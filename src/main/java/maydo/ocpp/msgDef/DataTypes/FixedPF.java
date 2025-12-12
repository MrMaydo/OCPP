package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
public class FixedPF implements JsonInterface {

    /**
     * Priority of setting (0=highest)
     */
    @Required
    private Integer priority;

    /**
     * Power factor, cos(phi), as value between 0..1.
     */
    @Required
    private Float displacement;

    /**
     * True when absorbing reactive power (under- excited), false when injecting reactive power (over- excited).
     */
    @Required
    private Boolean excitation;

    /**
     * Time when this setting becomes active
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


    public FixedPF() {
    }


    public FixedPF(Integer priority, Float displacement, Boolean excitation, Date startTime, Float duration, CustomData customData) {
        super();
        this.priority = priority;
        this.displacement = displacement;
        this.excitation = excitation;
        this.startTime = startTime;
        this.duration = duration;
        this.customData = customData;
    }


    public Integer getPriority() {
        return priority;
    }


    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    public Float getDisplacement() {
        return displacement;
    }


    public void setDisplacement(Float displacement) {
        this.displacement = displacement;
    }


    public Boolean getExcitation() {
        return excitation;
    }


    public void setExcitation(Boolean excitation) {
        this.excitation = excitation;
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
        json.addProperty("priority", priority);
        json.addProperty("displacement", displacement);
        json.addProperty("excitation", excitation);
        json.addProperty("startTime", new SimpleDateFormat(DATE_FORMAT).format(startTime));
        json.addProperty("duration", duration);
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
        if (jsonObject.has("priority")) {
            this.priority = jsonObject.get("priority").getAsInt();
        }

        if (jsonObject.has("displacement")) {
            this.displacement = jsonObject.get("displacement").getAsFloat();
        }

        if (jsonObject.has("excitation")) {
            this.excitation = jsonObject.get("excitation").getAsBoolean();
        }

        if (jsonObject.has("startTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.startTime = dateFormat.parse(jsonObject.get("startTime").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for startTime" + e);
            }
        }

        if (jsonObject.has("duration")) {
            this.duration = jsonObject.get("duration").getAsFloat();
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
        if (!(obj instanceof FixedPF))
            return false;
        FixedPF that = (FixedPF) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.excitation, that.excitation)
                && Objects.equals(this.displacement, that.displacement)
                && Objects.equals(this.startTime, that.startTime)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.excitation != null ? this.excitation.hashCode() : 0);
        result = 31 * result + (this.displacement != null ? this.displacement.hashCode() : 0);
        result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        return result;
    }
}
