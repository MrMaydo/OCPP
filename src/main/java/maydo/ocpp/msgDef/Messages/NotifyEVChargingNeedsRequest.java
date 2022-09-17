
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ChargingNeeds;
import maydo.ocpp.msgDef.DataTypes.CustomData;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class NotifyEVChargingNeedsRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Contains the maximum schedule tuples the car supports per schedule.
     * 
     * 
     */
    private Integer maxScheduleTuples;
    /**
     * Charging_ Needs
     * urn:x-oca:ocpp:uid:2:233249
     * 
     * (Required)
     * 
     */
    private ChargingNeeds chargingNeeds;
    /**
     * Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
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
     * Contains the maximum schedule tuples the car supports per schedule.
     * 
     * 
     */
    public Integer getMaxScheduleTuples() {
        return maxScheduleTuples;
    }

    /**
     * Contains the maximum schedule tuples the car supports per schedule.
     * 
     * 
     */
    public void setMaxScheduleTuples(Integer maxScheduleTuples) {
        this.maxScheduleTuples = maxScheduleTuples;
    }

    /**
     * Charging_ Needs
     * urn:x-oca:ocpp:uid:2:233249
     * 
     * (Required)
     * 
     */
    public ChargingNeeds getChargingNeeds() {
        return chargingNeeds;
    }

    /**
     * Charging_ Needs
     * urn:x-oca:ocpp:uid:2:233249
     * 
     * (Required)
     * 
     */
    public void setChargingNeeds(ChargingNeeds chargingNeeds) {
        this.chargingNeeds = chargingNeeds;
    }

    /**
     * Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
     * 
     * (Required)
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
     * 
     * (Required)
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

}
