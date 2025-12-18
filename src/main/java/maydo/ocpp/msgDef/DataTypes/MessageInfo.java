package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.MessagePriorityEnum;
import maydo.ocpp.msgDef.Enumerations.MessageStateEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * Contains message details, for a message to be displayed on a Charging Station.
 */
public class MessageInfo implements JsonInterface {

    /**
     * Unique id within an exchange context.
     * It is defined within the OCPP context as a positive Integer value (greater or equal to zero).
     */
    @Required
    private Integer id;

    /**
     * Contains message details for the message to be displayed on a Charging Station.
     */
    @Required
    private MessageContent message;

    /**
     * (2.1) Contains message details for extra languages to be displayed on a Charging Station.
     */
    @Optional
    private List<MessageContent> messageExtra;

    /**
     * With what priority should this message be shown
     */
    @Required
    private MessagePriorityEnum priority;

    /**
     * When a Charging Station has multiple Displays, this field can be used to define to which Display this message belongs.
     */
    @Optional
    private Component display;

    /**
     * During what state should this message be shown. When omitted this message should be shown in any state of the Charging Station.
     */
    @Optional
    private MessageStateEnum state;

    /**
     * From what date-time should this message be shown. If omitted: directly.
     */
    @Optional
    private Date startDateTime;

    /**
     * Until what date-time should this message be shown, after this date/time this message SHALL be removed.
     */
    @Optional
    private Date endDateTime;

    /**
     * During which transaction shall this message be shown.
     * Message SHALL be removed by the Charging Station after transaction has ended.
     */
    @Optional
    private String transactionId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public MessageInfo() {
    }


    public Component getDisplay() {
        return display;
    }


    public void setDisplay(Component display) {
        this.display = display;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
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


    public Date getStartDateTime() {
        return startDateTime;
    }


    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }


    public Date getEndDateTime() {
        return endDateTime;
    }


    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }


    public String getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public MessageContent getMessage() {
        return message;
    }


    public void setMessage(MessageContent message) {
        this.message = message;
    }

    public List<MessageContent> getMessageExtra() {
        return messageExtra;
    }

    public void setMessageExtra(List<MessageContent> messageExtra) {
        this.messageExtra = messageExtra;
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

        json.addProperty("id", getId());

        json.add("message", getMessage().toJsonObject());

        if (getMessageExtra() != null) {
            JsonArray messageExtraArray = new JsonArray();
            for (MessageContent item : getMessageExtra()) {
                messageExtraArray.add(item.toJsonObject());
            }
            json.add("messageExtra", messageExtraArray);
        }
        json.addProperty("priority", getPriority().toString());

        if (getDisplay() != null) {
            json.add("display", getDisplay().toJsonObject());
        }
        if (getState() != null) {
            json.addProperty("state", getState().toString());
        }
        if (getStartDateTime() != null) {
            json.addProperty("startDateTime", new SimpleDateFormat(DATE_FORMAT).format(getStartDateTime()));
        }
        if (getEndDateTime() != null) {
            json.addProperty("endDateTime", new SimpleDateFormat(DATE_FORMAT).format(getEndDateTime()));
        }
        if (getTransactionId() != null) {
            json.addProperty("transactionId", getTransactionId());
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
        if (jsonObject.has("id")) {
            setId(jsonObject.get("id").getAsInt());
        }

        if (jsonObject.has("message")) {
            setMessage(new MessageContent());
            getMessage().fromJsonObject(jsonObject.getAsJsonObject("message"));
        }

        if (jsonObject.has("messageExtra")) {
            setMessageExtra(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("messageExtra");
            for (JsonElement el : arr) {
                MessageContent item = new MessageContent();
                item.fromJsonObject(el.getAsJsonObject());
                getMessageExtra().add(item);
            }
        }

        if (jsonObject.has("priority")) {
            setPriority(MessagePriorityEnum.valueOf(jsonObject.get("priority").getAsString()));
        }

        if (jsonObject.has("display")) {
            setDisplay(new Component());
            getDisplay().fromJsonObject(jsonObject.getAsJsonObject("display"));
        }

        if (jsonObject.has("state")) {
            setState(MessageStateEnum.valueOf(jsonObject.get("state").getAsString()));
        }

        if (jsonObject.has("startDateTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setStartDateTime(dateFormat.parse(jsonObject.get("startDateTime").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for startDateTime" + e);
            }
        }

        if (jsonObject.has("endDateTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setEndDateTime(dateFormat.parse(jsonObject.get("endDateTime").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for endDateTime" + e);
            }
        }

        if (jsonObject.has("transactionId")) {
            setTransactionId(jsonObject.get("transactionId").getAsString());
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
        if (!(obj instanceof MessageInfo))
            return false;
        MessageInfo that = (MessageInfo) obj;
        return Objects.equals(this.messageExtra, that.messageExtra)
                && Objects.equals(this.startDateTime, that.startDateTime)
                && Objects.equals(this.display, that.display)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.state, that.state)
                && Objects.equals(this.priority, that.priority)
                && Objects.equals(this.endDateTime, that.endDateTime)
                && Objects.equals(this.message, that.message)
                && Objects.equals(this.transactionId, that.transactionId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.messageExtra != null ? this.messageExtra.hashCode() : 0);
        result = 31 * result + (this.startDateTime != null ? this.startDateTime.hashCode() : 0);
        result = 31 * result + (this.display != null ? this.display.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.state != null ? this.state.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        result = 31 * result + (this.endDateTime != null ? this.endDateTime.hashCode() : 0);
        result = 31 * result + (this.message != null ? this.message.hashCode() : 0);
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        return result;
    }
}
