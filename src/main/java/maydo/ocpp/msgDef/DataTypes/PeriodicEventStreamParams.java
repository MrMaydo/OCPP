package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 *
 */
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
     *
     */
    @Optional
    private CustomData customData;


    public PeriodicEventStreamParams() {
    }


    public Integer getInterval() {
        return interval;
    }


    public void setInterval(Integer interval) {
        this.interval = interval;
    }


    public Integer getValues() {
        return values;
    }


    public void setValues(Integer values) {
        this.values = values;
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

        if (getInterval() != null) {
            json.addProperty("interval", getInterval());
        }
        if (getValues() != null) {
            json.addProperty("values", getValues());
        }
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
        if (jsonObject.has("interval")) {
            setInterval(jsonObject.get("interval").getAsInt());
        }

        if (jsonObject.has("values")) {
            setValues(jsonObject.get("values").getAsInt());
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
        if (!(obj instanceof PeriodicEventStreamParams))
            return false;
        PeriodicEventStreamParams that = (PeriodicEventStreamParams) obj;
        return Objects.equals(this.interval, that.interval)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.values, that.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getInterval(),
                getValues(),
                getCustomData()
        );
    }
}
