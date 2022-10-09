
package maydo.ocpp.msgDef.Messages;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.Firmware;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class UpdateFirmwareRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This specifies how many times Charging Station must try to download the firmware before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
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
     * The Id of this request
     * 
     * (Required)
     * 
     */
    private Integer requestId;
    /**
     * Firmware
     * urn:x-enexis:ecdm:uid:2:233291
     * Represents a copy of the firmware that can be loaded/updated on the Charging Station.
     * 
     * (Required)
     * 
     */
    private Firmware firmware;

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
     * This specifies how many times Charging Station must try to download the firmware before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
     * 
     * 
     */
    public Integer getRetries() {
        return retries;
    }

    /**
     * This specifies how many times Charging Station must try to download the firmware before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
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
     * Firmware
     * urn:x-enexis:ecdm:uid:2:233291
     * Represents a copy of the firmware that can be loaded/updated on the Charging Station.
     * 
     * (Required)
     * 
     */
    public Firmware getFirmware() {
        return firmware;
    }

    /**
     * Firmware
     * urn:x-enexis:ecdm:uid:2:233291
     * Represents a copy of the firmware that can be loaded/updated on the Charging Station.
     * 
     * (Required)
     * 
     */
    public void setFirmware(Firmware firmware) {
        this.firmware = firmware;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
