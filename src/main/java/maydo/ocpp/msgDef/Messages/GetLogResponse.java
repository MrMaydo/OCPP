
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.LogStatusEnum;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GetLogResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This field indicates whether the Charging Station was able to accept the request.
     * 
     * (Required)
     * 
     */
    private LogStatusEnum status;
    /**
     * Element providing more information about the status.
     * 
     * 
     */
    private StatusInfo statusInfo;
    /**
     * This contains the name of the log file that will be uploaded. This field is not present when no logging information is available.
     * 
     * 
     */
    private String filename;

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
     * This field indicates whether the Charging Station was able to accept the request.
     * 
     * (Required)
     * 
     */
    public LogStatusEnum getStatus() {
        return status;
    }

    /**
     * This field indicates whether the Charging Station was able to accept the request.
     * 
     * (Required)
     * 
     */
    public void setStatus(LogStatusEnum status) {
        this.status = status;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     * 
     * 
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    /**
     * This contains the name of the log file that will be uploaded. This field is not present when no logging information is available.
     * 
     * 
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This contains the name of the log file that will be uploaded. This field is not present when no logging information is available.
     * 
     * 
     */
    public void setFilename(String filename) {
        this.filename = filename;
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
