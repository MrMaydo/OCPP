package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.PeriodicEventStreamParams;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class AdjustPeriodicEventStreamRequest implements JsonInterface {

    /**
     *
     */
    @Required
    private Integer id;

    /**
     * Updated rate of sending data
     */
    @Required
    private PeriodicEventStreamParams params;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public AdjustPeriodicEventStreamRequest() {
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
        json.addProperty("id", id);
        json.add("params", params.toJsonObject());
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
        if (jsonObject.has("id")) {
            this.id = jsonObject.get("id").getAsInt();
        }

        if (jsonObject.has("params")) {
            this.params = new PeriodicEventStreamParams();
            this.params.fromJsonObject(jsonObject.getAsJsonObject("params"));
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
        if (!(obj instanceof AdjustPeriodicEventStreamRequest))
            return false;
        AdjustPeriodicEventStreamRequest that = (AdjustPeriodicEventStreamRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.params != null ? this.params.hashCode() : 0);
        return result;
    }
}
