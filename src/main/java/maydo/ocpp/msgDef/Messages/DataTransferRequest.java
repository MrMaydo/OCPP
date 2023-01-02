package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class DataTransferRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * May be used to indicate a specific message or implementation.
     */
    @Optional
    private String messageId;
    /**
     * Data without specified length or format. This needs to be decided by both parties (Open to implementation).
     */
    @Optional
    private Object data;
    /**
     * This identifies the Vendor specific implementation
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String vendorId;

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
     * May be used to indicate a specific message or implementation.
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * May be used to indicate a specific message or implementation.
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Data without specified length or format. This needs to be decided by both parties (Open to implementation).
     */
    public Object getData() {
        return data;
    }

    /**
     * Data without specified length or format. This needs to be decided by both parties (Open to implementation).
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * This identifies the Vendor specific implementation
     * <p>
     * <p>
     * (Required)
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * This identifies the Vendor specific implementation
     * <p>
     * <p>
     * (Required)
     */
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
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
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof DataTransferRequest))
            return false;
        DataTransferRequest that = (DataTransferRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(messageId, that.messageId)
                && Objects.equals(data, that.data)
                && Objects.equals(vendorId, that.vendorId);
    }

    @Override
    public int hashCode() {
        int result = (messageId != null ? messageId.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (vendorId != null ? vendorId.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
