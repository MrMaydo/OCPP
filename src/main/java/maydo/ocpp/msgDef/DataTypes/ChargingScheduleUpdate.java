package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;


/**
 * Updates to a ChargingSchedulePeriodType for dynamic charging profiles.
 */
public class ChargingScheduleUpdate implements JsonInterface {

    /**
     * Optional only when not required by the operationMode,
     * as in CentralSetpoint, ExternalSetpoint, ExternalLimits, LocalFrequency, LocalLoadBalancing.
     * Charging rate limit during the schedule period, in the applicable chargingRateUnit.
     * This SHOULD be a non- negative value; a negative value is only supported for backwards compatibility
     * with older systems that use a negative value to specify a discharging limit.
     * For AC this field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1.
     */
    @Optional
    private Float limit;

    /**
     * (2.1) Charging rate limit on phase L2 in the applicable chargingRateUnit.
     */
    @Optional
    private Float limitL2;

    /**
     * (2.1) Charging rate limit on phase L3 in the applicable chargingRateUnit.
     */
    @Optional
    private Float limitL3;

    /**
     * (2.1) Limit in chargingRateUnit that the EV is allowed to discharge with.
     * Note, these are negative values in order to be consistent with setpoint, which can be positive and negative.
     * For AC this field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1.
     */
    @Optional
    private Float dischargeLimit;

    /**
     * (2.1) Limit in chargingRateUnit on phase L2 that the EV is allowed to discharge with.
     */
    @Optional
    private Float dischargeLimitL2;

    /**
     * (2.1) Limit in chargingRateUnit on phase L3 that the EV is allowed to discharge with.
     */
    @Optional
    private Float dischargeLimitL3;

    /**
     * (2.1) Setpoint in chargingRateUnit that the EV should follow as close as possible.
     * Use negative values for discharging. When a limit and/or dischargeLimit are given the overshoot
     * when following setpoint must remain within these values. This field represents the sum of all phases,
     * unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    @Optional
    private Float setpoint;

    /**
     * (2.1) Setpoint in chargingRateUnit that the EV should follow on phase L2 as close as possible.
     */
    @Optional
    private Float setpointL2;

    /**
     * (2.1) Setpoint in chargingRateUnit that the EV should follow on phase L3 as close as possible.
     */
    @Optional
    private Float setpointL3;

    /**
     * (2.1) Setpoint for reactive power (or current) in chargingRateUnit that the EV should follow as closely as possible.
     * Positive values for inductive, negative for capacitive reactive power or current.
     * This field represents the sum of all phases, unless values are provided for L2 and L3,
     * in which case this field represents phase L1.
     */
    @Optional
    private Float setpointReactive;

    /**
     * (2.1) Setpoint for reactive power (or current) in chargingRateUnit that the EV should follow on phase L2 as closely as possible.
     */
    @Optional
    private Float setpointReactiveL2;

    /**
     * (2.1) Setpoint for reactive power (or current) in chargingRateUnit that the EV should follow on phase L3 as closely as possible
     */
    @Optional
    private Float setpointReactiveL3;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChargingScheduleUpdate() {
    }


    public Float getLimit() {
        return limit;
    }


    public void setLimit(Float limit) {
        this.limit = limit;
    }


    public Float getLimitL2() {
        return limitL2;
    }


    public void setLimitL2(Float limitL2) {
        this.limitL2 = limitL2;
    }


    public Float getLimitL3() {
        return limitL3;
    }


    public void setLimitL3(Float limitL3) {
        this.limitL3 = limitL3;
    }


    public Float getDischargeLimit() {
        return dischargeLimit;
    }


    public void setDischargeLimit(Float dischargeLimit) {
        this.dischargeLimit = dischargeLimit;
    }


    public Float getDischargeLimitL2() {
        return dischargeLimitL2;
    }


    public void setDischargeLimitL2(Float dischargeLimitL2) {
        this.dischargeLimitL2 = dischargeLimitL2;
    }


    public Float getDischargeLimitL3() {
        return dischargeLimitL3;
    }


    public void setDischargeLimitL3(Float dischargeLimitL3) {
        this.dischargeLimitL3 = dischargeLimitL3;
    }


    public Float getSetpoint() {
        return setpoint;
    }


    public void setSetpoint(Float setpoint) {
        this.setpoint = setpoint;
    }


    public Float getSetpointL2() {
        return setpointL2;
    }


    public void setSetpointL2(Float setpointL2) {
        this.setpointL2 = setpointL2;
    }


    public Float getSetpointL3() {
        return setpointL3;
    }


    public void setSetpointL3(Float setpointL3) {
        this.setpointL3 = setpointL3;
    }


    public Float getSetpointReactive() {
        return setpointReactive;
    }


    public void setSetpointReactive(Float setpointReactive) {
        this.setpointReactive = setpointReactive;
    }


    public Float getSetpointReactiveL2() {
        return setpointReactiveL2;
    }


