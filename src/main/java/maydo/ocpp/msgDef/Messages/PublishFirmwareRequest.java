package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the PublishFirmwareRequest PDU sent by the CSMS to the Local Controller.
 */
public class PublishFirmwareRequest implements JsonInterface {

    /**
     * This contains a string containing a URI pointing to a location from which to retrieve the firmware.
     */
    @Required
    private String location;

    /**
     * This specifies how many times Charging Station must retry to download the firmware before giving up.
     * If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
     * If the value is 0, it means: no retries.
     */
    @Optional
    private Integer retries;

    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32.
     */
    @Required
    private String checksum;

    /**
     * The Id of the request.
     */
    @Required
    private Integer requestId;

    /**
     * The interval in seconds after which a retry may be attempted.
     * If this field is not present, it is left to Charging Station to decide how long to wait between attempts
     */
    @Optional
    private Integer retryInterval;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public PublishFirmwareRequest() {
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public Integer getRetries() {
        return retries;
    }


    public void setRetries(Integer retries) {
        this.retries = retries;
    }


    public String getChecksum() {
        return checksum;
    }


    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public Integer getRetryInterval() {
        return retryInterval;
    }


    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
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

        json.addProperty("location", getLocation());

        if (getRetries() != null) {
            json.addProperty("retries", getRetries());
        }
        json.addProperty("checksum", getChecksum());

        json.addProperty("requestId", getRequestId());

        if (getRetryInterval() != null) {
            json.addProperty("retryInterval", getRetryInterval());
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
        if (jsonObject.has("location")) {
            setLocation(jsonObject.get("location").getAsString());
        }

        if (jsonObject.has("retries")) {
            setRetries(jsonObject.get("retries").getAsInt());
        }

        if (jsonObject.has("checksum")) {
            setChecksum(jsonObject.get("checksum").getAsString());
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("retryInterval")) {
            setRetryInterval(jsonObject.get("retryInterval").getAsInt());
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
        if (!(obj instanceof PublishFirmwareRequest))
            return false;
        PublishFirmwareRequest that = (PublishFirmwareRequest) obj;
        return Objects.equals(this.retries, that.retries)
                && Objects.equals(this.requestId, that.requestId)
                && Objects.equals(this.checksum, that.checksum)
                && Objects.equals(this.location, that.location)
                && Objects.equals(this.retryInterval, that.retryInterval)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.retries != null ? this.retries.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.checksum != null ? this.checksum.hashCode() : 0);
        result = 31 * result + (this.location != null ? this.location.hashCode() : 0);
        result = 31 * result + (this.retryInterval != null ? this.retryInterval.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
