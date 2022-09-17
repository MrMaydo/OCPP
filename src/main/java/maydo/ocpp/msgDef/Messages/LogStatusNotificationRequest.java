
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.UploadLogStatusEnum;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class LogStatusNotificationRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This contains the status of the log upload.
     * 
     * (Required)
     * 
     */
    private UploadLogStatusEnum status;
    /**
     * The request id that was provided in GetLogRequest that started this log upload. This field is mandatory,
     * unless the message was triggered by a TriggerMessageRequest AND there is no log upload ongoing.
     * 
     * 
     */
    private Integer requestId;

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
     * This contains the status of the log upload.
     * 
     * (Required)
     * 
     */
    public UploadLogStatusEnum getStatus() {
        return status;
    }

    /**
     * This contains the status of the log upload.
     * 
     * (Required)
     * 
     */
    public void setStatus(UploadLogStatusEnum status) {
        this.status = status;
    }

    /**
     * The request id that was provided in GetLogRequest that started this log upload. This field is mandatory,
     * unless the message was triggered by a TriggerMessageRequest AND there is no log upload ongoing.
     * 
     * 
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The request id that was provided in GetLogRequest that started this log upload. This field is mandatory,
     * unless the message was triggered by a TriggerMessageRequest AND there is no log upload ongoing.
     * 
     * 
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

}
