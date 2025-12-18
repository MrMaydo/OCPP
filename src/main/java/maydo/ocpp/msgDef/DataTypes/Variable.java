package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Reference key to a component-variable.
 */
public class Variable implements JsonInterface {

    /**
     * Name of the variable. Name should be taken from the list of standardized variable names whenever possible.
     * Case Insensitive. strongly advised to use Camel Case.
     */
    @Required
    private String name;

    /**
     * Name of instance in case the variable exists as multiple instances.
     * Case Insensitive. strongly advised to use Camel Case
     */
    @Optional
    private String instance;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Variable() {
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getInstance() {
        return instance;
    }


    public void setInstance(String instance) {
        this.instance = instance;
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

        json.addProperty("name", getName());

        if (getInstance() != null) {
            json.addProperty("instance", getInstance());
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
        if (jsonObject.has("name")) {
            setName(jsonObject.get("name").getAsString());
        }

        if (jsonObject.has("instance")) {
            setInstance(jsonObject.get("instance").getAsString());
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
        if (!(obj instanceof Variable))
            return false;
        Variable that = (Variable) obj;
        return Objects.equals(this.name, that.name)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.instance, that.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getName(),
                getInstance(),
                getCustomData()
        );
    }
}
