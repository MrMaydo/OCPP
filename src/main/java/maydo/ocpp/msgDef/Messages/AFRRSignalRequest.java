package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.Objects;

public class AFRRSignalRequest implements JsonInterface  {

    /**
     * Time when signal becomes active.
     * 
     * (Required)
     */
    @Required
    private Date timestamp;
    /**
     * Value of signal in _v2xSignalWattCurve_. 
     * 
     * (Required)
     */
    @Required
    private Integer signal;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public AFRRSignalRequest() {
    }

    /**
     * 
     * @param signal
     *     Value of signal in _v2xSignalWattCurve_. 
     *     .
     * @param timestamp
     *     Time when signal becomes active.
     *     .
     */
    public AFRRSignalRequest(Date timestamp, Integer signal, CustomData customData) {
        super();
        this.timestamp = timestamp;
        this.signal = signal;
        this.customData = customData;
    }

    /**
     * Time when signal becomes active.
     * 
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Time when signal becomes active.
     * 
     * (Required)
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Value of signal in _v2xSignalWattCurve_. 
     * 
     * (Required)
     */
    public Integer getSignal() {
        return signal;
    }

    /**
     * Value of signal in _v2xSignalWattCurve_. 
     * 
     * (Required)
     */
    public void setSignal(Integer signal) {
        this.signal = signal;
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
        if (!(obj instanceof AFRRSignalRequest))
            return false;
        AFRRSignalRequest that = (AFRRSignalRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.signal, that.signal) 
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.signal != null ? this.signal.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
