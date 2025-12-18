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
 * Class to hold parameters of SetVariableMonitoring request.
 */
public class MonitoringData implements JsonInterface {

    /**
     * Component for which monitoring report was requested.
     */
    @Required
    private Component component;

    /**
     * Variable for which monitoring report was requested.
     */
    @Required
    private Variable variable;

    /**
     * List of monitors for this Component-Variable pair.
     */
    @Required
    private List<VariableMonitoring> variableMonitoring;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public MonitoringData() {
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


    public List<VariableMonitoring> getVariableMonitoring() {
        return variableMonitoring;
    }


    public void setVariableMonitoring(List<VariableMonitoring> variableMonitoring) {
        this.variableMonitoring = variableMonitoring;
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

        JsonArray variableMonitoringArray = new JsonArray();
        for (VariableMonitoring item : getVariableMonitoring()) {
            variableMonitoringArray.add(item.toJsonObject());
        }
        json.add("variableMonitoring", variableMonitoringArray);

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

        if (jsonObject.has("variableMonitoring")) {
            setVariableMonitoring(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("variableMonitoring");
            for (JsonElement el : arr) {
                VariableMonitoring item = new VariableMonitoring();
                item.fromJsonObject(el.getAsJsonObject());
                getVariableMonitoring().add(item);
            }
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
        if (!(obj instanceof MonitoringData))
            return false;
        MonitoringData that = (MonitoringData) obj;
        return Objects.equals(getComponent(), that.getComponent())
                && Objects.equals(getVariable(), that.getVariable())
                && Objects.equals(getVariableMonitoring(), that.getVariableMonitoring())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getComponent(),
                getVariable(),
                getVariableMonitoring(),
                getCustomData()
        );
    }
}
