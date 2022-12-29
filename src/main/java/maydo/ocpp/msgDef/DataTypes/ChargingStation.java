package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * Charge_ Point
 * urn:x-oca:ocpp:uid:2:233122
 * The physical system where an Electrical Vehicle (EV) can be charged.
 */
public class ChargingStation implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Device. Serial_ Number. Serial_ Number
     * urn:x-oca:ocpp:uid:1:569324
     * Vendor-specific device identifier.
     */
    @Optional
    private String serialNumber;
    /**
     * Device. Model. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569325
     * Defines the model of the device.
     * <p>
     * (Required)
     */
    @Required
    private String model;
    /**
     * Wireless_ Communication_ Module
     * urn:x-oca:ocpp:uid:2:233306
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
     * Device. Serial_ Number. Serial_ Number
     * urn:x-oca:ocpp:uid:1:569324
     * Vendor-specific device identifier.
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Device. Serial_ Number. Serial_ Number
     * urn:x-oca:ocpp:uid:1:569324
     * Vendor-specific device identifier.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Device. Model. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569325
     * Defines the model of the device.
     * <p>
     * (Required)
     */
    public String getModel() {
        return model;
    }

    /**
     * Device. Model. CI20_ Text
     * urn:x-oca:ocpp:uid:1:569325
     * Defines the model of the device.
     * <p>
     * (Required)
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Wireless_ Communication_ Module
     * urn:x-oca:ocpp:uid:2:233306
     * Defines parameters required for initiating and maintaining wireless communication with other devices.
     */
    public Modem getModem() {
        return modem;
    }

    /**
     * Wireless_ Communication_ Module
     * urn:x-oca:ocpp:uid:2:233306
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
        if (!(obj instanceof ChargingStation))
            return false;
        ChargingStation that = (ChargingStation) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(serialNumber, that.serialNumber)
                && Objects.equals(model, that.model)
                && Objects.equals(modem, that.modem)
                && Objects.equals(vendorName, that.vendorName)
                && Objects.equals(firmwareVersion, that.firmwareVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customData, serialNumber, model, modem, vendorName, firmwareVersion);
    }
}
