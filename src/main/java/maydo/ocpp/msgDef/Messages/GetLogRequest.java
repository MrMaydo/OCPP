package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.LogParameters;
import maydo.ocpp.msgDef.Enumerations.LogEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetLogRequest implements JsonInterface {

    /**
     * Generic class for the configuration of logging entries.
     * <p>
     * (Required)
     */
    @Required
    private LogParameters log;
    /**
     * This contains the type of log file that the Charging Station
     * should send.
     * <p>
     * (Required)
     */
    @Required
    private LogEnum logType;
    /**
     * The Id of this request
     * <p>
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * This specifies how many times the Charging Station must retry to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry. If the value is 0, it means: no retries.
     */
    @Optional
    private Integer retries;
    /**
     * The interval in seconds after which a retry may be attempted. If this field is not present, it is left to Charging Station to decide how long to wait between attempts.
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
    public GetLogRequest() {
    }

    /**
     * @param retries       This specifies how many times the Charging Station must retry to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry. If the value is 0, it means: no retries.
     *                      .
     * @param requestId     The Id of this request
     *                      .
     * @param retryInterval The interval in seconds after which a retry may be attempted. If this field is not present, it is left to Charging Station to decide how long to wait between attempts.
     *                      .
     */
    public GetLogRequest(LogParameters log, LogEnum logType, Integer requestId, Integer retries, Integer retryInterval, CustomData customData) {
        super();
        this.log = log;
        this.logType = logType;
        this.requestId = requestId;
        this.retries = retries;
        this.retryInterval = retryInterval;
        this.customData = customData;
    }

    /**
     * Generic class for the configuration of logging entries.
     * <p>
     * (Required)
     */
    public LogParameters getLog() {
        return log;
    }

    /**
     * Generic class for the configuration of logging entries.
     * <p>
     * (Required)
     */
    public void setLog(LogParameters log) {
        this.log = log;
    }

    /**
     * This contains the type of log file that the Charging Station
     * should send.
     * <p>
     * (Required)
     */
    public LogEnum getLogType() {
        return logType;
    }

    /**
     * This contains the type of log file that the Charging Station
     * should send.
     * <p>
     * (Required)
     */
    public void setLogType(LogEnum logType) {
        this.logType = logType;
    }

    /**
     * The Id of this request
     * <p>
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of this request
     * <p>
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * This specifies how many times the Charging Station must retry to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry. If the value is 0, it means: no retries.
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * This specifies how many times the Charging Station must retry to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry. If the value is 0, it means: no retries.
     */
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * The interval in seconds after which a retry may be attempted. If this field is not present, it is left to Charging Station to decide how long to wait between attempts.
     */
    public Integer getRetryInterval() {
        return retryInterval;
    }

    /**
     * The interval in seconds after which a retry may be attempted. If this field is not present, it is left to Charging Station to decide how long to wait between attempts.
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
        JsonObject json = new JsonObject();
        json.add("log", log.toJsonObject());
        json.addProperty("logType", logType.toString());
        json.addProperty("requestId", requestId);
        json.addProperty("retries", retries);
        json.addProperty("retryInterval", retryInterval);
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
        if (!(obj instanceof GetLogRequest))
            return false;
        GetLogRequest that = (GetLogRequest) obj;
        return Objects.equals(this.logType, that.logType)
                && Objects.equals(this.retries, that.retries)
                && Objects.equals(this.log, that.log)
                && Objects.equals(this.requestId, that.requestId)
                && Objects.equals(this.retryInterval, that.retryInterval)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.logType != null ? this.logType.hashCode() : 0);
        result = 31 * result + (this.retries != null ? this.retries.hashCode() : 0);
        result = 31 * result + (this.log != null ? this.log.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.retryInterval != null ? this.retryInterval.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
