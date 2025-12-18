package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ChargingRateUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the GetCompositeScheduleRequest PDU sent by the CSMS to the Charging Station.
 */
public class GetCompositeScheduleRequest implements JsonInterface {

    /**
     * The ID of the EVSE for which the schedule is requested.
     * When evseid=0, the Charging Station will calculate the expected consumption for the grid connection.
     */
    @Required
    private Integer evseId;

    /**
     * Length of the requested schedule in seconds.
     */
    @Required
    private Integer duration;

    /**
     * Can be used to force a power or current profile.
     */
    @Optional
    private ChargingRateUnitEnum chargingRateUnit;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetCompositeScheduleRequest() {
    }


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer duration) {
        this.duration = duration;
    }


    public ChargingRateUnitEnum getChargingRateUnit() {
        return chargingRateUnit;
    }


    public void setChargingRateUnit(ChargingRateUnitEnum chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
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

        json.addProperty("evseId", getEvseId());

        json.addProperty("duration", getDuration());

        if (getChargingRateUnit() != null) {
            json.addProperty("chargingRateUnit", getChargingRateUnit().toString());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

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
            setEvseId(jsonObject.get("evseId").getAsInt());
        }

        if (jsonObject.has("duration")) {
            setDuration(jsonObject.get("duration").getAsInt());
        }

        if (jsonObject.has("chargingRateUnit")) {
            setChargingRateUnit(ChargingRateUnitEnum.valueOf(jsonObject.get("chargingRateUnit").getAsString()));
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetCompositeScheduleRequest))
            return false;
        GetCompositeScheduleRequest that = (GetCompositeScheduleRequest) obj;
        return Objects.equals(getEvseId(), that.getEvseId())
                && Objects.equals(getDuration(), that.getDuration())
                && Objects.equals(getChargingRateUnit(), that.getChargingRateUnit())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getEvseId(),
                getDuration(),
                getChargingRateUnit(),
                getCustomData()
        );
    }
}
