package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.MessageInfo;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the SetDisplayMessageRequest PDU sent by the CSMS to the Charging Station.
 * The CSMS asks the Charging Station to configure a new display message that the Charging Station will display (in the future).
 * See also O01 - Set Display Message, O02 - Set Display Message for Transaction and O06 - Replace Display Message
 */
public class SetDisplayMessageRequest implements JsonInterface {

    /**
     * Message to be configured in the Charging Station, to be displayed.
     */
    @Required
    private MessageInfo message;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetDisplayMessageRequest() {
    }


    public MessageInfo getMessage() {
        return message;
    }


    public void setMessage(MessageInfo message) {
        this.message = message;
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

        json.add("message", getMessage().toJsonObject());

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
        if (jsonObject.has("message")) {
            setMessage(new MessageInfo());
            getMessage().fromJsonObject(jsonObject.getAsJsonObject("message"));
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
        if (!(obj instanceof SetDisplayMessageRequest))
            return false;
        SetDisplayMessageRequest that = (SetDisplayMessageRequest) obj;
        return Objects.equals(getMessage(), that.getMessage())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getMessage(),
                getCustomData()
        );
    }
}
