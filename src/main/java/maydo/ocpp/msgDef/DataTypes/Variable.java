
package maydo.ocpp.msgDef.DataTypes;

import javax.annotation.Generated;


/**
 * Reference key to a component-variable.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Variable {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Name of the variable. Name should be taken from the list of standardized variable names whenever possible. Case Insensitive. strongly advised to use Camel Case.
     * 
     * (Required)
     * 
     */
    private String name;
    /**
     * Name of instance in case the variable exists as multiple instances. Case Insensitive. strongly advised to use Camel Case.
     * 
     * 
     */
    private String instance;

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
     * Name of the variable. Name should be taken from the list of standardized variable names whenever possible. Case Insensitive. strongly advised to use Camel Case.
     * 
     * (Required)
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the variable. Name should be taken from the list of standardized variable names whenever possible. Case Insensitive. strongly advised to use Camel Case.
     * 
     * (Required)
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of instance in case the variable exists as multiple instances. Case Insensitive. strongly advised to use Camel Case.
     * 
     * 
     */
    public String getInstance() {
        return instance;
    }

    /**
     * Name of instance in case the variable exists as multiple instances. Case Insensitive. strongly advised to use Camel Case.
     * 
     * 
     */
    public void setInstance(String instance) {
        this.instance = instance;
    }

}
