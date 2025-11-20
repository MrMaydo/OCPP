package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class NotifyDERStartStopRequest implements JsonInterface {

    /**
     * Id of the started or stopped DER control.
     * Corresponds to the _controlId_ of the SetDERControlRequest.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String controlId;
    /**
     * True if DER control has started. False if it has ended.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Boolean started;
    /**
     * Time of start or end of event.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Date timestamp;
    /**
     * List of controlIds that are superseded as a result of this control starting.
     */
    @Optional
    private List<String> supersededIds;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyDERStartStopRequest() {
    }

    /**
     * @param started       True if DER control has started. False if it has ended.
     *                      <p>
     *                      .
     * @param controlId     Id of the started or stopped DER control.
     *                      Corresponds to the _controlId_ of the SetDERControlRequest.
     *                      <p>
     *                      .
     * @param supersededIds List of controlIds that are superseded as a result of this control starting.
     *                      <p>
     *                      .
     * @param timestamp     Time of start or end of event.
     *                      <p>
     *                      .
     */
    public NotifyDERStartStopRequest(String controlId, Boolean started, Date timestamp, List<String> supersededIds, CustomData customData) {
        super();
        this.controlId = controlId;
        this.started = started;
        this.timestamp = timestamp;
        this.supersededIds = supersededIds;
        this.customData = customData;
    }

    /**
     * Id of the started or stopped DER control.
     * Corresponds to the _controlId_ of the SetDERControlRequest.
     * <p>
     * <p>
     * (Required)
     */
    public String getControlId() {
        return controlId;
    }

    /**
     * Id of the started or stopped DER control.
     * Corresponds to the _controlId_ of the SetDERControlRequest.
     * <p>
     * <p>
     * (Required)
     */
    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * True if DER control has started. False if it has ended.
     * <p>
     * <p>
     * (Required)
     */
    public Boolean getStarted() {
        return started;
    }

    /**
     * True if DER control has started. False if it has ended.
     * <p>
     * <p>
     * (Required)
     */
    public void setStarted(Boolean started) {
        this.started = started;
    }

    /**
     * Time of start or end of event.
     * <p>
     * <p>
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Time of start or end of event.
     * <p>
     * <p>
     * (Required)
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * List of controlIds that are superseded as a result of this control starting.
     */
    public List<String> getSupersededIds() {
        return supersededIds;
    }

    /**
     * List of controlIds that are superseded as a result of this control starting.
     */
    public void setSupersededIds(List<String> supersededIds) {
        this.supersededIds = supersededIds;
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
        json.addProperty("controlId", controlId);
        json.addProperty("started", started);
        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(timestamp));
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
        if (jsonObject.has("controlId")) {
            this.controlId = jsonObject.get("controlId").getAsString();
        }

        if (jsonObject.has("started")) {
            this.started = jsonObject.get("started").getAsBoolean();
        }

        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.timestamp = dateFormat.parse(jsonObject.get("timestamp").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
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
        if (!(obj instanceof NotifyDERStartStopRequest))
            return false;
        NotifyDERStartStopRequest that = (NotifyDERStartStopRequest) obj;
        return Objects.equals(this.started, that.started)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.controlId, that.controlId)
                && Objects.equals(this.supersededIds, that.supersededIds)
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.started != null ? this.started.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.controlId != null ? this.controlId.hashCode() : 0);
        result = 31 * result + (this.supersededIds != null ? this.supersededIds.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
