
package maydo.ocpp.msgDef.DataTypes;

import javax.annotation.Generated;


/**
 * Class to report components, variables and variable attributes and characteristics.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class ComponentVariable {

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
     * 
     */
    private Variable variable;

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
     * 
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Reference key to a component-variable.
     * 
     * 
     */
    public void setVariable(Variable variable) {
        this.variable = variable;
    }

}
