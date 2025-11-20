package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class TariffEnergy implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private List<TariffEnergyPrice> prices;
    @Optional
    private List<TaxRate> taxRates;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TariffEnergy() {
    }

    public TariffEnergy(List<TariffEnergyPrice> prices, List<TaxRate> taxRates, CustomData customData) {
        super();
        this.prices = prices;
        this.taxRates = taxRates;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public List<TariffEnergyPrice> getPrices() {
        return prices;
    }

    /**
     * (Required)
     */
    public void setPrices(List<TariffEnergyPrice> prices) {
        this.prices = prices;
    }

    public List<TaxRate> getTaxRates() {
        return taxRates;
    }

    public void setTaxRates(List<TaxRate> taxRates) {
        this.taxRates = taxRates;
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
        if (!(obj instanceof TariffEnergy))
            return false;
        TariffEnergy that = (TariffEnergy) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.taxRates, that.taxRates)
                && Objects.equals(this.prices, that.prices);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.taxRates != null ? this.taxRates.hashCode() : 0);
        result = 31 * result + (this.prices != null ? this.prices.hashCode() : 0);
        return result;
    }
}
