package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.GetCertificateIdUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

public class GetInstalledCertificateIdsRequest implements JsonInterface {

    /**
     * Indicates the type of certificates requested. When omitted, all certificate types are requested.
     */
    @Optional
    private List<GetCertificateIdUseEnum> certificateType;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetInstalledCertificateIdsRequest() {
    }

    /**
     * @param certificateType Indicates the type of certificates requested. When omitted, all certificate types are requested.
     *                        .
     */
    public GetInstalledCertificateIdsRequest(List<GetCertificateIdUseEnum> certificateType, CustomData customData) {
        super();
        this.certificateType = certificateType;
        this.customData = customData;
    }

    /**
     * Indicates the type of certificates requested. When omitted, all certificate types are requested.
     */
    public List<GetCertificateIdUseEnum> getCertificateType() {
        return certificateType;
    }

    /**
     * Indicates the type of certificates requested. When omitted, all certificate types are requested.
     */
    public void setCertificateType(List<GetCertificateIdUseEnum> certificateType) {
        this.certificateType = certificateType;
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
        if (!(obj instanceof GetInstalledCertificateIdsRequest))
            return false;
        GetInstalledCertificateIdsRequest that = (GetInstalledCertificateIdsRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateType, that.certificateType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.certificateType != null ? this.certificateType.hashCode() : 0);
        return result;
    }
}
