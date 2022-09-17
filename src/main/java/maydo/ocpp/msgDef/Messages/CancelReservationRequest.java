
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.RegistrationStatusEnum;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;

import java.util.Date;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CancelReservationRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This contains the CSMS’s current time.
     * 
     * (Required)
     * 
     */
    private Date currentTime;
    /**
     * When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     * 
     * (Required)
     * 
     */
    private Integer interval;
    /**
     * This contains whether the Charging Station has been registered
     * within the CSMS.
     * 
     * (Required)
     * 
     */
    private RegistrationStatusEnum status;
    /**
     * Element providing more information about the status.
     * 
     * 
     */
    private StatusInfo statusInfo;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * This contains the CSMS’s current time.
     * 
     * (Required)
     * 
     */
    public Date getCurrentTime() {
        return currentTime;
    }

    /**
     * This contains the CSMS’s current time.
     * 
     * (Required)
     * 
     */
    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    /**
     * When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     * 
     * (Required)
     * 
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * When &lt;&lt;cmn_registrationstatusenumtype,Status&gt;&gt; is Accepted, this contains the heartbeat interval in seconds. If the CSMS returns something other than Accepted, the value of the interval field indicates the minimum wait time before sending a next BootNotification request.
     * 
     * (Required)
     * 
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * This contains whether the Charging Station has been registered
     * within the CSMS.
     * 
     * (Required)
     * 
     */
    public RegistrationStatusEnum getStatus() {
        return status;
    }

    /**
     * This contains whether the Charging Station has been registered
     * within the CSMS.
     * 
     * (Required)
     * 
     */
    public void setStatus(RegistrationStatusEnum status) {
        this.status = status;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

}
