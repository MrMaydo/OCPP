
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.LogEnum;
import maydo.ocpp.msgDef.DataTypes.LogParameters;
import maydo.ocpp.msgDef.JsonInterface;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GetLogRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Log
     * urn:x-enexis:ecdm:uid:2:233373
     * Generic class for the configuration of logging entries.
     * 
     * (Required)
     * 
     */
    private LogParameters log;
    /**
     * This contains the type of log file that the Charging Station
     * should send.
     * 
     * (Required)
     * 
     */
    private LogEnum logType;
    /**
     * The Id of this request
     * 
     * (Required)
     * 
     */
    private Integer requestId;
    /**
     * This specifies how many times the Charging Station must try to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
     * 
     * 
     */
    private Integer retries;
    /**
     * The interval in seconds after which a retry may be attempted. If this field is not present, it is left to Charging Station to decide how long to wait between attempts.
     * 
     * 
     */
    private Integer retryInterval;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * Log
     * urn:x-enexis:ecdm:uid:2:233373
     * Generic class for the configuration of logging entries.
     * 
     * (Required)
     * 
     */
    public LogParameters getLog() {
        return log;
    }

    /**
     * Log
     * urn:x-enexis:ecdm:uid:2:233373
     * Generic class for the configuration of logging entries.
     * 
     * (Required)
     * 
     */
    public void setLog(LogParameters log) {
        this.log = log;
    }

    /**
     * This contains the type of log file that the Charging Station
     * should send.
     * 
     * (Required)
     * 
     */
    public LogEnum getLogType() {
        return logType;
    }

    /**
     * This contains the type of log file that the Charging Station
     * should send.
     * 
     * (Required)
     * 
     */
    public void setLogType(LogEnum logType) {
        this.logType = logType;
    }

    /**
     * The Id of this request
     * 
     * (Required)
     * 
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of this request
     * 
     * (Required)
     * 
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * This specifies how many times the Charging Station must try to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
     * 
     * 
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * This specifies how many times the Charging Station must try to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
     * 
     * 
     */
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * The interval in seconds after which a retry may be attempted. If this field is not present, it is left to Charging Station to decide how long to wait between attempts.
     * 
     * 
     */
    public Integer getRetryInterval() {
        return retryInterval;
    }

    /**
     * The interval in seconds after which a retry may be attempted. If this field is not present, it is left to Charging Station to decide how long to wait between attempts.
     * 
     * 
     */
    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonElement toJsonObject(){
        JsonElement jsonObject= new Gson().toJsonTree(this);
        return jsonObject;
    }
}
