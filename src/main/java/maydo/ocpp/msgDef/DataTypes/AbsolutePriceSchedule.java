package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class AbsolutePriceSchedule implements JsonInterface {

    /**
     * Starting point of price schedule.
     * <p>
     * (Required)
     */
    @Required
    private Date timeAnchor;
    /**
     * Unique ID of price schedule
     * <p>
     * (Required)
     */
    @Required
    private Integer priceScheduleID;
    /**
     * Description of the price schedule.
     */
    @Optional
    private String priceScheduleDescription;
    /**
     * Currency according to ISO 4217.
     * <p>
     * (Required)
     */
    @Required
    private String currency;
    /**
     * String that indicates what language is used for the human readable strings in the price schedule. Based on ISO 639.
     * <p>
     * (Required)
     */
    @Required
    private String language;
    /**
     * A string in URN notation which shall uniquely identify an algorithm that defines how to compute an energy fee sum for a specific power profile based on the EnergyFee information from the PriceRule elements.
     * <p>
     * (Required)
     */
    @Required
    private String priceAlgorithm;
    /**
     * Part of ISO 15118-20 price schedule.
     */
    @Optional
    private RationalNumber minimumCost;
    /**
     * Part of ISO 15118-20 price schedule.
     */
    @Optional
    private RationalNumber maximumCost;
    /**
     * (Required)
     */
    @Required
    private List<PriceRuleStack> priceRuleStacks;
    @Optional
    private List<TaxRule> taxRules;
    /**
     * Part of ISO 15118-20 price schedule.
     */
    @Optional
    private OverstayRuleList overstayRuleList;
    @Optional
    private List<AdditionalSelectedServices> additionalSelectedServices;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public AbsolutePriceSchedule() {
    }

    /**
     * @param priceScheduleID          Unique ID of price schedule
     *                                 .
     * @param timeAnchor               Starting point of price schedule.
     *                                 .
     * @param priceScheduleDescription Description of the price schedule.
     *                                 .
     * @param currency                 Currency according to ISO 4217.
     *                                 .
     * @param language                 String that indicates what language is used for the human readable strings in the price schedule. Based on ISO 639.
     *                                 .
     * @param priceAlgorithm           A string in URN notation which shall uniquely identify an algorithm that defines how to compute an energy fee sum for a specific power profile based on the EnergyFee information from the PriceRule elements.
     *                                 .
     */
    public AbsolutePriceSchedule(Date timeAnchor, Integer priceScheduleID, String priceScheduleDescription, String currency, String language, String priceAlgorithm, RationalNumber minimumCost, RationalNumber maximumCost, List<PriceRuleStack> priceRuleStacks, List<TaxRule> taxRules, OverstayRuleList overstayRuleList, List<AdditionalSelectedServices> additionalSelectedServices, CustomData customData) {
        super();
        this.timeAnchor = timeAnchor;
        this.priceScheduleID = priceScheduleID;
        this.priceScheduleDescription = priceScheduleDescription;
        this.currency = currency;
        this.language = language;
        this.priceAlgorithm = priceAlgorithm;
        this.minimumCost = minimumCost;
        this.maximumCost = maximumCost;
        this.priceRuleStacks = priceRuleStacks;
        this.taxRules = taxRules;
        this.overstayRuleList = overstayRuleList;
        this.additionalSelectedServices = additionalSelectedServices;
        this.customData = customData;
    }

    /**
     * Starting point of price schedule.
     * <p>
     * (Required)
     */
    public Date getTimeAnchor() {
        return timeAnchor;
    }

    /**
     * Starting point of price schedule.
     * <p>
     * (Required)
     */
    public void setTimeAnchor(Date timeAnchor) {
        this.timeAnchor = timeAnchor;
    }

    /**
     * Unique ID of price schedule
     * <p>
     * (Required)
     */
    public Integer getPriceScheduleID() {
        return priceScheduleID;
    }

    /**
     * Unique ID of price schedule
     * <p>
     * (Required)
     */
    public void setPriceScheduleID(Integer priceScheduleID) {
        this.priceScheduleID = priceScheduleID;
    }

    /**
     * Description of the price schedule.
     */
    public String getPriceScheduleDescription() {
        return priceScheduleDescription;
    }

    /**
     * Description of the price schedule.
     */
    public void setPriceScheduleDescription(String priceScheduleDescription) {
        this.priceScheduleDescription = priceScheduleDescription;
    }

    /**
     * Currency according to ISO 4217.
     * <p>
     * (Required)
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Currency according to ISO 4217.
     * <p>
     * (Required)
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * String that indicates what language is used for the human readable strings in the price schedule. Based on ISO 639.
     * <p>
     * (Required)
     */
    public String getLanguage() {
        return language;
    }

    /**
     * String that indicates what language is used for the human readable strings in the price schedule. Based on ISO 639.
     * <p>
     * (Required)
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * A string in URN notation which shall uniquely identify an algorithm that defines how to compute an energy fee sum for a specific power profile based on the EnergyFee information from the PriceRule elements.
     * <p>
     * (Required)
     */
    public String getPriceAlgorithm() {
        return priceAlgorithm;
    }

    /**
     * A string in URN notation which shall uniquely identify an algorithm that defines how to compute an energy fee sum for a specific power profile based on the EnergyFee information from the PriceRule elements.
     * <p>
     * (Required)
     */
    public void setPriceAlgorithm(String priceAlgorithm) {
        this.priceAlgorithm = priceAlgorithm;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     */
    public RationalNumber getMinimumCost() {
        return minimumCost;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     */
    public void setMinimumCost(RationalNumber minimumCost) {
        this.minimumCost = minimumCost;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     */
    public RationalNumber getMaximumCost() {
        return maximumCost;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     */
    public void setMaximumCost(RationalNumber maximumCost) {
        this.maximumCost = maximumCost;
    }

    /**
     * (Required)
     */
    public List<PriceRuleStack> getPriceRuleStacks() {
        return priceRuleStacks;
    }

    /**
     * (Required)
     */
    public void setPriceRuleStacks(List<PriceRuleStack> priceRuleStacks) {
        this.priceRuleStacks = priceRuleStacks;
    }

    public List<TaxRule> getTaxRules() {
        return taxRules;
    }

    public void setTaxRules(List<TaxRule> taxRules) {
        this.taxRules = taxRules;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     */
    public OverstayRuleList getOverstayRuleList() {
        return overstayRuleList;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     */
    public void setOverstayRuleList(OverstayRuleList overstayRuleList) {
        this.overstayRuleList = overstayRuleList;
    }

    public List<AdditionalSelectedServices> getAdditionalSelectedServices() {
        return additionalSelectedServices;
    }

    public void setAdditionalSelectedServices(List<AdditionalSelectedServices> additionalSelectedServices) {
        this.additionalSelectedServices = additionalSelectedServices;
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
        json.addProperty("priceScheduleID", priceScheduleID);
        json.addProperty("priceScheduleDescription", priceScheduleDescription);
        json.addProperty("currency", currency);
        json.addProperty("language", language);
        json.addProperty("priceAlgorithm", priceAlgorithm);
        json.add("minimumCost", minimumCost.toJsonObject());
        json.add("maximumCost", maximumCost.toJsonObject());
        json.add("overstayRuleList", overstayRuleList.toJsonObject());
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
        if (jsonObject.has("timeAnchor")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.timeAnchor = dateFormat.parse(jsonObject.get("timeAnchor").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for timeAnchor" + e);
            }
        }

        if (jsonObject.has("priceScheduleID")) {
            this.priceScheduleID = jsonObject.get("priceScheduleID").getAsInt();
        }

        if (jsonObject.has("priceScheduleDescription")) {
            this.priceScheduleDescription = jsonObject.get("priceScheduleDescription").getAsString();
        }

        if (jsonObject.has("currency")) {
            this.currency = jsonObject.get("currency").getAsString();
        }

        if (jsonObject.has("language")) {
            this.language = jsonObject.get("language").getAsString();
        }

        if (jsonObject.has("priceAlgorithm")) {
            this.priceAlgorithm = jsonObject.get("priceAlgorithm").getAsString();
        }

        if (jsonObject.has("minimumCost")) {
            this.minimumCost = new RationalNumber();
            this.minimumCost.fromJsonObject(jsonObject.getAsJsonObject("minimumCost"));
        }

        if (jsonObject.has("maximumCost")) {
            this.maximumCost = new RationalNumber();
            this.maximumCost.fromJsonObject(jsonObject.getAsJsonObject("maximumCost"));
        }

        if (jsonObject.has("overstayRuleList")) {
            this.overstayRuleList = new OverstayRuleList();
            this.overstayRuleList.fromJsonObject(jsonObject.getAsJsonObject("overstayRuleList"));
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
        if (!(obj instanceof AbsolutePriceSchedule))
            return false;
        AbsolutePriceSchedule that = (AbsolutePriceSchedule) obj;
        return Objects.equals(this.taxRules, that.taxRules)
                && Objects.equals(this.additionalSelectedServices, that.additionalSelectedServices)
                && Objects.equals(this.overstayRuleList, that.overstayRuleList)
                && Objects.equals(this.language, that.language)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.minimumCost, that.minimumCost)
                && Objects.equals(this.priceAlgorithm, that.priceAlgorithm)
                && Objects.equals(this.priceScheduleID, that.priceScheduleID)
                && Objects.equals(this.priceRuleStacks, that.priceRuleStacks)
                && Objects.equals(this.timeAnchor, that.timeAnchor)
                && Objects.equals(this.priceScheduleDescription, that.priceScheduleDescription)
                && Objects.equals(this.currency, that.currency)
                && Objects.equals(this.maximumCost, that.maximumCost);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.taxRules != null ? this.taxRules.hashCode() : 0);
        result = 31 * result + (this.additionalSelectedServices != null ? this.additionalSelectedServices.hashCode() : 0);
        result = 31 * result + (this.overstayRuleList != null ? this.overstayRuleList.hashCode() : 0);
        result = 31 * result + (this.language != null ? this.language.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.minimumCost != null ? this.minimumCost.hashCode() : 0);
        result = 31 * result + (this.priceAlgorithm != null ? this.priceAlgorithm.hashCode() : 0);
        result = 31 * result + (this.priceScheduleID != null ? this.priceScheduleID.hashCode() : 0);
        result = 31 * result + (this.priceRuleStacks != null ? this.priceRuleStacks.hashCode() : 0);
        result = 31 * result + (this.timeAnchor != null ? this.timeAnchor.hashCode() : 0);
        result = 31 * result + (this.priceScheduleDescription != null ? this.priceScheduleDescription.hashCode() : 0);
        result = 31 * result + (this.currency != null ? this.currency.hashCode() : 0);
        result = 31 * result + (this.maximumCost != null ? this.maximumCost.hashCode() : 0);
        return result;
    }
}
