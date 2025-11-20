package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class UnpublishFirmwareRequest implements JsonInterface {

    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32.
     * <p>
     * (Required)
     */
    @Required
    private String checksum;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public UnpublishFirmwareRequest() {
    }

    /**
     * @param checksum The MD5 checksum over the entire firmware file as a hexadecimal string of length 32.
     *                 .
     */
    public UnpublishFirmwareRequest(String checksum, CustomData customData) {
        super();
        this.checksum = checksum;
        this.customData = customData;
    }

    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32.
     * <p>
     * (Required)
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32.
     * <p>
     * (Required)
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
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
        json.addProperty("checksum", checksum);
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
