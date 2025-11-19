package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.UploadLogStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class LogStatusNotificationRequest implements JsonInterface {

    /**
     * This contains the status of the log upload.
     * 
     * (Required)
     */
    @Required
    private UploadLogStatusEnum status;
    /**
     * The request id that was provided in GetLogRequest that started this log upload. This field is mandatory,
     * unless the message was triggered by a TriggerMessageRequest AND there is no log upload ongoing.
     */
    @Optional
    private Integer requestId;
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
    public LogStatusNotificationRequest() {
    }

    /**
     * 
     * @param requestId
     *     The request id that was provided in GetLogRequest that started this log upload. This field is mandatory,
     *     unless the message was triggered by a TriggerMessageRequest AND there is no log upload ongoing.
     *     .
     */
    public LogStatusNotificationRequest(UploadLogStatusEnum status, Integer requestId, StatusInfo statusInfo, CustomData customData) {
        super();
        this.status = status;
        this.requestId = requestId;
        this.statusInfo = statusInfo;
        this.customData = customData;
    }

    /**
     * This contains the status of the log upload.
     * 
     * (Required)
     */
    public UploadLogStatusEnum getStatus() {
        return status;
    }

    /**
     * This contains the status of the log upload.
     * 
     * (Required)
     */
    public void setStatus(UploadLogStatusEnum status) {
        this.status = status;
    }

    /**
     * The request id that was provided in GetLogRequest that started this log upload. This field is mandatory,
     * unless the message was triggered by a TriggerMessageRequest AND there is no log upload ongoing.
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The request id that was provided in GetLogRequest that started this log upload. This field is mandatory,
     * unless the message was triggered by a TriggerMessageRequest AND there is no log upload ongoing.
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof LogStatusNotificationRequest))
            return false;
        LogStatusNotificationRequest that = (LogStatusNotificationRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo) 
                && Objects.equals(this.requestId, that.requestId) 
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
