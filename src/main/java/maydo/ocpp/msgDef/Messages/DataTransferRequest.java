package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

public class DataTransferRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * May be used to indicate a specific message or implementation.
     */
    private String messageId;
    /**
     * Data without specified length or format. This needs to be decided by both parties (Open to implementation).
     */
    private Object data;
    /**
     * This identifies the Vendor specific implementation
     * <p>
     * <p>
     * (Required)
     */
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
}
