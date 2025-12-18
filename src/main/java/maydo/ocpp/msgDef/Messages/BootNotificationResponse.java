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

        json.addProperty("currentTime", new SimpleDateFormat(DATE_FORMAT).format(getCurrentTime()));

        json.addProperty("interval", getInterval());

        json.addProperty("status", getStatus().toString());

        if (getStatusInfo() != null) {
            json.add("statusInfo", getStatusInfo().toJsonObject());
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
        if (jsonObject.has("currentTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setCurrentTime(dateFormat.parse(jsonObject.get("currentTime").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for currentTime" + e);
            }
        }

        if (jsonObject.has("interval")) {
            setInterval(jsonObject.get("interval").getAsInt());
        }

        if (jsonObject.has("status")) {
            setStatus(RegistrationStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
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
        return Objects.hash(
                getCurrentTime(),
                getInterval(),
                getStatus(),
                getStatusInfo(),
                getCustomData()
        );
    }
}
