package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.MessagePriorityEnum;
import maydo.ocpp.msgDef.Enumerations.MessageStateEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;

public class GetDisplayMessagesRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * If provided the Charging Station shall return Display Messages of the given ids. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-number-of-display-messages,NumberOfDisplayMessages.maxLimit&gt;&gt;
     */
    @Optional
    private List<Integer> id = null;
    /**
     * The Id of this request.
     * <p>
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * If provided the Charging Station shall return Display Messages with the given priority only.
     */
    @Optional
    private MessagePriorityEnum priority;
    /**
     * If provided the Charging Station shall return Display Messages with the given state only.
     */
    @Optional
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

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetDisplayMessagesRequest))
            return false;
        GetDisplayMessagesRequest that = (GetDisplayMessagesRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(id, that.id)
                && Objects.equals(requestId, that.requestId)
                && priority == that.priority
                && state == that.state;
    }

    @Override
    public int hashCode() {
        int result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
