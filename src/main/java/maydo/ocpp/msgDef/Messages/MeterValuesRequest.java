package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.MeterValue;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;


/**
 * Request_ Body
 * urn:x-enexis:ecdm:uid:2:234744
 */
public class MeterValuesRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Request_ Body. EVSEID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:571101
     * This contains a number (&gt;0) designating an EVSE of the Charging Station. ‘0’ (zero) is used to designate the main power meter.
     * <p>
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * (Required)
     */
    @Required
    private List<MeterValue> meterValue = null;

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

    /**
     * Request_ Body. EVSEID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:571101
     * This contains a number (&gt;0) designating an EVSE of the Charging Station. ‘0’ (zero) is used to designate the main power meter.
     * <p>
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * Request_ Body. EVSEID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:571101
     * This contains a number (&gt;0) designating an EVSE of the Charging Station. ‘0’ (zero) is used to designate the main power meter.
     * <p>
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * (Required)
     */
    public List<MeterValue> getMeterValue() {
        return meterValue;
    }

    /**
     * (Required)
     */
    public void setMeterValue(List<MeterValue> meterValue) {
        this.meterValue = meterValue;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof MeterValuesRequest))
            return false;
        MeterValuesRequest that = (MeterValuesRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(evseId, that.evseId)
                && Objects.equals(meterValue, that.meterValue);
    }

    @Override
    public int hashCode() {
        int result = (evseId != null ? evseId.hashCode() : 0);
        result = 31 * result + (meterValue != null ? meterValue.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
