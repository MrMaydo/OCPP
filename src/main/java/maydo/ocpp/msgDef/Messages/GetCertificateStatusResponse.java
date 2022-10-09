
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.GetCertificateStatusEnum;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

public class GetCertificateStatusResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This indicates whether the charging station was able to retrieve the OCSP certificate status.
     * 
     * (Required)
     * 
     */
    private GetCertificateStatusEnum status;
    /**
     * Element providing more information about the status.
     * 
     * 
     */
    private StatusInfo statusInfo;
    /**
     * OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted.
     * 
     * 
     */
    private String ocspResult;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * This indicates whether the charging station was able to retrieve the OCSP certificate status.
     * 
     * (Required)
     * 
     */
    public GetCertificateStatusEnum getStatus() {
        return status;
    }

    /**
     * This indicates whether the charging station was able to retrieve the OCSP certificate status.
     * 
     * (Required)
     * 
     */
    public void setStatus(GetCertificateStatusEnum status) {
        this.status = status;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    /**
     * OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted.
     * 
     * 
     */
    public String getOcspResult() {
        return ocspResult;
    }

    /**
     * OCSPResponse class as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;. DER encoded (as defined in &lt;&lt;ref-ocpp_security_24, IETF RFC 6960&gt;&gt;), and then base64 encoded. MAY only be omitted when status is not Accepted.
     * 
     * 
     */
    public void setOcspResult(String ocspResult) {
        this.ocspResult = ocspResult;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
