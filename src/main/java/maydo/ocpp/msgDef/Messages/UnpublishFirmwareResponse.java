package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.UnpublishFirmwareStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class UnpublishFirmwareResponse implements JsonInterface {

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
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public UnpublishFirmwareResponse() {
    }

    public UnpublishFirmwareResponse(UnpublishFirmwareStatusEnum status, CustomData customData) {
        super();
        this.status = status;
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
        json.addProperty("status", status.toString());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("status")) {
            this.status = UnpublishFirmwareStatusEnum.valueOf(jsonObject.get("status").getAsString());
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof UnpublishFirmwareResponse))
            return false;
        UnpublishFirmwareResponse that = (UnpublishFirmwareResponse) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
