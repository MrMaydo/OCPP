package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * The physical system where an Electrical Vehicle (EV) can be charged.
 */
public class ChargingStation implements JsonInterface {

    /**
     * Defines the model of the device.
     */
    @Required
    private String model;

    /**
     * Vendor-specific device identifier.
     */
    @Optional
    private String serialNumber;

    /**
     * Defines the functional parameters of a communication link.
     */
    @Optional
    private Modem modem;

    /**
     * Identifies the vendor (not necessarily in a unique manner).
     */
    @Required
    private String vendorName;

    /**
     * This contains the firmware version of the Charging Station.
     */
    @Optional
    private String firmwareVersion;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChargingStation() {
    }


    public String getSerialNumber() {
        return serialNumber;
    }


    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public Modem getModem() {
        return modem;
    }


    public void setModem(Modem modem) {
        this.modem = modem;
    }


    public String getVendorName() {
        return vendorName;
    }


    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }


    public String getFirmwareVersion() {
        return firmwareVersion;
    }


    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
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

        json.addProperty("model", getModel());

        if (getSerialNumber() != null) {
            json.addProperty("serialNumber", getSerialNumber());
        }
        if (getModem() != null) {
            json.add("modem", getModem().toJsonObject());
        }
        json.addProperty("vendorName", getVendorName());

        if (getFirmwareVersion() != null) {
            json.addProperty("firmwareVersion", getFirmwareVersion());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("model")) {
            setModel(jsonObject.get("model").getAsString());
        }

        if (jsonObject.has("serialNumber")) {
            setSerialNumber(jsonObject.get("serialNumber").getAsString());
        }

        if (jsonObject.has("modem")) {
            setModem(new Modem());
            getModem().fromJsonObject(jsonObject.getAsJsonObject("modem"));
        }

        if (jsonObject.has("vendorName")) {
            setVendorName(jsonObject.get("vendorName").getAsString());
        }

        if (jsonObject.has("firmwareVersion")) {
            setFirmwareVersion(jsonObject.get("firmwareVersion").getAsString());
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
