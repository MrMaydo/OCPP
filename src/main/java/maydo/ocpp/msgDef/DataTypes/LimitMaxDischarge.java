package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 *
 */
public class LimitMaxDischarge implements JsonInterface {

    /**
     * Priority of setting (0=highest)
     */
    @Required
    private Integer priority;

    /**
     * Only for PowerMonitoring. The value specifies a percentage (0 to 100) of the rated maximum discharge power of EV.
     * The PowerMonitoring curve becomes active when power exceeds this percentage.
     */
    @Optional
    private Float pctMaxDischargePower;

    /**
     * The curve is an interpolation of data points where the x-axis values are time in seconds
     * and the y- axis values refer to the percentage value of the rated EVMaximumDischargePower,
     * reported in the ChargeParameterDiscoveryRequest message. The value lies between 0 and 100.
     * The curve is activated when the power value measured via the ExternalMeter value reported in the ChargeLoopRes
     * is higher than the pctMaxDischargePower defined above. If the power does not stay within the defined curve for
     * the respective time period, the EV must trip.
     */
    @Optional
    private DERCurve powerMonitoringMustTrip;

    /**
     * Time when this setting becomes active
     */
    @Optional
    private Date startTime;

    /**
     * Duration in seconds that this setting is active
     */
    @Optional
    private Float duration;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public LimitMaxDischarge() {
    }


    public Integer getPriority() {
        return priority;
    }


    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    public Float getPctMaxDischargePower() {
        return pctMaxDischargePower;
    }


    public void setPctMaxDischargePower(Float pctMaxDischargePower) {
        this.pctMaxDischargePower = pctMaxDischargePower;
    }

    public DERCurve getPowerMonitoringMustTrip() {
        return powerMonitoringMustTrip;
    }

    public void setPowerMonitoringMustTrip(DERCurve powerMonitoringMustTrip) {
        this.powerMonitoringMustTrip = powerMonitoringMustTrip;
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
        json.addProperty("priority", priority);
        json.addProperty("pctMaxDischargePower", pctMaxDischargePower);
        json.add("powerMonitoringMustTrip", powerMonitoringMustTrip.toJsonObject());
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
        if (jsonObject.has("priority")) {
            setPriority(jsonObject.get("priority").getAsInt());
        }

        if (jsonObject.has("pctMaxDischargePower")) {
            setPctMaxDischargePower(jsonObject.get("pctMaxDischargePower").getAsFloat());
        }

        if (jsonObject.has("powerMonitoringMustTrip")) {
            setPowerMonitoringMustTrip(new DERCurve());
            getPowerMonitoringMustTrip().fromJsonObject(jsonObject.getAsJsonObject("powerMonitoringMustTrip"));
        }

        if (jsonObject.has("startTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setStartTime(dateFormat.parse(jsonObject.get("startTime").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for startTime" + e);
            }
        }

        if (jsonObject.has("duration")) {
            setDuration(jsonObject.get("duration").getAsFloat());
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
        if (!(obj instanceof LimitMaxDischarge))
            return false;
        LimitMaxDischarge that = (LimitMaxDischarge) obj;
        return Objects.equals(this.duration, that.duration)
                && Objects.equals(this.powerMonitoringMustTrip, that.powerMonitoringMustTrip)
                && Objects.equals(this.startTime, that.startTime)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priority, that.priority)
                && Objects.equals(this.pctMaxDischargePower, that.pctMaxDischargePower);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.powerMonitoringMustTrip != null ? this.powerMonitoringMustTrip.hashCode() : 0);
        result = 31 * result + (this.startTime != null ? this.startTime.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        result = 31 * result + (this.pctMaxDischargePower != null ? this.pctMaxDischargePower.hashCode() : 0);
        return result;
    }
}
