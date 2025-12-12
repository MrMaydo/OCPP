package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
     * Multiplier, this value represents the exponent to base 10. I.e. multiplier 3 means 10 raised to the 3rd power.
     * Default is 0. The multiplier only multiplies the value of the measurand.
     * It does not specify a conversion between units, for example, kW and W.
     */
    @Optional
    private Integer multiplier = 0;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public UnitOfMeasure() {
    }


    public UnitOfMeasure(String unit, Integer multiplier, CustomData customData) {
        super();
        this.unit = unit;
        this.multiplier = multiplier;
        this.customData = customData;
    }


    public String getUnit() {
        return unit;
    }


    public void setUnit(String unit) {
        this.unit = unit;
    }


    public Integer getMultiplier() {
        return multiplier;
    }


    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
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
