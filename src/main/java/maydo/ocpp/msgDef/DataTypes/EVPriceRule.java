package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * (2.1) An entry in price schedule over time for which EV is willing to discharge.
 */
public class EVPriceRule implements JsonInterface {

    /**
     * Cost per kWh.
     */
    @Required
    private Float energyFee;

    /**
     * The EnergyFee applies between this value and the value of the PowerRangeStart of the subsequent EVPriceRule.
     * If the power is below this value, the EnergyFee of the previous EVPriceRule applies.
     * Negative values are used for discharging.
     */
    @Required
    private Float powerRangeStart;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public EVPriceRule() {
    }


    public Float getEnergyFee() {
        return energyFee;
    }


    public void setEnergyFee(Float energyFee) {
        this.energyFee = energyFee;
    }


    public Float getPowerRangeStart() {
        return powerRangeStart;
    }


    public void setPowerRangeStart(Float powerRangeStart) {
        this.powerRangeStart = powerRangeStart;
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
        json.addProperty("energyFee", energyFee);
        json.addProperty("powerRangeStart", powerRangeStart);
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
        if (jsonObject.has("energyFee")) {
            setEnergyFee(jsonObject.get("energyFee").getAsFloat());
        }

        if (jsonObject.has("powerRangeStart")) {
            setPowerRangeStart(jsonObject.get("powerRangeStart").getAsFloat());
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
        if (!(obj instanceof EVPriceRule))
            return false;
        EVPriceRule that = (EVPriceRule) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.energyFee, that.energyFee)
                && Objects.equals(this.powerRangeStart, that.powerRangeStart);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.energyFee != null ? this.energyFee.hashCode() : 0);
        result = 31 * result + (this.powerRangeStart != null ? this.powerRangeStart.hashCode() : 0);
        return result;
    }
}
