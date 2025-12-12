package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.DERControlEnum;
import maydo.ocpp.msgDef.Enumerations.GridEventFaultEnum;
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
public class NotifyDERAlarmRequest implements JsonInterface {

    /**
     * Name of DER control, e.g. LFMustTrip
     */
    @Required
    private DERControlEnum controlType;

    /**
     * Type of grid event that caused this
     */
    @Optional
    private GridEventFaultEnum gridEventFault;

    /**
     * True when error condition has ended. Absent or false when alarm has started.
     */
    @Optional
    private Boolean alarmEnded;

    /**
     * Time of start or end of alarm.
     */
    @Required
    private Date timestamp;

    /**
     * Optional info provided by EV.
     */
    @Optional
    private String extraInfo;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyDERAlarmRequest() {
    }


    public DERControlEnum getControlType() {
        return controlType;
    }


    public void setControlType(DERControlEnum controlType) {
        this.controlType = controlType;
    }


    public GridEventFaultEnum getGridEventFault() {
        return gridEventFault;
    }


    public void setGridEventFault(GridEventFaultEnum gridEventFault) {
        this.gridEventFault = gridEventFault;
    }


    public Boolean getAlarmEnded() {
        return alarmEnded;
    }


    public void setAlarmEnded(Boolean alarmEnded) {
        this.alarmEnded = alarmEnded;
    }


    public Date getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }


    public String getExtraInfo() {
        return extraInfo;
    }


    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
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
        json.addProperty("controlType", controlType.toString());
        json.addProperty("gridEventFault", gridEventFault.toString());
        json.addProperty("alarmEnded", alarmEnded);
        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(timestamp));
        json.addProperty("extraInfo", extraInfo);
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
        if (jsonObject.has("controlType")) {
            this.controlType = DERControlEnum.valueOf(jsonObject.get("controlType").getAsString());
        }

        if (jsonObject.has("gridEventFault")) {
            this.gridEventFault = GridEventFaultEnum.valueOf(jsonObject.get("gridEventFault").getAsString());
        }

        if (jsonObject.has("alarmEnded")) {
            this.alarmEnded = jsonObject.get("alarmEnded").getAsBoolean();
        }

        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.timestamp = dateFormat.parse(jsonObject.get("timestamp").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
        }

        if (jsonObject.has("extraInfo")) {
            this.extraInfo = jsonObject.get("extraInfo").getAsString();
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
        if (!(obj instanceof NotifyDERAlarmRequest))
            return false;
        NotifyDERAlarmRequest that = (NotifyDERAlarmRequest) obj;
        return Objects.equals(this.gridEventFault, that.gridEventFault)
                && Objects.equals(this.alarmEnded, that.alarmEnded)
                && Objects.equals(this.controlType, that.controlType)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.timestamp, that.timestamp)
                && Objects.equals(this.extraInfo, that.extraInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.gridEventFault != null ? this.gridEventFault.hashCode() : 0);
        result = 31 * result + (this.alarmEnded != null ? this.alarmEnded.hashCode() : 0);
        result = 31 * result + (this.controlType != null ? this.controlType.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        result = 31 * result + (this.extraInfo != null ? this.extraInfo.hashCode() : 0);
        return result;
    }
}
