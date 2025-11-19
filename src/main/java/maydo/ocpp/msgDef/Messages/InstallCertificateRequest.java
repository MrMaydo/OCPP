package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.InstallCertificateUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class InstallCertificateRequest implements JsonInterface {

    /**
     * Indicates the certificate type that is sent.
     * 
     * (Required)
     */
    @Required
    private InstallCertificateUseEnum certificateType;
    /**
     * A PEM encoded X.509 certificate.
     * 
     * (Required)
     */
    @Required
    private String certificate;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public InstallCertificateRequest() {
    }

    /**
     * 
     * @param certificate
     *     A PEM encoded X.509 certificate.
     *     .
     */
    public InstallCertificateRequest(InstallCertificateUseEnum certificateType, String certificate, CustomData customData) {
        super();
        this.certificateType = certificateType;
        this.certificate = certificate;
        this.customData = customData;
    }

    /**
     * Indicates the certificate type that is sent.
     * 
     * (Required)
     */
    public InstallCertificateUseEnum getCertificateType() {
        return certificateType;
    }

    /**
     * Indicates the certificate type that is sent.
     * 
     * (Required)
     */
    public void setCertificateType(InstallCertificateUseEnum certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * A PEM encoded X.509 certificate.
     * 
     * (Required)
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * A PEM encoded X.509 certificate.
     * 
     * (Required)
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
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
        if (!(obj instanceof InstallCertificateRequest))
            return false;
        InstallCertificateRequest that = (InstallCertificateRequest) obj;
        return Objects.equals(this.certificate, that.certificate)
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.certificateType, that.certificateType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.certificate != null ? this.certificate.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.certificateType != null ? this.certificateType.hashCode() : 0);
        return result;
    }
}
