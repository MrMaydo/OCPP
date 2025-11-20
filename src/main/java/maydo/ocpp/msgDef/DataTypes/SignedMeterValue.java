package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Represent a signed version of the meter value.
 */
public class SignedMeterValue implements JsonInterface {

    /**
     * Base64 encoded, contains the signed data from the meter in the format specified in _encodingMethod_, which might contain more then just the meter value. It can contain information like timestamps, reference to a customer etc.
     * <p>
     * (Required)
     */
    @Required
    private String signedMeterData;
    /**
     * *(2.1)* Method used to create the digital signature. Optional, if already included in _signedMeterData_. Standard values for this are defined in Appendix as SigningMethodEnumStringType.
     */
    @Optional
    private String signingMethod;
    /**
     * Format used by the energy meter to encode the meter data. For example: OCMF or EDL.
     * <p>
     * (Required)
     */
    @Required
    private String encodingMethod;
    /**
     * *(2.1)* Base64 encoded, sending depends on configuration variable _PublicKeyWithSignedMeterValue_.
     */
    @Optional
    private String publicKey;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SignedMeterValue() {
    }

    /**
     * @param signedMeterData Base64 encoded, contains the signed data from the meter in the format specified in _encodingMethod_, which might contain more then just the meter value. It can contain information like timestamps, reference to a customer etc.
     *                        .
     * @param publicKey       *(2.1)* Base64 encoded, sending depends on configuration variable _PublicKeyWithSignedMeterValue_.
     *                        .
     * @param signingMethod   *(2.1)* Method used to create the digital signature. Optional, if already included in _signedMeterData_. Standard values for this are defined in Appendix as SigningMethodEnumStringType.
     *                        .
     * @param encodingMethod  Format used by the energy meter to encode the meter data. For example: OCMF or EDL.
     *                        .
     */
    public SignedMeterValue(String signedMeterData, String signingMethod, String encodingMethod, String publicKey, CustomData customData) {
        super();
        this.signedMeterData = signedMeterData;
        this.signingMethod = signingMethod;
        this.encodingMethod = encodingMethod;
        this.publicKey = publicKey;
        this.customData = customData;
    }

    /**
     * Base64 encoded, contains the signed data from the meter in the format specified in _encodingMethod_, which might contain more then just the meter value. It can contain information like timestamps, reference to a customer etc.
     * <p>
     * (Required)
     */
    public String getSignedMeterData() {
        return signedMeterData;
    }

    /**
     * Base64 encoded, contains the signed data from the meter in the format specified in _encodingMethod_, which might contain more then just the meter value. It can contain information like timestamps, reference to a customer etc.
     * <p>
     * (Required)
     */
    public void setSignedMeterData(String signedMeterData) {
        this.signedMeterData = signedMeterData;
    }

    /**
     * *(2.1)* Method used to create the digital signature. Optional, if already included in _signedMeterData_. Standard values for this are defined in Appendix as SigningMethodEnumStringType.
     */
    public String getSigningMethod() {
        return signingMethod;
    }

    /**
     * *(2.1)* Method used to create the digital signature. Optional, if already included in _signedMeterData_. Standard values for this are defined in Appendix as SigningMethodEnumStringType.
     */
    public void setSigningMethod(String signingMethod) {
        this.signingMethod = signingMethod;
    }

    /**
     * Format used by the energy meter to encode the meter data. For example: OCMF or EDL.
     * <p>
     * (Required)
     */
    public String getEncodingMethod() {
        return encodingMethod;
    }

    /**
     * Format used by the energy meter to encode the meter data. For example: OCMF or EDL.
     * <p>
     * (Required)
     */
    public void setEncodingMethod(String encodingMethod) {
        this.encodingMethod = encodingMethod;
    }

    /**
     * *(2.1)* Base64 encoded, sending depends on configuration variable _PublicKeyWithSignedMeterValue_.
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * *(2.1)* Base64 encoded, sending depends on configuration variable _PublicKeyWithSignedMeterValue_.
     */
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
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
        json.addProperty("signedMeterData", signedMeterData);
        json.addProperty("signingMethod", signingMethod);
        json.addProperty("encodingMethod", encodingMethod);
        json.addProperty("publicKey", publicKey);
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
        if (!(obj instanceof SignedMeterValue))
            return false;
        SignedMeterValue that = (SignedMeterValue) obj;
        return Objects.equals(this.signedMeterData, that.signedMeterData)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.publicKey, that.publicKey)
                && Objects.equals(this.signingMethod, that.signingMethod)
                && Objects.equals(this.encodingMethod, that.encodingMethod);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.signedMeterData != null ? this.signedMeterData.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.publicKey != null ? this.publicKey.hashCode() : 0);
        result = 31 * result + (this.signingMethod != null ? this.signingMethod.hashCode() : 0);
        result = 31 * result + (this.encodingMethod != null ? this.encodingMethod.hashCode() : 0);
        return result;
    }
}
