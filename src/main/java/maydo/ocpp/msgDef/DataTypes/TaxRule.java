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
     * <p>
     * (Required)
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
     * <p>
     * (Required)
     */
    @Required
    private Boolean appliesToEnergyFee;
    /**
     * Indicates whether this tax applies to Parking Fees.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Boolean appliesToParkingFee;
    /**
     * Indicates whether this tax applies to Overstay Fees.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Boolean appliesToOverstayFee;
    /**
     * Indicates whether this tax applies to Minimum/Maximum Cost.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Boolean appliesToMinimumMaximumCost;
    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private RationalNumber taxRate;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TaxRule() {
    }

    /**
     * @param appliesToEnergyFee          Indicates whether this tax applies to Energy Fees.
     *                                    .
     * @param taxRuleID                   Id for the tax rule.
     *                                    .
     * @param taxRuleName                 Human readable string to identify the tax rule.
     *                                    .
     * @param appliesToOverstayFee        Indicates whether this tax applies to Overstay Fees.
     *                                    <p>
     *                                    .
     * @param taxIncludedInPrice          Indicates whether the tax is included in any price or not.
     *                                    .
     * @param appliesToParkingFee         Indicates whether this tax applies to Parking Fees.
     *                                    <p>
     *                                    .
     * @param appliesToMinimumMaximumCost Indicates whether this tax applies to Minimum/Maximum Cost.
     *                                    <p>
     *                                    .
     */
    public TaxRule(Integer taxRuleID, String taxRuleName, Boolean taxIncludedInPrice, Boolean appliesToEnergyFee, Boolean appliesToParkingFee, Boolean appliesToOverstayFee, Boolean appliesToMinimumMaximumCost, RationalNumber taxRate, CustomData customData) {
        super();
        this.taxRuleID = taxRuleID;
        this.taxRuleName = taxRuleName;
        this.taxIncludedInPrice = taxIncludedInPrice;
        this.appliesToEnergyFee = appliesToEnergyFee;
        this.appliesToParkingFee = appliesToParkingFee;
        this.appliesToOverstayFee = appliesToOverstayFee;
        this.appliesToMinimumMaximumCost = appliesToMinimumMaximumCost;
        this.taxRate = taxRate;
        this.customData = customData;
    }

    /**
     * Id for the tax rule.
     * <p>
     * (Required)
     */
    public Integer getTaxRuleID() {
        return taxRuleID;
    }

    /**
     * Id for the tax rule.
     * <p>
     * (Required)
     */
    public void setTaxRuleID(Integer taxRuleID) {
        this.taxRuleID = taxRuleID;
    }

    /**
     * Human readable string to identify the tax rule.
     */
    public String getTaxRuleName() {
        return taxRuleName;
    }

    /**
     * Human readable string to identify the tax rule.
     */
    public void setTaxRuleName(String taxRuleName) {
        this.taxRuleName = taxRuleName;
    }

    /**
     * Indicates whether the tax is included in any price or not.
     */
    public Boolean getTaxIncludedInPrice() {
        return taxIncludedInPrice;
    }

    /**
     * Indicates whether the tax is included in any price or not.
     */
    public void setTaxIncludedInPrice(Boolean taxIncludedInPrice) {
        this.taxIncludedInPrice = taxIncludedInPrice;
    }

    /**
     * Indicates whether this tax applies to Energy Fees.
     * <p>
     * (Required)
     */
    public Boolean getAppliesToEnergyFee() {
        return appliesToEnergyFee;
    }

    /**
     * Indicates whether this tax applies to Energy Fees.
     * <p>
     * (Required)
     */
    public void setAppliesToEnergyFee(Boolean appliesToEnergyFee) {
        this.appliesToEnergyFee = appliesToEnergyFee;
    }

    /**
     * Indicates whether this tax applies to Parking Fees.
     * <p>
     * <p>
     * (Required)
     */
    public Boolean getAppliesToParkingFee() {
        return appliesToParkingFee;
    }

    /**
     * Indicates whether this tax applies to Parking Fees.
     * <p>
     * <p>
     * (Required)
     */
    public void setAppliesToParkingFee(Boolean appliesToParkingFee) {
        this.appliesToParkingFee = appliesToParkingFee;
    }

    /**
     * Indicates whether this tax applies to Overstay Fees.
     * <p>
     * <p>
     * (Required)
     */
    public Boolean getAppliesToOverstayFee() {
        return appliesToOverstayFee;
    }

    /**
     * Indicates whether this tax applies to Overstay Fees.
     * <p>
     * <p>
     * (Required)
     */
    public void setAppliesToOverstayFee(Boolean appliesToOverstayFee) {
        this.appliesToOverstayFee = appliesToOverstayFee;
    }

    /**
     * Indicates whether this tax applies to Minimum/Maximum Cost.
     * <p>
     * <p>
     * (Required)
     */
    public Boolean getAppliesToMinimumMaximumCost() {
        return appliesToMinimumMaximumCost;
    }

    /**
     * Indicates whether this tax applies to Minimum/Maximum Cost.
     * <p>
     * <p>
     * (Required)
     */
    public void setAppliesToMinimumMaximumCost(Boolean appliesToMinimumMaximumCost) {
        this.appliesToMinimumMaximumCost = appliesToMinimumMaximumCost;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    public RationalNumber getTaxRate() {
        return taxRate;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    public void setTaxRate(RationalNumber taxRate) {
        this.taxRate = taxRate;
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
        json.addProperty("taxRuleID", taxRuleID);
        json.addProperty("taxRuleName", taxRuleName);
        json.addProperty("taxIncludedInPrice", taxIncludedInPrice);
        json.addProperty("appliesToEnergyFee", appliesToEnergyFee);
        json.addProperty("appliesToParkingFee", appliesToParkingFee);
        json.addProperty("appliesToOverstayFee", appliesToOverstayFee);
        json.addProperty("appliesToMinimumMaximumCost", appliesToMinimumMaximumCost);
        json.add("taxRate", taxRate.toJsonObject());
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
        if (jsonObject.has("taxRuleID")) {
            this.taxRuleID = jsonObject.get("taxRuleID").getAsInt();
        }

        if (jsonObject.has("taxRuleName")) {
            this.taxRuleName = jsonObject.get("taxRuleName").getAsString();
        }

        if (jsonObject.has("taxIncludedInPrice")) {
            this.taxIncludedInPrice = jsonObject.get("taxIncludedInPrice").getAsBoolean();
        }

        if (jsonObject.has("appliesToEnergyFee")) {
            this.appliesToEnergyFee = jsonObject.get("appliesToEnergyFee").getAsBoolean();
        }

        if (jsonObject.has("appliesToParkingFee")) {
            this.appliesToParkingFee = jsonObject.get("appliesToParkingFee").getAsBoolean();
        }

        if (jsonObject.has("appliesToOverstayFee")) {
            this.appliesToOverstayFee = jsonObject.get("appliesToOverstayFee").getAsBoolean();
        }

        if (jsonObject.has("appliesToMinimumMaximumCost")) {
            this.appliesToMinimumMaximumCost = jsonObject.get("appliesToMinimumMaximumCost").getAsBoolean();
        }

        if (jsonObject.has("taxRate")) {
            this.taxRate = new RationalNumber();
            this.taxRate.fromJsonObject(jsonObject.getAsJsonObject("taxRate"));
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
        if (!(obj instanceof TaxRule))
            return false;
        TaxRule that = (TaxRule) obj;
        return Objects.equals(this.appliesToEnergyFee, that.appliesToEnergyFee)
                && Objects.equals(this.taxRate, that.taxRate)
                && Objects.equals(this.taxRuleID, that.taxRuleID)
                && Objects.equals(this.taxRuleName, that.taxRuleName)
                && Objects.equals(this.appliesToOverstayFee, that.appliesToOverstayFee)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.taxIncludedInPrice, that.taxIncludedInPrice)
                && Objects.equals(this.appliesToParkingFee, that.appliesToParkingFee)
                && Objects.equals(this.appliesToMinimumMaximumCost, that.appliesToMinimumMaximumCost);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.appliesToEnergyFee != null ? this.appliesToEnergyFee.hashCode() : 0);
        result = 31 * result + (this.taxRate != null ? this.taxRate.hashCode() : 0);
        result = 31 * result + (this.taxRuleID != null ? this.taxRuleID.hashCode() : 0);
        result = 31 * result + (this.taxRuleName != null ? this.taxRuleName.hashCode() : 0);
        result = 31 * result + (this.appliesToOverstayFee != null ? this.appliesToOverstayFee.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.taxIncludedInPrice != null ? this.taxIncludedInPrice.hashCode() : 0);
        result = 31 * result + (this.appliesToParkingFee != null ? this.appliesToParkingFee.hashCode() : 0);
        result = 31 * result + (this.appliesToMinimumMaximumCost != null ? this.appliesToMinimumMaximumCost.hashCode() : 0);
        return result;
    }
}
