
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.FirmwareStatusEnum;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class FirmwareStatusNotificationRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This contains the progress status of the firmware installation.
     * 
     * (Required)
     * 
     */
    private FirmwareStatusEnum status;
    /**
     * The request id that was provided in the
     * UpdateFirmwareRequest that started this firmware update.
     * This field is mandatory, unless the message was triggered by a TriggerMessageRequest AND there is no firmware update ongoing.
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
     * This contains the progress status of the firmware installation.
     * 
     * (Required)
     * 
     */
    public FirmwareStatusEnum getStatus() {
        return status;
    }

    /**
     * This contains the progress status of the firmware installation.
     * 
     * (Required)
     * 
     */
    public void setStatus(FirmwareStatusEnum status) {
        this.status = status;
    }

    /**
     * The request id that was provided in the
     * UpdateFirmwareRequest that started this firmware update.
     * This field is mandatory, unless the message was triggered by a TriggerMessageRequest AND there is no firmware update ongoing.
     * 
     * 
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The request id that was provided in the
     * UpdateFirmwareRequest that started this firmware update.
     * This field is mandatory, unless the message was triggered by a TriggerMessageRequest AND there is no firmware update ongoing.
     * 
     * 
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

}