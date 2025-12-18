package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.OperationModeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Charging schedule period structure defines a time period in a charging schedule.
 * It is used in: CompositeScheduleType and in ChargingScheduleType.
 * When used in a NotifyEVChargingScheduleRequest only startPeriod, limit, limit_L2, limit_L3 are relevant.
 */
public class ChargingSchedulePeriod implements JsonInterface {

    /**
     * Start of the period, in seconds from the start of schedule.
     * The value of StartPeriod also defines the stop time of the previous period.
     */
    @Required
    private Integer startPeriod;

    /**
     * Optional only when not required by the operationMode,
     * as in CentralSetpoint, ExternalSetpoint, ExternalLimits, LocalFrequency, LocalLoadBalancing.
     * Charging rate limit during the schedule period, in the applicable chargingRateUnit.
     * This SHOULD be a non- negative value; a negative value is only supported for backwards compatibility
     * with older systems that use a negative value to specify a discharging limit.
     * When using chargingRateUnit =  W , this field represents the sum of the power of all phases,
     * unless values are provided for L2 and L3, in which case this field represents phase L1.
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
     * The number of phases that can be used for charging. For a DC EVSE this field should be omitted.
     * For an AC EVSE a default value of numberPhases = 3 will be assumed if the field is absent.
     */
    @Optional
    private Integer numberPhases;

    /**
     * Values: 1..3, Used if numberPhases=1 and if the EVSE is capable of switching the phase connected to the EV,
     * i.e. ACPhaseSwitchingSupported is defined and true. It’s not allowed unless both conditions above are true.
     * If both conditions are true, and phaseToUse is omitted, the Charging Station / EVSE will make the selection on its own.
     */
    @Optional
    private Integer phaseToUse;

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
     * (2.1) Setpoint for reactive power (or current) in chargingRateUnit that the EV should follow on phase L3 as closely as possible.
     */
    @Optional
    private Float setpointReactiveL3;

    /**
     * (2.1) If true, the EV should attempt to keep the BMS preconditioned for this time interval.
     */
    @Optional
    private Boolean preconditioningRequest;

    /**
     * (2.1) If true, the EVSE must turn off power electronics/modules associated with this transaction.
     * Default value when absent is false.
     */
    @Optional
    private Boolean evseSleep;

    /**
     * (2.1) Power value that, when present, is used as a baseline on top of which values
     * from v2xFreqWattCurve and v2xSignalWattCurve are added.
     */
    @Optional
    private Float v2xBaseline;

    /**
     * (2.1) Charging operation mode to use during this time interval. When absent defaults to ChargingOnly.
     */
    @Optional
    private OperationModeEnum operationMode;

    /**
     * (2.1) Only required when operationMode = LocalFrequency.
     * When used it must contain at least two coordinates to specify a power-frequency table to use during this period.
     * The table determines the value of setpoint power for a given frequency. chargingRateUnit must be W for LocalFrequency control.
     */
    @Optional
    private List<V2XFreqWattPoint> v2xFreqWattCurve;

    /**
     * (2.1) Only used, but not required, when operationMode =  LocalFrequency.
     * When used it must contain at least two coordinates to specify a signal- frequency curve to use during this period.
     * The curve determines the value of setpoint power for a given signal.
     * chargingRateUnit must be  W  for  LocalFrequency control.
     */
    @Optional
    private List<V2XSignalWattPoint> v2xSignalWattCurve;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChargingSchedulePeriod() {
    }


    public Integer getStartPeriod() {
        return startPeriod;
    }


