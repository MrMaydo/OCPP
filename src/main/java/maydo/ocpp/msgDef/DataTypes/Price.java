package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Price with and without tax. At least one of exclTax, inclTax must be present.
 */
public class Price implements JsonInterface {

    /**
     * Price/cost excluding tax. Can be absent if inclTax is present.
     */
    @Optional
    private Float exclTax;

    /**
     * Price/cost including tax. Can be absent if exclTax is present.
     */
    @Optional
    private Float inclTax;

    /**
     * Tax percentages that were used to calculate inclTax from exclTax (for displaying/printing on invoices)
     */
    @Optional
    private List<TaxRate> taxRates;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Price() {
    }


    public Float getExclTax() {
        return exclTax;
    }


    public void setExclTax(Float exclTax) {
        this.exclTax = exclTax;
    }


    public Float getInclTax() {
        return inclTax;
    }


    public void setInclTax(Float inclTax) {
        this.inclTax = inclTax;
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
        json.addProperty("exclTax", exclTax);
        json.addProperty("inclTax", inclTax);
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
        if (jsonObject.has("exclTax")) {
            setExclTax(jsonObject.get("exclTax").getAsFloat());
        }

        if (jsonObject.has("inclTax")) {
            setInclTax(jsonObject.get("inclTax").getAsFloat());
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
        if (!(obj instanceof Price))
            return false;
        Price that = (Price) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.taxRates, that.taxRates)
                && Objects.equals(this.inclTax, that.inclTax)
                && Objects.equals(this.exclTax, that.exclTax);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.taxRates != null ? this.taxRates.hashCode() : 0);
        result = 31 * result + (this.inclTax != null ? this.inclTax.hashCode() : 0);
        result = 31 * result + (this.exclTax != null ? this.exclTax.hashCode() : 0);
        return result;
    }
}
