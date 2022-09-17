
package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.ChargingRateUnitEnum;

import java.util.Date;
import java.util.List;
import javax.annotation.Generated;


/**
 * Composite_ Schedule
 * urn:x-oca:ocpp:uid:2:233362
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class CompositeSchedule {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * 
     * (Required)
     * 
     */
    private List<ChargingSchedulePeriod> chargingSchedulePeriod = null;
    /**
     * The ID of the EVSE for which the
     * schedule is requested. When evseid=0, the
     * Charging Station calculated the expected
     * consumption for the grid connection.
     * 
     * (Required)
     * 
     */
    private Integer evseId;
    /**
     * Duration of the schedule in seconds.
     * 
     * (Required)
     * 
     */
    private Integer duration;
    /**
     * Composite_ Schedule. Start. Date_ Time
     * urn:x-oca:ocpp:uid:1:569456
     * Date and time at which the schedule becomes active. All time measurements within the schedule are relative to this timestamp.
     * 
     * (Required)
     * 
     */
    private Date scheduleStart;
    /**
     * The unit of measure Limit is
     * expressed in.
     * 
     * (Required)
     * 
     */
    private ChargingRateUnitEnum chargingRateUnit;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<ChargingSchedulePeriod> getChargingSchedulePeriod() {
        return chargingSchedulePeriod;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setChargingSchedulePeriod(List<ChargingSchedulePeriod> chargingSchedulePeriod) {
        this.chargingSchedulePeriod = chargingSchedulePeriod;
    }

    /**
     * The ID of the EVSE for which the
     * schedule is requested. When evseid=0, the
     * Charging Station calculated the expected
     * consumption for the grid connection.
     * 
     * (Required)
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The ID of the EVSE for which the
     * schedule is requested. When evseid=0, the
     * Charging Station calculated the expected
     * consumption for the grid connection.
     * 
     * (Required)
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Duration of the schedule in seconds.
     * 
     * (Required)
     * 
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Duration of the schedule in seconds.
     * 
     * (Required)
     * 
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Composite_ Schedule. Start. Date_ Time
     * urn:x-oca:ocpp:uid:1:569456
     * Date and time at which the schedule becomes active. All time measurements within the schedule are relative to this timestamp.
     * 
     * (Required)
     * 
     */
    public Date getScheduleStart() {
        return scheduleStart;
    }

    /**
     * Composite_ Schedule. Start. Date_ Time
     * urn:x-oca:ocpp:uid:1:569456
     * Date and time at which the schedule becomes active. All time measurements within the schedule are relative to this timestamp.
     * 
     * (Required)
     * 
     */
    public void setScheduleStart(Date scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    /**
     * The unit of measure Limit is
     * expressed in.
     * 
     * (Required)
     * 
     */
    public ChargingRateUnitEnum getChargingRateUnit() {
        return chargingRateUnit;
    }

    /**
     * The unit of measure Limit is
     * expressed in.
     * 
     * (Required)
     * 
     */
    public void setChargingRateUnit(ChargingRateUnitEnum chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

}
