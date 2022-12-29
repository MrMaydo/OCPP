package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;


/**
 * Sales_ Tariff
 * urn:x-oca:ocpp:uid:2:233272
 * NOTE: This dataType is based on dataTypes from &lt;&lt;ref-ISOIEC15118-2,ISO 15118-2&gt;&gt;.
 */
public class SalesTariff implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * SalesTariff identifier used to identify one sales tariff. An SAID remains a unique identifier for one schedule throughout a charging session.
     * <p>
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * Sales_ Tariff. Sales. Tariff_ Description
     * urn:x-oca:ocpp:uid:1:569283
     * A human readable title/short description of the sales tariff e.g. for HMI display purposes.
     */
    @Optional
    private String salesTariffDescription;
    /**
     * Sales_ Tariff. Num_ E_ Price_ Levels. Counter
     * urn:x-oca:ocpp:uid:1:569284
     * Defines the overall number of distinct price levels used across all provided SalesTariff elements.
     */
    @Optional
    private Integer numEPriceLevels;
    /**
     * (Required)
     */
    @Required
    private List<SalesTariffEntry> salesTariffEntry = null;

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

    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * SalesTariff identifier used to identify one sales tariff. An SAID remains a unique identifier for one schedule throughout a charging session.
     * <p>
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * SalesTariff identifier used to identify one sales tariff. An SAID remains a unique identifier for one schedule throughout a charging session.
     * <p>
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Sales_ Tariff. Sales. Tariff_ Description
     * urn:x-oca:ocpp:uid:1:569283
     * A human readable title/short description of the sales tariff e.g. for HMI display purposes.
     */
    public String getSalesTariffDescription() {
        return salesTariffDescription;
    }

    /**
     * Sales_ Tariff. Sales. Tariff_ Description
     * urn:x-oca:ocpp:uid:1:569283
     * A human readable title/short description of the sales tariff e.g. for HMI display purposes.
     */
    public void setSalesTariffDescription(String salesTariffDescription) {
        this.salesTariffDescription = salesTariffDescription;
    }

    /**
     * Sales_ Tariff. Num_ E_ Price_ Levels. Counter
     * urn:x-oca:ocpp:uid:1:569284
     * Defines the overall number of distinct price levels used across all provided SalesTariff elements.
     */
    public Integer getNumEPriceLevels() {
        return numEPriceLevels;
    }

    /**
     * Sales_ Tariff. Num_ E_ Price_ Levels. Counter
     * urn:x-oca:ocpp:uid:1:569284
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SalesTariff))
            return false;
        SalesTariff that = (SalesTariff) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(id, that.id)
                && Objects.equals(salesTariffDescription, that.salesTariffDescription)
                && Objects.equals(numEPriceLevels, that.numEPriceLevels)
                && Objects.equals(salesTariffEntry, that.salesTariffEntry);
    }

    @Override
    public int hashCode() {
        int result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (salesTariffDescription != null ? salesTariffDescription.hashCode() : 0);
        result = 31 * result + (numEPriceLevels != null ? numEPriceLevels.hashCode() : 0);
        result = 31 * result + (salesTariffEntry != null ? salesTariffEntry.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
