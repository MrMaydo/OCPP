package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetMonitoringResult;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class SetVariableMonitoringResponse implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private List<SetMonitoringResult> setMonitoringResult;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SetVariableMonitoringResponse() {
    }

    public SetVariableMonitoringResponse(List<SetMonitoringResult> setMonitoringResult, CustomData customData) {
        super();
        this.setMonitoringResult = setMonitoringResult;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public List<SetMonitoringResult> getSetMonitoringResult() {
        return setMonitoringResult;
    }

    /**
     * (Required)
     */
    public void setSetMonitoringResult(List<SetMonitoringResult> setMonitoringResult) {
        this.setMonitoringResult = setMonitoringResult;
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
        if (!(obj instanceof SetVariableMonitoringResponse))
            return false;
        SetVariableMonitoringResponse that = (SetVariableMonitoringResponse) obj;
        return Objects.equals(this.setMonitoringResult, that.setMonitoringResult)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.setMonitoringResult != null ? this.setMonitoringResult.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
