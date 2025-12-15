package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Part of ISO 15118-20 price schedule.
 */
public class PriceRuleStack implements JsonInterface {

    /**
     * Duration of the stack of price rules. The amount of seconds that define the duration of the given PriceRule(s).
     */
    @Required
    private Integer duration;

    /**
     * Contains the price rules.
     */
    @Required
    private List<PriceRule> priceRule;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public PriceRuleStack() {
    }


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer duration) {
        this.duration = duration;
    }


    public List<PriceRule> getPriceRule() {
        return priceRule;
    }


    public void setPriceRule(List<PriceRule> priceRule) {
        this.priceRule = priceRule;
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

        json.addProperty("duration", getDuration());

        JsonArray priceRuleArray = new JsonArray();
        for (PriceRule item : getPriceRule()) {
            priceRuleArray.add(item.toJsonObject());
        }
        json.add("priceRule", priceRuleArray);

        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("duration")) {
            setDuration(jsonObject.get("duration").getAsInt());
        }

        if (jsonObject.has("priceRule")) {
            setPriceRule(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("priceRule");
            for (JsonElement el : arr) {
                PriceRule item = new PriceRule();
                item.fromJsonObject(el.getAsJsonObject());
                getPriceRule().add(item);
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
