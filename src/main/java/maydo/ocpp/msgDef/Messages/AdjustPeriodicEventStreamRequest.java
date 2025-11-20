package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.PeriodicEventStreamParams;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class AdjustPeriodicEventStreamRequest implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * (Required)
     */
    @Required
    private PeriodicEventStreamParams params;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public AdjustPeriodicEventStreamRequest() {
    }

    public AdjustPeriodicEventStreamRequest(Integer id, PeriodicEventStreamParams params, CustomData customData) {
        super();
        this.id = id;
        this.params = params;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * (Required)
     */
    public PeriodicEventStreamParams getParams() {
        return params;
    }

    /**
     * (Required)
     */
    public void setParams(PeriodicEventStreamParams params) {
        this.params = params;
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
        json.addProperty("id", id);
        json.add("params", params.toJsonObject());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
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
