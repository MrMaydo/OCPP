package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the calculated usage of energy, charging time and idle time during a transaction.
 * 
 * 
 */
public class TotalUsage implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private Float energy;
    /**
     * Total duration of the charging session (including the duration of charging and not charging), in seconds.
     * 
     * 
     * 
     * (Required)
     */
    @Required
    private Integer chargingTime;
    /**
     * Total duration of the charging session where the EV was not charging (no energy was transferred between EVSE and EV), in seconds.
     * 
     * 
     * 
     * (Required)
     */
    @Required
    private Integer idleTime;
    /**
     * Total time of reservation in seconds.
     */
    @Optional
    private Integer reservationTime;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TotalUsage() {
    }

    /**
     * 
     * @param chargingTime
     *     Total duration of the charging session (including the duration of charging and not charging), in seconds.
     *     
     *     
     *     .
     * @param reservationTime
     *     Total time of reservation in seconds.
     *     .
     * @param idleTime
     *     Total duration of the charging session where the EV was not charging (no energy was transferred between EVSE and EV), in seconds.
     *     
     *     
     *     .
     */
    public TotalUsage(Float energy, Integer chargingTime, Integer idleTime, Integer reservationTime, CustomData customData) {
        super();
        this.energy = energy;
        this.chargingTime = chargingTime;
        this.idleTime = idleTime;
        this.reservationTime = reservationTime;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public Float getEnergy() {
        return energy;
    }

    /**
     * 
     * (Required)
     */
    public void setEnergy(Float energy) {
        this.energy = energy;
    }

    /**
     * Total duration of the charging session (including the duration of charging and not charging), in seconds.
     * 
     * 
     * 
     * (Required)
     */
    public Integer getChargingTime() {
        return chargingTime;
    }

    /**
     * Total duration of the charging session (including the duration of charging and not charging), in seconds.
     * 
     * 
     * 
     * (Required)
     */
    public void setChargingTime(Integer chargingTime) {
        this.chargingTime = chargingTime;
    }

    /**
     * Total duration of the charging session where the EV was not charging (no energy was transferred between EVSE and EV), in seconds.
     * 
     * 
     * 
     * (Required)
     */
    public Integer getIdleTime() {
        return idleTime;
    }

    /**
     * Total duration of the charging session where the EV was not charging (no energy was transferred between EVSE and EV), in seconds.
     * 
     * 
     * 
     * (Required)
     */
    public void setIdleTime(Integer idleTime) {
        this.idleTime = idleTime;
    }

    /**
     * Total time of reservation in seconds.
     */
    public Integer getReservationTime() {
        return reservationTime;
    }

    /**
     * Total time of reservation in seconds.
     */
    public void setReservationTime(Integer reservationTime) {
        this.reservationTime = reservationTime;
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
        if (!(obj instanceof TotalUsage))
            return false;
        TotalUsage that = (TotalUsage) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.idleTime, that.idleTime) 
                && Objects.equals(this.chargingTime, that.chargingTime) 
                && Objects.equals(this.energy, that.energy) 
                && Objects.equals(this.reservationTime, that.reservationTime);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.idleTime != null ? this.idleTime.hashCode() : 0);
        result = 31 * result + (this.chargingTime != null ? this.chargingTime.hashCode() : 0);
        result = 31 * result + (this.energy != null ? this.energy.hashCode() : 0);
        result = 31 * result + (this.reservationTime != null ? this.reservationTime.hashCode() : 0);
        return result;
    }
}
