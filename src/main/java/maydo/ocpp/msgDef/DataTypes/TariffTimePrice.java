package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Tariff with optional conditions for a time duration price.
 */
public class TariffTimePrice implements JsonInterface {

    /**
     * Price per minute (excl. tax) for this element.
     * <p>
     * (Required)
     */
    @Required
    private Float priceMinute;
    /**
     * These conditions describe if and when a TariffEnergyType or TariffTimeType applies during a transaction.
     * <p>
     * When more than one restriction is set, they are to be treated as a logical AND. All need to be valid before this price is active.
     * <p>
     * For reverse energy flow (discharging) negative values of energy, power and current are used.
     * <p>
     * NOTE: _minXXX_ (where XXX = Kwh/A/Kw) must be read as "closest to zero", and _maxXXX_ as "furthest from zero". For example, a *charging* power range from 10 kW to 50 kWh is given by _minPower_ = 10000 and _maxPower_ = 50000, and a *discharging* power range from -10 kW to -50 kW is given by _minPower_ = -10 and _maxPower_ = -50.
     * <p>
     * NOTE: _startTimeOfDay_ and _endTimeOfDay_ are in local time, because it is the time in the tariff as it is shown to the EV driver at the Charging Station.
     * A Charging Station will convert this to the internal time zone that it uses (which is recommended to be UTC, see section Generic chapter 3.1) when performing cost calculation.
     */
    @Optional
    private TariffConditions conditions;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TariffTimePrice() {
    }

    /**
     * @param priceMinute Price per minute (excl. tax) for this element.
     *                    .
     */
    public TariffTimePrice(Float priceMinute, TariffConditions conditions, CustomData customData) {
        super();
        this.priceMinute = priceMinute;
        this.conditions = conditions;
        this.customData = customData;
    }

    /**
     * Price per minute (excl. tax) for this element.
     * <p>
     * (Required)
     */
    public Float getPriceMinute() {
        return priceMinute;
    }

    /**
     * Price per minute (excl. tax) for this element.
     * <p>
     * (Required)
     */
    public void setPriceMinute(Float priceMinute) {
        this.priceMinute = priceMinute;
    }

    /**
     * These conditions describe if and when a TariffEnergyType or TariffTimeType applies during a transaction.
     * <p>
     * When more than one restriction is set, they are to be treated as a logical AND. All need to be valid before this price is active.
     * <p>
     * For reverse energy flow (discharging) negative values of energy, power and current are used.
     * <p>
     * NOTE: _minXXX_ (where XXX = Kwh/A/Kw) must be read as "closest to zero", and _maxXXX_ as "furthest from zero". For example, a *charging* power range from 10 kW to 50 kWh is given by _minPower_ = 10000 and _maxPower_ = 50000, and a *discharging* power range from -10 kW to -50 kW is given by _minPower_ = -10 and _maxPower_ = -50.
     * <p>
     * NOTE: _startTimeOfDay_ and _endTimeOfDay_ are in local time, because it is the time in the tariff as it is shown to the EV driver at the Charging Station.
     * A Charging Station will convert this to the internal time zone that it uses (which is recommended to be UTC, see section Generic chapter 3.1) when performing cost calculation.
     */
    public TariffConditions getConditions() {
        return conditions;
    }

    /**
     * These conditions describe if and when a TariffEnergyType or TariffTimeType applies during a transaction.
     * <p>
     * When more than one restriction is set, they are to be treated as a logical AND. All need to be valid before this price is active.
     * <p>
     * For reverse energy flow (discharging) negative values of energy, power and current are used.
     * <p>
     * NOTE: _minXXX_ (where XXX = Kwh/A/Kw) must be read as "closest to zero", and _maxXXX_ as "furthest from zero". For example, a *charging* power range from 10 kW to 50 kWh is given by _minPower_ = 10000 and _maxPower_ = 50000, and a *discharging* power range from -10 kW to -50 kW is given by _minPower_ = -10 and _maxPower_ = -50.
     * <p>
     * NOTE: _startTimeOfDay_ and _endTimeOfDay_ are in local time, because it is the time in the tariff as it is shown to the EV driver at the Charging Station.
     * A Charging Station will convert this to the internal time zone that it uses (which is recommended to be UTC, see section Generic chapter 3.1) when performing cost calculation.
     */
    public void setConditions(TariffConditions conditions) {
        this.conditions = conditions;
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
        json.addProperty("priceMinute", priceMinute);
        json.add("conditions", conditions.toJsonObject());
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
        if (jsonObject.has("priceMinute")) {
            this.priceMinute = jsonObject.get("priceMinute").getAsFloat();
        }

        if (jsonObject.has("conditions")) {
            this.conditions = new TariffConditions();
            this.conditions.fromJsonObject(jsonObject.getAsJsonObject("conditions"));
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
        if (!(obj instanceof TariffTimePrice))
            return false;
        TariffTimePrice that = (TariffTimePrice) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priceMinute, that.priceMinute)
                && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priceMinute != null ? this.priceMinute.hashCode() : 0);
        result = 31 * result + (this.conditions != null ? this.conditions.hashCode() : 0);
        return result;
    }
}
