package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Represent a signed version of the meter value.
 */
public class SignedMeterValue implements JsonInterface {

    /**
     * Base64 encoded, contains the signed data from the meter in the format specified in encodingMethod,
     * which might contain more then just the meter value.
     * It can contain information like timestamps, reference to a customer etc.
     */
    @Required
    private String signedMeterData;

    /**
     * (2.1) Method used to create the digital signature. Optional, if already included in signedMeterData.
     * Standard values for this are defined in Appendix as SigningMethodEnumStringType.
     */
    @Optional
    private String signingMethod;

    /**
     * Format used by the energy meter to encode the meter data. For example: OCMF or EDL.
     */
    @Required
    private String encodingMethod;

    /**
     * (2.1) Base64 encoded, sending depends on configuration variable PublicKeyWithSignedMeterValue.
     */
    @Optional
    private String publicKey;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SignedMeterValue() {
    }


    public String getSignedMeterData() {
        return signedMeterData;
    }


    public void setSignedMeterData(String signedMeterData) {
        this.signedMeterData = signedMeterData;
    }


    public String getSigningMethod() {
        return signingMethod;
    }


    public void setSigningMethod(String signingMethod) {
        this.signingMethod = signingMethod;
    }


    public String getEncodingMethod() {
        return encodingMethod;
    }


    public void setEncodingMethod(String encodingMethod) {
        this.encodingMethod = encodingMethod;
    }


    public String getPublicKey() {
        return publicKey;
    }


    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
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
        json.addProperty("signedMeterData", signedMeterData);
        json.addProperty("signingMethod", signingMethod);
        json.addProperty("encodingMethod", encodingMethod);
        json.addProperty("publicKey", publicKey);
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
        if (jsonObject.has("signedMeterData")) {
            this.signedMeterData = jsonObject.get("signedMeterData").getAsString();
        }

        if (jsonObject.has("signingMethod")) {
            this.signingMethod = jsonObject.get("signingMethod").getAsString();
        }

        if (jsonObject.has("encodingMethod")) {
            this.encodingMethod = jsonObject.get("encodingMethod").getAsString();
        }

        if (jsonObject.has("publicKey")) {
            this.publicKey = jsonObject.get("publicKey").getAsString();
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
