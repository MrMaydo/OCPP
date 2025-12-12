package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * Collection of one or more sampled values in MeterValuesRequest and TransactionEvent.
 * All sampled values in a MeterValue are sampled at the same point in time.
 */
public class MeterValue implements JsonInterface {

    /**
     * One or more measured values
     */
    @Required
    private List<SampledValue> sampledValue;

    /**
     * Timestamp for measured value(s).
     */
    @Required
    private Date timestamp;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public MeterValue() {
    }


    public List<SampledValue> getSampledValue() {
        return sampledValue;
    }


    public void setSampledValue(List<SampledValue> sampledValue) {
        this.sampledValue = sampledValue;
    }


    public Date getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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
        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(timestamp));
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
        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.timestamp = dateFormat.parse(jsonObject.get("timestamp").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
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
        if (!(obj instanceof MeterValue))
            return false;
        MeterValue that = (MeterValue) obj;
        return Objects.equals(this.sampledValue, that.sampledValue)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.sampledValue != null ? this.sampledValue.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
