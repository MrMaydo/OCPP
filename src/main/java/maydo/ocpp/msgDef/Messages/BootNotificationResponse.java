package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
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

public class BootNotificationResponse implements JsonInterface {

    /**
     * This contains the CSMS’s current time.
     * <p>
     * (Required)
     */
    @Required
    private Date currentTime;
    /**
     * When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     * <p>
     * (Required)
     */
    @Required
    private Integer interval;
    /**
     * This contains whether the Charging Station has been registered
     * within the CSMS.
     * <p>
     * (Required)
     */
    @Required
    private RegistrationStatusEnum status;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public BootNotificationResponse() {
    }

    /**
     * @param currentTime This contains the CSMS’s current time.
     *                    .
     * @param interval    When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     *                    .
     */
    public BootNotificationResponse(Date currentTime, Integer interval, RegistrationStatusEnum status, StatusInfo statusInfo, CustomData customData) {
        super();
        this.currentTime = currentTime;
        this.interval = interval;
        this.status = status;
        this.statusInfo = statusInfo;
        this.customData = customData;
    }

    /**
     * This contains the CSMS’s current time.
     * <p>
     * (Required)
     */
    public Date getCurrentTime() {
        return currentTime;
    }

    /**
     * This contains the CSMS’s current time.
     * <p>
     * (Required)
     */
    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    /**
     * When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     * <p>
     * (Required)
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     * <p>
     * (Required)
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * This contains whether the Charging Station has been registered
     * within the CSMS.
     * <p>
     * (Required)
     */
    public RegistrationStatusEnum getStatus() {
        return status;
    }

    /**
     * This contains whether the Charging Station has been registered
     * within the CSMS.
     * <p>
     * (Required)
     */
    public void setStatus(RegistrationStatusEnum status) {
        this.status = status;
    }

    /**
     * Element providing more information about the status.
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
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
