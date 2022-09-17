
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ClearVariableMonitoringRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * List of the monitors to be cleared, identified by there Id.
     * 
     * (Required)
     * 
     */
    private List<Integer> id = null;

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
     * List of the monitors to be cleared, identified by there Id.
     * 
     * (Required)
     * 
     */
    public List<Integer> getId() {
        return id;
    }

    /**
     * List of the monitors to be cleared, identified by there Id.
     * 
     * (Required)
     * 
     */
    public void setId(List<Integer> id) {
        this.id = id;
    }

}