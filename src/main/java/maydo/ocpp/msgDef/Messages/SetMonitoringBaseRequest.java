package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.MonitoringBaseEnum;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class SetMonitoringBaseRequest {

    /**
     * Specify which monitoring base will be set
     * 
     * (Required)
     */
    @Required
    private MonitoringBaseEnum monitoringBase;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SetMonitoringBaseRequest() {
    }

    public SetMonitoringBaseRequest(MonitoringBaseEnum monitoringBase, CustomData customData) {
        super();
        this.monitoringBase = monitoringBase;
        this.customData = customData;
    }

    /**
     * Specify which monitoring base will be set
     * 
     * (Required)
     */
    public MonitoringBaseEnum getMonitoringBase() {
        return monitoringBase;
    }

    /**
     * Specify which monitoring base will be set
     * 
     * (Required)
     */
    public void setMonitoringBase(MonitoringBaseEnum monitoringBase) {
        this.monitoringBase = monitoringBase;
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
        if (!(obj instanceof SetMonitoringBaseRequest))
            return false;
        SetMonitoringBaseRequest that = (SetMonitoringBaseRequest) obj;
        return Objects.equals(this.monitoringBase, that.monitoringBase)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.monitoringBase != null ? this.monitoringBase.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
