package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetVariableResult;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class SetVariablesResponse implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private List<SetVariableResult> setVariableResult;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SetVariablesResponse() {
    }

    public SetVariablesResponse(List<SetVariableResult> setVariableResult, CustomData customData) {
        super();
        this.setVariableResult = setVariableResult;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public List<SetVariableResult> getSetVariableResult() {
        return setVariableResult;
    }

    /**
     * (Required)
     */
    public void setSetVariableResult(List<SetVariableResult> setVariableResult) {
        this.setVariableResult = setVariableResult;
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
        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SetVariablesResponse))
            return false;
        SetVariablesResponse that = (SetVariablesResponse) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.setVariableResult, that.setVariableResult);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.setVariableResult != null ? this.setVariableResult.hashCode() : 0);
        return result;
    }
}
