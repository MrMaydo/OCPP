
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.MonitoringBaseEnum;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SetMonitoringBaseRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Specify which monitoring base will be set
     * 
     * (Required)
     * 
     */
    private MonitoringBaseEnum monitoringBase;

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
     * Specify which monitoring base will be set
     * 
     * (Required)
     * 
     */
    public MonitoringBaseEnum getMonitoringBase() {
        return monitoringBase;
    }

    /**
     * Specify which monitoring base will be set
     * 
     * (Required)
     * 
     */
    public void setMonitoringBase(MonitoringBaseEnum monitoringBase) {
        this.monitoringBase = monitoringBase;
    }

}
