package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * The AbsolutePriceScheduleType is modeled after the same type that is defined in ISO 15118-20,
 * such that if it is supplied by an EMSP as a signed EXI message,
 * the conversion from EXI to JSON (in OCPP) and back to EXI (for ISO 15118-20)
 * does not change the digest and therefore does not invalidate the signature
 */
public class AbsolutePriceSchedule implements JsonInterface {

    /**
     * Starting point of price schedule.
     */
    @Required
    private Date timeAnchor;

    /**
     * Unique ID of price schedule
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
     */
    @Required
    private String currency;

    /**
     * String that indicates what language is used for the human readable strings in the price schedule.
     * Based on ISO 639.
     */
    @Required
    private String language;

    /**
     * A string in URN notation which shall uniquely identify an algorithm that defines
     * how to compute an energy fee sum for a specific power profile
     * based on the EnergyFee information from the PriceRule elements.
     */
    @Required
    private String priceAlgorithm;

    /**
     * Minimum amount to be billed for the overall charging session (e.g. including energy, parking, and overstay).
     */
    @Optional
    private RationalNumber minimumCost;

    /**
     * Maximum amount to be billed for the overall charging session (e.g. including energy, parking, and overstay).
     */
    @Optional
    private RationalNumber maximumCost;

    /**
     * A set of pricing rules for parking and energy costs.
     */
    @Required
    private List<PriceRuleStack> priceRuleStacks;

    /**
     * Describes the applicable tax rule(s) for this price schedule
     */
    @Optional
    private List<TaxRule> taxRules;

    /**
     * A set of overstay rules that allows for escalation of charges after the overstay is triggered.
     */
    @Optional
    private OverstayRuleList overstayRuleList;

    /**
     * A set of prices for optional services (e.g. valet, carwash).
     */
    @Optional
    private List<AdditionalSelectedServices> additionalSelectedServices;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public AbsolutePriceSchedule() {
    }


    public Date getTimeAnchor() {
        return timeAnchor;
    }


    public void setTimeAnchor(Date timeAnchor) {
        this.timeAnchor = timeAnchor;
    }


    public Integer getPriceScheduleID() {
        return priceScheduleID;
    }


    public void setPriceScheduleID(Integer priceScheduleID) {
        this.priceScheduleID = priceScheduleID;
    }


    public String getPriceScheduleDescription() {
        return priceScheduleDescription;
    }


    public void setPriceScheduleDescription(String priceScheduleDescription) {
        this.priceScheduleDescription = priceScheduleDescription;
    }


    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public String getLanguage() {
        return language;
    }


    public void setLanguage(String language) {
        this.language = language;
    }


    public String getPriceAlgorithm() {
        return priceAlgorithm;
    }


    public void setPriceAlgorithm(String priceAlgorithm) {
        this.priceAlgorithm = priceAlgorithm;
    }


    public RationalNumber getMinimumCost() {
        return minimumCost;
    }


    public void setMinimumCost(RationalNumber minimumCost) {
        this.minimumCost = minimumCost;
    }


    public RationalNumber getMaximumCost() {
        return maximumCost;
    }


    public void setMaximumCost(RationalNumber maximumCost) {
        this.maximumCost = maximumCost;
    }


    public List<PriceRuleStack> getPriceRuleStacks() {
        return priceRuleStacks;
    }


    public void setPriceRuleStacks(List<PriceRuleStack> priceRuleStacks) {
        this.priceRuleStacks = priceRuleStacks;
    }

    public List<TaxRule> getTaxRules() {
        return taxRules;
    }

    public void setTaxRules(List<TaxRule> taxRules) {
        this.taxRules = taxRules;
    }


    public OverstayRuleList getOverstayRuleList() {
        return overstayRuleList;
    }


    public void setOverstayRuleList(OverstayRuleList overstayRuleList) {
        this.overstayRuleList = overstayRuleList;
    }

    public List<AdditionalSelectedServices> getAdditionalSelectedServices() {
        return additionalSelectedServices;
    }

    public void setAdditionalSelectedServices(List<AdditionalSelectedServices> additionalSelectedServices) {
        this.additionalSelectedServices = additionalSelectedServices;
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
                setTimeAnchor(dateFormat.parse(jsonObject.get("timeAnchor").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for timeAnchor" + e);
            }
        }

        if (jsonObject.has("priceScheduleID")) {
            setPriceScheduleID(jsonObject.get("priceScheduleID").getAsInt());
        }

        if (jsonObject.has("priceScheduleDescription")) {
            setPriceScheduleDescription(jsonObject.get("priceScheduleDescription").getAsString());
        }

        if (jsonObject.has("currency")) {
            setCurrency(jsonObject.get("currency").getAsString());
        }

        if (jsonObject.has("language")) {
            setLanguage(jsonObject.get("language").getAsString());
        }

        if (jsonObject.has("priceAlgorithm")) {
            setPriceAlgorithm(jsonObject.get("priceAlgorithm").getAsString());
        }

        if (jsonObject.has("minimumCost")) {
            setMinimumCost(new RationalNumber());
            getMinimumCost().fromJsonObject(jsonObject.getAsJsonObject("minimumCost"));
        }

        if (jsonObject.has("maximumCost")) {
            setMaximumCost(new RationalNumber());
            getMaximumCost().fromJsonObject(jsonObject.getAsJsonObject("maximumCost"));
        }

        if (jsonObject.has("priceRuleStacks")) {
            setPriceRuleStacks(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("priceRuleStacks");
            for (JsonElement el : arr) {
                PriceRuleStack item = new PriceRuleStack();
                item.fromJsonObject(el.getAsJsonObject());
                getPriceRuleStacks().add(item);
            }
        }

        if (jsonObject.has("taxRules")) {
            setTaxRules(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("taxRules");
            for (JsonElement el : arr) {
                TaxRule item = new TaxRule();
                item.fromJsonObject(el.getAsJsonObject());
                getTaxRules().add(item);
            }
        }

        if (jsonObject.has("overstayRuleList")) {
            setOverstayRuleList(new OverstayRuleList());
            getOverstayRuleList().fromJsonObject(jsonObject.getAsJsonObject("overstayRuleList"));
        }

        if (jsonObject.has("additionalSelectedServices")) {
            setAdditionalSelectedServices(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("additionalSelectedServices");
            for (JsonElement el : arr) {
                AdditionalSelectedServices item = new AdditionalSelectedServices();
                item.fromJsonObject(el.getAsJsonObject());
                getAdditionalSelectedServices().add(item);
            }
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
