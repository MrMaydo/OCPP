
package maydo.ocpp.msgDef.DataTypes;

import java.util.Date;
import java.util.List;
import javax.annotation.Generated;


/**
 * Meter_ Value
 * urn:x-oca:ocpp:uid:2:233265
 * Collection of one or more sampled values in MeterValuesRequest and TransactionEvent. All sampled values in a MeterValue are sampled at the same point in time.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class MeterValue {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * 
     * (Required)
     * 
     */
    private List<SampledValue> sampledValue = null;
    /**
     * Meter_ Value. Timestamp. Date_ Time
     * urn:x-oca:ocpp:uid:1:569259
     * Timestamp for measured value(s).
     * 
     * (Required)
     * 
     */
    private Date timestamp;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<SampledValue> getSampledValue() {
        return sampledValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setSampledValue(List<SampledValue> sampledValue) {
        this.sampledValue = sampledValue;
    }

    /**
     * Meter_ Value. Timestamp. Date_ Time
     * urn:x-oca:ocpp:uid:1:569259
     * Timestamp for measured value(s).
     * 
     * (Required)
     * 
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Meter_ Value. Timestamp. Date_ Time
     * urn:x-oca:ocpp:uid:1:569259
     * Timestamp for measured value(s).
     * 
     * (Required)
     * 
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}
