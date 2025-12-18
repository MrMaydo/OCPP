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

        json.addProperty("hashAlgorithm", getHashAlgorithm().toString());

        json.addProperty("issuerNameHash", getIssuerNameHash());

        json.addProperty("issuerKeyHash", getIssuerKeyHash());

        json.addProperty("serialNumber", getSerialNumber());

        json.addProperty("responderURL", getResponderURL());

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

        if (jsonObject.has("responderURL")) {
            setResponderURL(jsonObject.get("responderURL").getAsString());
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
        return Objects.hash(
                getHashAlgorithm(),
                getIssuerNameHash(),
                getIssuerKeyHash(),
                getSerialNumber(),
                getResponderURL(),
                getCustomData()
        );
    }
}
