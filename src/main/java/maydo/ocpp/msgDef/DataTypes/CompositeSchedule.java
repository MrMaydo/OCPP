package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ChargingRateUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.List;
import java.util.Objects;


/**
 * Composite_ Schedule
 * urn:x-oca:ocpp:uid:2:233362
 */
public class CompositeSchedule implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * (Required)
     */
    @Required
    private List<ChargingSchedulePeriod> chargingSchedulePeriod = null;
    /**
     * The ID of the EVSE for which the
     * schedule is requested. When evseid=0, the
     * Charging Station calculated the expected
     * consumption for the grid connection.
     * <p>
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * Duration of the schedule in seconds.
     * <p>
     * (Required)
     */
    @Required
    private Integer duration;
    /**
     * Composite_ Schedule. Start. Date_ Time
     * urn:x-oca:ocpp:uid:1:569456
     * Date and time at which the schedule becomes active. All time measurements within the schedule are relative to this timestamp.
     * <p>
     * (Required)
     */
    @Required
    private Date scheduleStart;
    /**
     * The unit of measure Limit is
     * expressed in.
     * <p>
     * (Required)
     */
    @Required
    private ChargingRateUnitEnum chargingRateUnit;

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

    /**
     * (Required)
     */
    public List<ChargingSchedulePeriod> getChargingSchedulePeriod() {
        return chargingSchedulePeriod;
    }

    /**
     * (Required)
     */
    public void setChargingSchedulePeriod(List<ChargingSchedulePeriod> chargingSchedulePeriod) {
        this.chargingSchedulePeriod = chargingSchedulePeriod;
    }

    /**
     * The ID of the EVSE for which the
     * schedule is requested. When evseid=0, the
     * Charging Station calculated the expected
     * consumption for the grid connection.
     * <p>
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The ID of the EVSE for which the
     * schedule is requested. When evseid=0, the
     * Charging Station calculated the expected
     * consumption for the grid connection.
     * <p>
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Duration of the schedule in seconds.
     * <p>
     * (Required)
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Duration of the schedule in seconds.
     * <p>
     * (Required)
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Composite_ Schedule. Start. Date_ Time
     * urn:x-oca:ocpp:uid:1:569456
     * Date and time at which the schedule becomes active. All time measurements within the schedule are relative to this timestamp.
     * <p>
     * (Required)
     */
    public Date getScheduleStart() {
        return scheduleStart;
    }

    /**
     * Composite_ Schedule. Start. Date_ Time
     * urn:x-oca:ocpp:uid:1:569456
     * Date and time at which the schedule becomes active. All time measurements within the schedule are relative to this timestamp.
     * <p>
     * (Required)
     */
    public void setScheduleStart(Date scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    /**
     * The unit of measure Limit is
     * expressed in.
     * <p>
     * (Required)
     */
    public ChargingRateUnitEnum getChargingRateUnit() {
        return chargingRateUnit;
    }

    /**
     * The unit of measure Limit is
     * expressed in.
     * <p>
     * (Required)
     */
    public void setChargingRateUnit(ChargingRateUnitEnum chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CompositeSchedule))
            return false;
        CompositeSchedule that = (CompositeSchedule) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(chargingSchedulePeriod, that.chargingSchedulePeriod)
                && Objects.equals(evseId, that.evseId)
                && Objects.equals(duration, that.duration)
                && Objects.equals(scheduleStart, that.scheduleStart)
                && chargingRateUnit == that.chargingRateUnit;
    }

    @Override
    public int hashCode() {
        int result = (chargingSchedulePeriod != null ? chargingSchedulePeriod.hashCode() : 0);
        result = 31 * result + (evseId != null ? evseId.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (scheduleStart != null ? scheduleStart.hashCode() : 0);
        result = 31 * result + (chargingRateUnit != null ? chargingRateUnit.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
