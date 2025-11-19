package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 * Total cost with and without tax. Contains the total of energy, charging time, idle time, fixed and reservation costs including and/or excluding tax.
 * 
 * 
 */
public class TotalPrice implements JsonInterface {

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
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TotalPrice() {
    }

    /**
     * 
     * @param inclTax
     *     Price/cost including tax. Can be absent if _exclTax_ is present.
     *     .
     * @param exclTax
     *     Price/cost excluding tax. Can be absent if _inclTax_ is present.
     *     .
     */
    public TotalPrice(Float exclTax, Float inclTax, CustomData customData) {
        super();
        this.exclTax = exclTax;
        this.inclTax = inclTax;
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
        if (!(obj instanceof TotalPrice))
            return false;
        TotalPrice that = (TotalPrice) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.inclTax, that.inclTax) 
                && Objects.equals(this.exclTax, that.exclTax);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.inclTax != null ? this.inclTax.hashCode() : 0);
        result = 31 * result + (this.exclTax != null ? this.exclTax.hashCode() : 0);
        return result;
    }
}
