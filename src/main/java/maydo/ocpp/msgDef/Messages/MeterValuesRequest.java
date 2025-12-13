package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.MeterValue;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the MeterValuesRequest PDU sent by the Charging Station to the CSMS. This message might be
 * removed in a future version of OCPP. It will be replaced by Device Management Monitoring events.
 */
public class MeterValuesRequest implements JsonInterface {

    /**
     * This contains a number (>0) designating an EVSE of the Charging Station.
     * ‘0’ (zero) is used to designate the main power meter.
     */
    @Required
    private Integer evseId;

    /**
     * The sampled meter values with timestamps.
     * The following Configuration Variables are used to configure which measurands are sent:
     * <p> -  AlignedDataMeasurands </p>
     * <p> - AlignedDataUpstreamMeasurands </p>
     */
    @Required
    private List<MeterValue> meterValue;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public MeterValuesRequest() {
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public List<MeterValue> getMeterValue() {
        return meterValue;
    }


    public void setMeterValue(List<MeterValue> meterValue) {
        this.meterValue = meterValue;
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
        json.addProperty("evseId", evseId);
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
        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
        }

        if (jsonObject.has("meterValue")) {
            setMeterValue(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("meterValue");
            for (JsonElement el : arr) {
                MeterValue item = new MeterValue();
                item.fromJsonObject(el.getAsJsonObject());
                getMeterValue().add(item);
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
        if (!(obj instanceof MeterValuesRequest))
            return false;
        MeterValuesRequest that = (MeterValuesRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.meterValue, that.meterValue);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.meterValue != null ? this.meterValue.hashCode() : 0);
        return result;
    }
}
