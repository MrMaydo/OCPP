package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.RegistrationStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * This contains the field definition of the BootNotificationResponse PDU sent by
 * the CSMS to the Charging Station in response to a BootNotificationRequest.
 */
public class BootNotificationResponse implements JsonInterface {

    /**
     * This contains the CSMS’s current time.
     */
    @Required
    private Date currentTime;

    /**
     * When Status is Accepted, this contains the heartbeat interval in seconds.
     * If the CSMS returns something other than Accepted,
     * the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     */
    @Required
    private Integer interval;

    /**
     * This contains whether the Charging Station has been registered within the CSMS.
     */
    @Required
    private RegistrationStatusEnum status;

    /**
     * Detailed status information.
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public BootNotificationResponse() {
    }


    public BootNotificationResponse(Date currentTime, Integer interval, RegistrationStatusEnum status, StatusInfo statusInfo, CustomData customData) {
        super();
        this.currentTime = currentTime;
        this.interval = interval;
        this.status = status;
        this.statusInfo = statusInfo;
        this.customData = customData;
    }


    public Date getCurrentTime() {
        return currentTime;
    }


    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }


    public Integer getInterval() {
        return interval;
    }


    public void setInterval(Integer interval) {
        this.interval = interval;
    }


    public RegistrationStatusEnum getStatus() {
        return status;
    }


    public void setStatus(RegistrationStatusEnum status) {
        this.status = status;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
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
        json.addProperty("currentTime", new SimpleDateFormat(DATE_FORMAT).format(currentTime));
        json.addProperty("interval", interval);
        json.addProperty("status", status.toString());
        json.add("statusInfo", statusInfo.toJsonObject());
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
        if (jsonObject.has("currentTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.currentTime = dateFormat.parse(jsonObject.get("currentTime").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for currentTime" + e);
            }
        }

        if (jsonObject.has("interval")) {
            this.interval = jsonObject.get("interval").getAsInt();
        }

        if (jsonObject.has("status")) {
            this.status = RegistrationStatusEnum.valueOf(jsonObject.get("status").getAsString());
        }

        if (jsonObject.has("statusInfo")) {
            this.statusInfo = new StatusInfo();
            this.statusInfo.fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
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
        if (!(obj instanceof BootNotificationResponse))
            return false;
        BootNotificationResponse that = (BootNotificationResponse) obj;
        return Objects.equals(this.currentTime, that.currentTime)
                && Objects.equals(this.interval, that.interval)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.currentTime != null ? this.currentTime.hashCode() : 0);
        result = 31 * result + (this.interval != null ? this.interval.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
