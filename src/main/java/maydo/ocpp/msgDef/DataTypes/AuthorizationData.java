package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Contains the identifier to use for authorization.
 * 
 * 
 */
public class AuthorizationData implements JsonInterface {

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     */
    @Required
    private IdToken idToken;
    /**
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     */
    @Optional
    private IdTokenInfo idTokenInfo;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public AuthorizationData() {
    }

    public AuthorizationData(IdToken idToken, IdTokenInfo idTokenInfo, CustomData customData) {
        super();
        this.idToken = idToken;
        this.idTokenInfo = idTokenInfo;
        this.customData = customData;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     */
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     */
    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }

    /**
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     */
    public IdTokenInfo getIdTokenInfo() {
        return idTokenInfo;
    }

    /**
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     */
    public void setIdTokenInfo(IdTokenInfo idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
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
        if (!(obj instanceof AuthorizationData))
            return false;
        AuthorizationData that = (AuthorizationData) obj;
        return Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.idTokenInfo, that.idTokenInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.idTokenInfo != null ? this.idTokenInfo.hashCode() : 0);
        return result;
    }
}
