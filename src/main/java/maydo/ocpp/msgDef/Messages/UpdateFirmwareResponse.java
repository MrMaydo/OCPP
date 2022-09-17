
package maydo.ocpp.msgDef.Messages;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class UpdateFirmwareResponse {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This field indicates whether the Charging Station was able to accept the request.
     * 
     * 
     * (Required)
     * 
     */
    private UpdateFirmwareStatusEnum status;
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
     * This field indicates whether the Charging Station was able to accept the request.
     * 
     * 
     * (Required)
     * 
     */
    public UpdateFirmwareStatusEnum getStatus() {
        return status;
    }

    /**
     * This field indicates whether the Charging Station was able to accept the request.
     * 
     * 
     * (Required)
     * 
     */
    public void setStatus(UpdateFirmwareStatusEnum status) {
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
