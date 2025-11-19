package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.EVSE;
import maydo.ocpp.msgDef.Enumerations.MessageTriggerEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class TriggerMessageRequest implements JsonInterface {

    /**
     * Electric Vehicle Supply Equipment
     */
    @Optional
    private EVSE evse;
    /**
     * Type of message to be triggered.
     * 
     * (Required)
     */
    @Required
    private MessageTriggerEnum requestedMessage;
    /**
     * *(2.1)* When _requestedMessage_ = `CustomTrigger` this will trigger sending the corresponding message in field _customTrigger_, if supported by Charging Station.
     * 
     */
    @Optional
    private String customTrigger;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TriggerMessageRequest() {
    }

    /**
     * 
     * @param customTrigger
     *     *(2.1)* When _requestedMessage_ = `CustomTrigger` this will trigger sending the corresponding message in field _customTrigger_, if supported by Charging Station.
     *     
     *     .
     */
    public TriggerMessageRequest(EVSE evse, MessageTriggerEnum requestedMessage, String customTrigger, CustomData customData) {
        super();
        this.evse = evse;
        this.requestedMessage = requestedMessage;
        this.customTrigger = customTrigger;
        this.customData = customData;
    }

    /**
     * Electric Vehicle Supply Equipment
     */
    public EVSE getEvse() {
        return evse;
    }

    /**
     * Electric Vehicle Supply Equipment
     */
    public void setEvse(EVSE evse) {
        this.evse = evse;
    }

    /**
     * Type of message to be triggered.
     * 
     * (Required)
     */
    public MessageTriggerEnum getRequestedMessage() {
        return requestedMessage;
    }

    /**
     * Type of message to be triggered.
     * 
     * (Required)
     */
    public void setRequestedMessage(MessageTriggerEnum requestedMessage) {
        this.requestedMessage = requestedMessage;
    }

    /**
     * *(2.1)* When _requestedMessage_ = `CustomTrigger` this will trigger sending the corresponding message in field _customTrigger_, if supported by Charging Station.
     * 
     */
    public String getCustomTrigger() {
        return customTrigger;
    }

    /**
     * *(2.1)* When _requestedMessage_ = `CustomTrigger` this will trigger sending the corresponding message in field _customTrigger_, if supported by Charging Station.
     * 
     */
    public void setCustomTrigger(String customTrigger) {
        this.customTrigger = customTrigger;
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
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
        int result = 1;
        result = 31 * result + (this.customTrigger != null ? this.customTrigger.hashCode() : 0);
        result = 31 * result + (this.requestedMessage != null ? this.requestedMessage.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.evse != null ? this.evse.hashCode() : 0);
        return result;
    }
}
