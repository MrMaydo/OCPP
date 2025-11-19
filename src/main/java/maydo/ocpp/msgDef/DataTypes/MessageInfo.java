package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.MessagePriorityEnum;
import maydo.ocpp.msgDef.Enumerations.MessageStateEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MessageInfo implements JsonInterface {

    /**
     * A physical or logical component
     */
    @Optional
    private Component display;
    /**
     * Unique id within an exchange context. It is defined within the OCPP context as a positive Integer value (greater or equal to zero).
     * <p>
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * With what priority should this message be shown
     * <p>
     * (Required)
     */
    @Required
    private MessagePriorityEnum priority;
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
     * Message SHALL be removed by the Charging Station after transaction has
     * ended.
     */
    @Optional
    private String transactionId;
    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private MessageContent message;
    @Optional
    private List<MessageContent> messageExtra;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public MessageInfo() {
    }

    /**
     * @param startDateTime From what date-time should this message be shown. If omitted: directly.
     *                      .
     * @param id            Unique id within an exchange context. It is defined within the OCPP context as a positive Integer value (greater or equal to zero).
     *                      .
     * @param endDateTime   Until what date-time should this message be shown, after this date/time this message SHALL be removed.
     *                      .
     * @param transactionId During which transaction shall this message be shown.
     *                      Message SHALL be removed by the Charging Station after transaction has
     *                      ended.
     *                      .
     */
    public MessageInfo(Component display, Integer id, MessagePriorityEnum priority, MessageStateEnum state, Date startDateTime, Date endDateTime, String transactionId, MessageContent message, List<MessageContent> messageExtra, CustomData customData) {
        super();
        this.display = display;
        this.id = id;
        this.priority = priority;
        this.state = state;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.transactionId = transactionId;
        this.message = message;
        this.messageExtra = messageExtra;
        this.customData = customData;
    }

    /**
     * A physical or logical component
     */
    public Component getDisplay() {
        return display;
    }

    /**
     * A physical or logical component
     */
    public void setDisplay(Component display) {
        this.display = display;
    }

    /**
     * Unique id within an exchange context. It is defined within the OCPP context as a positive Integer value (greater or equal to zero).
     * <p>
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Unique id within an exchange context. It is defined within the OCPP context as a positive Integer value (greater or equal to zero).
     * <p>
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * With what priority should this message be shown
     * <p>
     * (Required)
     */
    public MessagePriorityEnum getPriority() {
        return priority;
    }

    /**
     * With what priority should this message be shown
     * <p>
     * (Required)
     */
    public void setPriority(MessagePriorityEnum priority) {
        this.priority = priority;
    }

    /**
     * During what state should this message be shown. When omitted this message should be shown in any state of the Charging Station.
     */
    public MessageStateEnum getState() {
        return state;
    }

    /**
     * During what state should this message be shown. When omitted this message should be shown in any state of the Charging Station.
     */
    public void setState(MessageStateEnum state) {
        this.state = state;
    }

    /**
     * From what date-time should this message be shown. If omitted: directly.
     */
    public Date getStartDateTime() {
        return startDateTime;
    }

    /**
     * From what date-time should this message be shown. If omitted: directly.
     */
    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * Until what date-time should this message be shown, after this date/time this message SHALL be removed.
     */
    public Date getEndDateTime() {
        return endDateTime;
    }

    /**
     * Until what date-time should this message be shown, after this date/time this message SHALL be removed.
     */
    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * During which transaction shall this message be shown.
     * Message SHALL be removed by the Charging Station after transaction has
     * ended.
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * During which transaction shall this message be shown.
     * Message SHALL be removed by the Charging Station after transaction has
     * ended.
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     * <p>
     * <p>
     * (Required)
     */
    public MessageContent getMessage() {
        return message;
    }

    /**
     * Contains message details, for a message to be displayed on a Charging Station.
     * <p>
     * <p>
     * (Required)
     */
    public void setMessage(MessageContent message) {
        this.message = message;
    }

    public List<MessageContent> getMessageExtra() {
        return messageExtra;
    }

    public void setMessageExtra(List<MessageContent> messageExtra) {
        this.messageExtra = messageExtra;
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
