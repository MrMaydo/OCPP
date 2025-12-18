package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.EVSE;
import maydo.ocpp.msgDef.Enumerations.MessageTriggerEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the TriggerMessageRequest PDU sent by the CSMS to the Charging Station.
 */
public class TriggerMessageRequest implements JsonInterface {

    /**
     * Can be used to specifiy the EVSE and Connector if required for the message which needs to be sent.
     */
    @Optional
    private EVSE evse;

    /**
     * Type of message to be triggered.
     */
    @Required
    private MessageTriggerEnum requestedMessage;

    /**
     * (2.1) When requestedMessage = CustomTrigger  this will trigger sending the corresponding message in field customTrigger,
     * if supported by Charging Station.
     */
    @Optional
    private String customTrigger;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TriggerMessageRequest() {
    }


    public EVSE getEvse() {
        return evse;
    }


    public void setEvse(EVSE evse) {
        this.evse = evse;
    }


    public MessageTriggerEnum getRequestedMessage() {
        return requestedMessage;
    }


    public void setRequestedMessage(MessageTriggerEnum requestedMessage) {
        this.requestedMessage = requestedMessage;
    }


    public String getCustomTrigger() {
        return customTrigger;
    }


    public void setCustomTrigger(String customTrigger) {
        this.customTrigger = customTrigger;
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

        if (getEvse() != null) {
            json.add("evse", getEvse().toJsonObject());
        }
        json.addProperty("requestedMessage", getRequestedMessage().toString());

        if (getCustomTrigger() != null) {
            json.addProperty("customTrigger", getCustomTrigger());
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
        if (jsonObject.has("evse")) {
            setEvse(new EVSE());
            getEvse().fromJsonObject(jsonObject.getAsJsonObject("evse"));
        }

        if (jsonObject.has("requestedMessage")) {
            setRequestedMessage(MessageTriggerEnum.valueOf(jsonObject.get("requestedMessage").getAsString()));
        }

        if (jsonObject.has("customTrigger")) {
            setCustomTrigger(jsonObject.get("customTrigger").getAsString());
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
        if (!(obj instanceof TriggerMessageRequest))
            return false;
        TriggerMessageRequest that = (TriggerMessageRequest) obj;
        return Objects.equals(this.customTrigger, that.customTrigger)
                && Objects.equals(this.requestedMessage, that.requestedMessage)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.evse, that.evse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getEvse(),
                getRequestedMessage(),
                getCustomTrigger(),
                getCustomData()
        );
    }
}
