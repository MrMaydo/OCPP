
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CompositeSchedule;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.GenericStatusEnum;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GetCompositeScheduleResponse {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * The Charging Station will indicate if it was
     * able to process the request
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
     * Composite_ Schedule
     * urn:x-oca:ocpp:uid:2:233362
     * 
     * 
     */
    private CompositeSchedule schedule;

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
     * The Charging Station will indicate if it was
     * able to process the request
     * 
     * (Required)
     * 
     */
    public GenericStatusEnum getStatus() {
        return status;
    }

    /**
     * The Charging Station will indicate if it was
     * able to process the request
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

    /**
     * Composite_ Schedule
     * urn:x-oca:ocpp:uid:2:233362
     * 
     * 
     */
    public CompositeSchedule getSchedule() {
        return schedule;
    }

    /**
     * Composite_ Schedule
     * urn:x-oca:ocpp:uid:2:233362
     * 
     * 
     */
    public void setSchedule(CompositeSchedule schedule) {
        this.schedule = schedule;
    }

}