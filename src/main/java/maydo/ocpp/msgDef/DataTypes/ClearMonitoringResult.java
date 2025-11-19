package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.ClearMonitoringStatusEnum;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class ClearMonitoringResult {

    /**
     * Result of the clear request for this monitor, identified by its Id.
     * 
     * 
     * (Required)
     */
    @Required
    private ClearMonitoringStatusEnum status;
    /**
     * Id of the monitor of which a clear was requested.
     * 
     * 
     * (Required)
     */
    @Required
    private Integer id;
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
    public ClearMonitoringResult() {
    }

    /**
     * 
     * @param id
     *     Id of the monitor of which a clear was requested.
     *     
     *     .
     */
    public ClearMonitoringResult(ClearMonitoringStatusEnum status, Integer id, StatusInfo statusInfo, CustomData customData) {
        super();
        this.status = status;
        this.id = id;
        this.statusInfo = statusInfo;
        this.customData = customData;
    }

    /**
     * Result of the clear request for this monitor, identified by its Id.
     * 
     * 
     * (Required)
     */
    public ClearMonitoringStatusEnum getStatus() {
        return status;
    }

    /**
     * Result of the clear request for this monitor, identified by its Id.
     * 
     * 
     * (Required)
     */
    public void setStatus(ClearMonitoringStatusEnum status) {
        this.status = status;
    }

    /**
     * Id of the monitor of which a clear was requested.
     * 
     * 
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id of the monitor of which a clear was requested.
     * 
     * 
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ClearMonitoringResult))
            return false;
        ClearMonitoringResult that = (ClearMonitoringResult) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id) 
                && Objects.equals(this.statusInfo, that.statusInfo) 
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
