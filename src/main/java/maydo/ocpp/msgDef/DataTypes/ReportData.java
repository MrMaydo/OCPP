package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class ReportData implements JsonInterface {

    /**
     * A physical or logical component
     * 
     * (Required)
     */
    @Required
    private Component component;
    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     */
    @Required
    private Variable variable;
    /**
     * 
     * (Required)
     */
    @Required
    private List<VariableAttribute> variableAttribute;
    /**
     * Fixed read-only parameters of a variable.
     */
    @Optional
    private VariableCharacteristics variableCharacteristics;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ReportData() {
    }

    public ReportData(Component component, Variable variable, List<VariableAttribute> variableAttribute, VariableCharacteristics variableCharacteristics, CustomData customData) {
        super();
        this.component = component;
        this.variable = variable;
        this.variableAttribute = variableAttribute;
        this.variableCharacteristics = variableCharacteristics;
        this.customData = customData;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     */
    public Component getComponent() {
        return component;
    }

    /**
     * A physical or logical component
     * 
     * (Required)
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Reference key to a component-variable.
     * 
     * (Required)
     */
    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    /**
     * 
     * (Required)
     */
    public List<VariableAttribute> getVariableAttribute() {
        return variableAttribute;
    }

    /**
     * 
     * (Required)
     */
    public void setVariableAttribute(List<VariableAttribute> variableAttribute) {
        this.variableAttribute = variableAttribute;
    }

    /**
     * Fixed read-only parameters of a variable.
     */
    public VariableCharacteristics getVariableCharacteristics() {
        return variableCharacteristics;
    }

    /**
     * Fixed read-only parameters of a variable.
     */
    public void setVariableCharacteristics(VariableCharacteristics variableCharacteristics) {
        this.variableCharacteristics = variableCharacteristics;
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
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ReportData))
            return false;
        ReportData that = (ReportData) obj;
        return Objects.equals(this.variable, that.variable)
                && Objects.equals(this.component, that.component) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.variableAttribute, that.variableAttribute) 
                && Objects.equals(this.variableCharacteristics, that.variableCharacteristics);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.variable != null ? this.variable.hashCode() : 0);
        result = 31 * result + (this.component != null ? this.component.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.variableAttribute != null ? this.variableAttribute.hashCode() : 0);
        result = 31 * result + (this.variableCharacteristics != null ? this.variableCharacteristics.hashCode() : 0);
        return result;
    }
}
