package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CertificateHashData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.CertificateSigningUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Sent by the Charging Station to the CSMS to request that the Certificate Authority signs the public key into a certificate.
 */
public class SignCertificateRequest implements JsonInterface {

    /**
     * The Charging Station SHALL send the public key in form of a Certificate Signing Request (CSR)
     * as described in RFC 2986 [22] and then PEM encoded, using the SignCertificateRequest message.
     */
    @Required
    private String csr;

    /**
     * Indicates the type of certificate that is to be signed.
     * When omitted the certificate is to be used for both the 15118 connection (if implemented)
     * and the Charging Station to CSMS connection.
     */
    @Optional
    private CertificateSigningUseEnum certificateType;

    /**
     * (2.1) The hash of the root certificate to identify the PKI to use.
     */
    @Optional
    private CertificateHashData hashRootCertificate;

    /**
     * (2.1) RequestId to match this message with the CertificateSignedRequest.
     */
    @Optional
    private Integer requestId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SignCertificateRequest() {
    }


    public String getCsr() {
        return csr;
    }


    public void setCsr(String csr) {
        this.csr = csr;
    }


    public CertificateSigningUseEnum getCertificateType() {
        return certificateType;
    }


    public void setCertificateType(CertificateSigningUseEnum certificateType) {
        this.certificateType = certificateType;
    }

    public CertificateHashData getHashRootCertificate() {
        return hashRootCertificate;
    }

    public void setHashRootCertificate(CertificateHashData hashRootCertificate) {
        this.hashRootCertificate = hashRootCertificate;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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

        json.addProperty("csr", getCsr());

        if (getCertificateType() != null) {
            json.addProperty("certificateType", getCertificateType().toString());
        }
        if (getHashRootCertificate() != null) {
            json.add("hashRootCertificate", getHashRootCertificate().toJsonObject());
        }
        if (getRequestId() != null) {
            json.addProperty("requestId", getRequestId());
        }
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
        if (jsonObject.has("csr")) {
            setCsr(jsonObject.get("csr").getAsString());
        }

        if (jsonObject.has("certificateType")) {
            setCertificateType(CertificateSigningUseEnum.valueOf(jsonObject.get("certificateType").getAsString()));
        }

        if (jsonObject.has("hashRootCertificate")) {
            setHashRootCertificate(new CertificateHashData());
            getHashRootCertificate().fromJsonObject(jsonObject.getAsJsonObject("hashRootCertificate"));
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
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
        if (!(obj instanceof SignCertificateRequest))
            return false;
        SignCertificateRequest that = (SignCertificateRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.csr, that.csr)
                && Objects.equals(this.hashRootCertificate, that.hashRootCertificate)
                && Objects.equals(this.requestId, that.requestId)
                && Objects.equals(this.certificateType, that.certificateType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.csr != null ? this.csr.hashCode() : 0);
        result = 31 * result + (this.hashRootCertificate != null ? this.hashRootCertificate.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.certificateType != null ? this.certificateType.hashCode() : 0);
        return result;
    }
}
