package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetVariableData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;

public class SetVariablesRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * (Required)
     */
    @Required
    private List<SetVariableData> setVariableData = null;

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
    public List<SetVariableData> getSetVariableData() {
        return setVariableData;
    }

    /**
     * (Required)
     */
    public void setSetVariableData(List<SetVariableData> setVariableData) {
        this.setVariableData = setVariableData;
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
        if (!(obj instanceof SetVariablesRequest))
            return false;
        SetVariablesRequest that = (SetVariablesRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(setVariableData, that.setVariableData);
    }

    @Override
    public int hashCode() {
        int result = (setVariableData != null ? setVariableData.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
