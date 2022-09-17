
package maydo.ocpp.msgDef.Messages;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SetVariablesResponse {

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
    private List<SetVariableResult> setVariableResult = null;

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
    public List<SetVariableResult> getSetVariableResult() {
        return setVariableResult;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setSetVariableResult(List<SetVariableResult> setVariableResult) {
        this.setVariableResult = setVariableResult;
    }

}
