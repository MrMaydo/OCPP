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
public class OverstayRuleList implements JsonInterface {

    /**
     * Power threshold in W at which the overstay applies
     */
    @Optional
    private RationalNumber overstayPowerThreshold;

    /**
     * Overstay rules that will be applied.
     */
    @Required
    private List<OverstayRule> overstayRule;

    /**
     * Time till overstay is applied in seconds.
     */
    @Optional
    private Integer overstayTimeThreshold;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public OverstayRuleList() {
    }


    public RationalNumber getOverstayPowerThreshold() {
        return overstayPowerThreshold;
    }


    public void setOverstayPowerThreshold(RationalNumber overstayPowerThreshold) {
        this.overstayPowerThreshold = overstayPowerThreshold;
    }


    public List<OverstayRule> getOverstayRule() {
        return overstayRule;
    }


    public void setOverstayRule(List<OverstayRule> overstayRule) {
        this.overstayRule = overstayRule;
    }


    public Integer getOverstayTimeThreshold() {
        return overstayTimeThreshold;
    }


    public void setOverstayTimeThreshold(Integer overstayTimeThreshold) {
        this.overstayTimeThreshold = overstayTimeThreshold;
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

        if (getOverstayPowerThreshold() != null) {
            json.add("overstayPowerThreshold", getOverstayPowerThreshold().toJsonObject());
        }
        JsonArray overstayRuleArray = new JsonArray();
        for (OverstayRule item : getOverstayRule()) {
            overstayRuleArray.add(item.toJsonObject());
        }
        json.add("overstayRule", overstayRuleArray);

        if (getOverstayTimeThreshold() != null) {
            json.addProperty("overstayTimeThreshold", getOverstayTimeThreshold());
        }
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
        if (jsonObject.has("overstayPowerThreshold")) {
            setOverstayPowerThreshold(new RationalNumber());
            getOverstayPowerThreshold().fromJsonObject(jsonObject.getAsJsonObject("overstayPowerThreshold"));
        }

        if (jsonObject.has("overstayRule")) {
            setOverstayRule(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("overstayRule");
            for (JsonElement el : arr) {
                OverstayRule item = new OverstayRule();
                item.fromJsonObject(el.getAsJsonObject());
                getOverstayRule().add(item);
            }
        }

        if (jsonObject.has("overstayTimeThreshold")) {
            setOverstayTimeThreshold(jsonObject.get("overstayTimeThreshold").getAsInt());
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
        if (!(obj instanceof OverstayRuleList))
            return false;
        OverstayRuleList that = (OverstayRuleList) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.overstayTimeThreshold, that.overstayTimeThreshold)
                && Objects.equals(this.overstayPowerThreshold, that.overstayPowerThreshold)
                && Objects.equals(this.overstayRule, that.overstayRule);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.overstayTimeThreshold != null ? this.overstayTimeThreshold.hashCode() : 0);
        result = 31 * result + (this.overstayPowerThreshold != null ? this.overstayPowerThreshold.hashCode() : 0);
        result = 31 * result + (this.overstayRule != null ? this.overstayRule.hashCode() : 0);
        return result;
    }
}
