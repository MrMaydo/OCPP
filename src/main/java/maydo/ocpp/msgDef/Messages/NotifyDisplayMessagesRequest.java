package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.MessageInfo;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the NotifyDisplayMessagesRequest PDU sent by the Charging Station to the CSMS.
 */
public class NotifyDisplayMessagesRequest implements JsonInterface {

    /**
     * The requested display message as configured in the Charging Station.
     */
    @Optional
    private List<MessageInfo> messageInfo;

    /**
     * The id of the GetDisplayMessagesRequest that requested this message.
     */
    @Required
    private Integer requestId;

    /**
     * "to be continued" indicator. Indicates whether another part of the report follows in
     * an upcoming NotifyDisplayMessagesRequest message. Default value when omitted is false.
     */
    @Optional
    private Boolean tbc = false;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyDisplayMessagesRequest() {
    }


    public List<MessageInfo> getMessageInfo() {
        return messageInfo;
    }

    public void setMessageInfo(List<MessageInfo> messageInfo) {
        this.messageInfo = messageInfo;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public Boolean getTbc() {
        return tbc;
    }


    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
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

        if (getMessageInfo() != null) {
            JsonArray messageInfoArray = new JsonArray();
            for (MessageInfo item : getMessageInfo()) {
                messageInfoArray.add(item.toJsonObject());
            }
            json.add("messageInfo", messageInfoArray);
        }
        json.addProperty("requestId", getRequestId());

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
        if (jsonObject.has("messageInfo")) {
            setMessageInfo(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("messageInfo");
            for (JsonElement el : arr) {
                MessageInfo item = new MessageInfo();
                item.fromJsonObject(el.getAsJsonObject());
                getMessageInfo().add(item);
            }
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
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
        if (!(obj instanceof NotifyDisplayMessagesRequest))
            return false;
        NotifyDisplayMessagesRequest that = (NotifyDisplayMessagesRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.tbc, that.tbc)
                && Objects.equals(this.messageInfo, that.messageInfo)
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.tbc != null ? this.tbc.hashCode() : 0);
        result = 31 * result + (this.messageInfo != null ? this.messageInfo.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
