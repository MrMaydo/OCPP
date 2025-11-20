package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.Iso15118EVCertificateStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class Get15118EVCertificateResponse implements JsonInterface {

    /**
     * Indicates whether the message was processed properly.
     * <p>
     * (Required)
     */
    @Required
    private Iso15118EVCertificateStatusEnum status;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;
    /**
     * *(2/1)* Raw CertificateInstallationRes response for the EV, Base64 encoded. +
     * Extended to support ISO 15118-20 certificates. The minimum supported length is 17000. If a longer _exiResponse_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "Get15118EVCertificateResponse.exiResponse" ].
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String exiResponse;
    /**
     * *(2.1)* Number of contracts that can be retrieved with additional requests.
     */
    @Optional
    private Integer remainingContracts;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public Get15118EVCertificateResponse() {
    }

    /**
     * @param remainingContracts *(2.1)* Number of contracts that can be retrieved with additional requests.
     *                           .
     * @param exiResponse        *(2/1)* Raw CertificateInstallationRes response for the EV, Base64 encoded. +
     *                           Extended to support ISO 15118-20 certificates. The minimum supported length is 17000. If a longer _exiResponse_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "Get15118EVCertificateResponse.exiResponse" ].
     *                           <p>
     *                           .
     */
    public Get15118EVCertificateResponse(Iso15118EVCertificateStatusEnum status, StatusInfo statusInfo, String exiResponse, Integer remainingContracts, CustomData customData) {
        super();
        this.status = status;
        this.statusInfo = statusInfo;
        this.exiResponse = exiResponse;
        this.remainingContracts = remainingContracts;
        this.customData = customData;
    }

    /**
     * Indicates whether the message was processed properly.
     * <p>
     * (Required)
     */
    public Iso15118EVCertificateStatusEnum getStatus() {
        return status;
    }

    /**
     * Indicates whether the message was processed properly.
     * <p>
     * (Required)
     */
    public void setStatus(Iso15118EVCertificateStatusEnum status) {
        this.status = status;
    }

    /**
     * Element providing more information about the status.
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    /**
     * *(2/1)* Raw CertificateInstallationRes response for the EV, Base64 encoded. +
     * Extended to support ISO 15118-20 certificates. The minimum supported length is 17000. If a longer _exiResponse_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "Get15118EVCertificateResponse.exiResponse" ].
     * <p>
     * <p>
     * (Required)
     */
    public String getExiResponse() {
        return exiResponse;
    }

    /**
     * *(2/1)* Raw CertificateInstallationRes response for the EV, Base64 encoded. +
     * Extended to support ISO 15118-20 certificates. The minimum supported length is 17000. If a longer _exiResponse_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "Get15118EVCertificateResponse.exiResponse" ].
     * <p>
     * <p>
     * (Required)
     */
    public void setExiResponse(String exiResponse) {
        this.exiResponse = exiResponse;
    }

    /**
     * *(2.1)* Number of contracts that can be retrieved with additional requests.
     */
    public Integer getRemainingContracts() {
        return remainingContracts;
    }

    /**
     * *(2.1)* Number of contracts that can be retrieved with additional requests.
     */
    public void setRemainingContracts(Integer remainingContracts) {
        this.remainingContracts = remainingContracts;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
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
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
