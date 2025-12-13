package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
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
 *
 */
public class NotifyDERStartStopRequest implements JsonInterface {

    /**
     * Id of the started or stopped DER control. Corresponds to the controlId of the SetDERControlRequest.
     */
    @Required
    private String controlId;

    /**
     * True if DER control has started. False if it has ended.
     */
    @Required
    private Boolean started;

    /**
     * Time of start or end of event.
     */
    @Required
    private Date timestamp;

    /**
     * List of controlIds that are superseded as a result of this control starting.
     */
    @Optional
    private List<String> supersededIds;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyDERStartStopRequest() {
    }


    public String getControlId() {
        return controlId;
    }


    public void setControlId(String controlId) {
        this.controlId = controlId;
    }


    public Boolean getStarted() {
        return started;
    }


    public void setStarted(Boolean started) {
        this.started = started;
    }


    public Date getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }


    public List<String> getSupersededIds() {
        return supersededIds;
    }


    public void setSupersededIds(List<String> supersededIds) {
        this.supersededIds = supersededIds;
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
            setControlId(jsonObject.get("controlId").getAsString());
        }

        if (jsonObject.has("started")) {
            setStarted(jsonObject.get("started").getAsBoolean());
        }

        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setTimestamp(dateFormat.parse(jsonObject.get("timestamp").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
        }

        if (jsonObject.has("supersededIds")) {
            setSupersededIds(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("supersededIds");
            for (JsonElement el : arr) {
                getSupersededIds().add(el.getAsString());
            }
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
