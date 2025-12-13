package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.LogParameters;
import maydo.ocpp.msgDef.Enumerations.LogEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the GetLogRequest PDU sent by the CSMS to the Charging Station.
 */
public class GetLogRequest implements JsonInterface {

    /**
     * This field specifies the requested log and the location to which the log should be sent.
     */
    @Required
    private LogParameters log;

    /**
     * This contains the type of log file that the Charging Station should send.
     */
    @Required
    private LogEnum logType;

    /**
     * The Id of this request
     */
    @Required
    private Integer requestId;

    /**
     * This specifies how many times the Charging Station must retry to upload the log before giving up.
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
     *
     */
    @Optional
    private CustomData customData;


    public GetLogRequest() {
    }


    public LogParameters getLog() {
        return log;
    }


    public void setLog(LogParameters log) {
        this.log = log;
    }


    public LogEnum getLogType() {
        return logType;
    }


    public void setLogType(LogEnum logType) {
        this.logType = logType;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("log")) {
            setLog(new LogParameters());
            getLog().fromJsonObject(jsonObject.getAsJsonObject("log"));
        }

        if (jsonObject.has("logType")) {
            setLogType(LogEnum.valueOf(jsonObject.get("logType").getAsString()));
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("retries")) {
            setRetries(jsonObject.get("retries").getAsInt());
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