    public void setSetpointReactiveL2(Float setpointReactiveL2) {
        this.setpointReactiveL2 = setpointReactiveL2;
    }


    public Float getSetpointReactiveL3() {
        return setpointReactiveL3;
    }


    public void setSetpointReactiveL3(Float setpointReactiveL3) {
        this.setpointReactiveL3 = setpointReactiveL3;
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
        json.addProperty("limit", limit);
        json.addProperty("limitL2", limitL2);
        json.addProperty("limitL3", limitL3);
        json.addProperty("dischargeLimit", dischargeLimit);
        json.addProperty("dischargeLimitL2", dischargeLimitL2);
        json.addProperty("dischargeLimitL3", dischargeLimitL3);
        json.addProperty("setpoint", setpoint);
        json.addProperty("setpointL2", setpointL2);
        json.addProperty("setpointL3", setpointL3);
        json.addProperty("setpointReactive", setpointReactive);
        json.addProperty("setpointReactiveL2", setpointReactiveL2);
        json.addProperty("setpointReactiveL3", setpointReactiveL3);
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
        if (jsonObject.has("limit")) {
            setLimit(jsonObject.get("limit").getAsFloat());
        }

        if (jsonObject.has("limitL2")) {
            setLimitL2(jsonObject.get("limitL2").getAsFloat());
        }

        if (jsonObject.has("limitL3")) {
            setLimitL3(jsonObject.get("limitL3").getAsFloat());
        }

        if (jsonObject.has("dischargeLimit")) {
            setDischargeLimit(jsonObject.get("dischargeLimit").getAsFloat());
        }

        if (jsonObject.has("dischargeLimitL2")) {
            setDischargeLimitL2(jsonObject.get("dischargeLimitL2").getAsFloat());
        }

        if (jsonObject.has("dischargeLimitL3")) {
            setDischargeLimitL3(jsonObject.get("dischargeLimitL3").getAsFloat());
        }

        if (jsonObject.has("setpoint")) {
            setSetpoint(jsonObject.get("setpoint").getAsFloat());
        }

        if (jsonObject.has("setpointL2")) {
            setSetpointL2(jsonObject.get("setpointL2").getAsFloat());
        }

        if (jsonObject.has("setpointL3")) {
            setSetpointL3(jsonObject.get("setpointL3").getAsFloat());
        }

        if (jsonObject.has("setpointReactive")) {
            setSetpointReactive(jsonObject.get("setpointReactive").getAsFloat());
        }

        if (jsonObject.has("setpointReactiveL2")) {
            setSetpointReactiveL2(jsonObject.get("setpointReactiveL2").getAsFloat());
        }

        if (jsonObject.has("setpointReactiveL3")) {
            setSetpointReactiveL3(jsonObject.get("setpointReactiveL3").getAsFloat());
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
        if (!(obj instanceof ChargingScheduleUpdate))
            return false;
        ChargingScheduleUpdate that = (ChargingScheduleUpdate) obj;
        return Objects.equals(this.setpoint, that.setpoint)
                && Objects.equals(this.dischargeLimitL3, that.dischargeLimitL3)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.setpointL3, that.setpointL3)
                && Objects.equals(this.setpointL2, that.setpointL2)
                && Objects.equals(this.setpointReactive, that.setpointReactive)
                && Objects.equals(this.limit, that.limit)
                && Objects.equals(this.setpointReactiveL2, that.setpointReactiveL2)
                && Objects.equals(this.setpointReactiveL3, that.setpointReactiveL3)
                && Objects.equals(this.dischargeLimitL2, that.dischargeLimitL2)
                && Objects.equals(this.limitL3, that.limitL3)
                && Objects.equals(this.dischargeLimit, that.dischargeLimit)
                && Objects.equals(this.limitL2, that.limitL2);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.setpoint != null ? this.setpoint.hashCode() : 0);
        result = 31 * result + (this.dischargeLimitL3 != null ? this.dischargeLimitL3.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.setpointL3 != null ? this.setpointL3.hashCode() : 0);
        result = 31 * result + (this.setpointL2 != null ? this.setpointL2.hashCode() : 0);
        result = 31 * result + (this.setpointReactive != null ? this.setpointReactive.hashCode() : 0);
        result = 31 * result + (this.limit != null ? this.limit.hashCode() : 0);
        result = 31 * result + (this.setpointReactiveL2 != null ? this.setpointReactiveL2.hashCode() : 0);
        result = 31 * result + (this.setpointReactiveL3 != null ? this.setpointReactiveL3.hashCode() : 0);
        result = 31 * result + (this.dischargeLimitL2 != null ? this.dischargeLimitL2.hashCode() : 0);
        result = 31 * result + (this.limitL3 != null ? this.limitL3.hashCode() : 0);
        result = 31 * result + (this.dischargeLimit != null ? this.dischargeLimit.hashCode() : 0);
        result = 31 * result + (this.limitL2 != null ? this.limitL2.hashCode() : 0);
        return result;
    }
}
