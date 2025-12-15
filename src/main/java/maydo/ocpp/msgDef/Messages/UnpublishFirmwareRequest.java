package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the UnpublishFirmwareRequest PDU sent by the CSMS to the Charging Station.
 */
public class UnpublishFirmwareRequest implements JsonInterface {

    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32.
     */
    @Required
    private String checksum;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public UnpublishFirmwareRequest() {
    }


    public String getChecksum() {
        return checksum;
    }


    public void setChecksum(String checksum) {
        this.checksum = checksum;
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

        json.addProperty("checksum", getChecksum());

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
        if (jsonObject.has("checksum")) {
            setChecksum(jsonObject.get("checksum").getAsString());
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
        if (!(obj instanceof UnpublishFirmwareRequest))
            return false;
        UnpublishFirmwareRequest that = (UnpublishFirmwareRequest) obj;
        return Objects.equals(this.checksum, that.checksum)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.checksum != null ? this.checksum.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
