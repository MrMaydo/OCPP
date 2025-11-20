package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class SalesTariff implements JsonInterface {

    /**
     * SalesTariff identifier used to identify one sales tariff. An SAID remains a unique identifier for one schedule throughout a charging session.
     * <p>
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * A human readable title/short description of the sales tariff e.g. for HMI display purposes.
     */
    @Optional
    private String salesTariffDescription;
    /**
     * Defines the overall number of distinct price levels used across all provided SalesTariff elements.
     */
    @Optional
    private Integer numEPriceLevels;
    /**
     * (Required)
     */
    @Required
    private List<SalesTariffEntry> salesTariffEntry;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SalesTariff() {
    }

    /**
     * @param salesTariffDescription A human readable title/short description of the sales tariff e.g. for HMI display purposes.
     *                               .
     * @param numEPriceLevels        Defines the overall number of distinct price levels used across all provided SalesTariff elements.
     *                               .
     * @param id                     SalesTariff identifier used to identify one sales tariff. An SAID remains a unique identifier for one schedule throughout a charging session.
     *                               .
     */
    public SalesTariff(Integer id, String salesTariffDescription, Integer numEPriceLevels, List<SalesTariffEntry> salesTariffEntry, CustomData customData) {
        super();
        this.id = id;
        this.salesTariffDescription = salesTariffDescription;
        this.numEPriceLevels = numEPriceLevels;
        this.salesTariffEntry = salesTariffEntry;
        this.customData = customData;
    }

    /**
     * SalesTariff identifier used to identify one sales tariff. An SAID remains a unique identifier for one schedule throughout a charging session.
     * <p>
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * SalesTariff identifier used to identify one sales tariff. An SAID remains a unique identifier for one schedule throughout a charging session.
     * <p>
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * A human readable title/short description of the sales tariff e.g. for HMI display purposes.
     */
    public String getSalesTariffDescription() {
        return salesTariffDescription;
    }

    /**
     * A human readable title/short description of the sales tariff e.g. for HMI display purposes.
     */
    public void setSalesTariffDescription(String salesTariffDescription) {
        this.salesTariffDescription = salesTariffDescription;
    }

    /**
     * Defines the overall number of distinct price levels used across all provided SalesTariff elements.
     */
    public Integer getNumEPriceLevels() {
        return numEPriceLevels;
    }

    /**
     * Defines the overall number of distinct price levels used across all provided SalesTariff elements.
     */
    public void setNumEPriceLevels(Integer numEPriceLevels) {
        this.numEPriceLevels = numEPriceLevels;
    }

    /**
     * (Required)
     */
    public List<SalesTariffEntry> getSalesTariffEntry() {
        return salesTariffEntry;
    }

    /**
     * (Required)
     */
    public void setSalesTariffEntry(List<SalesTariffEntry> salesTariffEntry) {
        this.salesTariffEntry = salesTariffEntry;
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
        json.addProperty("id", id);
        json.addProperty("salesTariffDescription", salesTariffDescription);
        json.addProperty("numEPriceLevels", numEPriceLevels);
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
        if (!(obj instanceof SalesTariff))
            return false;
        SalesTariff that = (SalesTariff) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.salesTariffEntry, that.salesTariffEntry)
                && Objects.equals(this.salesTariffDescription, that.salesTariffDescription)
                && Objects.equals(this.numEPriceLevels, that.numEPriceLevels);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.salesTariffEntry != null ? this.salesTariffEntry.hashCode() : 0);
        result = 31 * result + (this.salesTariffDescription != null ? this.salesTariffDescription.hashCode() : 0);
        result = 31 * result + (this.numEPriceLevels != null ? this.numEPriceLevels.hashCode() : 0);
        return result;
    }
}
