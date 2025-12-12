package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.Firmware;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the UpdateFirmwareRequest PDU sent by the CSMS to the Charging Station.
 */
public class UpdateFirmwareRequest implements JsonInterface {

    /**
     * This specifies how many times Charging Station must retry to download the firmware before giving up.
     * If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
     * If the value is 0, it means: no retries.
     */
    @Optional
    private Integer retries;

    /**
     * The interval in seconds after which a retry may be attempted.
     * If this field is not present, it is left to Charging Station to decide how long to wait between attempts.
     */
    @Optional
    private Integer retryInterval;

    /**
     * The Id of this request
     */
    @Required
    private Integer requestId;

    /**
     * Specifies the firmware to be updated on the Charging Station.
     */
    @Required
    private Firmware firmware;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public UpdateFirmwareRequest() {
    }


    public Integer getRetries() {
        return retries;
    }


    public void setRetries(Integer retries) {
        this.retries = retries;
    }


    public Integer getRetryInterval() {
        return retryInterval;
    }


    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public Firmware getFirmware() {
        return firmware;
    }


    public void setFirmware(Firmware firmware) {
        this.firmware = firmware;
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
        json.addProperty("retries", retries);
        json.addProperty("retryInterval", retryInterval);
        json.addProperty("requestId", requestId);
        json.add("firmware", firmware.toJsonObject());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("retries")) {
            this.retries = jsonObject.get("retries").getAsInt();
        }

        if (jsonObject.has("retryInterval")) {
            this.retryInterval = jsonObject.get("retryInterval").getAsInt();
        }

        if (jsonObject.has("requestId")) {
            this.requestId = jsonObject.get("requestId").getAsInt();
        }

        if (jsonObject.has("firmware")) {
            this.firmware = new Firmware();
            this.firmware.fromJsonObject(jsonObject.getAsJsonObject("firmware"));
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
        if (!(obj instanceof UpdateFirmwareRequest))
            return false;
        UpdateFirmwareRequest that = (UpdateFirmwareRequest) obj;
        return Objects.equals(this.retries, that.retries)
                && Objects.equals(this.retryInterval, that.retryInterval)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.firmware, that.firmware)
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.retries != null ? this.retries.hashCode() : 0);
        result = 31 * result + (this.retryInterval != null ? this.retryInterval.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.firmware != null ? this.firmware.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
