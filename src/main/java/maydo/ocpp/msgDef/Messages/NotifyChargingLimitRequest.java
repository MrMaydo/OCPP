
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ChargingLimit;
import maydo.ocpp.msgDef.DataTypes.ChargingSchedule;
import maydo.ocpp.msgDef.DataTypes.CustomData;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class NotifyChargingLimitRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    private List<ChargingSchedule> chargingSchedule = null;
    /**
     * The charging schedule contained in this notification applies to an EVSE. evseId must be &gt; 0.
     * 
     * 
     */
    private Integer evseId;
    /**
     * Charging_ Limit
     * urn:x-enexis:ecdm:uid:2:234489
     * 
     * (Required)
     * 
     */
    private ChargingLimit chargingLimit;

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

    public List<ChargingSchedule> getChargingSchedule() {
        return chargingSchedule;
    }

    public void setChargingSchedule(List<ChargingSchedule> chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    /**
     * The charging schedule contained in this notification applies to an EVSE. evseId must be &gt; 0.
     * 
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The charging schedule contained in this notification applies to an EVSE. evseId must be &gt; 0.
     * 
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Charging_ Limit
     * urn:x-enexis:ecdm:uid:2:234489
     * 
     * (Required)
     * 
     */
    public ChargingLimit getChargingLimit() {
        return chargingLimit;
    }

    /**
     * Charging_ Limit
     * urn:x-enexis:ecdm:uid:2:234489
     * 
     * (Required)
     * 
     */
    public void setChargingLimit(ChargingLimit chargingLimit) {
        this.chargingLimit = chargingLimit;
    }

}
