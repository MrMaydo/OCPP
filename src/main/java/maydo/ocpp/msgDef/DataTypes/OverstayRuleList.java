package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

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


    public OverstayRuleList(RationalNumber overstayPowerThreshold, List<OverstayRule> overstayRule, Integer overstayTimeThreshold, CustomData customData) {
        super();
        this.overstayPowerThreshold = overstayPowerThreshold;
        this.overstayRule = overstayRule;
        this.overstayTimeThreshold = overstayTimeThreshold;
        this.customData = customData;
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
        json.add("overstayPowerThreshold", overstayPowerThreshold.toJsonObject());
        json.addProperty("overstayTimeThreshold", overstayTimeThreshold);
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
        if (jsonObject.has("overstayPowerThreshold")) {
            this.overstayPowerThreshold = new RationalNumber();
            this.overstayPowerThreshold.fromJsonObject(jsonObject.getAsJsonObject("overstayPowerThreshold"));
        }

        if (jsonObject.has("overstayTimeThreshold")) {
            this.overstayTimeThreshold = jsonObject.get("overstayTimeThreshold").getAsInt();
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
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
