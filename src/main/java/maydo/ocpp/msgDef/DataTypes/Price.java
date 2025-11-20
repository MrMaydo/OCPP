package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

public class Price implements JsonInterface {

    /**
     * Price/cost excluding tax. Can be absent if _inclTax_ is present.
     */
    @Optional
    private Float exclTax;
    /**
     * Price/cost including tax. Can be absent if _exclTax_ is present.
     */
    @Optional
    private Float inclTax;
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
    public Price() {
    }

    /**
     * @param inclTax Price/cost including tax. Can be absent if _exclTax_ is present.
     *                .
     * @param exclTax Price/cost excluding tax. Can be absent if _inclTax_ is present.
     *                .
     */
    public Price(Float exclTax, Float inclTax, List<TaxRate> taxRates, CustomData customData) {
        super();
        this.exclTax = exclTax;
        this.inclTax = inclTax;
        this.taxRates = taxRates;
        this.customData = customData;
    }

    /**
     * Price/cost excluding tax. Can be absent if _inclTax_ is present.
     */
    public Float getExclTax() {
        return exclTax;
    }

    /**
     * Price/cost excluding tax. Can be absent if _inclTax_ is present.
     */
    public void setExclTax(Float exclTax) {
        this.exclTax = exclTax;
    }

    /**
     * Price/cost including tax. Can be absent if _exclTax_ is present.
     */
    public Float getInclTax() {
        return inclTax;
    }

    /**
     * Price/cost including tax. Can be absent if _exclTax_ is present.
     */
    public void setInclTax(Float inclTax) {
        this.inclTax = inclTax;
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
            this.exclTax = jsonObject.get("exclTax").getAsFloat();
        }

        if (jsonObject.has("inclTax")) {
            this.inclTax = jsonObject.get("inclTax").getAsFloat();
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
