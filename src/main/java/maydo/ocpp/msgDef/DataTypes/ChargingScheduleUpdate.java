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

        if (getLimit() != null) {
            json.addProperty("limit", getLimit());
        }
        if (getLimitL2() != null) {
            json.addProperty("limitL2", getLimitL2());
        }
        if (getLimitL3() != null) {
            json.addProperty("limitL3", getLimitL3());
        }
        if (getDischargeLimit() != null) {
            json.addProperty("dischargeLimit", getDischargeLimit());
        }
        if (getDischargeLimitL2() != null) {
            json.addProperty("dischargeLimitL2", getDischargeLimitL2());
        }
        if (getDischargeLimitL3() != null) {
            json.addProperty("dischargeLimitL3", getDischargeLimitL3());
        }
        if (getSetpoint() != null) {
            json.addProperty("setpoint", getSetpoint());
        }
        if (getSetpointL2() != null) {
            json.addProperty("setpointL2", getSetpointL2());
        }
        if (getSetpointL3() != null) {
            json.addProperty("setpointL3", getSetpointL3());
        }
        if (getSetpointReactive() != null) {
            json.addProperty("setpointReactive", getSetpointReactive());
        }
        if (getSetpointReactiveL2() != null) {
            json.addProperty("setpointReactiveL2", getSetpointReactiveL2());
        }
        if (getSetpointReactiveL3() != null) {
            json.addProperty("setpointReactiveL3", getSetpointReactiveL3());
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
        return Objects.equals(getLimit(), that.getLimit())
                && Objects.equals(getLimitL2(), that.getLimitL2())
                && Objects.equals(getLimitL3(), that.getLimitL3())
                && Objects.equals(getDischargeLimit(), that.getDischargeLimit())
                && Objects.equals(getDischargeLimitL2(), that.getDischargeLimitL2())
                && Objects.equals(getDischargeLimitL3(), that.getDischargeLimitL3())
                && Objects.equals(getSetpoint(), that.getSetpoint())
                && Objects.equals(getSetpointL2(), that.getSetpointL2())
                && Objects.equals(getSetpointL3(), that.getSetpointL3())
                && Objects.equals(getSetpointReactive(), that.getSetpointReactive())
                && Objects.equals(getSetpointReactiveL2(), that.getSetpointReactiveL2())
                && Objects.equals(getSetpointReactiveL3(), that.getSetpointReactiveL3())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getLimit(),
                getLimitL2(),
                getLimitL3(),
                getDischargeLimit(),
                getDischargeLimitL2(),
                getDischargeLimitL3(),
                getSetpoint(),
                getSetpointL2(),
                getSetpointL3(),
                getSetpointReactive(),
                getSetpointReactiveL2(),
                getSetpointReactiveL3(),
                getCustomData()
        );
    }
}
