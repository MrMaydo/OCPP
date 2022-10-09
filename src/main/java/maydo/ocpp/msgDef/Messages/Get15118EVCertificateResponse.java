
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.Iso15118EVCertificateStatusEnum;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Get15118EVCertificateResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Indicates whether the message was processed properly.
     * 
     * (Required)
     * 
     */
    private Iso15118EVCertificateStatusEnum status;
    /**
     * Element providing more information about the status.
     * 
     * 
     */
    private StatusInfo statusInfo;
    /**
     * Raw CertificateInstallationRes response for the EV, Base64 encoded.
     * 
     * (Required)
     * 
     */
    private String exiResponse;

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
     * Indicates whether the message was processed properly.
     * 
     * (Required)
     * 
     */
    public Iso15118EVCertificateStatusEnum getStatus() {
        return status;
    }

    /**
     * Indicates whether the message was processed properly.
     * 
     * (Required)
     * 
     */
    public void setStatus(Iso15118EVCertificateStatusEnum status) {
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
     * Raw CertificateInstallationRes response for the EV, Base64 encoded.
     * 
     * (Required)
     * 
     */
    public String getExiResponse() {
        return exiResponse;
    }

    /**
     * Raw CertificateInstallationRes response for the EV, Base64 encoded.
     * 
     * (Required)
     * 
     */
    public void setExiResponse(String exiResponse) {
        this.exiResponse = exiResponse;
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
