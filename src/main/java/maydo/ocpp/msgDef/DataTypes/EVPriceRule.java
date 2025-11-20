package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * *(2.1)* An entry in price schedule over time for which EV is willing to discharge.
 */
public class EVPriceRule implements JsonInterface {

    /**
     * Cost per kWh.
     * <p>
     * (Required)
     */
    @Required
    private Float energyFee;
    /**
     * The EnergyFee applies between this value and the value of the PowerRangeStart of the subsequent EVPriceRule. If the power is below this value, the EnergyFee of the previous EVPriceRule applies. Negative values are used for discharging.
     * <p>
     * (Required)
     */
    @Required
    private Float powerRangeStart;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public EVPriceRule() {
    }

    /**
     * @param energyFee       Cost per kWh.
     *                        .
     * @param powerRangeStart The EnergyFee applies between this value and the value of the PowerRangeStart of the subsequent EVPriceRule. If the power is below this value, the EnergyFee of the previous EVPriceRule applies. Negative values are used for discharging.
     *                        .
     */
    public EVPriceRule(Float energyFee, Float powerRangeStart, CustomData customData) {
        super();
        this.energyFee = energyFee;
        this.powerRangeStart = powerRangeStart;
        this.customData = customData;
    }

    /**
     * Cost per kWh.
     * <p>
     * (Required)
     */
    public Float getEnergyFee() {
        return energyFee;
    }

    /**
     * Cost per kWh.
     * <p>
     * (Required)
     */
    public void setEnergyFee(Float energyFee) {
        this.energyFee = energyFee;
    }

    /**
     * The EnergyFee applies between this value and the value of the PowerRangeStart of the subsequent EVPriceRule. If the power is below this value, the EnergyFee of the previous EVPriceRule applies. Negative values are used for discharging.
     * <p>
     * (Required)
     */
    public Float getPowerRangeStart() {
        return powerRangeStart;
    }

    /**
     * The EnergyFee applies between this value and the value of the PowerRangeStart of the subsequent EVPriceRule. If the power is below this value, the EnergyFee of the previous EVPriceRule applies. Negative values are used for discharging.
     * <p>
     * (Required)
     */
    public void setPowerRangeStart(Float powerRangeStart) {
        this.powerRangeStart = powerRangeStart;
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
        json.addProperty("energyFee", energyFee);
        json.addProperty("powerRangeStart", powerRangeStart);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("energyFee")) {
            this.energyFee = jsonObject.get("energyFee").getAsFloat();
        }

        if (jsonObject.has("powerRangeStart")) {
            this.powerRangeStart = jsonObject.get("powerRangeStart").getAsFloat();
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
