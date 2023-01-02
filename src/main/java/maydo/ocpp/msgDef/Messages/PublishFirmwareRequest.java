package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class PublishFirmwareRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * This contains a string containing a URI pointing to a
     * location from which to retrieve the firmware.
     * <p>
     * (Required)
     */
    @Required
    private String location;
    /**
     * This specifies how many times Charging Station must try
     * to download the firmware before giving up. If this field is not
     * present, it is left to Charging Station to decide how many times it wants to retry.
     */
    @Optional
    private Integer retries;
    /**
     * The MD5 checksum over the entire firmware file as a hexadecimal string of length 32.
     * <p>
     * (Required)
     */
    @Required
    private String checksum;
    /**
     * The Id of the request.
     * <p>
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * The interval in seconds
     * after which a retry may be
     * attempted. If this field is not
     * present, it is left to Charging
     * Station to decide how long to wait
     * between attempts.
     */
    @Optional
    private Integer retryInterval;

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
     * This contains a string containing a URI pointing to a
     * location from which to retrieve the firmware.
     * <p>
     * (Required)
     */
    public String getLocation() {
        return location;
    }

    /**
     * This contains a string containing a URI pointing to a
     * location from which to retrieve the firmware.
     * <p>
     * (Required)
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This specifies how many times Charging Station must try
     * to download the firmware before giving up. If this field is not
     * present, it is left to Charging Station to decide how many times it wants to retry.
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * This specifies how many times Charging Station must try
     * to download the firmware before giving up. If this field is not
     * present, it is left to Charging Station to decide how many times it wants to retry.
     */
    public void setRetries(Integer retries) {
        this.retries = retries;
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
     * The Id of the request.
     * <p>
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of the request.
     * <p>
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * The interval in seconds
     * after which a retry may be
     * attempted. If this field is not
     * present, it is left to Charging
     * Station to decide how long to wait
     * between attempts.
     */
    public Integer getRetryInterval() {
        return retryInterval;
    }

    /**
     * The interval in seconds
     * after which a retry may be
     * attempted. If this field is not
     * present, it is left to Charging
     * Station to decide how long to wait
     * between attempts.
     */
    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
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
        if (!(obj instanceof PublishFirmwareRequest))
            return false;
        PublishFirmwareRequest that = (PublishFirmwareRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(location, that.location)
                && Objects.equals(retries, that.retries)
                && Objects.equals(checksum, that.checksum)
                && Objects.equals(requestId, that.requestId)
                && Objects.equals(retryInterval, that.retryInterval);
    }

    @Override
    public int hashCode() {
        int result = (location != null ? location.hashCode() : 0);
        result = 31 * result + (retries != null ? retries.hashCode() : 0);
        result = 31 * result + (checksum != null ? checksum.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (retryInterval != null ? retryInterval.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
