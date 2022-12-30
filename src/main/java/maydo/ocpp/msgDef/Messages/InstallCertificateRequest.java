package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.InstallCertificateUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class InstallCertificateRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Indicates the certificate type that is sent.
     * <p>
     * (Required)
     */
    @Required
    private InstallCertificateUseEnum certificateType;
    /**
     * A PEM encoded X.509 certificate.
     * <p>
     * (Required)
     */
    @Required
    private String certificate;

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
     * Indicates the certificate type that is sent.
     * <p>
     * (Required)
     */
    public InstallCertificateUseEnum getCertificateType() {
        return certificateType;
    }

    /**
     * Indicates the certificate type that is sent.
     * <p>
     * (Required)
     */
    public void setCertificateType(InstallCertificateUseEnum certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * A PEM encoded X.509 certificate.
     * <p>
     * (Required)
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * A PEM encoded X.509 certificate.
     * <p>
     * (Required)
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
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
        if (!(obj instanceof InstallCertificateRequest))
            return false;
        InstallCertificateRequest that = (InstallCertificateRequest) obj;
        return Objects.equals(customData, that.customData)
                && certificateType == that.certificateType
                && Objects.equals(certificate, that.certificate);
    }

    @Override
    public int hashCode() {
        int result = (certificateType != null ? certificateType.hashCode() : 0);
        result = 31 * result + (certificate != null ? certificate.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
