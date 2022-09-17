
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.MeterValue;

import java.util.List;
import javax.annotation.Generated;


/**
 * Request_ Body
 * urn:x-enexis:ecdm:uid:2:234744
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class MeterValuesRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Request_ Body. EVSEID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:571101
     * This contains a number (&gt;0) designating an EVSE of the Charging Station. ‘0’ (zero) is used to designate the main power meter.
     * 
     * (Required)
     * 
     */
    private Integer evseId;
    /**
     * 
     * (Required)
     * 
     */
    private List<MeterValue> meterValue = null;

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
     * Request_ Body. EVSEID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:571101
     * This contains a number (&gt;0) designating an EVSE of the Charging Station. ‘0’ (zero) is used to designate the main power meter.
     * 
     * (Required)
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * Request_ Body. EVSEID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:571101
     * This contains a number (&gt;0) designating an EVSE of the Charging Station. ‘0’ (zero) is used to designate the main power meter.
     * 
     * (Required)
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<MeterValue> getMeterValue() {
        return meterValue;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setMeterValue(List<MeterValue> meterValue) {
        this.meterValue = meterValue;
    }

}
