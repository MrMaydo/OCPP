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

        json.addProperty("priority", getPriority());

        json.addProperty("displacement", getDisplacement());

        json.addProperty("excitation", getExcitation());

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

        if (jsonObject.has("displacement")) {
            setDisplacement(jsonObject.get("displacement").getAsFloat());
        }

        if (jsonObject.has("excitation")) {
            setExcitation(jsonObject.get("excitation").getAsBoolean());
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
        if (!(obj instanceof FixedPF))
            return false;
        FixedPF that = (FixedPF) obj;
        return Objects.equals(getPriority(), that.getPriority())
                && Objects.equals(getDisplacement(), that.getDisplacement())
                && Objects.equals(getExcitation(), that.getExcitation())
                && Objects.equals(getStartTime(), that.getStartTime())
                && Objects.equals(getDuration(), that.getDuration())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getPriority(),
                getDisplacement(),
                getExcitation(),
                getStartTime(),
                getDuration(),
                getCustomData()
        );
    }
}
