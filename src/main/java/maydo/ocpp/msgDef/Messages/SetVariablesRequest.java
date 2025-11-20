package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetVariableData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class SetVariablesRequest implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private List<SetVariableData> setVariableData;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SetVariablesRequest() {
    }

    public SetVariablesRequest(List<SetVariableData> setVariableData, CustomData customData) {
        super();
        this.setVariableData = setVariableData;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public List<SetVariableData> getSetVariableData() {
        return setVariableData;
    }

    /**
     * (Required)
     */
    public void setSetVariableData(List<SetVariableData> setVariableData) {
        this.setVariableData = setVariableData;
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
        if (!(obj instanceof SetVariablesRequest))
            return false;
        SetVariablesRequest that = (SetVariablesRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.setVariableData, that.setVariableData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.setVariableData != null ? this.setVariableData.hashCode() : 0);
        return result;
    }
}
