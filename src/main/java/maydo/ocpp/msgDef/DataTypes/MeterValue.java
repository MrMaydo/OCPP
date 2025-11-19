package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MeterValue {

    /**
     * 
     * (Required)
     */
    @Required
    private List<SampledValue> sampledValue;
    /**
     * Timestamp for measured value(s).
     * 
     * (Required)
     */
    @Required
    private Date timestamp;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public MeterValue() {
    }

    /**
     * 
     * @param timestamp
     *     Timestamp for measured value(s).
     *     .
     */
    public MeterValue(List<SampledValue> sampledValue, Date timestamp, CustomData customData) {
        super();
        this.sampledValue = sampledValue;
        this.timestamp = timestamp;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public List<SampledValue> getSampledValue() {
        return sampledValue;
    }

    /**
     * 
     * (Required)
     */
    public void setSampledValue(List<SampledValue> sampledValue) {
        this.sampledValue = sampledValue;
    }

    /**
     * Timestamp for measured value(s).
     * 
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp for measured value(s).
     * 
     * (Required)
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof MeterValue))
            return false;
        MeterValue that = (MeterValue) obj;
        return Objects.equals(this.sampledValue, that.sampledValue)
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.sampledValue != null ? this.sampledValue.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
