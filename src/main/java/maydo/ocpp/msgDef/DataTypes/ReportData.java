package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * Class to report components, variables and variable attributes and characteristics.
 */
public class ReportData implements JsonInterface {

    /**
     * Component for which a report of Variable is requested.
     */
    @Required
    private Component component;

    /**
     * Variable for which report is requested.
     */
    @Required
    private Variable variable;

    /**
     * Attribute data of a variable.
     */
    @Required
    private List<VariableAttribute> variableAttribute;

    /**
     * Fixed read-only parameters of a variable.
     */
    @Optional
    private VariableCharacteristics variableCharacteristics;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ReportData() {
    }


    public Component getComponent() {
        return component;
    }


    public void setComponent(Component component) {
        this.component = component;
    }


    public Variable getVariable() {
        return variable;
    }


    public void setVariable(Variable variable) {
        this.variable = variable;
    }


    public List<VariableAttribute> getVariableAttribute() {
        return variableAttribute;
    }


    public void setVariableAttribute(List<VariableAttribute> variableAttribute) {
        this.variableAttribute = variableAttribute;
    }


    public VariableCharacteristics getVariableCharacteristics() {
        return variableCharacteristics;
    }


    public void setVariableCharacteristics(VariableCharacteristics variableCharacteristics) {
        this.variableCharacteristics = variableCharacteristics;
    }


    public CustomData getCustomData() {
        return customData;
    }


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
