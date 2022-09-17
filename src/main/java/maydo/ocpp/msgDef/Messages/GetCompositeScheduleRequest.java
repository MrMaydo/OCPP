
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ChargingRateUnitEnum;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GetCompositeScheduleRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Length of the requested schedule in seconds.
     * 
     * 
     * (Required)
     * 
     */
    private Integer duration;
    /**
     * Can be used to force a power or current profile.
     * 
     * 
     * 
     */
    private ChargingRateUnitEnum chargingRateUnit;
    /**
     * The ID of the EVSE for which the schedule is requested. When evseid=0, the Charging Station will calculate the expected consumption for the grid connection.
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
     * Length of the requested schedule in seconds.
     * 
     * 
     * (Required)
     * 
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Length of the requested schedule in seconds.
     * 
     * 
     * (Required)
     * 
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Can be used to force a power or current profile.
     * 
     * 
     * 
     */
    public ChargingRateUnitEnum getChargingRateUnit() {
        return chargingRateUnit;
    }

    /**
     * Can be used to force a power or current profile.
     * 
     * 
     * 
     */
    public void setChargingRateUnit(ChargingRateUnitEnum chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

    /**
     * The ID of the EVSE for which the schedule is requested. When evseid=0, the Charging Station will calculate the expected consumption for the grid connection.
     * 
     * (Required)
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The ID of the EVSE for which the schedule is requested. When evseid=0, the Charging Station will calculate the expected consumption for the grid connection.
     * 
     * (Required)
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

}
