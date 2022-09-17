
package maydo.ocpp.msgDef.Messages;


import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetMonitoringResult;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SetVariableMonitoringResponse {

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
    private List<SetMonitoringResult> setMonitoringResult = null;

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
    public List<SetMonitoringResult> getSetMonitoringResult() {
        return setMonitoringResult;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setSetMonitoringResult(List<SetMonitoringResult> setMonitoringResult) {
        this.setMonitoringResult = setMonitoringResult;
    }

}
