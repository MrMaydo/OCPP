package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ChargingLimit;
import maydo.ocpp.msgDef.DataTypes.ChargingSchedule;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;

public class NotifyChargingLimitRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    @Optional
    private List<ChargingSchedule> chargingSchedule = null;
    /**
     * The charging schedule contained in this notification applies to an EVSE. evseId must be &gt; 0.
     */
    @Optional
    private Integer evseId;
    /**
     * Charging_ Limit
     * urn:x-enexis:ecdm:uid:2:234489
     * <p>
     * (Required)
     */
    @Required
    private ChargingLimit chargingLimit;

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

    public List<ChargingSchedule> getChargingSchedule() {
        return chargingSchedule;
    }

    public void setChargingSchedule(List<ChargingSchedule> chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    /**
     * The charging schedule contained in this notification applies to an EVSE. evseId must be &gt; 0.
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The charging schedule contained in this notification applies to an EVSE. evseId must be &gt; 0.
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Charging_ Limit
     * urn:x-enexis:ecdm:uid:2:234489
     * <p>
     * (Required)
     */
    public ChargingLimit getChargingLimit() {
        return chargingLimit;
    }

    /**
     * Charging_ Limit
     * urn:x-enexis:ecdm:uid:2:234489
     * <p>
     * (Required)
     */
    public void setChargingLimit(ChargingLimit chargingLimit) {
        this.chargingLimit = chargingLimit;
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
