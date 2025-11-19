package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class ConsumptionCost implements JsonInterface {

    /**
     * The lowest level of consumption that defines the starting point of this consumption block. The block interval extends to the start of the next interval.
     * 
     * (Required)
     */
    @Required
    private Float startValue;
    /**
     * 
     * (Required)
     */
    @Required
    private List<Cost> cost;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ConsumptionCost() {
    }

    /**
     * 
     * @param startValue
     *     The lowest level of consumption that defines the starting point of this consumption block. The block interval extends to the start of the next interval.
     *     .
     */
    public ConsumptionCost(Float startValue, List<Cost> cost, CustomData customData) {
        super();
        this.startValue = startValue;
        this.cost = cost;
        this.customData = customData;
    }

    /**
     * The lowest level of consumption that defines the starting point of this consumption block. The block interval extends to the start of the next interval.
     * 
     * (Required)
     */
    public Float getStartValue() {
        return startValue;
    }

    /**
     * The lowest level of consumption that defines the starting point of this consumption block. The block interval extends to the start of the next interval.
     * 
     * (Required)
     */
    public void setStartValue(Float startValue) {
        this.startValue = startValue;
    }

    /**
     * 
     * (Required)
     */
    public List<Cost> getCost() {
        return cost;
    }

    /**
     * 
     * (Required)
     */
    public void setCost(List<Cost> cost) {
        this.cost = cost;
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
        if (!(obj instanceof ConsumptionCost))
            return false;
        ConsumptionCost that = (ConsumptionCost) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.startValue, that.startValue) 
                && Objects.equals(this.cost, that.cost);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.startValue != null ? this.startValue.hashCode() : 0);
        result = 31 * result + (this.cost != null ? this.cost.hashCode() : 0);
        return result;
    }
}
