
package maydo.ocpp.msgDef.DataTypes;

import java.util.List;
import javax.annotation.Generated;


/**
 * Class to hold parameters of SetVariableMonitoring request.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class MonitoringData {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    private Component component;
    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    private Variable variable;
    /**
     * 
     * (Required)
     * 
     */
    private List<VariableMonitoring> variableMonitoring = null;

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
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    public Component getComponent() {
        return component;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     * 
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     * 
     */
    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<VariableMonitoring> getVariableMonitoring() {
        return variableMonitoring;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setVariableMonitoring(List<VariableMonitoring> variableMonitoring) {
        this.variableMonitoring = variableMonitoring;
    }

}
