
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.AuthorizeCertificateStatusEnum;
import maydo.ocpp.msgDef.DataTypes.IdTokenInfo;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

public class AuthorizeResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * ID_ Token
     * urn:x-oca:ocpp:uid:2:233247
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     * 
     * (Required)
     * 
     */
    private IdTokenInfo idTokenInfo;
    /**
     * Certificate status information. 
     * - if all certificates are valid: return 'Accepted'.
     * - if one of the certificates was revoked, return 'CertificateRevoked'.
     * 
     * 
     */
    private AuthorizeCertificateStatusEnum certificateStatus;

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
     * ID_ Token
     * urn:x-oca:ocpp:uid:2:233247
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     * 
     * (Required)
     * 
     */
    public IdTokenInfo getIdTokenInfo() {
        return idTokenInfo;
    }

    /**
     * ID_ Token
     * urn:x-oca:ocpp:uid:2:233247
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     * 
     * (Required)
     * 
     */
    public void setIdTokenInfo(IdTokenInfo idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
    }

    /**
     * Certificate status information. 
     * - if all certificates are valid: return 'Accepted'.
     * - if one of the certificates was revoked, return 'CertificateRevoked'.
     * 
     * 
     */
    public AuthorizeCertificateStatusEnum getCertificateStatus() {
        return certificateStatus;
    }

    /**
     * Certificate status information. 
     * - if all certificates are valid: return 'Accepted'.
     * - if one of the certificates was revoked, return 'CertificateRevoked'.
     * 
     * 
     */
    public void setCertificateStatus(AuthorizeCertificateStatusEnum certificateStatus) {
        this.certificateStatus = certificateStatus;
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
