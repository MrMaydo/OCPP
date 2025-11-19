package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.GetCertificateStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetCertificateStatusResponse implements JsonInterface {

    /**
     * This indicates whether the charging station was able to retrieve the OCSP certificate status.
     * 
     * (Required)
     */
    @Required
    private GetCertificateStatusEnum status;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;
    /**
     * *(2.1)* OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted. +
     * The minimum supported length is 18000. If a longer _ocspResult_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "GetCertificateStatusResponse.ocspResult" ].
     * 
     */
    @Optional
    private String ocspResult;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetCertificateStatusResponse() {
    }

    /**
     * 
     * @param ocspResult
     *     *(2.1)* OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted. +
     *     The minimum supported length is 18000. If a longer _ocspResult_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "GetCertificateStatusResponse.ocspResult" ].
     *     
     *     .
     */
    public GetCertificateStatusResponse(GetCertificateStatusEnum status, StatusInfo statusInfo, String ocspResult, CustomData customData) {
        super();
        this.status = status;
        this.statusInfo = statusInfo;
        this.ocspResult = ocspResult;
        this.customData = customData;
    }

    /**
     * This indicates whether the charging station was able to retrieve the OCSP certificate status.
     * 
     * (Required)
     */
    public GetCertificateStatusEnum getStatus() {
        return status;
    }

    /**
     * This indicates whether the charging station was able to retrieve the OCSP certificate status.
     * 
     * (Required)
     */
    public void setStatus(GetCertificateStatusEnum status) {
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
     * *(2.1)* OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted. +
     * The minimum supported length is 18000. If a longer _ocspResult_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "GetCertificateStatusResponse.ocspResult" ].
     * 
     */
    public String getOcspResult() {
        return ocspResult;
    }

    /**
     * *(2.1)* OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted. +
     * The minimum supported length is 18000. If a longer _ocspResult_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "GetCertificateStatusResponse.ocspResult" ].
     * 
     */
    public void setOcspResult(String ocspResult) {
        this.ocspResult = ocspResult;
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
        return null;
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
        if (!(obj instanceof GetCertificateStatusResponse))
            return false;
        GetCertificateStatusResponse that = (GetCertificateStatusResponse) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo) 
                && Objects.equals(this.ocspResult, that.ocspResult) 
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.ocspResult != null ? this.ocspResult.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
