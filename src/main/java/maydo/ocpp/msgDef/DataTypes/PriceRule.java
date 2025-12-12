package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
     * When the time enters into a ParkingFeePeriod, the ParkingFee will apply to the session..
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
     * Cost per kWh. Use zero for free energy.
     */
    @Required
    private RationalNumber energyFee;

    /**
     * Cost of parking. Mandatory whenever a parking fee applies
     */
    @Optional
    private RationalNumber parkingFee;

    /**
     * For values 0 and above, this is the power level above which this price rule applies.
     * If there is another PriceRule with a higher value, and the current power is above that value,
     * then that other PriceRule applies.For negative values, this is the power level below which this price rule applies.
     * If there is another PriceRule with a lower value, and the current power is below that value, then that other PriceRule applies.
     */
    @Required
    private RationalNumber powerRangeStart;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public PriceRule() {
    }


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


    public Integer getParkingFeePeriod() {
        return parkingFeePeriod;
    }


    public void setParkingFeePeriod(Integer parkingFeePeriod) {
        this.parkingFeePeriod = parkingFeePeriod;
    }


    public Integer getCarbonDioxideEmission() {
        return carbonDioxideEmission;
    }


    public void setCarbonDioxideEmission(Integer carbonDioxideEmission) {
        this.carbonDioxideEmission = carbonDioxideEmission;
    }


    public Integer getRenewableGenerationPercentage() {
        return renewableGenerationPercentage;
    }


    public void setRenewableGenerationPercentage(Integer renewableGenerationPercentage) {
        this.renewableGenerationPercentage = renewableGenerationPercentage;
    }


    public RationalNumber getEnergyFee() {
        return energyFee;
    }


    public void setEnergyFee(RationalNumber energyFee) {
        this.energyFee = energyFee;
    }


    public RationalNumber getParkingFee() {
        return parkingFee;
    }


    public void setParkingFee(RationalNumber parkingFee) {
        this.parkingFee = parkingFee;
    }


    public RationalNumber getPowerRangeStart() {
        return powerRangeStart;
    }


    public void setPowerRangeStart(RationalNumber powerRangeStart) {
        this.powerRangeStart = powerRangeStart;
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
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
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
