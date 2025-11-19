package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

/**
 * Updates to a ChargingSchedulePeriodType for dynamic charging profiles.
 * 
 * 
 * 
 */
public class ChargingScheduleUpdate implements JsonInterface {

    /**
     * Optional only when not required by the _operationMode_, as in CentralSetpoint, ExternalSetpoint, ExternalLimits, LocalFrequency,  LocalLoadBalancing. +
     * Charging rate limit during the schedule period, in the applicable _chargingRateUnit_. 
     * This SHOULD be a non-negative value; a negative value is only supported for backwards compatibility with older systems that use a negative value to specify a discharging limit.
     * For AC this field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    @Optional
    private Float limit;
    /**
     * *(2.1)* Charging rate limit on phase L2  in the applicable _chargingRateUnit_. 
     */
    @Optional
    private Float limitL2;
    /**
     * *(2.1)* Charging rate limit on phase L3  in the applicable _chargingRateUnit_. 
     */
    @Optional
    private Float limitL3;
    /**
     * *(2.1)* Limit in _chargingRateUnit_ that the EV is allowed to discharge with. Note, these are negative values in order to be consistent with _setpoint_, which can be positive and negative.  +
     * For AC this field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    @Optional
    private Float dischargeLimit;
    /**
     * *(2.1)* Limit in _chargingRateUnit_ on phase L2 that the EV is allowed to discharge with. 
     */
    @Optional
    private Float dischargeLimitL2;
    /**
     * *(2.1)* Limit in _chargingRateUnit_ on phase L3 that the EV is allowed to discharge with. 
     */
    @Optional
    private Float dischargeLimitL3;
    /**
     * *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow as close as possible. Use negative values for discharging. +
     * When a limit and/or _dischargeLimit_ are given the overshoot when following _setpoint_ must remain within these values.
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    @Optional
    private Float setpoint;
    /**
     * *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow on phase L2 as close as possible.
     */
    @Optional
    private Float setpointL2;
    /**
     * *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow on phase L3 as close as possible. 
     */
    @Optional
    private Float setpointL3;
    /**
     * *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow as closely as possible. Positive values for inductive, negative for capacitive reactive power or current.  +
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    @Optional
    private Float setpointReactive;
    /**
     * *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow on phase L2 as closely as possible. 
     */
    @Optional
    private Float setpointReactiveL2;
    /**
     * *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow on phase L3 as closely as possible. 
     */
    @Optional
    private Float setpointReactiveL3;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ChargingScheduleUpdate() {
    }

    /**
     * 
     * @param setpointL3
     *     *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow on phase L3 as close as possible. 
     *     .
     * @param setpointL2
     *     *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow on phase L2 as close as possible.
     *     .
     * @param setpoint
     *     *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow as close as possible. Use negative values for discharging. +
     *     When a limit and/or _dischargeLimit_ are given the overshoot when following _setpoint_ must remain within these values.
     *     This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     *     .
     * @param dischargeLimitL3
     *     *(2.1)* Limit in _chargingRateUnit_ on phase L3 that the EV is allowed to discharge with. 
     *     .
     * @param setpointReactive
     *     *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow as closely as possible. Positive values for inductive, negative for capacitive reactive power or current.  +
     *     This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     *     .
     * @param limit
     *     Optional only when not required by the _operationMode_, as in CentralSetpoint, ExternalSetpoint, ExternalLimits, LocalFrequency,  LocalLoadBalancing. +
     *     Charging rate limit during the schedule period, in the applicable _chargingRateUnit_. 
     *     This SHOULD be a non-negative value; a negative value is only supported for backwards compatibility with older systems that use a negative value to specify a discharging limit.
     *     For AC this field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     *     .
     * @param setpointReactiveL2
     *     *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow on phase L2 as closely as possible. 
     *     .
     * @param setpointReactiveL3
     *     *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow on phase L3 as closely as possible. 
     *     .
     * @param dischargeLimitL2
     *     *(2.1)* Limit in _chargingRateUnit_ on phase L2 that the EV is allowed to discharge with. 
     *     .
     * @param limitL3
     *     *(2.1)* Charging rate limit on phase L3  in the applicable _chargingRateUnit_. 
     *     .
     * @param dischargeLimit
     *     *(2.1)* Limit in _chargingRateUnit_ that the EV is allowed to discharge with. Note, these are negative values in order to be consistent with _setpoint_, which can be positive and negative.  +
     *     For AC this field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     *     .
     * @param limitL2
     *     *(2.1)* Charging rate limit on phase L2  in the applicable _chargingRateUnit_. 
     *     .
     */
    public ChargingScheduleUpdate(Float limit, Float limitL2, Float limitL3, Float dischargeLimit, Float dischargeLimitL2, Float dischargeLimitL3, Float setpoint, Float setpointL2, Float setpointL3, Float setpointReactive, Float setpointReactiveL2, Float setpointReactiveL3, CustomData customData) {
        super();
        this.limit = limit;
        this.limitL2 = limitL2;
        this.limitL3 = limitL3;
        this.dischargeLimit = dischargeLimit;
        this.dischargeLimitL2 = dischargeLimitL2;
        this.dischargeLimitL3 = dischargeLimitL3;
        this.setpoint = setpoint;
        this.setpointL2 = setpointL2;
        this.setpointL3 = setpointL3;
        this.setpointReactive = setpointReactive;
        this.setpointReactiveL2 = setpointReactiveL2;
        this.setpointReactiveL3 = setpointReactiveL3;
        this.customData = customData;
    }

