package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class BatteryData implements JsonInterface {

    /**
     * Slot number where battery is inserted or removed.
     * <p>
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * Serial number of battery.
     * <p>
     * (Required)
     */
    @Required
    private String serialNumber;
    /**
     * State of charge
     * <p>
     * (Required)
     */
    @Required
    private Float soC;
    /**
     * State of health
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float soH;
    /**
     * Production date of battery.
     */
    @Optional
    private Date productionDate;
    /**
     * Vendor-specific info from battery in undefined format.
     */
    @Optional
    private String vendorInfo;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public BatteryData() {
    }

    /**
     * @param evseId         Slot number where battery is inserted or removed.
     *                       .
     * @param serialNumber   Serial number of battery.
     *                       .
     * @param productionDate Production date of battery.
     *                       <p>
     *                       .
     * @param soC            State of charge
     *                       .
     * @param vendorInfo     Vendor-specific info from battery in undefined format.
     *                       .
     * @param soH            State of health
     *                       <p>
     *                       .
     */
    public BatteryData(Integer evseId, String serialNumber, Float soC, Float soH, Date productionDate, String vendorInfo, CustomData customData) {
        super();
        this.evseId = evseId;
        this.serialNumber = serialNumber;
        this.soC = soC;
        this.soH = soH;
        this.productionDate = productionDate;
        this.vendorInfo = vendorInfo;
        this.customData = customData;
    }

    /**
     * Slot number where battery is inserted or removed.
     * <p>
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * Slot number where battery is inserted or removed.
     * <p>
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Serial number of battery.
     * <p>
     * (Required)
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Serial number of battery.
     * <p>
     * (Required)
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * State of charge
     * <p>
     * (Required)
     */
    public Float getSoC() {
        return soC;
    }

    /**
     * State of charge
     * <p>
     * (Required)
     */
    public void setSoC(Float soC) {
        this.soC = soC;
    }

    /**
     * State of health
     * <p>
     * <p>
     * (Required)
     */
    public Float getSoH() {
        return soH;
    }

    /**
     * State of health
     * <p>
     * <p>
     * (Required)
     */
    public void setSoH(Float soH) {
        this.soH = soH;
    }

    /**
     * Production date of battery.
     */
    public Date getProductionDate() {
        return productionDate;
    }

    /**
     * Production date of battery.
     */
    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    /**
     * Vendor-specific info from battery in undefined format.
     */
    public String getVendorInfo() {
        return vendorInfo;
    }

    /**
     * Vendor-specific info from battery in undefined format.
     */
    public void setVendorInfo(String vendorInfo) {
        this.vendorInfo = vendorInfo;
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
        json.addProperty("evseId", evseId);
        json.addProperty("serialNumber", serialNumber);
        json.addProperty("soC", soC);
        json.addProperty("soH", soH);
        json.addProperty("productionDate", new SimpleDateFormat(DATE_FORMAT).format(productionDate));
        json.addProperty("vendorInfo", vendorInfo);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("evseId")) {
            this.evseId = jsonObject.get("evseId").getAsInt();
        }

        if (jsonObject.has("serialNumber")) {
            this.serialNumber = jsonObject.get("serialNumber").getAsString();
        }

        if (jsonObject.has("soC")) {
            this.soC = jsonObject.get("soC").getAsFloat();
        }

        if (jsonObject.has("soH")) {
            this.soH = jsonObject.get("soH").getAsFloat();
        }

        if (jsonObject.has("productionDate")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.productionDate = dateFormat.parse(jsonObject.get("productionDate").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for productionDate" + e);
            }
        }

        if (jsonObject.has("vendorInfo")) {
            this.vendorInfo = jsonObject.get("vendorInfo").getAsString();
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
        if (!(obj instanceof BatteryData))
            return false;
        BatteryData that = (BatteryData) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.serialNumber, that.serialNumber)
                && Objects.equals(this.productionDate, that.productionDate)
                && Objects.equals(this.soC, that.soC)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.vendorInfo, that.vendorInfo)
                && Objects.equals(this.soH, that.soH);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.serialNumber != null ? this.serialNumber.hashCode() : 0);
        result = 31 * result + (this.productionDate != null ? this.productionDate.hashCode() : 0);
        result = 31 * result + (this.soC != null ? this.soC.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.vendorInfo != null ? this.vendorInfo.hashCode() : 0);
        result = 31 * result + (this.soH != null ? this.soH.hashCode() : 0);
        return result;
    }
}
