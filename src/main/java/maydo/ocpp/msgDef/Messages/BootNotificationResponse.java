package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.RegistrationStatusEnum;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.Objects;

public class BootNotificationResponse {

    /**
     * This contains the CSMS’s current time.
     * 
     * (Required)
     */
    @Required
    private Date currentTime;
    /**
     * When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     * 
     * (Required)
     */
    @Required
    private Integer interval;
    /**
     * This contains whether the Charging Station has been registered
     * within the CSMS.
     * 
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
     * 
     * @param currentTime
     *     This contains the CSMS’s current time.
     *     .
     * @param interval
     *     When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     *     .
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
     * 
     * (Required)
     */
    public Date getCurrentTime() {
        return currentTime;
    }

    /**
     * This contains the CSMS’s current time.
     * 
     * (Required)
     */
    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    /**
     * When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     * 
     * (Required)
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     * 
     * (Required)
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * This contains whether the Charging Station has been registered
     * within the CSMS.
     * 
     * (Required)
     */
    public RegistrationStatusEnum getStatus() {
        return status;
    }

    /**
     * This contains whether the Charging Station has been registered
     * within the CSMS.
     * 
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
