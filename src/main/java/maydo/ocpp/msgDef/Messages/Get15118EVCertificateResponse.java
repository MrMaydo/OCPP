package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.Iso15118EVCertificateStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Response message from CSMS to Charging Station containing the status and optionally new certificate.
 * NOTE: This message is based on CertificateInstallationReq Res from ISO 15118-2.
 */
public class Get15118EVCertificateResponse implements JsonInterface {

    /**
     * Indicates whether the message was processed properly
     */
    @Required
    private Iso15118EVCertificateStatusEnum status;

    /**
     * Detailed status information.
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     * (2.1) Raw CertificateInstallationRes response for the EV, Base64 encoded.
     * Extended to support ISO 15118-20 certificates. The minimum supported length is 17000.
     * If a longer exiResponse is supported, then the supported length must be
     * communicated in variable OCPPCommCtrlr.FieldLength[ "Get15118EVCertificateResponse.exiResponse" ].
     */
    @Required
    private String exiResponse;

    /**
     * (2.1) Number of contracts that can be retrieved with additional requests.
     */
    @Optional
    private Integer remainingContracts;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Get15118EVCertificateResponse() {
    }


    public Get15118EVCertificateResponse(Iso15118EVCertificateStatusEnum status, StatusInfo statusInfo, String exiResponse, Integer remainingContracts, CustomData customData) {
        super();
        this.status = status;
        this.statusInfo = statusInfo;
        this.exiResponse = exiResponse;
        this.remainingContracts = remainingContracts;
        this.customData = customData;
    }


    public Iso15118EVCertificateStatusEnum getStatus() {
        return status;
    }


    public void setStatus(Iso15118EVCertificateStatusEnum status) {
        this.status = status;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }


    public String getExiResponse() {
        return exiResponse;
    }


    public void setExiResponse(String exiResponse) {
        this.exiResponse = exiResponse;
    }


    public Integer getRemainingContracts() {
        return remainingContracts;
    }


    public void setRemainingContracts(Integer remainingContracts) {
        this.remainingContracts = remainingContracts;
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
        json.addProperty("exiResponse", exiResponse);
        json.addProperty("remainingContracts", remainingContracts);
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
            this.status = Iso15118EVCertificateStatusEnum.valueOf(jsonObject.get("status").getAsString());
        }

        if (jsonObject.has("statusInfo")) {
            this.statusInfo = new StatusInfo();
            this.statusInfo.fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("exiResponse")) {
            this.exiResponse = jsonObject.get("exiResponse").getAsString();
        }

        if (jsonObject.has("remainingContracts")) {
            this.remainingContracts = jsonObject.get("remainingContracts").getAsInt();
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Get15118EVCertificateResponse))
            return false;
        Get15118EVCertificateResponse that = (Get15118EVCertificateResponse) obj;
        return Objects.equals(this.remainingContracts, that.remainingContracts)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.exiResponse, that.exiResponse)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.remainingContracts != null ? this.remainingContracts.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.exiResponse != null ? this.exiResponse.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
