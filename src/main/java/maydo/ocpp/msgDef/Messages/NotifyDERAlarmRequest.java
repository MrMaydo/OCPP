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

        json.addProperty("controlType", getControlType().toString());

        if (getGridEventFault() != null) {
            json.addProperty("gridEventFault", getGridEventFault().toString());
        }
        if (getAlarmEnded() != null) {
            json.addProperty("alarmEnded", getAlarmEnded());
        }
        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(getTimestamp()));

        if (getExtraInfo() != null) {
            json.addProperty("extraInfo", getExtraInfo());
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
        if (jsonObject.has("controlType")) {
            setControlType(DERControlEnum.valueOf(jsonObject.get("controlType").getAsString()));
        }

        if (jsonObject.has("gridEventFault")) {
            setGridEventFault(GridEventFaultEnum.valueOf(jsonObject.get("gridEventFault").getAsString()));
        }

        if (jsonObject.has("alarmEnded")) {
            setAlarmEnded(jsonObject.get("alarmEnded").getAsBoolean());
        }

        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setTimestamp(dateFormat.parse(jsonObject.get("timestamp").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
        }

        if (jsonObject.has("extraInfo")) {
            setExtraInfo(jsonObject.get("extraInfo").getAsString());
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
        if (!(obj instanceof NotifyDERAlarmRequest))
            return false;
        NotifyDERAlarmRequest that = (NotifyDERAlarmRequest) obj;
        return Objects.equals(getControlType(), that.getControlType())
                && Objects.equals(getGridEventFault(), that.getGridEventFault())
                && Objects.equals(getAlarmEnded(), that.getAlarmEnded())
                && Objects.equals(getTimestamp(), that.getTimestamp())
                && Objects.equals(getExtraInfo(), that.getExtraInfo())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getControlType(),
                getGridEventFault(),
                getAlarmEnded(),
                getTimestamp(),
                getExtraInfo(),
                getCustomData()
        );
    }
}
