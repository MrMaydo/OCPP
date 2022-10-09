
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;


/**
 * Represents a UnitOfMeasure with a multiplier
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class UnitOfMeasure implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Unit of the value. Default = "Wh" if the (default) measurand is an "Energy" type.
     * This field SHALL use a value from the list Standardized Units of Measurements in Part 2 Appendices. 
     * If an applicable unit is available in that list, otherwise a "custom" unit might be used.
     * 
     * 
     */
    private String unit = "Wh";
    /**
     * Multiplier, this value represents the exponent to base 10. I.e. multiplier 3 means 10 raised to the 3rd power. Default is 0.
     * 
     * 
     */
    private Integer multiplier = 0;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * Unit of the value. Default = "Wh" if the (default) measurand is an "Energy" type.
     * This field SHALL use a value from the list Standardized Units of Measurements in Part 2 Appendices. 
     * If an applicable unit is available in that list, otherwise a "custom" unit might be used.
     * 
     * 
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Unit of the value. Default = "Wh" if the (default) measurand is an "Energy" type.
     * This field SHALL use a value from the list Standardized Units of Measurements in Part 2 Appendices. 
     * If an applicable unit is available in that list, otherwise a "custom" unit might be used.
     * 
     * 
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Multiplier, this value represents the exponent to base 10. I.e. multiplier 3 means 10 raised to the 3rd power. Default is 0.
     * 
     * 
     */
    public Integer getMultiplier() {
        return multiplier;
    }

    /**
     * Multiplier, this value represents the exponent to base 10. I.e. multiplier 3 means 10 raised to the 3rd power. Default is 0.
     * 
     * 
     */
    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
