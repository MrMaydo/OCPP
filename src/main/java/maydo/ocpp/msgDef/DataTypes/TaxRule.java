package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Part of ISO 15118-20 price schedule.
 * 
 * 
 * 
 */
public class TaxRule {

    /**
     * Id for the tax rule.
     * 
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
     * 
     * (Required)
     */
    @Required
    private Boolean appliesToEnergyFee;
    /**
     * Indicates whether this tax applies to Parking Fees.
     * 
     * 
     * (Required)
     */
    @Required
    private Boolean appliesToParkingFee;
    /**
     * Indicates whether this tax applies to Overstay Fees.
     * 
     * 
     * (Required)
     */
    @Required
    private Boolean appliesToOverstayFee;
    /**
     * Indicates whether this tax applies to Minimum/Maximum Cost.
     * 
     * 
     * (Required)
     */
    @Required
    private Boolean appliesToMinimumMaximumCost;
    /**
     * Part of ISO 15118-20 price schedule.
     * 
     * 
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
     * 
     * @param appliesToEnergyFee
     *     Indicates whether this tax applies to Energy Fees.
     *     .
     * @param taxRuleID
     *     Id for the tax rule.
     *     .
     * @param taxRuleName
     *     Human readable string to identify the tax rule.
     *     .
     * @param appliesToOverstayFee
     *     Indicates whether this tax applies to Overstay Fees.
     *     
     *     .
     * @param taxIncludedInPrice
     *     Indicates whether the tax is included in any price or not.
     *     .
     * @param appliesToParkingFee
     *     Indicates whether this tax applies to Parking Fees.
     *     
     *     .
     * @param appliesToMinimumMaximumCost
     *     Indicates whether this tax applies to Minimum/Maximum Cost.
     *     
     *     .
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
     * 
     * (Required)
     */
    public Integer getTaxRuleID() {
        return taxRuleID;
    }

    /**
     * Id for the tax rule.
     * 
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
     * 
     * (Required)
     */
    public Boolean getAppliesToEnergyFee() {
        return appliesToEnergyFee;
    }

    /**
     * Indicates whether this tax applies to Energy Fees.
     * 
     * (Required)
     */
    public void setAppliesToEnergyFee(Boolean appliesToEnergyFee) {
        this.appliesToEnergyFee = appliesToEnergyFee;
    }

    /**
     * Indicates whether this tax applies to Parking Fees.
     * 
     * 
     * (Required)
     */
    public Boolean getAppliesToParkingFee() {
        return appliesToParkingFee;
    }

    /**
     * Indicates whether this tax applies to Parking Fees.
     * 
     * 
     * (Required)
     */
    public void setAppliesToParkingFee(Boolean appliesToParkingFee) {
        this.appliesToParkingFee = appliesToParkingFee;
    }

    /**
     * Indicates whether this tax applies to Overstay Fees.
     * 
     * 
     * (Required)
     */
    public Boolean getAppliesToOverstayFee() {
        return appliesToOverstayFee;
    }

    /**
     * Indicates whether this tax applies to Overstay Fees.
     * 
     * 
     * (Required)
     */
    public void setAppliesToOverstayFee(Boolean appliesToOverstayFee) {
        this.appliesToOverstayFee = appliesToOverstayFee;
    }

    /**
     * Indicates whether this tax applies to Minimum/Maximum Cost.
     * 
     * 
     * (Required)
     */
    public Boolean getAppliesToMinimumMaximumCost() {
        return appliesToMinimumMaximumCost;
    }

    /**
     * Indicates whether this tax applies to Minimum/Maximum Cost.
     * 
     * 
     * (Required)
     */
    public void setAppliesToMinimumMaximumCost(Boolean appliesToMinimumMaximumCost) {
        this.appliesToMinimumMaximumCost = appliesToMinimumMaximumCost;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * 
     * 
     * (Required)
     */
    public RationalNumber getTaxRate() {
        return taxRate;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * 
     * 
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
