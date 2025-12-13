package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
 * (2.1) Schedule of EV energy offer.
 */
public class EVPowerSchedule implements JsonInterface {

    /**
     * List of EVPowerScheduleEntries.
     */
    @Required
    private List<EVPowerScheduleEntry> evPowerScheduleEntries;

    /**
     * The time that defines the starting point for the EVEnergyOffer.
     */
    @Required
    private Date timeAnchor;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public EVPowerSchedule() {
    }


    public List<EVPowerScheduleEntry> getEvPowerScheduleEntries() {
        return evPowerScheduleEntries;
    }


    public void setEvPowerScheduleEntries(List<EVPowerScheduleEntry> evPowerScheduleEntries) {
        this.evPowerScheduleEntries = evPowerScheduleEntries;
    }


    public Date getTimeAnchor() {
        return timeAnchor;
    }


    public void setTimeAnchor(Date timeAnchor) {
        this.timeAnchor = timeAnchor;
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
        json.addProperty("timeAnchor", new SimpleDateFormat(DATE_FORMAT).format(timeAnchor));
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
        if (jsonObject.has("evPowerScheduleEntries")) {
            setEvPowerScheduleEntries(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("evPowerScheduleEntries");
            for (JsonElement el : arr) {
                EVPowerScheduleEntry item = new EVPowerScheduleEntry();
                item.fromJsonObject(el.getAsJsonObject());
                getEvPowerScheduleEntries().add(item);
            }
        }

        if (jsonObject.has("timeAnchor")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setTimeAnchor(dateFormat.parse(jsonObject.get("timeAnchor").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for timeAnchor" + e);
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
        if (!(obj instanceof EVPowerSchedule))
            return false;
        EVPowerSchedule that = (EVPowerSchedule) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.evPowerScheduleEntries, that.evPowerScheduleEntries)
                && Objects.equals(this.timeAnchor, that.timeAnchor);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.evPowerScheduleEntries != null ? this.evPowerScheduleEntries.hashCode() : 0);
        result = 31 * result + (this.timeAnchor != null ? this.timeAnchor.hashCode() : 0);
        return result;
    }
}
