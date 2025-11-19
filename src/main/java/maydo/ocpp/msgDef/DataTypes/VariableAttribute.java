package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.AttributeEnum;
import maydo.ocpp.msgDef.Enumerations.MutabilityEnum;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

public class VariableAttribute {

    /**
     * Attribute: Actual, MinSet, MaxSet, etc.
     * Defaults to Actual if absent.
     */
    @Optional
    private AttributeEnum type = AttributeEnum.fromValue("Actual");
    /**
     * Value of the attribute. May only be omitted when mutability is set to 'WriteOnly'.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     */
    @Optional
    private String value;
    /**
     * Defines the mutability of this attribute. Default is ReadWrite when omitted.
     */
    @Optional
    private MutabilityEnum mutability = MutabilityEnum.fromValue("ReadWrite");
    /**
     * If true, value will be persistent across system reboots or power down. Default when omitted is false.
     */
    @Optional
    private Boolean persistent = false;
    /**
     * If true, value that will never be changed by the Charging Station at runtime. Default when omitted is false.
     */
    @Optional
    private Boolean constant = false;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public VariableAttribute() {
    }

    /**
     * 
     * @param constant
     *     If true, value that will never be changed by the Charging Station at runtime. Default when omitted is false.
     *     .
     * @param persistent
     *     If true, value will be persistent across system reboots or power down. Default when omitted is false.
     *     .
     * @param value
     *     Value of the attribute. May only be omitted when mutability is set to 'WriteOnly'.
     *     
     *     The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     *     .
     */
    public VariableAttribute(AttributeEnum type, String value, MutabilityEnum mutability, Boolean persistent, Boolean constant, CustomData customData) {
        super();
        this.type = type;
        this.value = value;
        this.mutability = mutability;
        this.persistent = persistent;
        this.constant = constant;
        this.customData = customData;
    }

    /**
     * Attribute: Actual, MinSet, MaxSet, etc.
     * Defaults to Actual if absent.
     */
    public AttributeEnum getType() {
        return type;
    }

    /**
     * Attribute: Actual, MinSet, MaxSet, etc.
     * Defaults to Actual if absent.
     */
    public void setType(AttributeEnum type) {
        this.type = type;
    }

    /**
     * Value of the attribute. May only be omitted when mutability is set to 'WriteOnly'.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     */
    public String getValue() {
        return value;
    }

    /**
     * Value of the attribute. May only be omitted when mutability is set to 'WriteOnly'.
     * 
     * The Configuration Variable &lt;&lt;configkey-reporting-value-size,ReportingValueSize&gt;&gt; can be used to limit GetVariableResult.attributeValue, VariableAttribute.value and EventData.actualValue. The max size of these values will always remain equal. 
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Defines the mutability of this attribute. Default is ReadWrite when omitted.
     */
    public MutabilityEnum getMutability() {
        return mutability;
    }

    /**
     * Defines the mutability of this attribute. Default is ReadWrite when omitted.
     */
    public void setMutability(MutabilityEnum mutability) {
        this.mutability = mutability;
    }

    /**
     * If true, value will be persistent across system reboots or power down. Default when omitted is false.
     */
    public Boolean getPersistent() {
        return persistent;
    }

    /**
     * If true, value will be persistent across system reboots or power down. Default when omitted is false.
     */
    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    /**
     * If true, value that will never be changed by the Charging Station at runtime. Default when omitted is false.
     */
    public Boolean getConstant() {
        return constant;
    }

    /**
     * If true, value that will never be changed by the Charging Station at runtime. Default when omitted is false.
     */
    public void setConstant(Boolean constant) {
        this.constant = constant;
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
        if (!(obj instanceof VariableAttribute))
            return false;
        VariableAttribute that = (VariableAttribute) obj;
        return Objects.equals(this.constant, that.constant)
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.mutability, that.mutability) 
                && Objects.equals(this.type, that.type) 
                && Objects.equals(this.persistent, that.persistent) 
                && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.constant != null ? this.constant.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.mutability != null ? this.mutability.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        result = 31 * result + (this.persistent != null ? this.persistent.hashCode() : 0);
        result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
        return result;
    }
}
