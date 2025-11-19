package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ConstantStreamData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class OpenPeriodicEventStreamRequest implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private ConstantStreamData constantStreamData;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public OpenPeriodicEventStreamRequest() {
    }

    public OpenPeriodicEventStreamRequest(ConstantStreamData constantStreamData, CustomData customData) {
        super();
        this.constantStreamData = constantStreamData;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public ConstantStreamData getConstantStreamData() {
        return constantStreamData;
    }

    /**
     * (Required)
     */
    public void setConstantStreamData(ConstantStreamData constantStreamData) {
        this.constantStreamData = constantStreamData;
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
        if (!(obj instanceof OpenPeriodicEventStreamRequest))
            return false;
        OpenPeriodicEventStreamRequest that = (OpenPeriodicEventStreamRequest) obj;
        return Objects.equals(this.constantStreamData, that.constantStreamData)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.constantStreamData != null ? this.constantStreamData.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
