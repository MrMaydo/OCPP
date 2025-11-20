package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class OverstayRuleList implements JsonInterface {

    /**
     * Part of ISO 15118-20 price schedule.
     */
    @Optional
    private RationalNumber overstayPowerThreshold;
    /**
     * (Required)
     */
    @Required
    private List<OverstayRule> overstayRule;
    /**
     * Time till overstay is applied in seconds.
     */
    @Optional
    private Integer overstayTimeThreshold;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public OverstayRuleList() {
    }

    /**
     * @param overstayTimeThreshold Time till overstay is applied in seconds.
     *                              .
     */
    public OverstayRuleList(RationalNumber overstayPowerThreshold, List<OverstayRule> overstayRule, Integer overstayTimeThreshold, CustomData customData) {
        super();
        this.overstayPowerThreshold = overstayPowerThreshold;
        this.overstayRule = overstayRule;
        this.overstayTimeThreshold = overstayTimeThreshold;
        this.customData = customData;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     */
    public RationalNumber getOverstayPowerThreshold() {
        return overstayPowerThreshold;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     */
    public void setOverstayPowerThreshold(RationalNumber overstayPowerThreshold) {
        this.overstayPowerThreshold = overstayPowerThreshold;
    }

    /**
     * (Required)
     */
    public List<OverstayRule> getOverstayRule() {
        return overstayRule;
    }

    /**
     * (Required)
     */
    public void setOverstayRule(List<OverstayRule> overstayRule) {
        this.overstayRule = overstayRule;
    }

    /**
     * Time till overstay is applied in seconds.
     */
    public Integer getOverstayTimeThreshold() {
        return overstayTimeThreshold;
    }

    /**
     * Time till overstay is applied in seconds.
     */
    public void setOverstayTimeThreshold(Integer overstayTimeThreshold) {
        this.overstayTimeThreshold = overstayTimeThreshold;
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
        JsonObject json = new JsonObject();
        json.add("overstayPowerThreshold", overstayPowerThreshold.toJsonObject());
        json.addProperty("overstayTimeThreshold", overstayTimeThreshold);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
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
