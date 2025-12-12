package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.EventData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * This contains the field definition of the NotifyEventRequest PDU sent by the Charging Station to the CSMS.
 */
public class NotifyEventRequest implements JsonInterface {

    /**
     * Timestamp of the moment this message was generated at the Charging Station
     */
    @Required
    private Date generatedAt;

    /**
     * “to be continued” indicator.
     * Indicates whether another part of the report follows in an upcoming notifyEventRequest message.
     * Default value when omitted is false.
     */
    @Optional
    private Boolean tbc = false;

    /**
     * Sequence number of this message. First message starts at 0.
     */
    @Required
    private Integer seqNo;

    /**
     * List of EventData. An EventData element contains only the Component, Variable and VariableMonitoring data
     * that caused the event. The list of EventData will usally contain one eventData element,
     * but the Charging Station may decide to group multiple events in one notification.
     * For example, when multiple events triggered at the same time.
     */
    @Required
    private List<EventData> eventData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyEventRequest() {
    }


    public NotifyEventRequest(Date generatedAt, Boolean tbc, Integer seqNo, List<EventData> eventData, CustomData customData) {
        super();
        this.generatedAt = generatedAt;
        this.tbc = tbc;
        this.seqNo = seqNo;
        this.eventData = eventData;
        this.customData = customData;
    }


    public Date getGeneratedAt() {
        return generatedAt;
    }


    public void setGeneratedAt(Date generatedAt) {
        this.generatedAt = generatedAt;
    }


    public Boolean getTbc() {
        return tbc;
    }


    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
    }


    public Integer getSeqNo() {
        return seqNo;
    }


    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }


    public List<EventData> getEventData() {
        return eventData;
    }


    public void setEventData(List<EventData> eventData) {
        this.eventData = eventData;
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
        json.addProperty("generatedAt", new SimpleDateFormat(DATE_FORMAT).format(generatedAt));
        json.addProperty("seqNo", seqNo);
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
        if (jsonObject.has("generatedAt")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.generatedAt = dateFormat.parse(jsonObject.get("generatedAt").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for generatedAt" + e);
            }
        }

        if (jsonObject.has("seqNo")) {
            this.seqNo = jsonObject.get("seqNo").getAsInt();
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
