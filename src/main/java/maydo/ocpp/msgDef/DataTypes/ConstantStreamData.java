package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class ConstantStreamData implements JsonInterface {

    /**
     * Uniquely identifies the stream
     * 
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * 
     * (Required)
     */
    @Required
    private PeriodicEventStreamParams params;
    /**
     * Id of monitor used to report his event. It can be a preconfigured or hardwired monitor.
     * 
     * (Required)
     */
    @Required
    private Integer variableMonitoringId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ConstantStreamData() {
    }

    /**
     * 
     * @param variableMonitoringId
     *     Id of monitor used to report his event. It can be a preconfigured or hardwired monitor.
     *     .
     * @param id
     *     Uniquely identifies the stream
     *     .
     */
    public ConstantStreamData(Integer id, PeriodicEventStreamParams params, Integer variableMonitoringId, CustomData customData) {
        super();
        this.id = id;
        this.params = params;
        this.variableMonitoringId = variableMonitoringId;
        this.customData = customData;
    }

    /**
     * Uniquely identifies the stream
     * 
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Uniquely identifies the stream
     * 
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     */
    public PeriodicEventStreamParams getParams() {
        return params;
    }

    /**
     * 
     * (Required)
     */
    public void setParams(PeriodicEventStreamParams params) {
        this.params = params;
    }

    /**
     * Id of monitor used to report his event. It can be a preconfigured or hardwired monitor.
     * 
     * (Required)
     */
    public Integer getVariableMonitoringId() {
        return variableMonitoringId;
    }

    /**
     * Id of monitor used to report his event. It can be a preconfigured or hardwired monitor.
     * 
     * (Required)
     */
    public void setVariableMonitoringId(Integer variableMonitoringId) {
        this.variableMonitoringId = variableMonitoringId;
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
        if (!(obj instanceof ConstantStreamData))
            return false;
        ConstantStreamData that = (ConstantStreamData) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id) 
                && Objects.equals(this.params, that.params) 
                && Objects.equals(this.variableMonitoringId, that.variableMonitoringId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.params != null ? this.params.hashCode() : 0);
        result = 31 * result + (this.variableMonitoringId != null ? this.variableMonitoringId.hashCode() : 0);
        return result;
    }
}
