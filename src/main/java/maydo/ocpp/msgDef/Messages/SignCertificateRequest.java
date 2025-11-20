package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CertificateHashData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.CertificateSigningUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class SignCertificateRequest implements JsonInterface {

    /**
     * The Charging Station SHALL send the public key in form of a Certificate Signing Request (CSR) as described in RFC 2986 [22] and then PEM encoded, using the &lt;&lt;signcertificaterequest,SignCertificateRequest&gt;&gt; message.
     * <p>
     * (Required)
     */
    @Required
    private String csr;
    /**
     * Indicates the type of certificate that is to be signed. When omitted the certificate is to be used for both the 15118 connection (if implemented) and the Charging Station to CSMS connection.
     */
    @Optional
    private CertificateSigningUseEnum certificateType;
    @Optional
    private CertificateHashData hashRootCertificate;
    /**
     * *(2.1)* RequestId to match this message with the CertificateSignedRequest.
     */
    @Optional
    private Integer requestId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SignCertificateRequest() {
    }

    /**
     * @param csr       The Charging Station SHALL send the public key in form of a Certificate Signing Request (CSR) as described in RFC 2986 [22] and then PEM encoded, using the &lt;&lt;signcertificaterequest,SignCertificateRequest&gt;&gt; message.
     *                  .
     * @param requestId *(2.1)* RequestId to match this message with the CertificateSignedRequest.
     *                  .
     */
    public SignCertificateRequest(String csr, CertificateSigningUseEnum certificateType, CertificateHashData hashRootCertificate, Integer requestId, CustomData customData) {
        super();
        this.csr = csr;
        this.certificateType = certificateType;
        this.hashRootCertificate = hashRootCertificate;
        this.requestId = requestId;
        this.customData = customData;
    }

    /**
     * The Charging Station SHALL send the public key in form of a Certificate Signing Request (CSR) as described in RFC 2986 [22] and then PEM encoded, using the &lt;&lt;signcertificaterequest,SignCertificateRequest&gt;&gt; message.
     * <p>
     * (Required)
     */
    public String getCsr() {
        return csr;
    }

    /**
     * The Charging Station SHALL send the public key in form of a Certificate Signing Request (CSR) as described in RFC 2986 [22] and then PEM encoded, using the &lt;&lt;signcertificaterequest,SignCertificateRequest&gt;&gt; message.
     * <p>
     * (Required)
     */
    public void setCsr(String csr) {
        this.csr = csr;
    }

    /**
     * Indicates the type of certificate that is to be signed. When omitted the certificate is to be used for both the 15118 connection (if implemented) and the Charging Station to CSMS connection.
     */
    public CertificateSigningUseEnum getCertificateType() {
        return certificateType;
    }

    /**
     * Indicates the type of certificate that is to be signed. When omitted the certificate is to be used for both the 15118 connection (if implemented) and the Charging Station to CSMS connection.
     */
    public void setCertificateType(CertificateSigningUseEnum certificateType) {
        this.certificateType = certificateType;
    }

    public CertificateHashData getHashRootCertificate() {
        return hashRootCertificate;
    }

    public void setHashRootCertificate(CertificateHashData hashRootCertificate) {
        this.hashRootCertificate = hashRootCertificate;
    }

    /**
     * *(2.1)* RequestId to match this message with the CertificateSignedRequest.
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * *(2.1)* RequestId to match this message with the CertificateSignedRequest.
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
        json.addProperty("csr", csr);
        json.addProperty("certificateType", certificateType.toString());
        json.add("hashRootCertificate", hashRootCertificate.toJsonObject());
        json.addProperty("requestId", requestId);
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
