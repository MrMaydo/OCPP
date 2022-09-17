
package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.Enumerations.MutabilityEnum;

import javax.annotation.Generated;


/**
 * Attribute data of a variable.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class VariableAttribute {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Attribute: Actual, MinSet, MaxSet, etc.
     * Defaults to Actual if absent.
     * 
     * 
     */
    private AttributeEnum type = AttributeEnum.fromValue("Actual");
    /**
     * Value of the attribute. May only be omitted when mutability is set to 'WriteOnly'.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     * 
     */
    private String value;
    /**
     * Defines the mutability of this attribute. Default is ReadWrite when omitted.
     * 
     * 
     */
    private MutabilityEnum mutability = MutabilityEnum.fromValue("ReadWrite");
    /**
     * If true, value will be persistent across system reboots or power down. Default when omitted is false.
     * 
     * 
     */
    private Boolean persistent = false;
    /**
     * If true, value that will never be changed by the Charging Station at runtime. Default when omitted is false.
     * 
     * 
     */
    private Boolean constant = false;

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
     * Attribute: Actual, MinSet, MaxSet, etc.
     * Defaults to Actual if absent.
     * 
     * 
     */
    public AttributeEnum getType() {
        return type;
    }

    /**
     * Attribute: Actual, MinSet, MaxSet, etc.
     * Defaults to Actual if absent.
     * 
     * 
     */
    public void setType(AttributeEnum type) {
        this.type = type;
    }

    /**
     * Value of the attribute. May only be omitted when mutability is set to 'WriteOnly'.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * Value of the attribute. May only be omitted when mutability is set to 'WriteOnly'.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     * 
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Defines the mutability of this attribute. Default is ReadWrite when omitted.
     * 
     * 
     */
    public MutabilityEnum getMutability() {
        return mutability;
    }

    /**
     * Defines the mutability of this attribute. Default is ReadWrite when omitted.
     * 
     * 
     */
    public void setMutability(MutabilityEnum mutability) {
        this.mutability = mutability;
    }

    /**
     * If true, value will be persistent across system reboots or power down. Default when omitted is false.
     * 
     * 
     */
    public Boolean getPersistent() {
        return persistent;
    }

    /**
     * If true, value will be persistent across system reboots or power down. Default when omitted is false.
     * 
     * 
     */
    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    /**
     * If true, value that will never be changed by the Charging Station at runtime. Default when omitted is false.
     * 
     * 
     */
    public Boolean getConstant() {
        return constant;
    }

    /**
     * If true, value that will never be changed by the Charging Station at runtime. Default when omitted is false.
     * 
     * 
     */
    public void setConstant(Boolean constant) {
        this.constant = constant;
    }

}
