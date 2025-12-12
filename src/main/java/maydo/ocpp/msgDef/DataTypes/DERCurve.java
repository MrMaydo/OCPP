package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.DERUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 *
 */
public class DERCurve implements JsonInterface {

    /**
     * Coordinates of the DER curve. X-axis is determined by curveType. Y-axis is determined by yUnit.
     */
    @Required
    private List<DERCurvePoints> curveData;

    /**
     * Hysteresis parameters for curve.
     */
    @Optional
    private Hysteresis hysteresis;

    /**
     * Priority of curve (0=highest)
     */
    @Required
    private Integer priority;

    /**
     * Additional parameters for VoltVar curve.
     */
    @Optional
    private ReactivePowerParams reactivePowerParams;

    /**
     * Additional parameters for voltage curves.
     */
    @Optional
    private VoltageParams voltageParams;

    /**
     * Unit of the Y-axis of DER curve
     */
    @Required
    private DERUnitEnum yUnit;

    /**
     * Open loop response time, the time to ramp up to 90% of the new target in response to the change in voltage, in seconds.
     * A value of 0 is used to mean no limit. When not present, the device should follow its default behavior
     */
    @Optional
    private Float responseTime;

    /**
     * Point in time when this curve will become activated. Only absent when default is true.
     */
    @Optional
    private Date startTime;

    /**
     * Duration in seconds that this curve will be active. Only absent when default is true
     */
    @Optional
    private Float duration;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public DERCurve() {
    }


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


    public List<DERCurvePoints> getCurveData() {
        return curveData;
    }


    public void setCurveData(List<DERCurvePoints> curveData) {
        this.curveData = curveData;
    }

    public Hysteresis getHysteresis() {
        return hysteresis;
    }

    public void setHysteresis(Hysteresis hysteresis) {
        this.hysteresis = hysteresis;
    }


    public Integer getPriority() {
        return priority;
    }


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


    public DERUnitEnum getyUnit() {
        return yUnit;
    }


    public void setyUnit(DERUnitEnum yUnit) {
        this.yUnit = yUnit;
    }


    public Float getResponseTime() {
        return responseTime;
    }


    public void setResponseTime(Float responseTime) {
        this.responseTime = responseTime;
    }


    public Date getStartTime() {
        return startTime;
    }


    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }


    public Float getDuration() {
        return duration;
    }


    public void setDuration(Float duration) {
        this.duration = duration;
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
        json.add("hysteresis", hysteresis.toJsonObject());
        json.addProperty("priority", priority);
        json.add("reactivePowerParams", reactivePowerParams.toJsonObject());
        json.add("voltageParams", voltageParams.toJsonObject());
        json.addProperty("yUnit", yUnit.toString());
        json.addProperty("responseTime", responseTime);
        json.addProperty("startTime", new SimpleDateFormat(DATE_FORMAT).format(startTime));
        json.addProperty("duration", duration);
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
        if (jsonObject.has("hysteresis")) {
            this.hysteresis = new Hysteresis();
            this.hysteresis.fromJsonObject(jsonObject.getAsJsonObject("hysteresis"));
        }

        if (jsonObject.has("priority")) {
            this.priority = jsonObject.get("priority").getAsInt();
        }

        if (jsonObject.has("reactivePowerParams")) {
            this.reactivePowerParams = new ReactivePowerParams();
            this.reactivePowerParams.fromJsonObject(jsonObject.getAsJsonObject("reactivePowerParams"));
        }

        if (jsonObject.has("voltageParams")) {
            this.voltageParams = new VoltageParams();
            this.voltageParams.fromJsonObject(jsonObject.getAsJsonObject("voltageParams"));
        }

        if (jsonObject.has("yUnit")) {
            this.yUnit = DERUnitEnum.valueOf(jsonObject.get("yUnit").getAsString());
        }

        if (jsonObject.has("responseTime")) {
            this.responseTime = jsonObject.get("responseTime").getAsFloat();
        }

        if (jsonObject.has("startTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.startTime = dateFormat.parse(jsonObject.get("startTime").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for startTime" + e);
            }
        }

        if (jsonObject.has("duration")) {
            this.duration = jsonObject.get("duration").getAsFloat();
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
