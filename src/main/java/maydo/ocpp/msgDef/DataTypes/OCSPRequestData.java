package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.HashAlgorithmEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Information about a certificate for an OCSP check.
 */
public class OCSPRequestData implements JsonInterface {

    /**
     * Used algorithms for the hashes provided.
     */
    @Required
    private HashAlgorithmEnum hashAlgorithm;

    /**
     * The hash of the issuer’s distinguished name (DN),
     * that must be calculated over the DER encoding of the issuer’s name field in the certificate being checked.
     */
    @Required
    private String issuerNameHash;

    /**
     * The hash of the DER encoded public key: the value (excluding tag and length) of the subject public key field
     * in the issuer’s certificate.
     */
    @Required
    private String issuerKeyHash;

    /**
     * The string representation of the hexadecimal value of the serial number without the prefix "0x" and without leading zeroes.
     */
    @Required
    private String serialNumber;

    /**
     * This contains the responder URL (Case insensitive).
     */
    @Required
    private String responderURL;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public OCSPRequestData() {
    }


    public OCSPRequestData(HashAlgorithmEnum hashAlgorithm, String issuerNameHash, String issuerKeyHash, String serialNumber, String responderURL, CustomData customData) {
        super();
        this.hashAlgorithm = hashAlgorithm;
        this.issuerNameHash = issuerNameHash;
        this.issuerKeyHash = issuerKeyHash;
        this.serialNumber = serialNumber;
        this.responderURL = responderURL;
        this.customData = customData;
    }


    public HashAlgorithmEnum getHashAlgorithm() {
        return hashAlgorithm;
    }


    public void setHashAlgorithm(HashAlgorithmEnum hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }


    public String getIssuerNameHash() {
        return issuerNameHash;
    }


    public void setIssuerNameHash(String issuerNameHash) {
        this.issuerNameHash = issuerNameHash;
    }


    public String getIssuerKeyHash() {
        return issuerKeyHash;
    }


    public void setIssuerKeyHash(String issuerKeyHash) {
        this.issuerKeyHash = issuerKeyHash;
    }


    public String getSerialNumber() {
        return serialNumber;
    }


    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getResponderURL() {
        return responderURL;
    }


    public void setResponderURL(String responderURL) {
        this.responderURL = responderURL;
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
        json.addProperty("hashAlgorithm", hashAlgorithm.toString());
        json.addProperty("issuerNameHash", issuerNameHash);
        json.addProperty("issuerKeyHash", issuerKeyHash);
        json.addProperty("serialNumber", serialNumber);
        json.addProperty("responderURL", responderURL);
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
        if (jsonObject.has("hashAlgorithm")) {
            this.hashAlgorithm = HashAlgorithmEnum.valueOf(jsonObject.get("hashAlgorithm").getAsString());
        }

        if (jsonObject.has("issuerNameHash")) {
            this.issuerNameHash = jsonObject.get("issuerNameHash").getAsString();
        }

        if (jsonObject.has("issuerKeyHash")) {
            this.issuerKeyHash = jsonObject.get("issuerKeyHash").getAsString();
        }

        if (jsonObject.has("serialNumber")) {
            this.serialNumber = jsonObject.get("serialNumber").getAsString();
        }

        if (jsonObject.has("responderURL")) {
            this.responderURL = jsonObject.get("responderURL").getAsString();
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
        if (!(obj instanceof OCSPRequestData))
            return false;
        OCSPRequestData that = (OCSPRequestData) obj;
        return Objects.equals(this.responderURL, that.responderURL)
                && Objects.equals(this.issuerNameHash, that.issuerNameHash)
                && Objects.equals(this.issuerKeyHash, that.issuerKeyHash)
                && Objects.equals(this.serialNumber, that.serialNumber)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.hashAlgorithm, that.hashAlgorithm);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.responderURL != null ? this.responderURL.hashCode() : 0);
        result = 31 * result + (this.issuerNameHash != null ? this.issuerNameHash.hashCode() : 0);
        result = 31 * result + (this.issuerKeyHash != null ? this.issuerKeyHash.hashCode() : 0);
        result = 31 * result + (this.serialNumber != null ? this.serialNumber.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.hashAlgorithm != null ? this.hashAlgorithm.hashCode() : 0);
        return result;
    }
}
