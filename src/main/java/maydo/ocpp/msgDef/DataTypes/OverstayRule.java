package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Part of ISO 15118-20 price schedule.
 */
public class OverstayRule implements JsonInterface {

    /**
     * Fee that applies to this overstay.
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
     */
    @Required
    private Integer startTime;

    /**
     * Time till overstay will be reapplied
     */
    @Required
    private Integer overstayFeePeriod;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public OverstayRule() {
    }


    public RationalNumber getOverstayFee() {
        return overstayFee;
    }


    public void setOverstayFee(RationalNumber overstayFee) {
        this.overstayFee = overstayFee;
    }


    public String getOverstayRuleDescription() {
        return overstayRuleDescription;
    }


    public void setOverstayRuleDescription(String overstayRuleDescription) {
        this.overstayRuleDescription = overstayRuleDescription;
    }


    public Integer getStartTime() {
        return startTime;
    }


    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }


    public Integer getOverstayFeePeriod() {
        return overstayFeePeriod;
    }


    public void setOverstayFeePeriod(Integer overstayFeePeriod) {
        this.overstayFeePeriod = overstayFeePeriod;
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

        json.add("overstayFee", getOverstayFee().toJsonObject());

        if (getOverstayRuleDescription() != null) {
            json.addProperty("overstayRuleDescription", getOverstayRuleDescription());
        }
        json.addProperty("startTime", getStartTime());

        json.addProperty("overstayFeePeriod", getOverstayFeePeriod());

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
        if (jsonObject.has("overstayFee")) {
            setOverstayFee(new RationalNumber());
            getOverstayFee().fromJsonObject(jsonObject.getAsJsonObject("overstayFee"));
        }

        if (jsonObject.has("overstayRuleDescription")) {
            setOverstayRuleDescription(jsonObject.get("overstayRuleDescription").getAsString());
        }

        if (jsonObject.has("startTime")) {
            setStartTime(jsonObject.get("startTime").getAsInt());
        }

        if (jsonObject.has("overstayFeePeriod")) {
            setOverstayFeePeriod(jsonObject.get("overstayFeePeriod").getAsInt());
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
        return Objects.hash(
                getOverstayFee(),
                getOverstayRuleDescription(),
                getStartTime(),
                getOverstayFeePeriod(),
                getCustomData()
        );
    }
}
