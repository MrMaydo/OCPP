package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.MessageInfo;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class SetDisplayMessageRequest {

    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     * (Required)
     */
    @Required
    private MessageInfo message;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SetDisplayMessageRequest() {
    }

    public SetDisplayMessageRequest(MessageInfo message, CustomData customData) {
        super();
        this.message = message;
        this.customData = customData;
    }

    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     * (Required)
     */
    public MessageInfo getMessage() {
        return message;
    }

    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     * 
     * (Required)
     */
    public void setMessage(MessageInfo message) {
        this.message = message;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SetDisplayMessageRequest))
            return false;
        SetDisplayMessageRequest that = (SetDisplayMessageRequest) obj;
        return Objects.equals(this.message, that.message)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
