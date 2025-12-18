package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.HashAlgorithmEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class CertificateHashData implements JsonInterface {

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
     * The hash of the DER encoded public key:
     * the value (excluding tag and length) of the subject public key field in the issuer’s certificate.
     */
    @Required
    private String issuerKeyHash;

    /**
     * The string representation of the hexadecimal value of the serial number without the prefix "0x" and without leading zeroes.
     */
    @Required
    private String serialNumber;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CertificateHashData() {
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

        json.addProperty("hashAlgorithm", getHashAlgorithm().toString());

        json.addProperty("issuerNameHash", getIssuerNameHash());

        json.addProperty("issuerKeyHash", getIssuerKeyHash());

        json.addProperty("serialNumber", getSerialNumber());

        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

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
            setHashAlgorithm(HashAlgorithmEnum.valueOf(jsonObject.get("hashAlgorithm").getAsString()));
        }

        if (jsonObject.has("issuerNameHash")) {
            setIssuerNameHash(jsonObject.get("issuerNameHash").getAsString());
        }

        if (jsonObject.has("issuerKeyHash")) {
            setIssuerKeyHash(jsonObject.get("issuerKeyHash").getAsString());
        }

        if (jsonObject.has("serialNumber")) {
            setSerialNumber(jsonObject.get("serialNumber").getAsString());
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CertificateHashData))
            return false;
        CertificateHashData that = (CertificateHashData) obj;
        return Objects.equals(this.issuerNameHash, that.issuerNameHash)
                && Objects.equals(this.issuerKeyHash, that.issuerKeyHash)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.serialNumber, that.serialNumber)
                && Objects.equals(this.hashAlgorithm, that.hashAlgorithm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getHashAlgorithm(),
                getIssuerNameHash(),
                getIssuerKeyHash(),
                getSerialNumber(),
                getCustomData()
        );
    }
}
