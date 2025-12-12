package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * This contains the calculated usage of energy, charging time and idle time during a transaction.
 */
public class TotalUsage implements JsonInterface {

    /**
     *
     */
    @Required
    private Float energy;

    /**
     * Total duration of the charging session (including the duration of charging and not charging), in seconds.
     */
    @Required
    private Integer chargingTime;

    /**
     * Total duration of the charging session where the EV was not charging
     * (no energy was transferred between EVSE and EV), in seconds.
     */
    @Required
    private Integer idleTime;

    /**
     * Total time of reservation in seconds.
     */
    @Optional
    private Integer reservationTime;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TotalUsage() {
    }


    public TotalUsage(Float energy, Integer chargingTime, Integer idleTime, Integer reservationTime, CustomData customData) {
        super();
        this.energy = energy;
        this.chargingTime = chargingTime;
        this.idleTime = idleTime;
        this.reservationTime = reservationTime;
        this.customData = customData;
    }


    public Float getEnergy() {
        return energy;
    }


    public void setEnergy(Float energy) {
        this.energy = energy;
    }


    public Integer getChargingTime() {
        return chargingTime;
    }


    public void setChargingTime(Integer chargingTime) {
        this.chargingTime = chargingTime;
    }


    public Integer getIdleTime() {
        return idleTime;
    }


    public void setIdleTime(Integer idleTime) {
        this.idleTime = idleTime;
    }


    public Integer getReservationTime() {
        return reservationTime;
    }


    public void setReservationTime(Integer reservationTime) {
        this.reservationTime = reservationTime;
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
        json.addProperty("energy", energy);
        json.addProperty("chargingTime", chargingTime);
        json.addProperty("idleTime", idleTime);
        json.addProperty("reservationTime", reservationTime);
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
        if (jsonObject.has("energy")) {
            this.energy = jsonObject.get("energy").getAsFloat();
        }

        if (jsonObject.has("chargingTime")) {
            this.chargingTime = jsonObject.get("chargingTime").getAsInt();
        }

        if (jsonObject.has("idleTime")) {
            this.idleTime = jsonObject.get("idleTime").getAsInt();
        }

        if (jsonObject.has("reservationTime")) {
            this.reservationTime = jsonObject.get("reservationTime").getAsInt();
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
