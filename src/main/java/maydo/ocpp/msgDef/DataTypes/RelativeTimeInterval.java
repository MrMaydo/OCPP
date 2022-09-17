
package maydo.ocpp.msgDef.DataTypes;

import javax.annotation.Generated;


/**
 * Relative_ Timer_ Interval
 * urn:x-oca:ocpp:uid:2:233270
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class RelativeTimeInterval {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Relative_ Timer_ Interval. Start. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569279
     * Start of the interval, in seconds from NOW.
     * 
     * (Required)
     * 
     */
    private Integer start;
    /**
     * Relative_ Timer_ Interval. Duration. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569280
     * Duration of the interval, in seconds.
     * 
     * 
     */
    private Integer duration;

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
     * Relative_ Timer_ Interval. Start. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569279
     * Start of the interval, in seconds from NOW.
     * 
     * (Required)
     * 
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Relative_ Timer_ Interval. Start. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569279
     * Start of the interval, in seconds from NOW.
     * 
     * (Required)
     * 
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * Relative_ Timer_ Interval. Duration. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569280
     * Duration of the interval, in seconds.
     * 
     * 
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Relative_ Timer_ Interval. Duration. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569280
     * Duration of the interval, in seconds.
     * 
     * 
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}