    public void setStartPeriod(Integer startPeriod) {
        this.startPeriod = startPeriod;
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


    public Integer getNumberPhases() {
        return numberPhases;
    }


    public void setNumberPhases(Integer numberPhases) {
        this.numberPhases = numberPhases;
    }


    public Integer getPhaseToUse() {
        return phaseToUse;
    }


    public void setPhaseToUse(Integer phaseToUse) {
        this.phaseToUse = phaseToUse;
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


    public Boolean getPreconditioningRequest() {
        return preconditioningRequest;
    }


    public void setPreconditioningRequest(Boolean preconditioningRequest) {
        this.preconditioningRequest = preconditioningRequest;
    }


    public Boolean getEvseSleep() {
        return evseSleep;
    }


    public void setEvseSleep(Boolean evseSleep) {
        this.evseSleep = evseSleep;
    }


    public Float getV2xBaseline() {
        return v2xBaseline;
    }


    public void setV2xBaseline(Float v2xBaseline) {
        this.v2xBaseline = v2xBaseline;
    }


    public OperationModeEnum getOperationMode() {
        return operationMode;
    }


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

        json.addProperty("startPeriod", getStartPeriod());

        if (getLimit() != null) {
            json.addProperty("limit", getLimit());
        }
        if (getLimitL2() != null) {
            json.addProperty("limitL2", getLimitL2());
        }
        if (getLimitL3() != null) {
            json.addProperty("limitL3", getLimitL3());
        }
        if (getNumberPhases() != null) {
            json.addProperty("numberPhases", getNumberPhases());
        }
        if (getPhaseToUse() != null) {
            json.addProperty("phaseToUse", getPhaseToUse());
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
        if (getPreconditioningRequest() != null) {
            json.addProperty("preconditioningRequest", getPreconditioningRequest());
        }
        if (getEvseSleep() != null) {
            json.addProperty("evseSleep", getEvseSleep());
        }
        if (getV2xBaseline() != null) {
            json.addProperty("v2xBaseline", getV2xBaseline());
        }
        if (getOperationMode() != null) {
            json.addProperty("operationMode", getOperationMode().toString());
        }
        if (getV2xFreqWattCurve() != null) {
            JsonArray v2xFreqWattCurveArray = new JsonArray();
            for (V2XFreqWattPoint item : getV2xFreqWattCurve()) {
                v2xFreqWattCurveArray.add(item.toJsonObject());
            }
            json.add("v2xFreqWattCurve", v2xFreqWattCurveArray);
        }
        if (getV2xSignalWattCurve() != null) {
            JsonArray v2xSignalWattCurveArray = new JsonArray();
            for (V2XSignalWattPoint item : getV2xSignalWattCurve()) {
                v2xSignalWattCurveArray.add(item.toJsonObject());
            }
            json.add("v2xSignalWattCurve", v2xSignalWattCurveArray);
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
        if (jsonObject.has("startPeriod")) {
            setStartPeriod(jsonObject.get("startPeriod").getAsInt());
        }

        if (jsonObject.has("limit")) {
            setLimit(jsonObject.get("limit").getAsFloat());
        }

        if (jsonObject.has("limitL2")) {
            setLimitL2(jsonObject.get("limitL2").getAsFloat());
        }

        if (jsonObject.has("limitL3")) {
            setLimitL3(jsonObject.get("limitL3").getAsFloat());
        }

        if (jsonObject.has("numberPhases")) {
            setNumberPhases(jsonObject.get("numberPhases").getAsInt());
        }

        if (jsonObject.has("phaseToUse")) {
            setPhaseToUse(jsonObject.get("phaseToUse").getAsInt());
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

        if (jsonObject.has("preconditioningRequest")) {
            setPreconditioningRequest(jsonObject.get("preconditioningRequest").getAsBoolean());
        }

        if (jsonObject.has("evseSleep")) {
            setEvseSleep(jsonObject.get("evseSleep").getAsBoolean());
        }

        if (jsonObject.has("v2xBaseline")) {
            setV2xBaseline(jsonObject.get("v2xBaseline").getAsFloat());
        }

        if (jsonObject.has("operationMode")) {
            setOperationMode(OperationModeEnum.valueOf(jsonObject.get("operationMode").getAsString()));
        }

        if (jsonObject.has("v2xFreqWattCurve")) {
            setV2xFreqWattCurve(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("v2xFreqWattCurve");
            for (JsonElement el : arr) {
                V2XFreqWattPoint item = new V2XFreqWattPoint();
                item.fromJsonObject(el.getAsJsonObject());
                getV2xFreqWattCurve().add(item);
            }
        }

        if (jsonObject.has("v2xSignalWattCurve")) {
            setV2xSignalWattCurve(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("v2xSignalWattCurve");
            for (JsonElement el : arr) {
                V2XSignalWattPoint item = new V2XSignalWattPoint();
                item.fromJsonObject(el.getAsJsonObject());
                getV2xSignalWattCurve().add(item);
            }
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
        return Objects.hash(
                getStartPeriod(),
                getLimit(),
                getLimitL2(),
                getLimitL3(),
                getNumberPhases(),
                getPhaseToUse(),
                getDischargeLimit(),
                getDischargeLimitL2(),
                getDischargeLimitL3(),
                getSetpoint(),
                getSetpointL2(),
                getSetpointL3(),
                getSetpointReactive(),
                getSetpointReactiveL2(),
                getSetpointReactiveL3(),
                getPreconditioningRequest(),
                getEvseSleep(),
                getV2xBaseline(),
                getOperationMode(),
                getV2xFreqWattCurve(),
                getV2xSignalWattCurve(),
                getCustomData()
        );
    }
}
