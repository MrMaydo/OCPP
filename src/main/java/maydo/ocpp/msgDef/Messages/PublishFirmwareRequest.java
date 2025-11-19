package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class PublishFirmwareRequest implements JsonInterface {

    /**
     * This contains a string containing a URI pointing to a
     * location from which to retrieve the firmware.
     * <p>
     * (Required)
     */
    @Required
    private String location;
    /**
     * This specifies how many times Charging Station must retry
     * to download the firmware before giving up. If this field is not
     * present, it is left to Charging Station to decide how many times it wants to retry.
     * If the value is 0, it means: no retries.
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
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public PublishFirmwareRequest() {
    }

    /**
     * @param retries       This specifies how many times Charging Station must retry
     *                      to download the firmware before giving up. If this field is not
     *                      present, it is left to Charging Station to decide how many times it wants to retry.
     *                      If the value is 0, it means: no retries.
     *                      .
     * @param requestId     The Id of the request.
     *                      .
     * @param checksum      The MD5 checksum over the entire firmware file as a hexadecimal string of length 32.
     *                      .
     * @param location      This contains a string containing a URI pointing to a
     *                      location from which to retrieve the firmware.
     *                      .
     * @param retryInterval The interval in seconds
     *                      after which a retry may be
     *                      attempted. If this field is not
     *                      present, it is left to Charging
     *                      Station to decide how long to wait
     *                      between attempts.
     *                      .
     */
    public PublishFirmwareRequest(String location, Integer retries, String checksum, Integer requestId, Integer retryInterval, CustomData customData) {
        super();
        this.location = location;
        this.retries = retries;
        this.checksum = checksum;
        this.requestId = requestId;
        this.retryInterval = retryInterval;
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
     * This specifies how many times Charging Station must retry
     * to download the firmware before giving up. If this field is not
     * present, it is left to Charging Station to decide how many times it wants to retry.
     * If the value is 0, it means: no retries.
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * This specifies how many times Charging Station must retry
     * to download the firmware before giving up. If this field is not
     * present, it is left to Charging Station to decide how many times it wants to retry.
     * If the value is 0, it means: no retries.
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
        return null;
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
