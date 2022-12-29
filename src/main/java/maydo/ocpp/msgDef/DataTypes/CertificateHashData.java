package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.HashAlgorithmEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class CertificateHashData implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Used algorithms for the hashes provided.
     * <p>
     * (Required)
     */
    @Required
    private HashAlgorithmEnum hashAlgorithm;
    /**
     * Hashed value of the Issuer DN (Distinguished Name).
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String issuerNameHash;
    /**
     * Hashed value of the issuers public key
     * <p>
     * (Required)
     */
    @Required
    private String issuerKeyHash;
    /**
     * The serial number of the certificate.
     * <p>
     * (Required)
     */
    @Required
    private String serialNumber;

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
        if (!(obj instanceof CertificateHashData))
            return false;
        CertificateHashData that = (CertificateHashData) obj;
        return Objects.equals(customData, that.customData)
                && hashAlgorithm == that.hashAlgorithm
                && Objects.equals(issuerNameHash, that.issuerNameHash)
                && Objects.equals(issuerKeyHash, that.issuerKeyHash)
                && Objects.equals(serialNumber, that.serialNumber);
    }

    @Override
    public int hashCode() {
        int result = (hashAlgorithm != null ? hashAlgorithm.hashCode() : 0);
        result = 31 * result + (issuerNameHash != null ? issuerNameHash.hashCode() : 0);
        result = 31 * result + (issuerKeyHash != null ? issuerKeyHash.hashCode() : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
