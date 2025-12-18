package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CertificateStatus;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class GetCertificateChainStatusResponse implements JsonInterface {

    /**
     * Status of the certificate revocation check.
     */
    @Required
    private List<CertificateStatus> certificateStatus;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetCertificateChainStatusResponse() {
    }


    public List<CertificateStatus> getCertificateStatus() {
        return certificateStatus;
    }


    public void setCertificateStatus(List<CertificateStatus> certificateStatus) {
        this.certificateStatus = certificateStatus;
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

        JsonArray certificateStatusArray = new JsonArray();
        for (CertificateStatus item : getCertificateStatus()) {
            certificateStatusArray.add(item.toJsonObject());
        }
        json.add("certificateStatus", certificateStatusArray);

        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("certificateStatus")) {
            setCertificateStatus(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("certificateStatus");
            for (JsonElement el : arr) {
                CertificateStatus item = new CertificateStatus();
                item.fromJsonObject(el.getAsJsonObject());
                getCertificateStatus().add(item);
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
        if (!(obj instanceof GetCertificateChainStatusResponse))
            return false;
        GetCertificateChainStatusResponse that = (GetCertificateChainStatusResponse) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateStatus, that.certificateStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getCertificateStatus(),
                getCustomData()
        );
    }
}
