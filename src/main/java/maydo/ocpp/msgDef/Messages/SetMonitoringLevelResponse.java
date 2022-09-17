
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.GenericStatusEnum;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SetMonitoringLevelResponse {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Indicates whether the Charging Station was able to accept the request.
     * 
     * (Required)
     * 
     */
    private GenericStatusEnum status;
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
     * Indicates whether the Charging Station was able to accept the request.
     * 
     * (Required)
     * 
     */
    public GenericStatusEnum getStatus() {
        return status;
    }

    /**
     * Indicates whether the Charging Station was able to accept the request.
     * 
     * (Required)
     * 
     */
    public void setStatus(GenericStatusEnum status) {
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