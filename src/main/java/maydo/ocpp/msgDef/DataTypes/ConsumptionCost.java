
package maydo.ocpp.msgDef.DataTypes;

import java.util.List;
import javax.annotation.Generated;


/**
 * Consumption_ Cost
 * urn:x-oca:ocpp:uid:2:233259
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class ConsumptionCost {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Consumption_ Cost. Start_ Value. Numeric
     * urn:x-oca:ocpp:uid:1:569246
     * The lowest level of consumption that defines the starting point of this consumption block. The block interval extends to the start of the next interval.
     * 
     * (Required)
     * 
     */
    private Float startValue;
    /**
     * 
     * (Required)
     * 
     */
    private List<Cost> cost = null;

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
     * Consumption_ Cost. Start_ Value. Numeric
     * urn:x-oca:ocpp:uid:1:569246
     * The lowest level of consumption that defines the starting point of this consumption block. The block interval extends to the start of the next interval.
     * 
     * (Required)
     * 
     */
    public Float getStartValue() {
        return startValue;
    }

    /**
     * Consumption_ Cost. Start_ Value. Numeric
     * urn:x-oca:ocpp:uid:1:569246
     * The lowest level of consumption that defines the starting point of this consumption block. The block interval extends to the start of the next interval.
     * 
     * (Required)
     * 
     */
    public void setStartValue(Float startValue) {
        this.startValue = startValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<Cost> getCost() {
        return cost;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCost(List<Cost> cost) {
        this.cost = cost;
    }

}
