package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;


/**
 * Class to report components, variables and variable attributes and characteristics.
 */
public class ReportData implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * A physical or logical component
     * <p>
     * (Required)
     */
    @Required
    private Component component;
    /**
     * Reference key to a component-variable.
     * <p>
     * (Required)
     */
    @Required
    private Variable variable;
    /**
     * (Required)
     */
    @Required
    private List<VariableAttribute> variableAttribute = null;
    /**
     * Fixed read-only parameters of a variable.
     */
    @Optional
    private VariableCharacteristics variableCharacteristics;

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

    /**
     * A physical or logical component
     * <p>
     * (Required)
     */
    public Component getComponent() {
        return component;
    }

    /**
     * A physical or logical component
     * <p>
     * (Required)
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     * Reference key to a component-variable.
     * <p>
     * (Required)
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Reference key to a component-variable.
     * <p>
     * (Required)
     */
    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    /**
     * (Required)
     */
    public List<VariableAttribute> getVariableAttribute() {
        return variableAttribute;
    }

    /**
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ReportData))
            return false;
        ReportData that = (ReportData) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(component, that.component)
                && Objects.equals(variable, that.variable)
                && Objects.equals(variableAttribute, that.variableAttribute)
                && Objects.equals(variableCharacteristics, that.variableCharacteristics);
    }

    @Override
    public int hashCode() {
        int result = (component != null ? component.hashCode() : 0);
        result = 31 * result + (variable != null ? variable.hashCode() : 0);
        result = 31 * result + (variableAttribute != null ? variableAttribute.hashCode() : 0);
        result = 31 * result + (variableCharacteristics != null ? variableCharacteristics.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
