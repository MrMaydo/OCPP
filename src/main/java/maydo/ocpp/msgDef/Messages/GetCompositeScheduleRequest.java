package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ChargingRateUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetCompositeScheduleRequest implements JsonInterface {

    /**
     * Length of the requested schedule in seconds.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer duration;
    /**
     * Can be used to force a power or current profile.
     */
    @Optional
    private ChargingRateUnitEnum chargingRateUnit;
    /**
     * The ID of the EVSE for which the schedule is requested. When evseid=0, the Charging Station will calculate the expected consumption for the grid connection.
     * <p>
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetCompositeScheduleRequest() {
    }

    /**
     * @param duration Length of the requested schedule in seconds.
     *                 <p>
     *                 .
     * @param evseId   The ID of the EVSE for which the schedule is requested. When evseid=0, the Charging Station will calculate the expected consumption for the grid connection.
     *                 .
     */
    public GetCompositeScheduleRequest(Integer duration, ChargingRateUnitEnum chargingRateUnit, Integer evseId, CustomData customData) {
        super();
        this.duration = duration;
        this.chargingRateUnit = chargingRateUnit;
        this.evseId = evseId;
        this.customData = customData;
    }

    /**
     * Length of the requested schedule in seconds.
     * <p>
     * <p>
     * (Required)
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Length of the requested schedule in seconds.
     * <p>
     * <p>
     * (Required)
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Can be used to force a power or current profile.
     */
    public ChargingRateUnitEnum getChargingRateUnit() {
        return chargingRateUnit;
    }

    /**
     * Can be used to force a power or current profile.
     */
    public void setChargingRateUnit(ChargingRateUnitEnum chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

    /**
     * The ID of the EVSE for which the schedule is requested. When evseid=0, the Charging Station will calculate the expected consumption for the grid connection.
     * <p>
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The ID of the EVSE for which the schedule is requested. When evseid=0, the Charging Station will calculate the expected consumption for the grid connection.
     * <p>
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
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
        json.addProperty("duration", duration);
        json.addProperty("chargingRateUnit", chargingRateUnit.toString());
        json.addProperty("evseId", evseId);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("duration")) {
            this.duration = jsonObject.get("duration").getAsInt();
        }

        if (jsonObject.has("chargingRateUnit")) {
            this.chargingRateUnit = ChargingRateUnitEnum.valueOf(jsonObject.get("chargingRateUnit").getAsString());
        }

        if (jsonObject.has("evseId")) {
            this.evseId = jsonObject.get("evseId").getAsInt();
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
        if (!(obj instanceof GetCompositeScheduleRequest))
            return false;
        GetCompositeScheduleRequest that = (GetCompositeScheduleRequest) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.chargingRateUnit, that.chargingRateUnit);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.chargingRateUnit != null ? this.chargingRateUnit.hashCode() : 0);
        return result;
    }
}
