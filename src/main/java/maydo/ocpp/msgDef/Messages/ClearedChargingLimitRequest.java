
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ChargingLimitSourceEnum;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ClearedChargingLimitRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Source of the charging limit.
     * 
     * (Required)
     * 
     */
    private ChargingLimitSourceEnum chargingLimitSource;
    /**
     * EVSE Identifier.
     * 
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
     * Source of the charging limit.
     * 
     * (Required)
     * 
     */
    public ChargingLimitSourceEnum getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * Source of the charging limit.
     * 
     * (Required)
     * 
     */
    public void setChargingLimitSource(ChargingLimitSourceEnum chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    /**
     * EVSE Identifier.
     * 
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * EVSE Identifier.
     * 
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

}