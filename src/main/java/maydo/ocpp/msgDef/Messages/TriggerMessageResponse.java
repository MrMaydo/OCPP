
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.TriggerMessageStatusEnum;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class TriggerMessageResponse {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Indicates whether the Charging Station will send the requested notification or not.
     * 
     * (Required)
     * 
     */
    private TriggerMessageStatusEnum status;
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
     * Indicates whether the Charging Station will send the requested notification or not.
     * 
     * (Required)
     * 
     */
    public TriggerMessageStatusEnum getStatus() {
        return status;
    }

    /**
     * Indicates whether the Charging Station will send the requested notification or not.
     * 
     * (Required)
     * 
     */
    public void setStatus(TriggerMessageStatusEnum status) {
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
