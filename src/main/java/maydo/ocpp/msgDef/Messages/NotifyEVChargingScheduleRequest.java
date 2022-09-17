
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ChargingSchedule;
import maydo.ocpp.msgDef.DataTypes.CustomData;

import java.util.Date;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class NotifyEVChargingScheduleRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Periods contained in the charging profile are relative to this point in time.
     * 
     * (Required)
     * 
     */
    private Date timeBase;
    /**
     * Charging_ Schedule
     * urn:x-oca:ocpp:uid:2:233256
     * Charging schedule structure defines a list of charging periods, as used in: GetCompositeSchedule.conf and ChargingProfile. 
     * 
     * (Required)
     * 
     */
    private ChargingSchedule chargingSchedule;
    /**
     * The charging schedule contained in this notification applies to an EVSE. EvseId must be &gt; 0.
     * 
     * (Required)
     * 
     */
    private Integer evseId;

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
     * Periods contained in the charging profile are relative to this point in time.
     * 
     * (Required)
     * 
     */
    public Date getTimeBase() {
        return timeBase;
    }

    /**
     * Periods contained in the charging profile are relative to this point in time.
     * 
     * (Required)
     * 
     */
    public void setTimeBase(Date timeBase) {
        this.timeBase = timeBase;
    }

    /**
     * Charging_ Schedule
     * urn:x-oca:ocpp:uid:2:233256
     * Charging schedule structure defines a list of charging periods, as used in: GetCompositeSchedule.conf and ChargingProfile. 
     * 
     * (Required)
     * 
     */
    public ChargingSchedule getChargingSchedule() {
        return chargingSchedule;
    }

    /**
     * Charging_ Schedule
     * urn:x-oca:ocpp:uid:2:233256
     * Charging schedule structure defines a list of charging periods, as used in: GetCompositeSchedule.conf and ChargingProfile. 
     * 
     * (Required)
     * 
     */
    public void setChargingSchedule(ChargingSchedule chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    /**
     * The charging schedule contained in this notification applies to an EVSE. EvseId must be &gt; 0.
     * 
     * (Required)
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The charging schedule contained in this notification applies to an EVSE. EvseId must be &gt; 0.
     * 
     * (Required)
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

}
