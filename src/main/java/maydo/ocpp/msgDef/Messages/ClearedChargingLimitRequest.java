package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ChargingLimitSourceEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class ClearedChargingLimitRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Source of the charging limit.
     * <p>
     * (Required)
     */
    @Required
    private ChargingLimitSourceEnum chargingLimitSource;
    /**
     * EVSE Identifier.
     */
    @Optional
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
     * Source of the charging limit.
     * <p>
     * (Required)
     */
    public ChargingLimitSourceEnum getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * Source of the charging limit.
     * <p>
     * (Required)
     */
    public void setChargingLimitSource(ChargingLimitSourceEnum chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    /**
     * EVSE Identifier.
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * EVSE Identifier.
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ClearedChargingLimitRequest))
            return false;
        ClearedChargingLimitRequest that = (ClearedChargingLimitRequest) obj;
        return Objects.equals(customData, that.customData)
                && chargingLimitSource == that.chargingLimitSource
                && Objects.equals(evseId, that.evseId);
    }

    @Override
    public int hashCode() {
        int result = (chargingLimitSource != null ? chargingLimitSource.hashCode() : 0);
        result = 31 * result + (evseId != null ? evseId.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
