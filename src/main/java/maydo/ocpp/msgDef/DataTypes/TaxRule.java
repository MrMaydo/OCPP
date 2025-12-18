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
public class TaxRule implements JsonInterface {

    /**
     * Id for the tax rule.
     */
    @Required
    private Integer taxRuleID;

    /**
     * Human readable string to identify the tax rule.
     */
    @Optional
    private String taxRuleName;

    /**
     * Indicates whether the tax is included in any price or not.
     */
    @Optional
    private Boolean taxIncludedInPrice;

    /**
     * Indicates whether this tax applies to Energy Fees.
     */
    @Required
    private Boolean appliesToEnergyFee;

    /**
     * Indicates whether this tax applies to Parking Fees
     */
    @Required
    private Boolean appliesToParkingFee;

    /**
     * Indicates whether this tax applies to Overstay Fees.
     */
    @Required
    private Boolean appliesToOverstayFee;

    /**
     * Indicates whether this tax applies to Minimum/Maximum Cost.
     */
    @Required
    private Boolean appliesToMinimumMaximumCost;

    /**
     * Percentage of the total amount of applying fee (energy, parking, overstay, MinimumCost and/or MaximumCost).
     */
    @Required
    private RationalNumber taxRate;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TaxRule() {
    }


    public Integer getTaxRuleID() {
        return taxRuleID;
    }


    public void setTaxRuleID(Integer taxRuleID) {
        this.taxRuleID = taxRuleID;
    }


    public String getTaxRuleName() {
        return taxRuleName;
    }


    public void setTaxRuleName(String taxRuleName) {
        this.taxRuleName = taxRuleName;
    }


    public Boolean getTaxIncludedInPrice() {
        return taxIncludedInPrice;
    }


    public void setTaxIncludedInPrice(Boolean taxIncludedInPrice) {
        this.taxIncludedInPrice = taxIncludedInPrice;
    }


    public Boolean getAppliesToEnergyFee() {
        return appliesToEnergyFee;
    }


    public void setAppliesToEnergyFee(Boolean appliesToEnergyFee) {
        this.appliesToEnergyFee = appliesToEnergyFee;
    }


    public Boolean getAppliesToParkingFee() {
        return appliesToParkingFee;
    }


    public void setAppliesToParkingFee(Boolean appliesToParkingFee) {
        this.appliesToParkingFee = appliesToParkingFee;
    }


    public Boolean getAppliesToOverstayFee() {
        return appliesToOverstayFee;
    }


    public void setAppliesToOverstayFee(Boolean appliesToOverstayFee) {
        this.appliesToOverstayFee = appliesToOverstayFee;
    }


    public Boolean getAppliesToMinimumMaximumCost() {
        return appliesToMinimumMaximumCost;
    }


    public void setAppliesToMinimumMaximumCost(Boolean appliesToMinimumMaximumCost) {
        this.appliesToMinimumMaximumCost = appliesToMinimumMaximumCost;
    }


    public RationalNumber getTaxRate() {
        return taxRate;
    }


    public void setTaxRate(RationalNumber taxRate) {
        this.taxRate = taxRate;
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

        json.addProperty("taxRuleID", getTaxRuleID());

        if (getTaxRuleName() != null) {
            json.addProperty("taxRuleName", getTaxRuleName());
        }
        if (getTaxIncludedInPrice() != null) {
            json.addProperty("taxIncludedInPrice", getTaxIncludedInPrice());
        }
        json.addProperty("appliesToEnergyFee", getAppliesToEnergyFee());

        json.addProperty("appliesToParkingFee", getAppliesToParkingFee());

        json.addProperty("appliesToOverstayFee", getAppliesToOverstayFee());

        json.addProperty("appliesToMinimumMaximumCost", getAppliesToMinimumMaximumCost());

        json.add("taxRate", getTaxRate().toJsonObject());

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
        if (jsonObject.has("taxRuleID")) {
            setTaxRuleID(jsonObject.get("taxRuleID").getAsInt());
        }

        if (jsonObject.has("taxRuleName")) {
            setTaxRuleName(jsonObject.get("taxRuleName").getAsString());
        }

        if (jsonObject.has("taxIncludedInPrice")) {
            setTaxIncludedInPrice(jsonObject.get("taxIncludedInPrice").getAsBoolean());
        }

        if (jsonObject.has("appliesToEnergyFee")) {
            setAppliesToEnergyFee(jsonObject.get("appliesToEnergyFee").getAsBoolean());
        }

        if (jsonObject.has("appliesToParkingFee")) {
            setAppliesToParkingFee(jsonObject.get("appliesToParkingFee").getAsBoolean());
        }

        if (jsonObject.has("appliesToOverstayFee")) {
            setAppliesToOverstayFee(jsonObject.get("appliesToOverstayFee").getAsBoolean());
        }

        if (jsonObject.has("appliesToMinimumMaximumCost")) {
            setAppliesToMinimumMaximumCost(jsonObject.get("appliesToMinimumMaximumCost").getAsBoolean());
        }

        if (jsonObject.has("taxRate")) {
            setTaxRate(new RationalNumber());
            getTaxRate().fromJsonObject(jsonObject.getAsJsonObject("taxRate"));
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
        if (!(obj instanceof TaxRule))
            return false;
        TaxRule that = (TaxRule) obj;
        return Objects.equals(getTaxRuleID(), that.getTaxRuleID())
                && Objects.equals(getTaxRuleName(), that.getTaxRuleName())
                && Objects.equals(getTaxIncludedInPrice(), that.getTaxIncludedInPrice())
                && Objects.equals(getAppliesToEnergyFee(), that.getAppliesToEnergyFee())
                && Objects.equals(getAppliesToParkingFee(), that.getAppliesToParkingFee())
                && Objects.equals(getAppliesToOverstayFee(), that.getAppliesToOverstayFee())
                && Objects.equals(getAppliesToMinimumMaximumCost(), that.getAppliesToMinimumMaximumCost())
                && Objects.equals(getTaxRate(), that.getTaxRate())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getTaxRuleID(),
                getTaxRuleName(),
                getTaxIncludedInPrice(),
                getAppliesToEnergyFee(),
                getAppliesToParkingFee(),
                getAppliesToOverstayFee(),
                getAppliesToMinimumMaximumCost(),
                getTaxRate(),
                getCustomData()
        );
    }
}
