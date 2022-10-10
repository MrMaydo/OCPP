package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.UnpublishFirmwareStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

public class UnpublishFirmwareResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Indicates whether the Local Controller succeeded in unpublishing the firmware.
     * <p>
     * (Required)
     */
    @Required
    private UnpublishFirmwareStatusEnum status;

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
     * Indicates whether the Local Controller succeeded in unpublishing the firmware.
     * <p>
     * (Required)
     */
    public UnpublishFirmwareStatusEnum getStatus() {
        return status;
    }

    /**
     * Indicates whether the Local Controller succeeded in unpublishing the firmware.
     * <p>
     * (Required)
     */
    public void setStatus(UnpublishFirmwareStatusEnum status) {
        this.status = status;
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
