package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class EVPowerSchedule implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private List<EVPowerScheduleEntry> evPowerScheduleEntries;
    /**
     * The time that defines the starting point for the EVEnergyOffer.
     * 
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
     * 
     * @param timeAnchor
     *     The time that defines the starting point for the EVEnergyOffer.
     *     .
     */
    public EVPowerSchedule(List<EVPowerScheduleEntry> evPowerScheduleEntries, Date timeAnchor, CustomData customData) {
        super();
        this.evPowerScheduleEntries = evPowerScheduleEntries;
        this.timeAnchor = timeAnchor;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public List<EVPowerScheduleEntry> getEvPowerScheduleEntries() {
        return evPowerScheduleEntries;
    }

    /**
     * 
     * (Required)
     */
    public void setEvPowerScheduleEntries(List<EVPowerScheduleEntry> evPowerScheduleEntries) {
        this.evPowerScheduleEntries = evPowerScheduleEntries;
    }

    /**
     * The time that defines the starting point for the EVEnergyOffer.
     * 
     * (Required)
     */
    public Date getTimeAnchor() {
        return timeAnchor;
    }

    /**
     * The time that defines the starting point for the EVEnergyOffer.
     * 
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
        return null;
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
