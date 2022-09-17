
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ClearMonitoringResult;
import maydo.ocpp.msgDef.DataTypes.CustomData;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ClearVariableMonitoringResponse {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * 
     * (Required)
     * 
     */
    private List<ClearMonitoringResult> clearMonitoringResult = null;

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
     * 
     * (Required)
     * 
     */
    public List<ClearMonitoringResult> getClearMonitoringResult() {
        return clearMonitoringResult;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setClearMonitoringResult(List<ClearMonitoringResult> clearMonitoringResult) {
        this.clearMonitoringResult = clearMonitoringResult;
    }

}
