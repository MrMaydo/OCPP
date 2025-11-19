package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * *(2.1)* An entry in schedule of the energy amount over time that EV is willing to discharge. A negative value indicates the willingness to discharge under specific conditions, a positive value indicates that the EV currently is not able to offer energy to discharge.
 * 
 * 
 */
public class EVPowerScheduleEntry implements JsonInterface {

    /**
     * The duration of this entry.
     * 
     * (Required)
     */
    @Required
    private Integer duration;
    /**
     * Defines maximum amount of power for the duration of this EVPowerScheduleEntry to be discharged from the EV battery through EVSE power outlet. Negative values are used for discharging.
     * 
     * (Required)
     */
    @Required
    private Float power;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public EVPowerScheduleEntry() {
    }

    /**
     * 
     * @param duration
     *     The duration of this entry.
     *     .
     * @param power
     *     Defines maximum amount of power for the duration of this EVPowerScheduleEntry to be discharged from the EV battery through EVSE power outlet. Negative values are used for discharging.
     *     .
     */
    public EVPowerScheduleEntry(Integer duration, Float power, CustomData customData) {
        super();
        this.duration = duration;
        this.power = power;
        this.customData = customData;
    }

    /**
     * The duration of this entry.
     * 
     * (Required)
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * The duration of this entry.
     * 
     * (Required)
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Defines maximum amount of power for the duration of this EVPowerScheduleEntry to be discharged from the EV battery through EVSE power outlet. Negative values are used for discharging.
     * 
     * (Required)
     */
    public Float getPower() {
        return power;
    }

    /**
     * Defines maximum amount of power for the duration of this EVPowerScheduleEntry to be discharged from the EV battery through EVSE power outlet. Negative values are used for discharging.
     * 
     * (Required)
     */
    public void setPower(Float power) {
        this.power = power;
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
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof EVPowerScheduleEntry))
            return false;
        EVPowerScheduleEntry that = (EVPowerScheduleEntry) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.power, that.power);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.power != null ? this.power.hashCode() : 0);
        return result;
    }
}
