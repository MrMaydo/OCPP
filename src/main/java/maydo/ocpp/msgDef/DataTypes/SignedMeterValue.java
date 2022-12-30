package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * Represent a signed version of the meter value.
 */
public class SignedMeterValue implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Base64 encoded, contains the signed data which might contain more then just the meter value. It can contain information like timestamps, reference to a customer etc.
     * <p>
     * (Required)
     */
    @Required
    private String signedMeterData;
    /**
     * Method used to create the digital signature.
     * <p>
     * (Required)
     */
    @Required
    private String signingMethod;
    /**
     * Method used to encode the meter values before applying the digital signature algorithm.
     * <p>
     * (Required)
     */
    @Required
    private String encodingMethod;
    /**
     * Base64 encoded, sending depends on configuration variable _PublicKeyWithSignedMeterValue_.
     * <p>
     * (Required)
     */
    @Required
    private String publicKey;

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

    /**
     * Base64 encoded, contains the signed data which might contain more then just the meter value. It can contain information like timestamps, reference to a customer etc.
     * <p>
     * (Required)
     */
    public String getSignedMeterData() {
        return signedMeterData;
    }

    /**
     * Base64 encoded, contains the signed data which might contain more then just the meter value. It can contain information like timestamps, reference to a customer etc.
     * <p>
     * (Required)
     */
    public void setSignedMeterData(String signedMeterData) {
        this.signedMeterData = signedMeterData;
    }

    /**
     * Method used to create the digital signature.
     * <p>
     * (Required)
     */
    public String getSigningMethod() {
        return signingMethod;
    }

    /**
     * Method used to create the digital signature.
     * <p>
     * (Required)
     */
    public void setSigningMethod(String signingMethod) {
        this.signingMethod = signingMethod;
    }

    /**
     * Method used to encode the meter values before applying the digital signature algorithm.
     * <p>
     * (Required)
     */
    public String getEncodingMethod() {
        return encodingMethod;
    }

    /**
     * Method used to encode the meter values before applying the digital signature algorithm.
     * <p>
     * (Required)
     */
    public void setEncodingMethod(String encodingMethod) {
        this.encodingMethod = encodingMethod;
    }

    /**
     * Base64 encoded, sending depends on configuration variable _PublicKeyWithSignedMeterValue_.
     * <p>
     * (Required)
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Base64 encoded, sending depends on configuration variable _PublicKeyWithSignedMeterValue_.
     * <p>
     * (Required)
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SignedMeterValue))
            return false;
        SignedMeterValue that = (SignedMeterValue) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(signedMeterData, that.signedMeterData)
                && Objects.equals(signingMethod, that.signingMethod)
                && Objects.equals(encodingMethod, that.encodingMethod)
                && Objects.equals(publicKey, that.publicKey);
    }

    @Override
    public int hashCode() {
        int result = (signedMeterData != null ? signedMeterData.hashCode() : 0);
        result = 31 * result + (signingMethod != null ? signingMethod.hashCode() : 0);
        result = 31 * result + (encodingMethod != null ? encodingMethod.hashCode() : 0);
        result = 31 * result + (publicKey != null ? publicKey.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
