package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.GetCertificateIdUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.utils.JsonTools;

import java.util.List;

public class GetInstalledCertificateIdsRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Indicates the type of certificates requested. When omitted, all certificate types are requested.
     */
    @Optional
    private List<GetCertificateIdUseEnum> certificateType = null;

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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
