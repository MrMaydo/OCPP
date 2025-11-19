package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Tariff with optional conditions for a fixed price.
 */
public class TariffFixedPrice implements JsonInterface {

    /**
     * These conditions describe if a FixedPrice applies at start of the transaction.
     * <p>
     * When more than one restriction is set, they are to be treated as a logical AND. All need to be valid before this price is active.
     * <p>
     * NOTE: _startTimeOfDay_ and _endTimeOfDay_ are in local time, because it is the time in the tariff as it is shown to the EV driver at the Charging Station.
     * A Charging Station will convert this to the internal time zone that it uses (which is recommended to be UTC, see section Generic chapter 3.1) when performing cost calculation.
     */
    @Optional
    private TariffConditionsFixed conditions;
    /**
     * Fixed price  for this element e.g. a start fee.
     * <p>
     * (Required)
     */
    @Required
    private Float priceFixed;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TariffFixedPrice() {
    }

    /**
     * @param priceFixed Fixed price  for this element e.g. a start fee.
     *                   .
     */
    public TariffFixedPrice(TariffConditionsFixed conditions, Float priceFixed, CustomData customData) {
        super();
        this.conditions = conditions;
        this.priceFixed = priceFixed;
        this.customData = customData;
    }

    /**
     * These conditions describe if a FixedPrice applies at start of the transaction.
     * <p>
     * When more than one restriction is set, they are to be treated as a logical AND. All need to be valid before this price is active.
     * <p>
     * NOTE: _startTimeOfDay_ and _endTimeOfDay_ are in local time, because it is the time in the tariff as it is shown to the EV driver at the Charging Station.
     * A Charging Station will convert this to the internal time zone that it uses (which is recommended to be UTC, see section Generic chapter 3.1) when performing cost calculation.
     */
    public TariffConditionsFixed getConditions() {
        return conditions;
    }

    /**
     * These conditions describe if a FixedPrice applies at start of the transaction.
     * <p>
     * When more than one restriction is set, they are to be treated as a logical AND. All need to be valid before this price is active.
     * <p>
     * NOTE: _startTimeOfDay_ and _endTimeOfDay_ are in local time, because it is the time in the tariff as it is shown to the EV driver at the Charging Station.
     * A Charging Station will convert this to the internal time zone that it uses (which is recommended to be UTC, see section Generic chapter 3.1) when performing cost calculation.
     */
    public void setConditions(TariffConditionsFixed conditions) {
        this.conditions = conditions;
    }

    /**
     * Fixed price  for this element e.g. a start fee.
     * <p>
     * (Required)
     */
    public Float getPriceFixed() {
        return priceFixed;
    }

    /**
     * Fixed price  for this element e.g. a start fee.
     * <p>
     * (Required)
     */
    public void setPriceFixed(Float priceFixed) {
        this.priceFixed = priceFixed;
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
        return null;
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
        if (!(obj instanceof TariffFixedPrice))
            return false;
        TariffFixedPrice that = (TariffFixedPrice) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.conditions, that.conditions)
                && Objects.equals(this.priceFixed, that.priceFixed);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.conditions != null ? this.conditions.hashCode() : 0);
        result = 31 * result + (this.priceFixed != null ? this.priceFixed.hashCode() : 0);
        return result;
    }
}
