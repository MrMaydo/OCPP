package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class PriceRuleStack implements JsonInterface {

    /**
     * Duration of the stack of price rules.  he amount of seconds that define the duration of the given PriceRule(s).
     * 
     * (Required)
     */
    @Required
    private Integer duration;
    /**
     * 
     * (Required)
     */
    @Required
    private List<PriceRule> priceRule;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public PriceRuleStack() {
    }

    /**
     * 
     * @param duration
     *     Duration of the stack of price rules.  he amount of seconds that define the duration of the given PriceRule(s).
     *     .
     */
    public PriceRuleStack(Integer duration, List<PriceRule> priceRule, CustomData customData) {
        super();
        this.duration = duration;
        this.priceRule = priceRule;
        this.customData = customData;
    }

    /**
     * Duration of the stack of price rules.  he amount of seconds that define the duration of the given PriceRule(s).
     * 
     * (Required)
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Duration of the stack of price rules.  he amount of seconds that define the duration of the given PriceRule(s).
     * 
     * (Required)
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * 
     * (Required)
     */
    public List<PriceRule> getPriceRule() {
        return priceRule;
    }

    /**
     * 
     * (Required)
     */
    public void setPriceRule(List<PriceRule> priceRule) {
        this.priceRule = priceRule;
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
        if (!(obj instanceof PriceRuleStack))
            return false;
        PriceRuleStack that = (PriceRuleStack) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.priceRule, that.priceRule);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priceRule != null ? this.priceRule.hashCode() : 0);
        return result;
    }
}
