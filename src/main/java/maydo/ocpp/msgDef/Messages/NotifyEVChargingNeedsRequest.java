package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingNeeds;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 *The Charging Station uses this message to communicate the charging needs as calculated by the EV to the CSMS.
 */
public class NotifyEVChargingNeedsRequest implements JsonInterface {

    /**
     * Defines the EVSE and connector to which the EV is connected. EvseId may not be 0.
     */
    @Required
    private Integer evseId;

    /**
     * Contains the maximum elements the EV supports for:
     * <p> - ISO 15118-2: schedule tuples in SASchedule (both Pmax and Tariff). </p>
     * <p> - ISO 15118-20: PowerScheduleEntry, PriceRule and PriceLevelScheduleEntries.</p>
     */
    @Optional
    private Integer maxScheduleTuples;

    /**
     * The characteristics of the energy delivery required.
     */
    @Required
    private ChargingNeeds chargingNeeds;

    /**
     * (2.1) Time when EV charging needs were received.
     * Field can be added when charging station was offline when charging needs were received.
     */
    @Optional
    private Date timestamp;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyEVChargingNeedsRequest() {
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public Integer getMaxScheduleTuples() {
        return maxScheduleTuples;
    }


    public void setMaxScheduleTuples(Integer maxScheduleTuples) {
        this.maxScheduleTuples = maxScheduleTuples;
    }


    public ChargingNeeds getChargingNeeds() {
        return chargingNeeds;
    }


    public void setChargingNeeds(ChargingNeeds chargingNeeds) {
        this.chargingNeeds = chargingNeeds;
    }


    public Date getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
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
        json.addProperty("maxScheduleTuples", maxScheduleTuples);
        json.add("chargingNeeds", chargingNeeds.toJsonObject());
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
        if (jsonObject.has("evseId")) {
            this.evseId = jsonObject.get("evseId").getAsInt();
        }

        if (jsonObject.has("maxScheduleTuples")) {
            this.maxScheduleTuples = jsonObject.get("maxScheduleTuples").getAsInt();
        }

        if (jsonObject.has("chargingNeeds")) {
            this.chargingNeeds = new ChargingNeeds();
            this.chargingNeeds.fromJsonObject(jsonObject.getAsJsonObject("chargingNeeds"));
        }

        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.timestamp = dateFormat.parse(jsonObject.get("timestamp").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof NotifyEVChargingNeedsRequest))
            return false;
        NotifyEVChargingNeedsRequest that = (NotifyEVChargingNeedsRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.maxScheduleTuples, that.maxScheduleTuples)
                && Objects.equals(this.chargingNeeds, that.chargingNeeds)
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.maxScheduleTuples != null ? this.maxScheduleTuples.hashCode() : 0);
        result = 31 * result + (this.chargingNeeds != null ? this.chargingNeeds.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
