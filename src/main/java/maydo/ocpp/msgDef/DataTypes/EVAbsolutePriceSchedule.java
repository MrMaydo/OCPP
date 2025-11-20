package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class EVAbsolutePriceSchedule implements JsonInterface {

    /**
     * Starting point in time of the EVEnergyOffer.
     * <p>
     * (Required)
     */
    @Required
    private Date timeAnchor;
    /**
     * Currency code according to ISO 4217.
     * <p>
     * (Required)
     */
    @Required
    private String currency;
    /**
     * (Required)
     */
    @Required
    private List<EVAbsolutePriceScheduleEntry> evAbsolutePriceScheduleEntries;
    /**
     * ISO 15118-20 URN of price algorithm: Power, PeakPower, StackedEnergy.
     * <p>
     * (Required)
     */
    @Required
    private String priceAlgorithm;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public EVAbsolutePriceSchedule() {
    }

    /**
     * @param timeAnchor     Starting point in time of the EVEnergyOffer.
     *                       .
     * @param currency       Currency code according to ISO 4217.
     *                       .
     * @param priceAlgorithm ISO 15118-20 URN of price algorithm: Power, PeakPower, StackedEnergy.
     *                       .
     */
    public EVAbsolutePriceSchedule(Date timeAnchor, String currency, List<EVAbsolutePriceScheduleEntry> evAbsolutePriceScheduleEntries, String priceAlgorithm, CustomData customData) {
        super();
        this.timeAnchor = timeAnchor;
        this.currency = currency;
        this.evAbsolutePriceScheduleEntries = evAbsolutePriceScheduleEntries;
        this.priceAlgorithm = priceAlgorithm;
        this.customData = customData;
    }

    /**
     * Starting point in time of the EVEnergyOffer.
     * <p>
     * (Required)
     */
    public Date getTimeAnchor() {
        return timeAnchor;
    }

    /**
     * Starting point in time of the EVEnergyOffer.
     * <p>
     * (Required)
     */
    public void setTimeAnchor(Date timeAnchor) {
        this.timeAnchor = timeAnchor;
    }

    /**
     * Currency code according to ISO 4217.
     * <p>
     * (Required)
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Currency code according to ISO 4217.
     * <p>
     * (Required)
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * (Required)
     */
    public List<EVAbsolutePriceScheduleEntry> getEvAbsolutePriceScheduleEntries() {
        return evAbsolutePriceScheduleEntries;
    }

    /**
     * (Required)
     */
    public void setEvAbsolutePriceScheduleEntries(List<EVAbsolutePriceScheduleEntry> evAbsolutePriceScheduleEntries) {
        this.evAbsolutePriceScheduleEntries = evAbsolutePriceScheduleEntries;
    }

    /**
     * ISO 15118-20 URN of price algorithm: Power, PeakPower, StackedEnergy.
     * <p>
     * (Required)
     */
    public String getPriceAlgorithm() {
        return priceAlgorithm;
    }

    /**
     * ISO 15118-20 URN of price algorithm: Power, PeakPower, StackedEnergy.
     * <p>
     * (Required)
     */
    public void setPriceAlgorithm(String priceAlgorithm) {
        this.priceAlgorithm = priceAlgorithm;
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
        json.addProperty("currency", currency);
        json.addProperty("priceAlgorithm", priceAlgorithm);
        json.add("customData", customData.toJsonObject());
        return json;
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
        if (!(obj instanceof EVAbsolutePriceSchedule))
            return false;
        EVAbsolutePriceSchedule that = (EVAbsolutePriceSchedule) obj;
        return Objects.equals(this.currency, that.currency)
                && Objects.equals(this.evAbsolutePriceScheduleEntries, that.evAbsolutePriceScheduleEntries)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priceAlgorithm, that.priceAlgorithm)
                && Objects.equals(this.timeAnchor, that.timeAnchor);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.currency != null ? this.currency.hashCode() : 0);
        result = 31 * result + (this.evAbsolutePriceScheduleEntries != null ? this.evAbsolutePriceScheduleEntries.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priceAlgorithm != null ? this.priceAlgorithm.hashCode() : 0);
        result = 31 * result + (this.timeAnchor != null ? this.timeAnchor.hashCode() : 0);
        return result;
    }
}
