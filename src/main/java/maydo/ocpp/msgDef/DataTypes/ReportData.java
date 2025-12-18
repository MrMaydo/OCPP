package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
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

        json.add("component", getComponent().toJsonObject());

        json.add("variable", getVariable().toJsonObject());

        JsonArray variableAttributeArray = new JsonArray();
        for (VariableAttribute item : getVariableAttribute()) {
            variableAttributeArray.add(item.toJsonObject());
        }
        json.add("variableAttribute", variableAttributeArray);

        if (getVariableCharacteristics() != null) {
            json.add("variableCharacteristics", getVariableCharacteristics().toJsonObject());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

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
            setComponent(new Component());
            getComponent().fromJsonObject(jsonObject.getAsJsonObject("component"));
        }

        if (jsonObject.has("variable")) {
            setVariable(new Variable());
            getVariable().fromJsonObject(jsonObject.getAsJsonObject("variable"));
        }

        if (jsonObject.has("variableAttribute")) {
            setVariableAttribute(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("variableAttribute");
            for (JsonElement el : arr) {
                VariableAttribute item = new VariableAttribute();
                item.fromJsonObject(el.getAsJsonObject());
                getVariableAttribute().add(item);
            }
        }

        if (jsonObject.has("variableCharacteristics")) {
            setVariableCharacteristics(new VariableCharacteristics());
            getVariableCharacteristics().fromJsonObject(jsonObject.getAsJsonObject("variableCharacteristics"));
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
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
        return Objects.hash(
                getComponent(),
                getVariable(),
                getVariableAttribute(),
                getVariableCharacteristics(),
                getCustomData()
        );
    }
}
