package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.OperationModeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class ChargingSchedulePeriod implements JsonInterface {

    /**
     * Start of the period, in seconds from the start of schedule. The value of StartPeriod also defines the stop time of the previous period.
     * 
     * (Required)
     */
    @Required
    private Integer startPeriod;
    /**
     * Optional only when not required by the _operationMode_, as in CentralSetpoint, ExternalSetpoint, ExternalLimits, LocalFrequency,  LocalLoadBalancing. +
     * Charging rate limit during the schedule period, in the applicable _chargingRateUnit_. 
     * This SHOULD be a non-negative value; a negative value is only supported for backwards compatibility with older systems that use a negative value to specify a discharging limit.
     * When using _chargingRateUnit_ = `W`, this field represents the sum of the power of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
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
     * The number of phases that can be used for charging. +
     * For a DC EVSE this field should be omitted. +
     * For an AC EVSE a default value of _numberPhases_ = 3 will be assumed if the field is absent.
     */
    @Optional
    private Integer numberPhases;
    /**
     * Values: 1..3, Used if numberPhases=1 and if the EVSE is capable of switching the phase connected to the EV, i.e. ACPhaseSwitchingSupported is defined and true. It’s not allowed unless both conditions above are true. If both conditions are true, and phaseToUse is omitted, the Charging Station / EVSE will make the selection on its own.
     * 
     */
    @Optional
    private Integer phaseToUse;
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
     * *(2.1)* If  true, the EV should attempt to keep the BMS preconditioned for this time interval.
     */
    @Optional
    private Boolean preconditioningRequest;
    /**
     * *(2.1)* If true, the EVSE must turn off power electronics/modules associated with this transaction. Default value when absent is false.
     */
    @Optional
    private Boolean evseSleep;
    /**
     * *(2.1)* Power value that, when present, is used as a baseline on top of which values from _v2xFreqWattCurve_ and _v2xSignalWattCurve_ are added.
     * 
     */
    @Optional
    private Float v2xBaseline;
    /**
     * *(2.1)* Charging operation mode to use during this time interval. When absent defaults to `ChargingOnly`.
     */
    @Optional
    private OperationModeEnum operationMode;
    @Optional
    private List<V2XFreqWattPoint> v2xFreqWattCurve;
    @Optional
    private List<V2XSignalWattPoint> v2xSignalWattCurve;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ChargingSchedulePeriod() {
    }

    /**
     * 
     * @param evseSleep
     *     *(2.1)* If true, the EVSE must turn off power electronics/modules associated with this transaction. Default value when absent is false.
     *     .
     * @param preconditioningRequest
     *     *(2.1)* If  true, the EV should attempt to keep the BMS preconditioned for this time interval.
     *     .
     * @param setpoint
     *     *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow as close as possible. Use negative values for discharging. +
     *     When a limit and/or _dischargeLimit_ are given the overshoot when following _setpoint_ must remain within these values.
     *     This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     *     .
     * @param dischargeLimitL3
     *     *(2.1)* Limit in _chargingRateUnit_ on phase L3 that the EV is allowed to discharge with. 
     *     .
     * @param phaseToUse
     *     Values: 1..3, Used if numberPhases=1 and if the EVSE is capable of switching the phase connected to the EV, i.e. ACPhaseSwitchingSupported is defined and true. It’s not allowed unless both conditions above are true. If both conditions are true, and phaseToUse is omitted, the Charging Station / EVSE will make the selection on its own.
     *     
     *     .
     * @param setpointL3
     *     *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow on phase L3 as close as possible. 
     *     .
     * @param startPeriod
     *     Start of the period, in seconds from the start of schedule. The value of StartPeriod also defines the stop time of the previous period.
     *     .
     * @param setpointL2
     *     *(2.1)* Setpoint in _chargingRateUnit_ that the EV should follow on phase L2 as close as possible.
     *     .
     * @param setpointReactive
     *     *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow as closely as possible. Positive values for inductive, negative for capacitive reactive power or current.  +
     *     This field represents the sum of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     *     .
     * @param limit
     *     Optional only when not required by the _operationMode_, as in CentralSetpoint, ExternalSetpoint, ExternalLimits, LocalFrequency,  LocalLoadBalancing. +
     *     Charging rate limit during the schedule period, in the applicable _chargingRateUnit_. 
     *     This SHOULD be a non-negative value; a negative value is only supported for backwards compatibility with older systems that use a negative value to specify a discharging limit.
     *     When using _chargingRateUnit_ = `W`, this field represents the sum of the power of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     *     .
     * @param setpointReactiveL2
     *     *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow on phase L2 as closely as possible. 
     *     .
     * @param setpointReactiveL3
     *     *(2.1)* Setpoint for reactive power (or current) in _chargingRateUnit_ that the EV should follow on phase L3 as closely as possible. 
     *     .
     * @param numberPhases
     *     The number of phases that can be used for charging. +
     *     For a DC EVSE this field should be omitted. +
     *     For an AC EVSE a default value of _numberPhases_ = 3 will be assumed if the field is absent.
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
     * @param v2xBaseline
     *     *(2.1)* Power value that, when present, is used as a baseline on top of which values from _v2xFreqWattCurve_ and _v2xSignalWattCurve_ are added.
     *     
     *     .
     */
    public ChargingSchedulePeriod(Integer startPeriod, Float limit, Float limitL2, Float limitL3, Integer numberPhases, Integer phaseToUse, Float dischargeLimit, Float dischargeLimitL2, Float dischargeLimitL3, Float setpoint, Float setpointL2, Float setpointL3, Float setpointReactive, Float setpointReactiveL2, Float setpointReactiveL3, Boolean preconditioningRequest, Boolean evseSleep, Float v2xBaseline, OperationModeEnum operationMode, List<V2XFreqWattPoint> v2xFreqWattCurve, List<V2XSignalWattPoint> v2xSignalWattCurve, CustomData customData) {
        super();
        this.startPeriod = startPeriod;
        this.limit = limit;
        this.limitL2 = limitL2;
        this.limitL3 = limitL3;
        this.numberPhases = numberPhases;
        this.phaseToUse = phaseToUse;
        this.dischargeLimit = dischargeLimit;
        this.dischargeLimitL2 = dischargeLimitL2;
        this.dischargeLimitL3 = dischargeLimitL3;
        this.setpoint = setpoint;
        this.setpointL2 = setpointL2;
        this.setpointL3 = setpointL3;
        this.setpointReactive = setpointReactive;
        this.setpointReactiveL2 = setpointReactiveL2;
        this.setpointReactiveL3 = setpointReactiveL3;
        this.preconditioningRequest = preconditioningRequest;
        this.evseSleep = evseSleep;
        this.v2xBaseline = v2xBaseline;
        this.operationMode = operationMode;
        this.v2xFreqWattCurve = v2xFreqWattCurve;
        this.v2xSignalWattCurve = v2xSignalWattCurve;
        this.customData = customData;
    }

    /**
     * Start of the period, in seconds from the start of schedule. The value of StartPeriod also defines the stop time of the previous period.
     * 
     * (Required)
     */
    public Integer getStartPeriod() {
        return startPeriod;
    }

    /**
     * Start of the period, in seconds from the start of schedule. The value of StartPeriod also defines the stop time of the previous period.
     * 
     * (Required)
     */
    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
    }

    /**
     * Optional only when not required by the _operationMode_, as in CentralSetpoint, ExternalSetpoint, ExternalLimits, LocalFrequency,  LocalLoadBalancing. +
     * Charging rate limit during the schedule period, in the applicable _chargingRateUnit_. 
     * This SHOULD be a non-negative value; a negative value is only supported for backwards compatibility with older systems that use a negative value to specify a discharging limit.
     * When using _chargingRateUnit_ = `W`, this field represents the sum of the power of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
     */
    public Float getLimit() {
        return limit;
    }

    /**
     * Optional only when not required by the _operationMode_, as in CentralSetpoint, ExternalSetpoint, ExternalLimits, LocalFrequency,  LocalLoadBalancing. +
     * Charging rate limit during the schedule period, in the applicable _chargingRateUnit_. 
     * This SHOULD be a non-negative value; a negative value is only supported for backwards compatibility with older systems that use a negative value to specify a discharging limit.
     * When using _chargingRateUnit_ = `W`, this field represents the sum of the power of all phases, unless values are provided for L2 and L3, in which case this field represents phase L1.
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
     * The number of phases that can be used for charging. +
     * For a DC EVSE this field should be omitted. +
     * For an AC EVSE a default value of _numberPhases_ = 3 will be assumed if the field is absent.
     */
    public Integer getNumberPhases() {
        return numberPhases;
    }

    /**
     * The number of phases that can be used for charging. +
     * For a DC EVSE this field should be omitted. +
     * For an AC EVSE a default value of _numberPhases_ = 3 will be assumed if the field is absent.
     */
    public void setNumberPhases(Integer numberPhases) {
        this.numberPhases = numberPhases;
    }

    /**
     * Values: 1..3, Used if numberPhases=1 and if the EVSE is capable of switching the phase connected to the EV, i.e. ACPhaseSwitchingSupported is defined and true. It’s not allowed unless both conditions above are true. If both conditions are true, and phaseToUse is omitted, the Charging Station / EVSE will make the selection on its own.
     * 
     */
    public Integer getPhaseToUse() {
        return phaseToUse;
    }

    /**
     * Values: 1..3, Used if numberPhases=1 and if the EVSE is capable of switching the phase connected to the EV, i.e. ACPhaseSwitchingSupported is defined and true. It’s not allowed unless both conditions above are true. If both conditions are true, and phaseToUse is omitted, the Charging Station / EVSE will make the selection on its own.
     * 
     */
    public void setPhaseToUse(Integer phaseToUse) {
        this.phaseToUse = phaseToUse;
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
     * *(2.1)* If  true, the EV should attempt to keep the BMS preconditioned for this time interval.
     */
    public Boolean getPreconditioningRequest() {
        return preconditioningRequest;
    }

    /**
     * *(2.1)* If  true, the EV should attempt to keep the BMS preconditioned for this time interval.
     */
    public void setPreconditioningRequest(Boolean preconditioningRequest) {
        this.preconditioningRequest = preconditioningRequest;
    }

    /**
     * *(2.1)* If true, the EVSE must turn off power electronics/modules associated with this transaction. Default value when absent is false.
     */
    public Boolean getEvseSleep() {
        return evseSleep;
    }

    /**
     * *(2.1)* If true, the EVSE must turn off power electronics/modules associated with this transaction. Default value when absent is false.
     */
    public void setEvseSleep(Boolean evseSleep) {
        this.evseSleep = evseSleep;
    }

    /**
     * *(2.1)* Power value that, when present, is used as a baseline on top of which values from _v2xFreqWattCurve_ and _v2xSignalWattCurve_ are added.
     * 
     */
    public Float getV2xBaseline() {
        return v2xBaseline;
    }

    /**
     * *(2.1)* Power value that, when present, is used as a baseline on top of which values from _v2xFreqWattCurve_ and _v2xSignalWattCurve_ are added.
     * 
     */
    public void setV2xBaseline(Float v2xBaseline) {
        this.v2xBaseline = v2xBaseline;
    }

    /**
     * *(2.1)* Charging operation mode to use during this time interval. When absent defaults to `ChargingOnly`.
     */
    public OperationModeEnum getOperationMode() {
        return operationMode;
    }

    /**
     * *(2.1)* Charging operation mode to use during this time interval. When absent defaults to `ChargingOnly`.
     */
    public void setOperationMode(OperationModeEnum operationMode) {
        this.operationMode = operationMode;
    }

    public List<V2XFreqWattPoint> getV2xFreqWattCurve() {
        return v2xFreqWattCurve;
    }

    public void setV2xFreqWattCurve(List<V2XFreqWattPoint> v2xFreqWattCurve) {
        this.v2xFreqWattCurve = v2xFreqWattCurve;
    }

    public List<V2XSignalWattPoint> getV2xSignalWattCurve() {
        return v2xSignalWattCurve;
    }

    public void setV2xSignalWattCurve(List<V2XSignalWattPoint> v2xSignalWattCurve) {
        this.v2xSignalWattCurve = v2xSignalWattCurve;
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
        if (!(obj instanceof ChargingSchedulePeriod))
            return false;
        ChargingSchedulePeriod that = (ChargingSchedulePeriod) obj;
        return Objects.equals(this.evseSleep, that.evseSleep)
                && Objects.equals(this.preconditioningRequest, that.preconditioningRequest) 
                && Objects.equals(this.setpoint, that.setpoint) 
                && Objects.equals(this.dischargeLimitL3, that.dischargeLimitL3) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.phaseToUse, that.phaseToUse) 
                && Objects.equals(this.setpointL3, that.setpointL3) 
                && Objects.equals(this.startPeriod, that.startPeriod) 
                && Objects.equals(this.setpointL2, that.setpointL2) 
                && Objects.equals(this.operationMode, that.operationMode) 
                && Objects.equals(this.v2xFreqWattCurve, that.v2xFreqWattCurve) 
                && Objects.equals(this.setpointReactive, that.setpointReactive) 
                && Objects.equals(this.v2xSignalWattCurve, that.v2xSignalWattCurve) 
                && Objects.equals(this.limit, that.limit) 
                && Objects.equals(this.setpointReactiveL2, that.setpointReactiveL2) 
                && Objects.equals(this.setpointReactiveL3, that.setpointReactiveL3) 
                && Objects.equals(this.numberPhases, that.numberPhases) 
                && Objects.equals(this.dischargeLimitL2, that.dischargeLimitL2) 
                && Objects.equals(this.limitL3, that.limitL3) 
                && Objects.equals(this.dischargeLimit, that.dischargeLimit) 
                && Objects.equals(this.limitL2, that.limitL2) 
                && Objects.equals(this.v2xBaseline, that.v2xBaseline);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseSleep != null ? this.evseSleep.hashCode() : 0);
        result = 31 * result + (this.preconditioningRequest != null ? this.preconditioningRequest.hashCode() : 0);
        result = 31 * result + (this.setpoint != null ? this.setpoint.hashCode() : 0);
        result = 31 * result + (this.dischargeLimitL3 != null ? this.dischargeLimitL3 .hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.phaseToUse != null ? this.phaseToUse.hashCode() : 0);
        result = 31 * result + (this.setpointL3 != null ? this.setpointL3 .hashCode() : 0);
        result = 31 * result + (this.startPeriod != null ? this.startPeriod.hashCode() : 0);
        result = 31 * result + (this.setpointL2 != null ? this.setpointL2 .hashCode() : 0);
        result = 31 * result + (this.operationMode != null ? this.operationMode.hashCode() : 0);
        result = 31 * result + (this.v2xFreqWattCurve != null ? this.v2xFreqWattCurve.hashCode() : 0);
        result = 31 * result + (this.setpointReactive != null ? this.setpointReactive.hashCode() : 0);
        result = 31 * result + (this.v2xSignalWattCurve != null ? this.v2xSignalWattCurve.hashCode() : 0);
        result = 31 * result + (this.limit != null ? this.limit.hashCode() : 0);
        result = 31 * result + (this.setpointReactiveL2 != null ? this.setpointReactiveL2 .hashCode() : 0);
        result = 31 * result + (this.setpointReactiveL3 != null ? this.setpointReactiveL3 .hashCode() : 0);
        result = 31 * result + (this.numberPhases != null ? this.numberPhases.hashCode() : 0);
        result = 31 * result + (this.dischargeLimitL2 != null ? this.dischargeLimitL2 .hashCode() : 0);
        result = 31 * result + (this.limitL3 != null ? this.limitL3 .hashCode() : 0);
        result = 31 * result + (this.dischargeLimit != null ? this.dischargeLimit.hashCode() : 0);
        result = 31 * result + (this.limitL2 != null ? this.limitL2 .hashCode() : 0);
        result = 31 * result + (this.v2xBaseline != null ? this.v2xBaseline.hashCode() : 0);
        return result;
    }
}
