package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.DERUnitEnum;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class DERCurve {

    /**
     * 
     * (Required)
     */
    @Required
    private List<DERCurvePoints> curveData;
    @Optional
    private Hysteresis hysteresis;
    /**
     * Priority of curve (0=highest)
     * 
     * 
     * 
     * (Required)
     */
    @Required
    private Integer priority;
    @Optional
    private ReactivePowerParams reactivePowerParams;
    @Optional
    private VoltageParams voltageParams;
    /**
     * Unit of the Y-axis of DER curve
     * 
     * (Required)
     */
    @Required
    private DERUnitEnum yUnit;
    /**
     * Open loop response time, the time to ramp up to 90% of the new target in response to the change in voltage, in seconds. A value of 0 is used to mean no limit. When not present, the device should follow its default behavior.
     * 
     * 
     */
    @Optional
    private Float responseTime;
    /**
     * Point in time when this curve will become activated. Only absent when _default_ is true.
     * 
     */
    @Optional
    private Date startTime;
    /**
     * Duration in seconds that this curve will be active. Only absent when _default_ is true.
     * 
     * 
     */
    @Optional
    private Float duration;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public DERCurve() {
    }

    /**
     * 
     * @param duration
     *     Duration in seconds that this curve will be active. Only absent when _default_ is true.
     *     
     *     
     *     .
     * @param responseTime
     *     Open loop response time, the time to ramp up to 90% of the new target in response to the change in voltage, in seconds. A value of 0 is used to mean no limit. When not present, the device should follow its default behavior.
     *     
     *     
     *     .
     * @param startTime
     *     Point in time when this curve will become activated. Only absent when _default_ is true.
     *     
     *     .
     * @param priority
     *     Priority of curve (0=highest)
     *     
     *     
     *     .
     */
    public DERCurve(List<DERCurvePoints> curveData, Hysteresis hysteresis, Integer priority, ReactivePowerParams reactivePowerParams, VoltageParams voltageParams, DERUnitEnum yUnit, Float responseTime, Date startTime, Float duration, CustomData customData) {
        super();
        this.curveData = curveData;
        this.hysteresis = hysteresis;
        this.priority = priority;
        this.reactivePowerParams = reactivePowerParams;
        this.voltageParams = voltageParams;
        this.yUnit = yUnit;
        this.responseTime = responseTime;
        this.startTime = startTime;
        this.duration = duration;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public List<DERCurvePoints> getCurveData() {
        return curveData;
    }

    /**
     * 
     * (Required)
     */
    public void setCurveData(List<DERCurvePoints> curveData) {
        this.curveData = curveData;
    }

    public Hysteresis getHysteresis() {
        return hysteresis;
    }

    public void setHysteresis(Hysteresis hysteresis) {
        this.hysteresis = hysteresis;
    }

    /**
     * Priority of curve (0=highest)
     * 
     * 
     * 
     * (Required)
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Priority of curve (0=highest)
     * 
     * 
     * 
     * (Required)
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ReactivePowerParams getReactivePowerParams() {
        return reactivePowerParams;
    }

    public void setReactivePowerParams(ReactivePowerParams reactivePowerParams) {
        this.reactivePowerParams = reactivePowerParams;
    }

    public VoltageParams getVoltageParams() {
        return voltageParams;
    }

    public void setVoltageParams(VoltageParams voltageParams) {
        this.voltageParams = voltageParams;
    }

    /**
     * Unit of the Y-axis of DER curve
     * 
     * (Required)
     */
    public DERUnitEnum getyUnit() {
        return yUnit;
    }

    /**
     * Unit of the Y-axis of DER curve
     * 
     * (Required)
     */
    public void setyUnit(DERUnitEnum yUnit) {
        this.yUnit = yUnit;
    }

    /**
     * Open loop response time, the time to ramp up to 90% of the new target in response to the change in voltage, in seconds. A value of 0 is used to mean no limit. When not present, the device should follow its default behavior.
     * 
     * 
     */
    public Float getResponseTime() {
        return responseTime;
    }

    /**
     * Open loop response time, the time to ramp up to 90% of the new target in response to the change in voltage, in seconds. A value of 0 is used to mean no limit. When not present, the device should follow its default behavior.
     * 
     * 
     */
    public void setResponseTime(Float responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * Point in time when this curve will become activated. Only absent when _default_ is true.
     * 
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Point in time when this curve will become activated. Only absent when _default_ is true.
     * 
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Duration in seconds that this curve will be active. Only absent when _default_ is true.
     * 
     * 
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Duration in seconds that this curve will be active. Only absent when _default_ is true.
     * 
     * 
     */
    public void setDuration(Float duration) {
        this.duration = duration;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof DERCurve))
            return false;
        DERCurve that = (DERCurve) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.responseTime, that.responseTime) 
                && Objects.equals(this.startTime, that.startTime) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.curveData, that.curveData) 
                && Objects.equals(this.priority, that.priority) 
                && Objects.equals(this.yUnit, that.yUnit) 
                && Objects.equals(this.reactivePowerParams, that.reactivePowerParams) 
                && Objects.equals(this.voltageParams, that.voltageParams) 
                && Objects.equals(this.hysteresis, that.hysteresis);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.responseTime != null ? this.responseTime.hashCode() : 0);
        result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.curveData != null ? this.curveData.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        result = 31 * result + (this.yUnit != null ? this.yUnit.hashCode() : 0);
        result = 31 * result + (this.reactivePowerParams != null ? this.reactivePowerParams.hashCode() : 0);
        result = 31 * result + (this.voltageParams != null ? this.voltageParams.hashCode() : 0);
        result = 31 * result + (this.hysteresis != null ? this.hysteresis.hashCode() : 0);
        return result;
    }
}
