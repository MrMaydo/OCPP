package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * Price elements and tax for time
 */
public class TariffTime implements JsonInterface {

    /**
     * Element tariff price and conditions
     */
    @Required
    private List<TariffTimePrice> prices;

    /**
     * Applicable tax percentages for this tariff dimension. If omitted, no tax is applicable.
     * Not providing a tax is different from 0% tax, which would be a value of 0.0 here.
     */
    @Optional
    private List<TaxRate> taxRates;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TariffTime() {
    }


    public List<TariffTimePrice> getPrices() {
        return prices;
    }


    public void setPrices(List<TariffTimePrice> prices) {
        this.prices = prices;
    }

    public List<TaxRate> getTaxRates() {
        return taxRates;
    }

    public void setTaxRates(List<TaxRate> taxRates) {
        this.taxRates = taxRates;
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
        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof TariffTime))
            return false;
        TariffTime that = (TariffTime) obj;
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
