package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingSchedule;
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
 * The Charging Station uses this message to communicate the charging schedule as calculated by the EV to the CSMS.
 */
public class NotifyEVChargingScheduleRequest implements JsonInterface {

    /**
     * Periods contained in the charging profile are relative to this point in time.
     */
    @Required
    private Date timeBase;

    /**
     * Planned energy consumption of the EV over time. Always relative to timeBase.
     */
    @Required
    private ChargingSchedule chargingSchedule;

    /**
     * The charging schedule contained in this notification applies to an EVSE. EvseId must be > 0.
     */
    @Required
    private Integer evseId;

    /**
     * (2.1) Id of the chargingSchedule that EV selected from the provided ChargingProfile.
     */
    @Optional
    private Integer selectedChargingScheduleId;

    /**
     * (2.1) True when power tolerance is accepted by EV.
     * This value is taken from EVPowerProfile.PowerToleranceAcceptance in the ISO 15118-20 PowerDeliverReq message..
     */
    @Optional
    private Boolean powerToleranceAcceptance;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyEVChargingScheduleRequest() {
    }


    public Date getTimeBase() {
        return timeBase;
    }


    public void setTimeBase(Date timeBase) {
        this.timeBase = timeBase;
    }


    public ChargingSchedule getChargingSchedule() {
        return chargingSchedule;
    }


    public void setChargingSchedule(ChargingSchedule chargingSchedule) {
        this.chargingSchedule = chargingSchedule;
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public Integer getSelectedChargingScheduleId() {
        return selectedChargingScheduleId;
    }


    public void setSelectedChargingScheduleId(Integer selectedChargingScheduleId) {
        this.selectedChargingScheduleId = selectedChargingScheduleId;
    }


    public Boolean getPowerToleranceAcceptance() {
        return powerToleranceAcceptance;
    }


    public void setPowerToleranceAcceptance(Boolean powerToleranceAcceptance) {
        this.powerToleranceAcceptance = powerToleranceAcceptance;
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

        json.addProperty("timeBase", new SimpleDateFormat(DATE_FORMAT).format(getTimeBase()));

        json.add("chargingSchedule", getChargingSchedule().toJsonObject());

        json.addProperty("evseId", getEvseId());

        if (getSelectedChargingScheduleId() != null) {
            json.addProperty("selectedChargingScheduleId", getSelectedChargingScheduleId());
        }
        if (getPowerToleranceAcceptance() != null) {
            json.addProperty("powerToleranceAcceptance", getPowerToleranceAcceptance());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("timeBase")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setTimeBase(dateFormat.parse(jsonObject.get("timeBase").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for timeBase" + e);
            }
        }

        if (jsonObject.has("chargingSchedule")) {
            setChargingSchedule(new ChargingSchedule());
            getChargingSchedule().fromJsonObject(jsonObject.getAsJsonObject("chargingSchedule"));
        }

        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
        }

        if (jsonObject.has("selectedChargingScheduleId")) {
            setSelectedChargingScheduleId(jsonObject.get("selectedChargingScheduleId").getAsInt());
        }

        if (jsonObject.has("powerToleranceAcceptance")) {
            setPowerToleranceAcceptance(jsonObject.get("powerToleranceAcceptance").getAsBoolean());
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
        if (!(obj instanceof NotifyEVChargingScheduleRequest))
            return false;
        NotifyEVChargingScheduleRequest that = (NotifyEVChargingScheduleRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.chargingSchedule, that.chargingSchedule)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.timeBase, that.timeBase)
                && Objects.equals(this.selectedChargingScheduleId, that.selectedChargingScheduleId)
                && Objects.equals(this.powerToleranceAcceptance, that.powerToleranceAcceptance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getTimeBase(),
                getChargingSchedule(),
                getEvseId(),
                getSelectedChargingScheduleId(),
                getPowerToleranceAcceptance(),
                getCustomData()
        );
    }
}
