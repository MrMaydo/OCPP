package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class NotifyDERStartStopRequest implements JsonInterface {

    /**
     * Id of the started or stopped DER control.
     * Corresponds to the _controlId_ of the SetDERControlRequest.
     * 
     * 
     * (Required)
     */
    @Required
    private String controlId;
    /**
     * True if DER control has started. False if it has ended.
     * 
     * 
     * (Required)
     */
    @Required
    private Boolean started;
    /**
     * Time of start or end of event.
     * 
     * 
     * (Required)
     */
    @Required
    private Date timestamp;
    /**
     * List of controlIds that are superseded as a result of this control starting.
     * 
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
     * 
     * @param started
     *     True if DER control has started. False if it has ended.
     *     
     *     .
     * @param controlId
     *     Id of the started or stopped DER control.
     *     Corresponds to the _controlId_ of the SetDERControlRequest.
     *     
     *     .
     * @param supersededIds
     *     List of controlIds that are superseded as a result of this control starting.
     *     
     *     .
     * @param timestamp
     *     Time of start or end of event.
     *     
     *     .
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
     * 
     * 
     * (Required)
     */
    public String getControlId() {
        return controlId;
    }

    /**
     * Id of the started or stopped DER control.
     * Corresponds to the _controlId_ of the SetDERControlRequest.
     * 
     * 
     * (Required)
     */
    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * True if DER control has started. False if it has ended.
     * 
     * 
     * (Required)
     */
    public Boolean getStarted() {
        return started;
    }

    /**
     * True if DER control has started. False if it has ended.
     * 
     * 
     * (Required)
     */
    public void setStarted(Boolean started) {
        this.started = started;
    }

    /**
     * Time of start or end of event.
     * 
     * 
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Time of start or end of event.
     * 
     * 
     * (Required)
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * List of controlIds that are superseded as a result of this control starting.
     * 
     */
    public List<String> getSupersededIds() {
        return supersededIds;
    }

    /**
     * List of controlIds that are superseded as a result of this control starting.
     * 
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
