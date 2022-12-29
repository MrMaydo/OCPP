package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;


/**
 * Consumption_ Cost
 * urn:x-oca:ocpp:uid:2:233259
 */
public class ConsumptionCost implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Consumption_ Cost. Start_ Value. Numeric
     * urn:x-oca:ocpp:uid:1:569246
     * The lowest level of consumption that defines the starting point of this consumption block. The block interval extends to the start of the next interval.
     * <p>
     * (Required)
     */
    @Required
    private Float startValue;
    /**
     * (Required)
     */
    @Required
    private List<Cost> cost = null;

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

    /**
     * Consumption_ Cost. Start_ Value. Numeric
     * urn:x-oca:ocpp:uid:1:569246
     * The lowest level of consumption that defines the starting point of this consumption block. The block interval extends to the start of the next interval.
     * <p>
     * (Required)
     */
    public Float getStartValue() {
        return startValue;
    }

    /**
     * Consumption_ Cost. Start_ Value. Numeric
     * urn:x-oca:ocpp:uid:1:569246
     * The lowest level of consumption that defines the starting point of this consumption block. The block interval extends to the start of the next interval.
     * <p>
     * (Required)
     */
    public void setStartValue(Float startValue) {
        this.startValue = startValue;
    }

    /**
     * (Required)
     */
    public List<Cost> getCost() {
        return cost;
    }

    /**
     * (Required)
     */
    public void setCost(List<Cost> cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ConsumptionCost))
            return false;
        ConsumptionCost that = (ConsumptionCost) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(startValue, that.startValue)
                && Objects.equals(cost, that.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customData, startValue, cost);
    }
}
