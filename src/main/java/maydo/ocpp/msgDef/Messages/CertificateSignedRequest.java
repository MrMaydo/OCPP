package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.CertificateSigningUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class CertificateSignedRequest implements JsonInterface {

    /**
     * The signed PEM encoded X.509 certificate. This SHALL also contain the necessary sub CA certificates, when applicable. The order of the bundle follows the certificate chain, starting from the leaf certificate.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-max-certificate-chain-size,MaxCertificateChainSize&gt;&gt; can be used to limit the maximum size of this field.
     * <p>
     * (Required)
     */
    @Required
    private String certificateChain;
    /**
     * Indicates the type of the signed certificate that is returned. When omitted the certificate is used for both the 15118 connection (if implemented) and the Charging Station to CSMS connection. This field is required when a typeOfCertificate was included in the &lt;&lt;signcertificaterequest,SignCertificateRequest&gt;&gt; that requested this certificate to be signed AND both the 15118 connection and the Charging Station connection are implemented.
     */
    @Optional
    private CertificateSigningUseEnum certificateType;
    /**
     * *(2.1)* RequestId to correlate this message with the SignCertificateRequest.
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
    public CertificateSignedRequest() {
    }

    /**
     * @param certificateChain The signed PEM encoded X.509 certificate. This SHALL also contain the necessary sub CA certificates, when applicable. The order of the bundle follows the certificate chain, starting from the leaf certificate.
     *                         <p>
     *                         The Configuration Variable &lt;&lt;configkey-max-certificate-chain-size,MaxCertificateChainSize&gt;&gt; can be used to limit the maximum size of this field.
     *                         .
     * @param requestId        *(2.1)* RequestId to correlate this message with the SignCertificateRequest.
     *                         .
     */
    public CertificateSignedRequest(String certificateChain, CertificateSigningUseEnum certificateType, Integer requestId, CustomData customData) {
        super();
        this.certificateChain = certificateChain;
        this.certificateType = certificateType;
        this.requestId = requestId;
        this.customData = customData;
    }

    /**
     * The signed PEM encoded X.509 certificate. This SHALL also contain the necessary sub CA certificates, when applicable. The order of the bundle follows the certificate chain, starting from the leaf certificate.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-max-certificate-chain-size,MaxCertificateChainSize&gt;&gt; can be used to limit the maximum size of this field.
     * <p>
     * (Required)
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    /**
     * The signed PEM encoded X.509 certificate. This SHALL also contain the necessary sub CA certificates, when applicable. The order of the bundle follows the certificate chain, starting from the leaf certificate.
     * <p>
     * The Configuration Variable &lt;&lt;configkey-max-certificate-chain-size,MaxCertificateChainSize&gt;&gt; can be used to limit the maximum size of this field.
     * <p>
     * (Required)
     */
    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * Indicates the type of the signed certificate that is returned. When omitted the certificate is used for both the 15118 connection (if implemented) and the Charging Station to CSMS connection. This field is required when a typeOfCertificate was included in the &lt;&lt;signcertificaterequest,SignCertificateRequest&gt;&gt; that requested this certificate to be signed AND both the 15118 connection and the Charging Station connection are implemented.
     */
    public CertificateSigningUseEnum getCertificateType() {
        return certificateType;
    }

    /**
     * Indicates the type of the signed certificate that is returned. When omitted the certificate is used for both the 15118 connection (if implemented) and the Charging Station to CSMS connection. This field is required when a typeOfCertificate was included in the &lt;&lt;signcertificaterequest,SignCertificateRequest&gt;&gt; that requested this certificate to be signed AND both the 15118 connection and the Charging Station connection are implemented.
     */
    public void setCertificateType(CertificateSigningUseEnum certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * *(2.1)* RequestId to correlate this message with the SignCertificateRequest.
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * *(2.1)* RequestId to correlate this message with the SignCertificateRequest.
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
        return null;
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
        if (!(obj instanceof CertificateSignedRequest))
            return false;
        CertificateSignedRequest that = (CertificateSignedRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateChain, that.certificateChain)
                && Objects.equals(this.requestId, that.requestId)
                && Objects.equals(this.certificateType, that.certificateType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.certificateChain != null ? this.certificateChain.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.certificateType != null ? this.certificateType.hashCode() : 0);
        return result;
    }
}
