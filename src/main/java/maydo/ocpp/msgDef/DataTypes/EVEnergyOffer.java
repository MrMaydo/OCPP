package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * *(2.1)* A schedule of the energy amount over time that EV is willing to discharge. A negative value indicates the willingness to discharge under specific conditions, a positive value indicates that the EV currently is not able to offer energy to discharge.
 */
public class EVEnergyOffer implements JsonInterface {

    /**
     * *(2.1)* Price schedule of EV energy offer.
     */
    @Optional
    private EVAbsolutePriceSchedule evAbsolutePriceSchedule;
    /**
     * *(2.1)* Schedule of EV energy offer.
     * <p>
     * (Required)
     */
    @Required
    private EVPowerSchedule evPowerSchedule;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public EVEnergyOffer() {
    }

    public EVEnergyOffer(EVAbsolutePriceSchedule evAbsolutePriceSchedule, EVPowerSchedule evPowerSchedule, CustomData customData) {
        super();
        this.evAbsolutePriceSchedule = evAbsolutePriceSchedule;
        this.evPowerSchedule = evPowerSchedule;
        this.customData = customData;
    }

    /**
     * *(2.1)* Price schedule of EV energy offer.
     */
    public EVAbsolutePriceSchedule getEvAbsolutePriceSchedule() {
        return evAbsolutePriceSchedule;
    }

    /**
     * *(2.1)* Price schedule of EV energy offer.
     */
    public void setEvAbsolutePriceSchedule(EVAbsolutePriceSchedule evAbsolutePriceSchedule) {
        this.evAbsolutePriceSchedule = evAbsolutePriceSchedule;
    }

    /**
     * *(2.1)* Schedule of EV energy offer.
     * <p>
     * (Required)
     */
    public EVPowerSchedule getEvPowerSchedule() {
        return evPowerSchedule;
    }

    /**
     * *(2.1)* Schedule of EV energy offer.
     * <p>
     * (Required)
     */
    public void setEvPowerSchedule(EVPowerSchedule evPowerSchedule) {
        this.evPowerSchedule = evPowerSchedule;
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
        json.add("evAbsolutePriceSchedule", evAbsolutePriceSchedule.toJsonObject());
        json.add("evPowerSchedule", evPowerSchedule.toJsonObject());
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
        if (jsonObject.has("evAbsolutePriceSchedule")) {
            this.evAbsolutePriceSchedule = new EVAbsolutePriceSchedule();
            this.evAbsolutePriceSchedule.fromJsonObject(jsonObject.getAsJsonObject("evAbsolutePriceSchedule"));
        }

        if (jsonObject.has("evPowerSchedule")) {
            this.evPowerSchedule = new EVPowerSchedule();
            this.evPowerSchedule.fromJsonObject(jsonObject.getAsJsonObject("evPowerSchedule"));
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
        if (!(obj instanceof EVEnergyOffer))
            return false;
        EVEnergyOffer that = (EVEnergyOffer) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.evPowerSchedule, that.evPowerSchedule)
                && Objects.equals(this.evAbsolutePriceSchedule, that.evAbsolutePriceSchedule);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.evPowerSchedule != null ? this.evPowerSchedule.hashCode() : 0);
        result = 31 * result + (this.evAbsolutePriceSchedule != null ? this.evAbsolutePriceSchedule.hashCode() : 0);
        return result;
    }
}
