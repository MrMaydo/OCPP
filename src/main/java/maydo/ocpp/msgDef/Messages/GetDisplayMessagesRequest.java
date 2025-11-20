package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.MessagePriorityEnum;
import maydo.ocpp.msgDef.Enumerations.MessageStateEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class GetDisplayMessagesRequest implements JsonInterface {

    /**
     * If provided the Charging Station shall return Display Messages of the given ids. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-number-of-display-messages,NumberOfDisplayMessages.maxLimit&gt;&gt;
     */
    @Optional
    private List<Integer> id;
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
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetDisplayMessagesRequest() {
    }

    /**
     * @param requestId The Id of this request.
     *                  .
     * @param id        If provided the Charging Station shall return Display Messages of the given ids. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-number-of-display-messages,NumberOfDisplayMessages.maxLimit&gt;&gt;
     *                  <p>
     *                  .
     */
    public GetDisplayMessagesRequest(List<Integer> id, Integer requestId, MessagePriorityEnum priority, MessageStateEnum state, CustomData customData) {
        super();
        this.id = id;
        this.requestId = requestId;
        this.priority = priority;
        this.state = state;
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
        JsonObject json = new JsonObject();
        json.addProperty("requestId", requestId);
        json.addProperty("priority", priority.toString());
        json.addProperty("state", state.toString());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("requestId")) {
            this.requestId = jsonObject.get("requestId").getAsInt();
        }

        if (jsonObject.has("priority")) {
            this.priority = MessagePriorityEnum.valueOf(jsonObject.get("priority").getAsString());
        }

        if (jsonObject.has("state")) {
            this.state = MessageStateEnum.valueOf(jsonObject.get("state").getAsString());
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetDisplayMessagesRequest))
            return false;
        GetDisplayMessagesRequest that = (GetDisplayMessagesRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.state, that.state)
                && Objects.equals(this.priority, that.priority)
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.state != null ? this.state.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
