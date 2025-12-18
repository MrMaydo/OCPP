package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * A physical or logical component
 */
public class Component implements JsonInterface {

    /**
     * Name of the component. Name should be taken from the list of standardized component names whenever possible.
     * Case Insensitive. strongly advised to use Camel Case.
     */
    @Required
    private String name;

    /**
     * Specifies the EVSE when component is located at EVSE level,
     * also specifies the connector when component is located at Connector level.
     */
    @Optional
    private EVSE evse;

    /**
     * Name of instance in case the component exists as multiple instances.
     * Case Insensitive. strongly advised to use Camel Case.
     */
    @Optional
    private String instance;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Component() {
    }


    public EVSE getEvse() {
        return evse;
    }


    public void setEvse(EVSE evse) {
        this.evse = evse;
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

        if (getEvse() != null) {
            json.add("evse", getEvse().toJsonObject());
        }
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

        if (jsonObject.has("evse")) {
            setEvse(new EVSE());
            getEvse().fromJsonObject(jsonObject.getAsJsonObject("evse"));
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
        if (!(obj instanceof Component))
            return false;
        Component that = (Component) obj;
        return Objects.equals(getName(), that.getName())
                && Objects.equals(getEvse(), that.getEvse())
                && Objects.equals(getInstance(), that.getInstance())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getName(),
                getEvse(),
                getInstance(),
                getCustomData()
        );
    }
}
