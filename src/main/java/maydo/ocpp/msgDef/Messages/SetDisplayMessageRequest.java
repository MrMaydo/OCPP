package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.MessageInfo;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

public class SetDisplayMessageRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * Message_ Info
     * urn:x-enexis:ecdm:uid:2:233264
     * Contains message details, for a message to be displayed on a Charging Station.
     * <p>
     * (Required)
     */
    private MessageInfo message;

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
     * Message_ Info
     * urn:x-enexis:ecdm:uid:2:233264
     * Contains message details, for a message to be displayed on a Charging Station.
     * <p>
     * (Required)
     */
    public MessageInfo getMessage() {
        return message;
    }

    /**
     * Message_ Info
     * urn:x-enexis:ecdm:uid:2:233264
     * Contains message details, for a message to be displayed on a Charging Station.
     * <p>
     * (Required)
     */
    public void setMessage(MessageInfo message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
