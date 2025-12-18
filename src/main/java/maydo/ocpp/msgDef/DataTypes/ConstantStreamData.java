package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class ConstantStreamData implements JsonInterface {

    /**
     * Uniquely identifies the stream
     */
    @Required
    private Integer id;

    /**
     * Max time and items parameters
     */
    @Required
    private PeriodicEventStreamParams params;

    /**
     * Id of monitor used to report his event. It can be a preconfigured or hardwired monitor.
     */
    @Required
    private Integer variableMonitoringId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ConstantStreamData() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public PeriodicEventStreamParams getParams() {
        return params;
    }


    public void setParams(PeriodicEventStreamParams params) {
        this.params = params;
    }


    public Integer getVariableMonitoringId() {
        return variableMonitoringId;
    }


    public void setVariableMonitoringId(Integer variableMonitoringId) {
        this.variableMonitoringId = variableMonitoringId;
    }


    public CustomData getCustomData() {
        return customData;
    }


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

        json.addProperty("id", getId());

        json.add("params", getParams().toJsonObject());

        json.addProperty("variableMonitoringId", getVariableMonitoringId());

        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("id")) {
            setId(jsonObject.get("id").getAsInt());
        }

        if (jsonObject.has("params")) {
            setParams(new PeriodicEventStreamParams());
            getParams().fromJsonObject(jsonObject.getAsJsonObject("params"));
        }

        if (jsonObject.has("variableMonitoringId")) {
            setVariableMonitoringId(jsonObject.get("variableMonitoringId").getAsInt());
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
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
        return Objects.hash(
                getId(),
                getParams(),
                getVariableMonitoringId(),
                getCustomData()
        );
    }
}
