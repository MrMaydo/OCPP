package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.InstallCertificateUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

public class InstallCertificateRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * Indicates the certificate type that is sent.
     * <p>
     * (Required)
     */
    private InstallCertificateUseEnum certificateType;
    /**
     * A PEM encoded X.509 certificate.
     * <p>
     * (Required)
     */
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
}
