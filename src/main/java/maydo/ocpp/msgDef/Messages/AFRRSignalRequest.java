package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class AFRRSignalRequest implements JsonInterface {

    /**
     * Time when signal becomes active.
     * <p>
     * (Required)
     */
    @Required
    private Date timestamp;
    /**
     * Value of signal in _v2xSignalWattCurve_.
     * <p>
     * (Required)
     */
    @Required
    private Integer signal;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public AFRRSignalRequest() {
    }

    /**
     * @param signal    Value of signal in _v2xSignalWattCurve_.
     *                  .
     * @param timestamp Time when signal becomes active.
     *                  .
     */
    public AFRRSignalRequest(Date timestamp, Integer signal, CustomData customData) {
        super();
        this.timestamp = timestamp;
        this.signal = signal;
        this.customData = customData;
    }

    /**
     * Time when signal becomes active.
     * <p>
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Time when signal becomes active.
     * <p>
     * (Required)
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Value of signal in _v2xSignalWattCurve_.
     * <p>
     * (Required)
     */
    public Integer getSignal() {
        return signal;
    }

    /**
     * Value of signal in _v2xSignalWattCurve_.
     * <p>
     * (Required)
     */
    public void setSignal(Integer signal) {
        this.signal = signal;
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
        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(timestamp));
        json.addProperty("signal", signal);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
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

        if (jsonObject.has("signal")) {
            this.signal = jsonObject.get("signal").getAsInt();
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
        if (!(obj instanceof AFRRSignalRequest))
            return false;
        AFRRSignalRequest that = (AFRRSignalRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.signal, that.signal)
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.signal != null ? this.signal.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
