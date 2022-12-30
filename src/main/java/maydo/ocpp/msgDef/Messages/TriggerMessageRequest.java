package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.EVSE;
import maydo.ocpp.msgDef.Enumerations.MessageTriggerEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class TriggerMessageRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     */
    @Optional
    private EVSE evse;
    /**
     * Type of message to be triggered.
     * <p>
     * (Required)
     */
    @Required
    private MessageTriggerEnum requestedMessage;

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
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     */
    public EVSE getEvse() {
        return evse;
    }

    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     */
    public void setEvse(EVSE evse) {
        this.evse = evse;
    }

    /**
     * Type of message to be triggered.
     * <p>
     * (Required)
     */
    public MessageTriggerEnum getRequestedMessage() {
        return requestedMessage;
    }

    /**
     * Type of message to be triggered.
     * <p>
     * (Required)
     */
    public void setRequestedMessage(MessageTriggerEnum requestedMessage) {
        this.requestedMessage = requestedMessage;
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
        if (!(obj instanceof TriggerMessageRequest))
            return false;
        TriggerMessageRequest that = (TriggerMessageRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(evse, that.evse)
                && requestedMessage == that.requestedMessage;
    }

    @Override
    public int hashCode() {
        int result = (evse != null ? evse.hashCode() : 0);
        result = 31 * result + (requestedMessage != null ? requestedMessage.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
