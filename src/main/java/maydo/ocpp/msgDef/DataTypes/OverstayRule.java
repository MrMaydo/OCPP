package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Part of ISO 15118-20 price schedule.
 */
public class OverstayRule implements JsonInterface {

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private RationalNumber overstayFee;
    /**
     * Human readable string to identify the overstay rule.
     */
    @Optional
    private String overstayRuleDescription;
    /**
     * Time in seconds after trigger of the parent Overstay Rules for this particular fee to apply.
     * <p>
     * (Required)
     */
    @Required
    private Integer startTime;
    /**
     * Time till overstay will be reapplied
     * <p>
     * (Required)
     */
    @Required
    private Integer overstayFeePeriod;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public OverstayRule() {
    }

    /**
     * @param overstayFeePeriod       Time till overstay will be reapplied
     *                                .
     * @param overstayRuleDescription Human readable string to identify the overstay rule.
     *                                .
     * @param startTime               Time in seconds after trigger of the parent Overstay Rules for this particular fee to apply.
     *                                .
     */
    public OverstayRule(RationalNumber overstayFee, String overstayRuleDescription, Integer startTime, Integer overstayFeePeriod, CustomData customData) {
        super();
        this.overstayFee = overstayFee;
        this.overstayRuleDescription = overstayRuleDescription;
        this.startTime = startTime;
        this.overstayFeePeriod = overstayFeePeriod;
        this.customData = customData;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    public RationalNumber getOverstayFee() {
        return overstayFee;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    public void setOverstayFee(RationalNumber overstayFee) {
        this.overstayFee = overstayFee;
    }

    /**
     * Human readable string to identify the overstay rule.
     */
    public String getOverstayRuleDescription() {
        return overstayRuleDescription;
    }

    /**
     * Human readable string to identify the overstay rule.
     */
    public void setOverstayRuleDescription(String overstayRuleDescription) {
        this.overstayRuleDescription = overstayRuleDescription;
    }

    /**
     * Time in seconds after trigger of the parent Overstay Rules for this particular fee to apply.
     * <p>
     * (Required)
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * Time in seconds after trigger of the parent Overstay Rules for this particular fee to apply.
     * <p>
     * (Required)
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * Time till overstay will be reapplied
     * <p>
     * (Required)
     */
    public Integer getOverstayFeePeriod() {
        return overstayFeePeriod;
    }

    /**
     * Time till overstay will be reapplied
     * <p>
     * (Required)
     */
    public void setOverstayFeePeriod(Integer overstayFeePeriod) {
        this.overstayFeePeriod = overstayFeePeriod;
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
        json.add("overstayFee", overstayFee.toJsonObject());
        json.addProperty("overstayRuleDescription", overstayRuleDescription);
        json.addProperty("startTime", startTime);
        json.addProperty("overstayFeePeriod", overstayFeePeriod);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("overstayFee")) {
            this.overstayFee = new RationalNumber();
            this.overstayFee.fromJsonObject(jsonObject.getAsJsonObject("overstayFee"));
        }

        if (jsonObject.has("overstayRuleDescription")) {
            this.overstayRuleDescription = jsonObject.get("overstayRuleDescription").getAsString();
        }

        if (jsonObject.has("startTime")) {
            this.startTime = jsonObject.get("startTime").getAsInt();
        }

        if (jsonObject.has("overstayFeePeriod")) {
            this.overstayFeePeriod = jsonObject.get("overstayFeePeriod").getAsInt();
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
        if (!(obj instanceof OverstayRule))
            return false;
        OverstayRule that = (OverstayRule) obj;
        return Objects.equals(this.startTime, that.startTime)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.overstayFee, that.overstayFee)
                && Objects.equals(this.overstayFeePeriod, that.overstayFeePeriod)
                && Objects.equals(this.overstayRuleDescription, that.overstayRuleDescription);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.overstayFee != null ? this.overstayFee.hashCode() : 0);
        result = 31 * result + (this.overstayFeePeriod != null ? this.overstayFeePeriod.hashCode() : 0);
        result = 31 * result + (this.overstayRuleDescription != null ? this.overstayRuleDescription.hashCode() : 0);
        return result;
    }
}