    /**
     * Optional only when not required by the _operationMode_, as in CentralSetpoint, ExternalSetpoint, ExternalLimits, LocalFrequency,  LocalLoadBalancing. +
     * Charging rate limit during the schedule period, in the applicable _chargingRateUnit_. 
     * This SHOULD be a non-negative value; a negative value is only supported for backwards compatibility with older systems that use a negative value to specify a discharging limit.
     * For AC this field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    public Float getLimit() {
        return limit;
    }

    /**
     * Optional only when not required by the _operationMode_, as in CentralSetpoint, ExternalSetpoint, ExternalLimits, LocalFrequency,  LocalLoadBalancing. +
     * Charging rate limit during the schedule period, in the applicable _chargingRateUnit_. 
     * This SHOULD be a non-negative value; a negative value is only supported for backwards compatibility with older systems that use a negative value to specify a discharging limit.
     * For AC this field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    public void setLimit(Float limit) {
        this.limit = limit;
    }

    /**
     * *(2.1)* Charging rate limit on phase L2  in the applicable _chargingRateUnit_. 
     */
    public Float getLimitL2() {
        return limitL2;
    }

    /**
     * *(2.1)* Charging rate limit on phase L2  in the applicable _chargingRateUnit_. 
     */
    public void setLimitL2(Float limitL2) {
        this.limitL2 = limitL2;
    }

    /**
     * *(2.1)* Charging rate limit on phase L3  in the applicable _chargingRateUnit_. 
     */
    public Float getLimitL3() {
        return limitL3;
    }

    /**
     * *(2.1)* Charging rate limit on phase L3  in the applicable _chargingRateUnit_. 
     */
    public void setLimitL3(Float limitL3) {
        this.limitL3 = limitL3;
    }

    /**
     * *(2.1)* Limit in _chargingRateUnit_ that the EV is allowed to discharge with. Note, these are negative values in order to be consistent with _setpoint_, which can be positive and negative.  +
     * For AC this field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    public Float getDischargeLimit() {
        return dischargeLimit;
    }

    /**
     * *(2.1)* Limit in _chargingRateUnit_ that the EV is allowed to discharge with. Note, these are negative values in order to be consistent with _setpoint_, which can be positive and negative.  +
     * For AC this field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    public void setDischargeLimit(Float dischargeLimit) {
        this.dischargeLimit = dischargeLimit;
    }

    /**
     * *(2.1)* Limit in _chargingRateUnit_ on phase L2 that the EV is allowed to discharge with. 
     */
    public Float getDischargeLimitL2() {
        return dischargeLimitL2;
    }

