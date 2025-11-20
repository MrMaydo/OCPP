package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class EVPowerSchedule implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private List<EVPowerScheduleEntry> evPowerScheduleEntries;
    /**
     * The time that defines the starting point for the EVEnergyOffer.
     * <p>
     * (Required)
     */
    @Required
    private Date timeAnchor;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public EVPowerSchedule() {
    }

    /**
     * @param timeAnchor The time that defines the starting point for the EVEnergyOffer.
     *                   .
     */
    public EVPowerSchedule(List<EVPowerScheduleEntry> evPowerScheduleEntries, Date timeAnchor, CustomData customData) {
        super();
        this.evPowerScheduleEntries = evPowerScheduleEntries;
        this.timeAnchor = timeAnchor;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public List<EVPowerScheduleEntry> getEvPowerScheduleEntries() {
        return evPowerScheduleEntries;
    }

    /**
     * (Required)
     */
    public void setEvPowerScheduleEntries(List<EVPowerScheduleEntry> evPowerScheduleEntries) {
        this.evPowerScheduleEntries = evPowerScheduleEntries;
    }

    /**
     * The time that defines the starting point for the EVEnergyOffer.
     * <p>
     * (Required)
     */
    public Date getTimeAnchor() {
        return timeAnchor;
    }

    /**
     * The time that defines the starting point for the EVEnergyOffer.
     * <p>
     * (Required)
     */
    public void setTimeAnchor(Date timeAnchor) {
        this.timeAnchor = timeAnchor;
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
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
