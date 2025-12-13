package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.GetCertificateIdUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Used by the CSMS to request an overview of the installed certificates on a Charging Station.
 */
public class GetInstalledCertificateIdsRequest implements JsonInterface {

    /**
     * Indicates the type of certificates requested. When omitted, all certificate types are requested.
     */
    @Optional
    private List<GetCertificateIdUseEnum> certificateType;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetInstalledCertificateIdsRequest() {
    }


    public List<GetCertificateIdUseEnum> getCertificateType() {
        return certificateType;
    }


    public void setCertificateType(List<GetCertificateIdUseEnum> certificateType) {
        this.certificateType = certificateType;
    }


    public CustomData getCustomData() {
        return customData;
    }


    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        JsonObject json = new JsonObject();
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("certificateType")) {
            setCertificateType(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("certificateType");
            for (JsonElement el : arr) {
                getCertificateType().add(GetCertificateIdUseEnum.valueOf(el.getAsString()));
            }
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetInstalledCertificateIdsRequest))
            return false;
        GetInstalledCertificateIdsRequest that = (GetInstalledCertificateIdsRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateType, that.certificateType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.certificateType != null ? this.certificateType.hashCode() : 0);
        return result;
    }
}
