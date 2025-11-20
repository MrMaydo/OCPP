package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ChargingLimit;
import maydo.ocpp.msgDef.DataTypes.ChargingSchedule;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class NotifyChargingLimitRequest implements JsonInterface {

    private List<ChargingSchedule> chargingSchedule;
    /**
     * The EVSE to which the charging limit is set. If absent or when zero, it applies to the entire Charging Station.
     */
    @Optional
    private Integer evseId;
    /**
     * (Required)
     */
    @Required
    private ChargingLimit chargingLimit;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyChargingLimitRequest() {
    }

    /**
     * @param evseId The EVSE to which the charging limit is set. If absent or when zero, it applies to the entire Charging Station.
     *               .
     */
    public NotifyChargingLimitRequest(List<ChargingSchedule> chargingSchedule, Integer evseId, ChargingLimit chargingLimit, CustomData customData) {
        super();
        this.chargingSchedule = chargingSchedule;
        this.evseId = evseId;
        this.chargingLimit = chargingLimit;
        this.customData = customData;
    }

    public List<ChargingSchedule> getChargingSchedule() {
        return chargingSchedule;
    }

    public void setChargingSchedule(List<ChargingSchedule> chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }

    /**
     * The EVSE to which the charging limit is set. If absent or when zero, it applies to the entire Charging Station.
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The EVSE to which the charging limit is set. If absent or when zero, it applies to the entire Charging Station.
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * (Required)
     */
    public ChargingLimit getChargingLimit() {
        return chargingLimit;
    }

    /**
     * (Required)
     */
    public void setChargingLimit(ChargingLimit chargingLimit) {
        this.chargingLimit = chargingLimit;
    }

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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        JsonObject json = new JsonObject();
        json.addProperty("evseId", evseId);
        json.add("chargingLimit", chargingLimit.toJsonObject());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof NotifyChargingLimitRequest))
            return false;
        NotifyChargingLimitRequest that = (NotifyChargingLimitRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.chargingSchedule, that.chargingSchedule)
                && Objects.equals(this.chargingLimit, that.chargingLimit);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.chargingSchedule != null ? this.chargingSchedule.hashCode() : 0);
        result = 31 * result + (this.chargingLimit != null ? this.chargingLimit.hashCode() : 0);
        return result;
    }
}
