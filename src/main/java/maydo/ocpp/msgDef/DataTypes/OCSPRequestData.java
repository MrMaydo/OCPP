
package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.HashAlgorithmEnum;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class OCSPRequestData {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Used algorithms for the hashes provided.
     * 
     * (Required)
     * 
     */
    private HashAlgorithmEnum hashAlgorithm;
    /**
     * Hashed value of the Issuer DN (Distinguished Name).
     * 
     * 
     * (Required)
     * 
     */
    private String issuerNameHash;
    /**
     * Hashed value of the issuers public key
     * 
     * (Required)
     * 
     */
    private String issuerKeyHash;
    /**
     * The serial number of the certificate.
     * 
     * (Required)
     * 
     */
    private String serialNumber;
    /**
     * This contains the responder URL (Case insensitive). 
     * 
     * 
     * (Required)
     * 
     */
    private String responderURL;

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
     * Used algorithms for the hashes provided.
     * 
     * (Required)
     * 
     */
    public HashAlgorithmEnum getHashAlgorithm() {
        return hashAlgorithm;
    }

    /**
     * Used algorithms for the hashes provided.
     * 
     * (Required)
     * 
     */
    public void setHashAlgorithm(HashAlgorithmEnum hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    /**
     * Hashed value of the Issuer DN (Distinguished Name).
     * 
     * 
     * (Required)
     * 
     */
    public String getIssuerNameHash() {
        return issuerNameHash;
    }

    /**
     * Hashed value of the Issuer DN (Distinguished Name).
     * 
     * 
     * (Required)
     * 
     */
    public void setIssuerNameHash(String issuerNameHash) {
        this.issuerNameHash = issuerNameHash;
    }

    /**
     * Hashed value of the issuers public key
     * 
     * (Required)
     * 
     */
    public String getIssuerKeyHash() {
        return issuerKeyHash;
    }

    /**
     * Hashed value of the issuers public key
     * 
     * (Required)
     * 
     */
    public void setIssuerKeyHash(String issuerKeyHash) {
        this.issuerKeyHash = issuerKeyHash;
    }

    /**
     * The serial number of the certificate.
     * 
     * (Required)
     * 
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * The serial number of the certificate.
     * 
     * (Required)
     * 
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * This contains the responder URL (Case insensitive). 
     * 
     * 
     * (Required)
     * 
     */
    public String getResponderURL() {
        return responderURL;
    }

    /**
     * This contains the responder URL (Case insensitive). 
     * 
     * 
     * (Required)
     * 
     */
    public void setResponderURL(String responderURL) {
        this.responderURL = responderURL;
    }

}