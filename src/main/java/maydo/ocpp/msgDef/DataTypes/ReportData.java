package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class ReportData implements JsonInterface {

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
        JsonObject json = new JsonObject();
        json.add("component", component.toJsonObject());
        json.add("variable", variable.toJsonObject());
        json.add("variableCharacteristics", variableCharacteristics.toJsonObject());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("component")) {
            this.component = new Component();
            this.component.fromJsonObject(jsonObject.getAsJsonObject("component"));
        }

        if (jsonObject.has("variable")) {
            this.variable = new Variable();
            this.variable.fromJsonObject(jsonObject.getAsJsonObject("variable"));
        }

        if (jsonObject.has("variableCharacteristics")) {
            this.variableCharacteristics = new VariableCharacteristics();
            this.variableCharacteristics.fromJsonObject(jsonObject.getAsJsonObject("variableCharacteristics"));
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

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
