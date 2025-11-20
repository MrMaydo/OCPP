package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class DataTransferRequest implements JsonInterface {

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
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public DataTransferRequest() {
    }

    /**
     * @param data      Data without specified length or format. This needs to be decided by both parties (Open to implementation).
     *                  .
     * @param messageId May be used to indicate a specific message or implementation.
     *                  .
     * @param vendorId  This identifies the Vendor specific implementation
     *                  <p>
     *                  .
     */
    public DataTransferRequest(String messageId, Object data, String vendorId, CustomData customData) {
        super();
        this.messageId = messageId;
        this.data = data;
        this.vendorId = vendorId;
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
        json.addProperty("messageId", messageId);
        json.addProperty("data", data.toString());
        json.addProperty("vendorId", vendorId);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("messageId")) {
            this.messageId = jsonObject.get("messageId").getAsString();
        }

        if (jsonObject.has("data")) {
            this.data = jsonObject.getAsJsonObject("data").getAsString();
        }

        if (jsonObject.has("vendorId")) {
            this.vendorId = jsonObject.get("vendorId").getAsString();
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
        if (!(obj instanceof DataTransferRequest))
            return false;
        DataTransferRequest that = (DataTransferRequest) obj;
        return Objects.equals(this.messageId, that.messageId)
                && Objects.equals(this.vendorId, that.vendorId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.messageId != null ? this.messageId.hashCode() : 0);
        result = 31 * result + (this.vendorId != null ? this.vendorId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.data != null ? this.data.hashCode() : 0);
        return result;
    }
}
