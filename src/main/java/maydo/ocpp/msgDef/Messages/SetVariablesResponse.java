package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetVariableResult;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;

public class SetVariablesResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * (Required)
     */
    @Required
    private List<SetVariableResult> setVariableResult = null;

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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SetVariablesResponse))
            return false;
        SetVariablesResponse that = (SetVariablesResponse) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(setVariableResult, that.setVariableResult);
    }

    @Override
    public int hashCode() {
        int result = (setVariableResult != null ? setVariableResult.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
