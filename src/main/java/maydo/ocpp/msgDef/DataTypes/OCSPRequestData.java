package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.HashAlgorithmEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class OCSPRequestData implements JsonInterface {

    /**
     * Used algorithms for the hashes provided.
     * <p>
     * (Required)
     */
    @Required
    private HashAlgorithmEnum hashAlgorithm;
    /**
     * The hash of the issuer’s distinguished
     * name (DN), that must be calculated over the DER
     * encoding of the issuer’s name field in the certificate
     * being checked.
     * <p>
     * (Required)
     */
    @Required
    private String issuerNameHash;
    /**
     * The hash of the DER encoded public key:
     * the value (excluding tag and length) of the subject
     * public key field in the issuer’s certificate.
     * <p>
     * (Required)
     */
    @Required
    private String issuerKeyHash;
    /**
     * The string representation of the
     * hexadecimal value of the serial number without the
     * prefix "0x" and without leading zeroes.
     * <p>
     * (Required)
     */
    @Required
    private String serialNumber;
    /**
     * This contains the responder URL (Case insensitive).
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String responderURL;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public OCSPRequestData() {
    }

    /**
     * @param responderURL   This contains the responder URL (Case insensitive).
     *                       <p>
     *                       .
     * @param issuerNameHash The hash of the issuer’s distinguished
     *                       name (DN), that must be calculated over the DER
     *                       encoding of the issuer’s name field in the certificate
     *                       being checked.
     *                       .
     * @param issuerKeyHash  The hash of the DER encoded public key:
     *                       the value (excluding tag and length) of the subject
     *                       public key field in the issuer’s certificate.
     *                       .
     * @param serialNumber   The string representation of the
     *                       hexadecimal value of the serial number without the
     *                       prefix "0x" and without leading zeroes.
     *                       .
     */
    public OCSPRequestData(HashAlgorithmEnum hashAlgorithm, String issuerNameHash, String issuerKeyHash, String serialNumber, String responderURL, CustomData customData) {
        super();
        this.hashAlgorithm = hashAlgorithm;
        this.issuerNameHash = issuerNameHash;
        this.issuerKeyHash = issuerKeyHash;
        this.serialNumber = serialNumber;
        this.responderURL = responderURL;
        this.customData = customData;
    }

    /**
     * Used algorithms for the hashes provided.
     * <p>
     * (Required)
     */
    public HashAlgorithmEnum getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * Used algorithms for the hashes provided.
     * <p>
     * (Required)
     */
    public void setHashAlgorithm(HashAlgorithmEnum hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    /**
     * The hash of the issuer’s distinguished
     * name (DN), that must be calculated over the DER
     * encoding of the issuer’s name field in the certificate
     * being checked.
     * <p>
     * (Required)
     */
    public String getIssuerNameHash() {
        return issuerNameHash;
    }

    /**
     * The hash of the issuer’s distinguished
     * name (DN), that must be calculated over the DER
     * encoding of the issuer’s name field in the certificate
     * being checked.
     * <p>
     * (Required)
     */
    public void setIssuerNameHash(String issuerNameHash) {
        this.issuerNameHash = issuerNameHash;
    }

    /**
     * The hash of the DER encoded public key:
     * the value (excluding tag and length) of the subject
     * public key field in the issuer’s certificate.
     * <p>
     * (Required)
     */
    public String getIssuerKeyHash() {
        return issuerKeyHash;
    }

    /**
     * The hash of the DER encoded public key:
     * the value (excluding tag and length) of the subject
     * public key field in the issuer’s certificate.
     * <p>
     * (Required)
     */
    public void setIssuerKeyHash(String issuerKeyHash) {
        this.issuerKeyHash = issuerKeyHash;
    }

    /**
     * The string representation of the
     * hexadecimal value of the serial number without the
     * prefix "0x" and without leading zeroes.
     * <p>
     * (Required)
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * The string representation of the
     * hexadecimal value of the serial number without the
     * prefix "0x" and without leading zeroes.
     * <p>
     * (Required)
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * This contains the responder URL (Case insensitive).
     * <p>
     * <p>
     * (Required)
     */
    public String getResponderURL() {
        return responderURL;
    }

    /**
     * This contains the responder URL (Case insensitive).
     * <p>
     * <p>
     * (Required)
     */
    public void setResponderURL(String responderURL) {
        this.responderURL = responderURL;
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
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
