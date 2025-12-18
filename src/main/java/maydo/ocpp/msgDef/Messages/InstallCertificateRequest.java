package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.InstallCertificateUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Used by the CSMS to request installation of a certificate on a Charging Station.
 * Note: This message is not for installing a TLS client certificate in a charging station.
 * The CertificateSignedRequest mechanism is used for that.
 */
public class InstallCertificateRequest implements JsonInterface {

    /**
     * Indicates the certificate type that is sent.
     */
    @Required
    private InstallCertificateUseEnum certificateType;

    /**
     * A PEM encoded X.509 certificate.
     */
    @Required
    private String certificate;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public InstallCertificateRequest() {
    }


    public InstallCertificateUseEnum getCertificateType() {
        return certificateType;
    }


    public void setCertificateType(InstallCertificateUseEnum certificateType) {
        this.certificateType = certificateType;
    }


    public String getCertificate() {
        return certificate;
    }


    public void setCertificate(String certificate) {
        this.certificate = certificate;
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

        json.addProperty("certificateType", getCertificateType().toString());

        json.addProperty("certificate", getCertificate());

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
        if (jsonObject.has("certificateType")) {
            setCertificateType(InstallCertificateUseEnum.valueOf(jsonObject.get("certificateType").getAsString()));
        }

        if (jsonObject.has("certificate")) {
            setCertificate(jsonObject.get("certificate").getAsString());
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
        if (!(obj instanceof InstallCertificateRequest))
            return false;
        InstallCertificateRequest that = (InstallCertificateRequest) obj;
        return Objects.equals(this.certificate, that.certificate)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateType, that.certificateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getCertificateType(),
                getCertificate(),
                getCustomData()
        );
    }
}
