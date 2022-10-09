
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;


/**
 * Represent a signed version of the meter value.
 * 
 * 
 */
public class SignedMeterValue implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Base64 encoded, contains the signed data which might contain more then just the meter value. It can contain information like timestamps, reference to a customer etc.
     * 
     * (Required)
     * 
     */
    private String signedMeterData;
    /**
     * Method used to create the digital signature.
     * 
     * (Required)
     * 
     */
    private String signingMethod;
    /**
     * Method used to encode the meter values before applying the digital signature algorithm.
     * 
     * (Required)
     * 
     */
    private String encodingMethod;
    /**
     * Base64 encoded, sending depends on configuration variable _PublicKeyWithSignedMeterValue_.
     * 
     * (Required)
     * 
     */
    private String publicKey;

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
     * Base64 encoded, contains the signed data which might contain more then just the meter value. It can contain information like timestamps, reference to a customer etc.
     * 
     * (Required)
     * 
     */
    public String getSignedMeterData() {
        return signedMeterData;
    }

    /**
     * Base64 encoded, contains the signed data which might contain more then just the meter value. It can contain information like timestamps, reference to a customer etc.
     * 
     * (Required)
     * 
     */
    public void setSignedMeterData(String signedMeterData) {
        this.signedMeterData = signedMeterData;
    }

    /**
     * Method used to create the digital signature.
     * 
     * (Required)
     * 
     */
    public String getSigningMethod() {
        return signingMethod;
    }

    /**
     * Method used to create the digital signature.
     * 
     * (Required)
     * 
     */
    public void setSigningMethod(String signingMethod) {
        this.signingMethod = signingMethod;
    }

    /**
     * Method used to encode the meter values before applying the digital signature algorithm.
     * 
     * (Required)
     * 
     */
    public String getEncodingMethod() {
        return encodingMethod;
    }

    /**
     * Method used to encode the meter values before applying the digital signature algorithm.
     * 
     * (Required)
     * 
     */
    public void setEncodingMethod(String encodingMethod) {
        this.encodingMethod = encodingMethod;
    }

    /**
     * Base64 encoded, sending depends on configuration variable _PublicKeyWithSignedMeterValue_.
     * 
     * (Required)
     * 
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Base64 encoded, sending depends on configuration variable _PublicKeyWithSignedMeterValue_.
     * 
     * (Required)
     * 
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
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
