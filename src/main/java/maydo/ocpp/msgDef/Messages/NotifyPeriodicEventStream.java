package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StreamDataElement;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class NotifyPeriodicEventStream implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private List<StreamDataElement> data;
    /**
     * Id of stream.
     * 
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * Number of data elements still pending to be sent.
     * 
     * (Required)
     */
    @Required
    private Integer pending;
    /**
     * Base timestamp to add to time offset of values.
     * 
     * (Required)
     */
    @Required
    private Date basetime;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyPeriodicEventStream() {
    }

    /**
     * 
     * @param pending
     *     Number of data elements still pending to be sent.
     *     .
     * @param id
     *     Id of stream.
     *     .
     * @param basetime
     *     Base timestamp to add to time offset of values.
     *     .
     */
    public NotifyPeriodicEventStream(List<StreamDataElement> data, Integer id, Integer pending, Date basetime, CustomData customData) {
        super();
        this.data = data;
        this.id = id;
        this.pending = pending;
        this.basetime = basetime;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public List<StreamDataElement> getData() {
        return data;
    }

    /**
     * 
     * (Required)
     */
    public void setData(List<StreamDataElement> data) {
        this.data = data;
    }

    /**
     * Id of stream.
     * 
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id of stream.
     * 
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Number of data elements still pending to be sent.
     * 
     * (Required)
     */
    public Integer getPending() {
        return pending;
    }

    /**
     * Number of data elements still pending to be sent.
     * 
     * (Required)
     */
    public void setPending(Integer pending) {
        this.pending = pending;
    }

    /**
     * Base timestamp to add to time offset of values.
     * 
     * (Required)
     */
    public Date getBasetime() {
        return basetime;
    }

    /**
     * Base timestamp to add to time offset of values.
     * 
     * (Required)
     */
    public void setBasetime(Date basetime) {
        this.basetime = basetime;
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
        if (!(obj instanceof NotifyPeriodicEventStream))
            return false;
        NotifyPeriodicEventStream that = (NotifyPeriodicEventStream) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id) 
                && Objects.equals(this.data, that.data) 
                && Objects.equals(this.basetime, that.basetime) 
                && Objects.equals(this.pending, that.pending);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.data != null ? this.data.hashCode() : 0);
        result = 31 * result + (this.basetime != null ? this.basetime.hashCode() : 0);
        result = 31 * result + (this.pending != null ? this.pending.hashCode() : 0);
        return result;
    }
}
