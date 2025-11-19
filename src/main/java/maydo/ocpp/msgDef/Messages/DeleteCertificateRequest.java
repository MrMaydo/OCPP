package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CertificateHashData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class DeleteCertificateRequest implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private CertificateHashData certificateHashData;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public DeleteCertificateRequest() {
    }

    public DeleteCertificateRequest(CertificateHashData certificateHashData, CustomData customData) {
        super();
        this.certificateHashData = certificateHashData;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public CertificateHashData getCertificateHashData() {
        return certificateHashData;
    }

    /**
     * (Required)
     */
    public void setCertificateHashData(CertificateHashData certificateHashData) {
        this.certificateHashData = certificateHashData;
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
        if (!(obj instanceof DeleteCertificateRequest))
            return false;
        DeleteCertificateRequest that = (DeleteCertificateRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateHashData, that.certificateHashData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.certificateHashData != null ? this.certificateHashData.hashCode() : 0);
        return result;
    }
}
