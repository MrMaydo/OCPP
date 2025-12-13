package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.MessagePriorityEnum;
import maydo.ocpp.msgDef.Enumerations.MessageStateEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class GetDisplayMessagesRequest implements JsonInterface {

    /**
     * If provided the Charging Station shall return Display Messages of the given ids.
     * This field SHALL NOT contain more ids than set in NumberOfDisplayMessages.maxLimit
     */
    @Optional
    private List<Integer> id;

    /**
     * The Id of this request.
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
     *
     */
    @Optional
    private CustomData customData;


    public GetDisplayMessagesRequest() {
    }


    public List<Integer> getId() {
        return id;
    }


    public void setId(List<Integer> id) {
        this.id = id;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public MessagePriorityEnum getPriority() {
        return priority;
    }


    public void setPriority(MessagePriorityEnum priority) {
        this.priority = priority;
    }


    public MessageStateEnum getState() {
        return state;
    }


    public void setState(MessageStateEnum state) {
        this.state = state;
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
        json.addProperty("requestId", requestId);
        json.addProperty("priority", priority.toString());
        json.addProperty("state", state.toString());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("id")) {
            setId(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("id");
            for (JsonElement el : arr) {
                getId().add(el.getAsInt());
            }
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("priority")) {
            setPriority(MessagePriorityEnum.valueOf(jsonObject.get("priority").getAsString()));
        }

        if (jsonObject.has("state")) {
            setState(MessageStateEnum.valueOf(jsonObject.get("state").getAsString()));
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
