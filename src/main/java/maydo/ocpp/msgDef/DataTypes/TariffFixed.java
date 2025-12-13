package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class TariffFixed implements JsonInterface {

    /**
     *
     */
    @Required
    private List<TariffFixedPrice> prices;

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


    public TariffFixed() {
    }


    public List<TariffFixedPrice> getPrices() {
        return prices;
    }


    public void setPrices(List<TariffFixedPrice> prices) {
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
        if (jsonObject.has("prices")) {
            setPrices(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("prices");
            for (JsonElement el : arr) {
                TariffFixedPrice item = new TariffFixedPrice();
                item.fromJsonObject(el.getAsJsonObject());
                getPrices().add(item);
            }
        }

        if (jsonObject.has("taxRates")) {
            setTaxRates(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("taxRates");
            for (JsonElement el : arr) {
                TaxRate item = new TaxRate();
                item.fromJsonObject(el.getAsJsonObject());
                getTaxRates().add(item);
            }
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
        if (!(obj instanceof TariffFixed))
            return false;
        TariffFixed that = (TariffFixed) obj;
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
