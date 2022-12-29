package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.UploadLogStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class LogStatusNotificationRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * This contains the status of the log upload.
     * <p>
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
     * This contains the status of the log upload.
     * <p>
     * (Required)
     */
    public UploadLogStatusEnum getStatus() {
        return status;
    }

    /**
     * This contains the status of the log upload.
     * <p>
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof LogStatusNotificationRequest))
            return false;
        LogStatusNotificationRequest that = (LogStatusNotificationRequest) obj;
        return Objects.equals(customData, that.customData)
                && status == that.status
                && Objects.equals(requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = (status != null ? status.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
