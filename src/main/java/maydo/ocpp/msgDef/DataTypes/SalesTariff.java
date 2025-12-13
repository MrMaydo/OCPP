package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A SalesTariff provided by a Mobility Operator (EMSP). NOTE: This dataType is based on dataTypes from ISO 15118-2.
 */
public class SalesTariff implements JsonInterface {

    /**
     * SalesTariff identifier used to identify one sales tariff.
     * An SAID remains a unique identifier for one schedule throughout a charging session.
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
     * Encapsulating element describing all relevant details for one time interval of the SalesTariff.
     * The number of SalesTariffEntry elements is limited by the parameter maxScheduleTuples.
     */
    @Required
    private List<SalesTariffEntry> salesTariffEntry;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SalesTariff() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getSalesTariffDescription() {
        return salesTariffDescription;
    }


    public void setSalesTariffDescription(String salesTariffDescription) {
        this.salesTariffDescription = salesTariffDescription;
    }


    public Integer getNumEPriceLevels() {
        return numEPriceLevels;
    }


    public void setNumEPriceLevels(Integer numEPriceLevels) {
        this.numEPriceLevels = numEPriceLevels;
    }


    public List<SalesTariffEntry> getSalesTariffEntry() {
        return salesTariffEntry;
    }


    public void setSalesTariffEntry(List<SalesTariffEntry> salesTariffEntry) {
        this.salesTariffEntry = salesTariffEntry;
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
        json.addProperty("id", id);
        json.addProperty("salesTariffDescription", salesTariffDescription);
        json.addProperty("numEPriceLevels", numEPriceLevels);
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
        if (jsonObject.has("id")) {
            setId(jsonObject.get("id").getAsInt());
        }

        if (jsonObject.has("salesTariffDescription")) {
            setSalesTariffDescription(jsonObject.get("salesTariffDescription").getAsString());
        }

        if (jsonObject.has("numEPriceLevels")) {
            setNumEPriceLevels(jsonObject.get("numEPriceLevels").getAsInt());
        }

        if (jsonObject.has("salesTariffEntry")) {
            setSalesTariffEntry(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("salesTariffEntry");
            for (JsonElement el : arr) {
                SalesTariffEntry item = new SalesTariffEntry();
                item.fromJsonObject(el.getAsJsonObject());
                getSalesTariffEntry().add(item);
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
