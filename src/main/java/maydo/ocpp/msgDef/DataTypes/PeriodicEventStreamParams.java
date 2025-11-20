package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

public class PeriodicEventStreamParams implements JsonInterface {

    /**
     * Time in seconds after which stream data is sent.
     */
    @Optional
    private Integer interval;
    /**
     * Number of items to be sent together in stream.
     */
    @Optional
    private Integer values;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public PeriodicEventStreamParams() {
    }

    /**
     * @param values   Number of items to be sent together in stream.
     *                 .
     * @param interval Time in seconds after which stream data is sent.
     *                 .
     */
    public PeriodicEventStreamParams(Integer interval, Integer values, CustomData customData) {
        super();
        this.interval = interval;
        this.values = values;
        this.customData = customData;
    }

    /**
     * Time in seconds after which stream data is sent.
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * Time in seconds after which stream data is sent.
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * Number of items to be sent together in stream.
     */
    public Integer getValues() {
        return values;
    }

    /**
     * Number of items to be sent together in stream.
     */
    public void setValues(Integer values) {
        this.values = values;
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
        json.addProperty("interval", interval);
        json.addProperty("values", values);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("interval")) {
            this.interval = jsonObject.get("interval").getAsInt();
        }

        if (jsonObject.has("values")) {
            this.values = jsonObject.get("values").getAsInt();
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
        if (!(obj instanceof PeriodicEventStreamParams))
            return false;
        PeriodicEventStreamParams that = (PeriodicEventStreamParams) obj;
        return Objects.equals(this.interval, that.interval)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.interval != null ? this.interval.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.values != null ? this.values.hashCode() : 0);
        return result;
    }
}
