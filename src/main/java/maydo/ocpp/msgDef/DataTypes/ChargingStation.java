package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * The physical system where an Electrical Vehicle (EV) can be charged.
 */
public class ChargingStation implements JsonInterface {

    /**
     * Vendor-specific device identifier.
     */
    @Optional
    private String serialNumber;
    /**
     * Defines the model of the device.
     * <p>
     * (Required)
     */
    @Required
    private String model;
    /**
     * Defines parameters required for initiating and maintaining wireless communication with other devices.
     */
    @Optional
    private Modem modem;
    /**
     * Identifies the vendor (not necessarily in a unique manner).
     * <p>
     * (Required)
     */
    @Required
    private String vendorName;
    /**
     * This contains the firmware version of the Charging Station.
     */
    @Optional
    private String firmwareVersion;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ChargingStation() {
    }

    /**
     * @param serialNumber    Vendor-specific device identifier.
     *                        .
     * @param model           Defines the model of the device.
     *                        .
     * @param vendorName      Identifies the vendor (not necessarily in a unique manner).
     *                        .
     * @param firmwareVersion This contains the firmware version of the Charging Station.
     *                        <p>
     *                        .
     */
    public ChargingStation(String serialNumber, String model, Modem modem, String vendorName, String firmwareVersion, CustomData customData) {
        super();
        this.serialNumber = serialNumber;
        this.model = model;
        this.modem = modem;
        this.vendorName = vendorName;
        this.firmwareVersion = firmwareVersion;
        this.customData = customData;
    }

    /**
     * Vendor-specific device identifier.
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Vendor-specific device identifier.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Defines the model of the device.
     * <p>
     * (Required)
     */
    public String getModel() {
        return model;
    }

    /**
     * Defines the model of the device.
     * <p>
     * (Required)
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Defines parameters required for initiating and maintaining wireless communication with other devices.
     */
    public Modem getModem() {
        return modem;
    }

    /**
     * Defines parameters required for initiating and maintaining wireless communication with other devices.
     */
    public void setModem(Modem modem) {
        this.modem = modem;
    }

    /**
     * Identifies the vendor (not necessarily in a unique manner).
     * <p>
     * (Required)
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Identifies the vendor (not necessarily in a unique manner).
     * <p>
     * (Required)
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * This contains the firmware version of the Charging Station.
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * This contains the firmware version of the Charging Station.
     */
    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
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
        return null;
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
        if (!(obj instanceof ChargingStation))
            return false;
        ChargingStation that = (ChargingStation) obj;
        return Objects.equals(this.serialNumber, that.serialNumber)
                && Objects.equals(this.modem, that.modem)
                && Objects.equals(this.model, that.model)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.vendorName, that.vendorName)
                && Objects.equals(this.firmwareVersion, that.firmwareVersion);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.serialNumber != null ? this.serialNumber.hashCode() : 0);
        result = 31 * result + (this.modem != null ? this.modem.hashCode() : 0);
        result = 31 * result + (this.model != null ? this.model.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.vendorName != null ? this.vendorName.hashCode() : 0);
        result = 31 * result + (this.firmwareVersion != null ? this.firmwareVersion.hashCode() : 0);
        return result;
    }
}
