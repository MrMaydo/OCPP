package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the DataTransferRequest PDU sent either by the CSMS to the Charging Station or vice versa.
 */
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
    private String data;

    /**
     * This identifies the Vendor specific implementation
     */
    @Required
    private String vendorId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public DataTransferRequest() {
    }


    public String getMessageId() {
        return messageId;
    }


    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }


    public String getVendorId() {
        return vendorId;
    }


    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
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

        if (getMessageId() != null) {
            json.addProperty("messageId", getMessageId());
        }
        if (getData() != null) {
            json.addProperty("data", getData());
        }
        json.addProperty("vendorId", getVendorId());

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
        if (jsonObject.has("messageId")) {
            setMessageId(jsonObject.get("messageId").getAsString());
        }

        if (jsonObject.has("data")) {
            setData(jsonObject.get("data").getAsString());
        }

        if (jsonObject.has("vendorId")) {
            setVendorId(jsonObject.get("vendorId").getAsString());
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
        return Objects.hash(
                getMessageId(),
                getData(),
                getVendorId(),
                getCustomData()
        );
    }
}
