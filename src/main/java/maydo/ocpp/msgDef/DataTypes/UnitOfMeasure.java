package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 * Represents a UnitOfMeasure with a multiplier
 */
public class UnitOfMeasure implements JsonInterface {

    /**
     * Unit of the value. Default = "Wh" if the (default) measurand is an "Energy" type.
     * This field SHALL use a value from the list Standardized Units of Measurements in Part 2 Appendices.
     * If an applicable unit is available in that list, otherwise a "custom" unit might be used.
     */
    @Optional
    private String unit = "Wh";
    /**
     * Multiplier, this value represents the exponent to base 10. I.e. multiplier 3 means 10 raised to the 3rd power. Default is 0. +
     * The _multiplier_ only multiplies the value of the measurand. It does not specify a conversion between units, for example, kW and W.
     */
    @Optional
    private Integer multiplier = 0;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public UnitOfMeasure() {
    }

    /**
     * @param unit       Unit of the value. Default = "Wh" if the (default) measurand is an "Energy" type.
     *                   This field SHALL use a value from the list Standardized Units of Measurements in Part 2 Appendices.
     *                   If an applicable unit is available in that list, otherwise a "custom" unit might be used.
     *                   .
     * @param multiplier Multiplier, this value represents the exponent to base 10. I.e. multiplier 3 means 10 raised to the 3rd power. Default is 0. +
     *                   The _multiplier_ only multiplies the value of the measurand. It does not specify a conversion between units, for example, kW and W.
     *                   .
     */
    public UnitOfMeasure(String unit, Integer multiplier, CustomData customData) {
        super();
        this.unit = unit;
        this.multiplier = multiplier;
        this.customData = customData;
    }

    /**
     * Unit of the value. Default = "Wh" if the (default) measurand is an "Energy" type.
     * This field SHALL use a value from the list Standardized Units of Measurements in Part 2 Appendices.
     * If an applicable unit is available in that list, otherwise a "custom" unit might be used.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Unit of the value. Default = "Wh" if the (default) measurand is an "Energy" type.
     * This field SHALL use a value from the list Standardized Units of Measurements in Part 2 Appendices.
     * If an applicable unit is available in that list, otherwise a "custom" unit might be used.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Multiplier, this value represents the exponent to base 10. I.e. multiplier 3 means 10 raised to the 3rd power. Default is 0. +
     * The _multiplier_ only multiplies the value of the measurand. It does not specify a conversion between units, for example, kW and W.
     */
    public Integer getMultiplier() {
        return multiplier;
    }

    /**
     * Multiplier, this value represents the exponent to base 10. I.e. multiplier 3 means 10 raised to the 3rd power. Default is 0. +
     * The _multiplier_ only multiplies the value of the measurand. It does not specify a conversion between units, for example, kW and W.
     */
    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
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
        if (!(obj instanceof UnitOfMeasure))
            return false;
        UnitOfMeasure that = (UnitOfMeasure) obj;
        return Objects.equals(this.unit, that.unit)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.multiplier, that.multiplier);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.unit != null ? this.unit.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.multiplier != null ? this.multiplier.hashCode() : 0);
        return result;
    }
}
