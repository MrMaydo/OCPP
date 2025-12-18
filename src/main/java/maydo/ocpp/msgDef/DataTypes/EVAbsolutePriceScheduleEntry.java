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
 * (2.1) An entry in price schedule over time for which EV is willing to discharge.
 */
public class EVAbsolutePriceScheduleEntry implements JsonInterface {

    /**
     * The amount of seconds of this entry.
     */
    @Required
    private Integer duration;

    /**
     * A set of pricing rules for energy costs.
     */
    @Required
    private List<EVPriceRule> evPriceRule;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public EVAbsolutePriceScheduleEntry() {
    }


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer duration) {
        this.duration = duration;
    }


    public List<EVPriceRule> getEvPriceRule() {
        return evPriceRule;
    }


    public void setEvPriceRule(List<EVPriceRule> evPriceRule) {
        this.evPriceRule = evPriceRule;
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

        JsonArray evPriceRuleArray = new JsonArray();
        for (EVPriceRule item : getEvPriceRule()) {
            evPriceRuleArray.add(item.toJsonObject());
        }
        json.add("evPriceRule", evPriceRuleArray);

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

        if (jsonObject.has("evPriceRule")) {
            setEvPriceRule(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("evPriceRule");
            for (JsonElement el : arr) {
                EVPriceRule item = new EVPriceRule();
                item.fromJsonObject(el.getAsJsonObject());
                getEvPriceRule().add(item);
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
        if (!(obj instanceof EVAbsolutePriceScheduleEntry))
            return false;
        EVAbsolutePriceScheduleEntry that = (EVAbsolutePriceScheduleEntry) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.evPriceRule, that.evPriceRule)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getDuration(),
                getEvPriceRule(),
                getCustomData()
        );
    }

}