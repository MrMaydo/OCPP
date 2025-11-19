package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class ClearVariableMonitoringRequest implements JsonInterface {

    /**
     * List of the monitors to be cleared, identified by there Id.
     * 
     * (Required)
     */
    @Required
    private List<Integer> id;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ClearVariableMonitoringRequest() {
    }

    /**
     * 
     * @param id
     *     List of the monitors to be cleared, identified by there Id.
     *     .
     */
    public ClearVariableMonitoringRequest(List<Integer> id, CustomData customData) {
        super();
        this.id = id;
        this.customData = customData;
    }

    /**
     * List of the monitors to be cleared, identified by there Id.
     * 
     * (Required)
     */
    public List<Integer> getId() {
        return id;
    }

    /**
     * List of the monitors to be cleared, identified by there Id.
     * 
     * (Required)
     */
    public void setId(List<Integer> id) {
        this.id = id;
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
        if (!(obj instanceof ClearVariableMonitoringRequest))
            return false;
        ClearVariableMonitoringRequest that = (ClearVariableMonitoringRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        return result;
    }
}
