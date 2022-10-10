package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.RegistrationStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;

public class BootNotificationResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
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
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public void setCustomData(CustomData customData) {
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
