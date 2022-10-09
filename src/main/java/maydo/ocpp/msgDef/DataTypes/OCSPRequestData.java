package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.HashAlgorithmEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

public class OCSPRequestData implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * Used algorithms for the hashes provided.
     * <p>
     * (Required)
     */
    private HashAlgorithmEnum hashAlgorithm;
    /**
     * Hashed value of the Issuer DN (Distinguished Name).
     * <p>
     * <p>
     * (Required)
     */
    private String issuerNameHash;
    /**
     * Hashed value of the issuers public key
     * <p>
     * (Required)
     */
    private String issuerKeyHash;
    /**
     * The serial number of the certificate.
     * <p>
     * (Required)
     */
    private String serialNumber;
    /**
     * This contains the responder URL (Case insensitive).
     * <p>
     * <p>
     * (Required)
     */
    private String responderURL;

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
     * Hashed value of the Issuer DN (Distinguished Name).
     * <p>
     * <p>
     * (Required)
     */
    public String getIssuerNameHash() {
        return issuerNameHash;
    }

    /**
     * Hashed value of the Issuer DN (Distinguished Name).
     * <p>
     * <p>
     * (Required)
     */
    public void setIssuerNameHash(String issuerNameHash) {
        this.issuerNameHash = issuerNameHash;
    }

    /**
     * Hashed value of the issuers public key
     * <p>
     * (Required)
     */
    public String getIssuerKeyHash() {
        return issuerKeyHash;
    }

    /**
     * Hashed value of the issuers public key
     * <p>
     * (Required)
     */
    public void setIssuerKeyHash(String issuerKeyHash) {
        this.issuerKeyHash = issuerKeyHash;
    }

    /**
     * The serial number of the certificate.
     * <p>
     * (Required)
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * The serial number of the certificate.
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
