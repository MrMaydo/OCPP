package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.LogParameters;
import maydo.ocpp.msgDef.Enumerations.LogEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class GetLogRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Log
     * urn:x-enexis:ecdm:uid:2:233373
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
     * This specifies how many times the Charging Station must try to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
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
     * Log
     * urn:x-enexis:ecdm:uid:2:233373
     * Generic class for the configuration of logging entries.
     * <p>
     * (Required)
     */
    public LogParameters getLog() {
        return log;
    }

    /**
     * Log
     * urn:x-enexis:ecdm:uid:2:233373
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
     * This specifies how many times the Charging Station must try to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * This specifies how many times the Charging Station must try to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
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
        if (!(obj instanceof GetLogRequest))
            return false;
        GetLogRequest that = (GetLogRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(log, that.log)
                && logType == that.logType
                && Objects.equals(requestId, that.requestId)
                && Objects.equals(retries, that.retries)
                && Objects.equals(retryInterval, that.retryInterval);
    }

    @Override
    public int hashCode() {
        int result = (log != null ? log.hashCode() : 0);
        result = 31 * result + (logType != null ? logType.hashCode() : 0);
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (retries != null ? retries.hashCode() : 0);
        result = 31 * result + (retryInterval != null ? retryInterval.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
