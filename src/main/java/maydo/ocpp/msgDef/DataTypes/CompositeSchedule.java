package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.ChargingRateUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 *
 */
public class CompositeSchedule implements JsonInterface {

    /**
     *
     */
    @Required
    private Integer evseId;

    /**
     *
     */
    @Required
    private Integer duration;

    /**
     *
     */
    @Required
    private Date scheduleStart;

    /**
     *
     */
    @Required
    private ChargingRateUnitEnum chargingRateUnit;

    /**
     * List of ChargingSchedulePeriod elements defining maximum power or current over time.
     */
    @Required
    private List<ChargingSchedulePeriod> chargingSchedulePeriod;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CompositeSchedule() {
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public Integer getDuration() {
        return duration;
    }


    public void setDuration(Integer duration) {
        this.duration = duration;
    }


    public Date getScheduleStart() {
        return scheduleStart;
    }


    public void setScheduleStart(Date scheduleStart) {
        this.scheduleStart = scheduleStart;
    }


    public ChargingRateUnitEnum getChargingRateUnit() {
        return chargingRateUnit;
    }


    public void setChargingRateUnit(ChargingRateUnitEnum chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }


    public List<ChargingSchedulePeriod> getChargingSchedulePeriod() {
        return chargingSchedulePeriod;
    }


    public void setChargingSchedulePeriod(List<ChargingSchedulePeriod> chargingSchedulePeriod) {
        this.chargingSchedulePeriod = chargingSchedulePeriod;
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

        json.addProperty("evseId", getEvseId());

        json.addProperty("duration", getDuration());

        json.addProperty("scheduleStart", new SimpleDateFormat(DATE_FORMAT).format(getScheduleStart()));

        json.addProperty("chargingRateUnit", getChargingRateUnit().toString());

        JsonArray chargingSchedulePeriodArray = new JsonArray();
        for (ChargingSchedulePeriod item : getChargingSchedulePeriod()) {
            chargingSchedulePeriodArray.add(item.toJsonObject());
        }
        json.add("chargingSchedulePeriod", chargingSchedulePeriodArray);

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
        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
        }

        if (jsonObject.has("duration")) {
            setDuration(jsonObject.get("duration").getAsInt());
        }

        if (jsonObject.has("scheduleStart")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setScheduleStart(dateFormat.parse(jsonObject.get("scheduleStart").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for scheduleStart" + e);
            }
        }

        if (jsonObject.has("chargingRateUnit")) {
            setChargingRateUnit(ChargingRateUnitEnum.valueOf(jsonObject.get("chargingRateUnit").getAsString()));
        }

        if (jsonObject.has("chargingSchedulePeriod")) {
            setChargingSchedulePeriod(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("chargingSchedulePeriod");
            for (JsonElement el : arr) {
                ChargingSchedulePeriod item = new ChargingSchedulePeriod();
                item.fromJsonObject(el.getAsJsonObject());
                getChargingSchedulePeriod().add(item);
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
        if (!(obj instanceof CompositeSchedule))
            return false;
        CompositeSchedule that = (CompositeSchedule) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.duration, that.duration)
                && Objects.equals(this.scheduleStart, that.scheduleStart)
                && Objects.equals(this.chargingSchedulePeriod, that.chargingSchedulePeriod)
                && Objects.equals(this.chargingRateUnit, that.chargingRateUnit)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.duration != null ? this.duration.hashCode() : 0);
        result = 31 * result + (this.scheduleStart != null ? this.scheduleStart.hashCode() : 0);
        result = 31 * result + (this.chargingSchedulePeriod != null ? this.chargingSchedulePeriod.hashCode() : 0);
        result = 31 * result + (this.chargingRateUnit != null ? this.chargingRateUnit.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
