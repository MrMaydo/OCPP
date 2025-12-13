package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CertificateHashDataChain;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.GetInstalledCertificateStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Response to a GetInstalledCertificateIDsRequest.
 */
public class GetInstalledCertificateIdsResponse implements JsonInterface {

    /**
     * Charging Station indicates if it can process the request
     */
    @Required
    private GetInstalledCertificateStatusEnum status;

    /**
     * Detailed status information.
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     * The Charging Station includes the Certificate information for each available certificate.
     */
    @Optional
    private List<CertificateHashDataChain> certificateHashDataChain;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetInstalledCertificateIdsResponse() {
    }


    public GetInstalledCertificateStatusEnum getStatus() {
        return status;
    }


    public void setStatus(GetInstalledCertificateStatusEnum status) {
        this.status = status;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    public List<CertificateHashDataChain> getCertificateHashDataChain() {
        return certificateHashDataChain;
    }

    public void setCertificateHashDataChain(List<CertificateHashDataChain> certificateHashDataChain) {
        this.certificateHashDataChain = certificateHashDataChain;
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
        json.addProperty("status", status.toString());
        json.add("statusInfo", statusInfo.toJsonObject());
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
        if (jsonObject.has("status")) {
            setStatus(GetInstalledCertificateStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("certificateHashDataChain")) {
            setCertificateHashDataChain(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("certificateHashDataChain");
            for (JsonElement el : arr) {
                CertificateHashDataChain item = new CertificateHashDataChain();
                item.fromJsonObject(el.getAsJsonObject());
                getCertificateHashDataChain().add(item);
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
        if (!(obj instanceof GetInstalledCertificateIdsResponse))
            return false;
        GetInstalledCertificateIdsResponse that = (GetInstalledCertificateIdsResponse) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.certificateHashDataChain, that.certificateHashDataChain)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.certificateHashDataChain != null ? this.certificateHashDataChain.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
