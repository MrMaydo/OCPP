package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.EventData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class NotifyEventRequest implements JsonInterface {

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * <p>
     * (Required)
     */
    @Required
    private Date generatedAt;
    /**
     * “to be continued” indicator. Indicates whether another part of the report follows in an upcoming notifyEventRequest message. Default value when omitted is false.
     */
    @Optional
    private Boolean tbc = false;
    /**
     * Sequence number of this message. First message starts at 0.
     * <p>
     * (Required)
     */
    @Required
    private Integer seqNo;
    /**
     * (Required)
     */
    @Required
    private List<EventData> eventData;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyEventRequest() {
    }

    /**
     * @param tbc         “to be continued” indicator. Indicates whether another part of the report follows in an upcoming notifyEventRequest message. Default value when omitted is false.
     *                    .
     * @param seqNo       Sequence number of this message. First message starts at 0.
     *                    .
     * @param generatedAt Timestamp of the moment this message was generated at the Charging Station.
     *                    .
     */
    public NotifyEventRequest(Date generatedAt, Boolean tbc, Integer seqNo, List<EventData> eventData, CustomData customData) {
        super();
        this.generatedAt = generatedAt;
        this.tbc = tbc;
        this.seqNo = seqNo;
        this.eventData = eventData;
        this.customData = customData;
    }

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * <p>
     * (Required)
     */
    public Date getGeneratedAt() {
        return generatedAt;
    }

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * <p>
     * (Required)
     */
    public void setGeneratedAt(Date generatedAt) {
        this.generatedAt = generatedAt;
    }

    /**
     * “to be continued” indicator. Indicates whether another part of the report follows in an upcoming notifyEventRequest message. Default value when omitted is false.
     */
    public Boolean getTbc() {
        return tbc;
    }

    /**
     * “to be continued” indicator. Indicates whether another part of the report follows in an upcoming notifyEventRequest message. Default value when omitted is false.
     */
    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
    }

    /**
     * Sequence number of this message. First message starts at 0.
     * <p>
     * (Required)
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence number of this message. First message starts at 0.
     * <p>
     * (Required)
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * (Required)
     */
    public List<EventData> getEventData() {
        return eventData;
    }

    /**
     * (Required)
     */
    public void setEventData(List<EventData> eventData) {
        this.eventData = eventData;
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
        if (!(obj instanceof NotifyEventRequest))
            return false;
        NotifyEventRequest that = (NotifyEventRequest) obj;
        return Objects.equals(this.generatedAt, that.generatedAt)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.eventData, that.eventData)
                && Objects.equals(this.tbc, that.tbc)
                && Objects.equals(this.seqNo, that.seqNo);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.generatedAt != null ? this.generatedAt.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.eventData != null ? this.eventData.hashCode() : 0);
        result = 31 * result + (this.tbc != null ? this.tbc.hashCode() : 0);
        result = 31 * result + (this.seqNo != null ? this.seqNo.hashCode() : 0);
        return result;
    }
}
