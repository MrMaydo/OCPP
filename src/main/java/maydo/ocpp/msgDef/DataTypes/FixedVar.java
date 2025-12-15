package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.DERUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 *
 */
public class FixedVar implements JsonInterface {

    /**
     * Priority of setting (0=highest)
     */
    @Required
    private Integer priority;

    /**
     * The value specifies a target var output interpreted as a signed percentage (-100 to 100).
     * A negative value refers to charging, whereas a positive one refers to discharging.
     * The value type is determined by the unit field.
     */
    @Required
    private Float setpoint;

    /**
     * Unit of the setpoint.
     */
    @Required
    private DERUnitEnum unit;

    /**
     * Time when this setting becomes active.
     */
    @Optional
    private Date startTime;

    /**
     * Duration in seconds that this setting is active.
     */
    @Optional
    private Float duration;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public FixedVar() {
    }


    public Integer getPriority() {
        return priority;
    }


    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    public Float getSetpoint() {
        return setpoint;
    }


    public void setSetpoint(Float setpoint) {
        this.setpoint = setpoint;
    }


    public DERUnitEnum getUnit() {
        return unit;
    }


    public void setUnit(DERUnitEnum unit) {
        this.unit = unit;
    }


    public Date getStartTime() {
        return startTime;
    }


    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }


    public Float getDuration() {
        return duration;
    }


    public void setDuration(Float duration) {
        this.duration = duration;
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

        json.addProperty("priority", getPriority());

        json.addProperty("setpoint", getSetpoint());

        json.addProperty("unit", getUnit().toString());

        if (getStartTime() != null) {
            json.addProperty("startTime", new SimpleDateFormat(DATE_FORMAT).format(getStartTime()));
        }
        if (getDuration() != null) {
            json.addProperty("duration", getDuration());
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
        if (jsonObject.has("priority")) {
            setPriority(jsonObject.get("priority").getAsInt());
        }

        if (jsonObject.has("setpoint")) {
            setSetpoint(jsonObject.get("setpoint").getAsFloat());
        }

        if (jsonObject.has("unit")) {
            setUnit(DERUnitEnum.valueOf(jsonObject.get("unit").getAsString()));
        }

        if (jsonObject.has("startTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setStartTime(dateFormat.parse(jsonObject.get("startTime").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for startTime" + e);
            }
        }

        if (jsonObject.has("duration")) {
            setDuration(jsonObject.get("duration").getAsFloat());
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
        if (!(obj instanceof FixedVar))
            return false;
        FixedVar that = (FixedVar) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.unit, that.unit)
                && Objects.equals(this.setpoint, that.setpoint)
                && Objects.equals(this.startTime, that.startTime)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.unit != null ? this.unit.hashCode() : 0);
        result = 31 * result + (this.setpoint != null ? this.setpoint.hashCode() : 0);
        result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        return result;
    }
}
