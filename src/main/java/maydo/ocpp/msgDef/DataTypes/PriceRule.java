package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Part of ISO 15118-20 price schedule.
 */
public class PriceRule implements JsonInterface {

    /**
     * The duration of the parking fee period (in seconds).
     * When the time enters into a ParkingFeePeriod, the ParkingFee will apply to the session. .
     */
    @Optional
    private Integer parkingFeePeriod;
    /**
     * Number of grams of CO2 per kWh.
     */
    @Optional
    private Integer carbonDioxideEmission;
    /**
     * Percentage of the power that is created by renewable resources.
     */
    @Optional
    private Integer renewableGenerationPercentage;
    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private RationalNumber energyFee;
    /**
     * Part of ISO 15118-20 price schedule.
     */
    @Optional
    private RationalNumber parkingFee;
    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private RationalNumber powerRangeStart;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public PriceRule() {
    }

    /**
     * @param renewableGenerationPercentage Percentage of the power that is created by renewable resources.
     *                                      .
     * @param parkingFeePeriod              The duration of the parking fee period (in seconds).
     *                                      When the time enters into a ParkingFeePeriod, the ParkingFee will apply to the session. .
     *                                      .
     * @param carbonDioxideEmission         Number of grams of CO2 per kWh.
     *                                      .
     */
    public PriceRule(Integer parkingFeePeriod, Integer carbonDioxideEmission, Integer renewableGenerationPercentage, RationalNumber energyFee, RationalNumber parkingFee, RationalNumber powerRangeStart, CustomData customData) {
        super();
        this.parkingFeePeriod = parkingFeePeriod;
        this.carbonDioxideEmission = carbonDioxideEmission;
        this.renewableGenerationPercentage = renewableGenerationPercentage;
        this.energyFee = energyFee;
        this.parkingFee = parkingFee;
        this.powerRangeStart = powerRangeStart;
        this.customData = customData;
    }

    /**
     * The duration of the parking fee period (in seconds).
     * When the time enters into a ParkingFeePeriod, the ParkingFee will apply to the session. .
     */
    public Integer getParkingFeePeriod() {
        return parkingFeePeriod;
    }

    /**
     * The duration of the parking fee period (in seconds).
     * When the time enters into a ParkingFeePeriod, the ParkingFee will apply to the session. .
     */
    public void setParkingFeePeriod(Integer parkingFeePeriod) {
        this.parkingFeePeriod = parkingFeePeriod;
    }

    /**
     * Number of grams of CO2 per kWh.
     */
    public Integer getCarbonDioxideEmission() {
        return carbonDioxideEmission;
    }

    /**
     * Number of grams of CO2 per kWh.
     */
    public void setCarbonDioxideEmission(Integer carbonDioxideEmission) {
        this.carbonDioxideEmission = carbonDioxideEmission;
    }

    /**
     * Percentage of the power that is created by renewable resources.
     */
    public Integer getRenewableGenerationPercentage() {
        return renewableGenerationPercentage;
    }

    /**
     * Percentage of the power that is created by renewable resources.
     */
    public void setRenewableGenerationPercentage(Integer renewableGenerationPercentage) {
        this.renewableGenerationPercentage = renewableGenerationPercentage;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    public RationalNumber getEnergyFee() {
        return energyFee;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    public void setEnergyFee(RationalNumber energyFee) {
        this.energyFee = energyFee;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     */
    public RationalNumber getParkingFee() {
        return parkingFee;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     */
    public void setParkingFee(RationalNumber parkingFee) {
        this.parkingFee = parkingFee;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    public RationalNumber getPowerRangeStart() {
        return powerRangeStart;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    public void setPowerRangeStart(RationalNumber powerRangeStart) {
        this.powerRangeStart = powerRangeStart;
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
        json.addProperty("parkingFeePeriod", parkingFeePeriod);
        json.addProperty("carbonDioxideEmission", carbonDioxideEmission);
        json.addProperty("renewableGenerationPercentage", renewableGenerationPercentage);
        json.add("energyFee", energyFee.toJsonObject());
        json.add("parkingFee", parkingFee.toJsonObject());
        json.add("powerRangeStart", powerRangeStart.toJsonObject());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("parkingFeePeriod")) {
            this.parkingFeePeriod = jsonObject.get("parkingFeePeriod").getAsInt();
        }

        if (jsonObject.has("carbonDioxideEmission")) {
            this.carbonDioxideEmission = jsonObject.get("carbonDioxideEmission").getAsInt();
        }

        if (jsonObject.has("renewableGenerationPercentage")) {
            this.renewableGenerationPercentage = jsonObject.get("renewableGenerationPercentage").getAsInt();
        }

        if (jsonObject.has("energyFee")) {
            this.energyFee = new RationalNumber();
            this.energyFee.fromJsonObject(jsonObject.getAsJsonObject("energyFee"));
        }

        if (jsonObject.has("parkingFee")) {
            this.parkingFee = new RationalNumber();
            this.parkingFee.fromJsonObject(jsonObject.getAsJsonObject("parkingFee"));
        }

        if (jsonObject.has("powerRangeStart")) {
            this.powerRangeStart = new RationalNumber();
            this.powerRangeStart.fromJsonObject(jsonObject.getAsJsonObject("powerRangeStart"));
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
        if (!(obj instanceof PriceRule))
            return false;
        PriceRule that = (PriceRule) obj;
        return Objects.equals(this.renewableGenerationPercentage, that.renewableGenerationPercentage)
                && Objects.equals(this.parkingFee, that.parkingFee)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.parkingFeePeriod, that.parkingFeePeriod)
                && Objects.equals(this.energyFee, that.energyFee)
                && Objects.equals(this.powerRangeStart, that.powerRangeStart)
                && Objects.equals(this.carbonDioxideEmission, that.carbonDioxideEmission);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.renewableGenerationPercentage != null ? this.renewableGenerationPercentage.hashCode() : 0);
        result = 31 * result + (this.parkingFee != null ? this.parkingFee.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.parkingFeePeriod != null ? this.parkingFeePeriod.hashCode() : 0);
        result = 31 * result + (this.energyFee != null ? this.energyFee.hashCode() : 0);
        result = 31 * result + (this.powerRangeStart != null ? this.powerRangeStart.hashCode() : 0);
        result = 31 * result + (this.carbonDioxideEmission != null ? this.carbonDioxideEmission.hashCode() : 0);
        return result;
    }
}