    /**
     * *(2.1)* Limit in _chargingRateUnit_ on phase L2 that the EV is allowed to discharge with. 
     */
    public void setDischargeLimitL2(Float dischargeLimitL2) {
        this.dischargeLimitL2 = dischargeLimitL2;
    }

    /**
     * *(2.1)* Limit in _chargingRateUnit_ on phase L3 that the EV is allowed to discharge with. 
     */
    public Float getDischargeLimitL3() {
        return dischargeLimitL3;
    }

    /**
     * *(2.1)* Limit in _chargingRateUnit_ on phase L3 that the EV is allowed to discharge with. 
     */
    public void setDischargeLimitL3(Float dischargeLimitL3) {
        this.dischargeLimitL3 = dischargeLimitL3;
    }

    /**
     * *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow as close as possible. Use negative values for discharging. +
     * When a limit and/or _dischargeLimit_ are given the overshoot when following _setpoint_ must remain within these values.
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    public Float getSetpoint() {
        return setpoint;
    }

    /**
     * *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow as close as possible. Use negative values for discharging. +
     * When a limit and/or _dischargeLimit_ are given the overshoot when following _setpoint_ must remain within these values.
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    public void setSetpoint(Float setpoint) {
        this.setpoint = setpoint;
    }

    /**
     * *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow on phase L2 as close as possible.
     */
    public Float getSetpointL2() {
        return setpointL2;
    }

    /**
     * *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow on phase L2 as close as possible.
     */
    public void setSetpointL2(Float setpointL2) {
        this.setpointL2 = setpointL2;
    }

    /**
     * *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow on phase L3 as close as possible. 
     */
    public Float getSetpointL3() {
        return setpointL3;
    }

    /**
     * *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow on phase L3 as close as possible. 
     */
    public void setSetpointL3(Float setpointL3) {
        this.setpointL3 = setpointL3;
    }

    /**
     * *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow as closely as possible. Positive values for inductive, negative for capacitive reactive power or current.  +
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    public Float getSetpointReactive() {
        return setpointReactive;
    }

    /**
     * *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow as closely as possible. Positive values for inductive, negative for capacitive reactive power or current.  +
     * This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    public void setSetpointReactive(Float setpointReactive) {
        this.setpointReactive = setpointReactive;
    }

    /**
     * *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow on phase L2 as closely as possible. 
     */
    public Float getSetpointReactiveL2() {
        return setpointReactiveL2;
    }

    /**
     * *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow on phase L2 as closely as possible. 
     */
    public void setSetpointReactiveL2(Float setpointReactiveL2) {
        this.setpointReactiveL2 = setpointReactiveL2;
    }

    /**
     * *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow on phase L3 as closely as possible. 
     */
    public Float getSetpointReactiveL3() {
        return setpointReactiveL3;
    }

    /**
     * *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow on phase L3 as closely as possible. 
     */
    public void setSetpointReactiveL3(Float setpointReactiveL3) {
        this.setpointReactiveL3 = setpointReactiveL3;
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
        result = 31 * result + (this.dischargeLimitL3 != null ? this.dischargeLimitL3 .hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.setpointL3 != null ? this.setpointL3 .hashCode() : 0);
        result = 31 * result + (this.setpointL2 != null ? this.setpointL2 .hashCode() : 0);
        result = 31 * result + (this.setpointReactive != null ? this.setpointReactive.hashCode() : 0);
        result = 31 * result + (this.limit != null ? this.limit.hashCode() : 0);
        result = 31 * result + (this.setpointReactiveL2 != null ? this.setpointReactiveL2 .hashCode() : 0);
        result = 31 * result + (this.setpointReactiveL3 != null ? this.setpointReactiveL3 .hashCode() : 0);
        result = 31 * result + (this.dischargeLimitL2 != null ? this.dischargeLimitL2 .hashCode() : 0);
        result = 31 * result + (this.limitL3 != null ? this.limitL3 .hashCode() : 0);
        result = 31 * result + (this.dischargeLimit != null ? this.dischargeLimit.hashCode() : 0);
        result = 31 * result + (this.limitL2 != null ? this.limitL2 .hashCode() : 0);
        return result;
    }
}
