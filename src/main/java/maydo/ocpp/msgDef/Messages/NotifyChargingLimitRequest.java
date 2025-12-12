package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingLimit;
import maydo.ocpp.msgDef.DataTypes.ChargingSchedule;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * The message NotifyChargingLimitRequest can be used to communicate a charging limit, set by an external system on the Charging
 * Station (Not installed by the CSO via SetChargingProfileRequest), to the CSMS.
 */
public class NotifyChargingLimitRequest implements JsonInterface {

    /**
     * Contains limits for the available power or current over time, as set by the external source.
     */
    @Optional
    private List<ChargingSchedule> chargingSchedule;

    /**
     * The EVSE to which the charging limit is set. If absent or when zero, it applies to the entire Charging Station.
     */
    @Optional
    private Integer evseId;

    /**
     * This contains the source of the charging limit and whether it is grid critical.
     */
    @Required
    private ChargingLimit chargingLimit;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyChargingLimitRequest() {
    }


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


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public ChargingLimit getChargingLimit() {
        return chargingLimit;
    }


    public void setChargingLimit(ChargingLimit chargingLimit) {
        this.chargingLimit = chargingLimit;
    }


    public CustomData getCustomData() {
        return customData;
    }


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
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("evseId")) {
            this.evseId = jsonObject.get("evseId").getAsInt();
        }

        if (jsonObject.has("chargingLimit")) {
            this.chargingLimit = new ChargingLimit();
            this.chargingLimit.fromJsonObject(jsonObject.getAsJsonObject("chargingLimit"));
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

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
