package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ChargingNeeds;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

public class NotifyEVChargingNeedsRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Contains the maximum schedule tuples the car supports per schedule.
     */
    @Optional
    private Integer maxScheduleTuples;
    /**
     * Charging_ Needs
     * urn:x-oca:ocpp:uid:2:233249
     * <p>
     * (Required)
     */
    @Required
    private ChargingNeeds chargingNeeds;
    /**
     * Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
     * <p>
     * (Required)
     */
    @Required
    private Integer evseId;

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
     * Contains the maximum schedule tuples the car supports per schedule.
     */
    public Integer getMaxScheduleTuples() {
        return maxScheduleTuples;
    }

    /**
     * Contains the maximum schedule tuples the car supports per schedule.
     */
    public void setMaxScheduleTuples(Integer maxScheduleTuples) {
        this.maxScheduleTuples = maxScheduleTuples;
    }

    /**
     * Charging_ Needs
     * urn:x-oca:ocpp:uid:2:233249
     * <p>
     * (Required)
     */
    public ChargingNeeds getChargingNeeds() {
        return chargingNeeds;
    }

    /**
     * Charging_ Needs
     * urn:x-oca:ocpp:uid:2:233249
     * <p>
     * (Required)
     */
    public void setChargingNeeds(ChargingNeeds chargingNeeds) {
        this.chargingNeeds = chargingNeeds;
    }

    /**
     * Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
     * <p>
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
     * <p>
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
