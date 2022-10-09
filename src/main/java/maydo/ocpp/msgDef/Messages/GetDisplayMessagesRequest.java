package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.MessagePriorityEnum;
import maydo.ocpp.msgDef.Enumerations.MessageStateEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.util.List;

public class GetDisplayMessagesRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * If provided the Charging Station shall return Display Messages of the given ids. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-number-of-display-messages,NumberOfDisplayMessages.maxLimit&gt;&gt;
     */
    private List<Integer> id = null;
    /**
     * The Id of this request.
     * <p>
     * (Required)
     */
    private Integer requestId;
    /**
     * If provided the Charging Station shall return Display Messages with the given priority only.
     */
    private MessagePriorityEnum priority;
    /**
     * If provided the Charging Station shall return Display Messages with the given state only.
     */
    private MessageStateEnum state;

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
     * If provided the Charging Station shall return Display Messages of the given ids. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-number-of-display-messages,NumberOfDisplayMessages.maxLimit&gt;&gt;
     */
    public List<Integer> getId() {
        return id;
    }

    /**
     * If provided the Charging Station shall return Display Messages of the given ids. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-number-of-display-messages,NumberOfDisplayMessages.maxLimit&gt;&gt;
     */
    public void setId(List<Integer> id) {
        this.id = id;
    }

    /**
     * The Id of this request.
     * <p>
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of this request.
     * <p>
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * If provided the Charging Station shall return Display Messages with the given priority only.
     */
    public MessagePriorityEnum getPriority() {
        return priority;
    }

    /**
     * If provided the Charging Station shall return Display Messages with the given priority only.
     */
    public void setPriority(MessagePriorityEnum priority) {
        this.priority = priority;
    }

    /**
     * If provided the Charging Station shall return Display Messages with the given state only.
     */
    public MessageStateEnum getState() {
        return state;
    }

    /**
     * If provided the Charging Station shall return Display Messages with the given state only.
     */
    public void setState(MessageStateEnum state) {
        this.state = state;
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
