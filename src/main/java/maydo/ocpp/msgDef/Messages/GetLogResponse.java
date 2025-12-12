package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.LogStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the GetLogResponse PDU sent by
 * the Charging Station to the CSMS in response to a GetLogRequest.
 */
public class GetLogResponse implements JsonInterface {

    /**
     * This field indicates whether the Charging Station was able to accept the request.
     */
    @Required
    private LogStatusEnum status;

    /**
     * Detailed status information.
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     * This contains the name of the log file that will be uploaded.
     * This field is not present when no logging information is available.
     */
    @Optional
    private String filename;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetLogResponse() {
    }


    public LogStatusEnum getStatus() {
        return status;
    }


    public void setStatus(LogStatusEnum status) {
        this.status = status;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }


    public String getFilename() {
        return filename;
    }


    public void setFilename(String filename) {
        this.filename = filename;
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
        json.addProperty("status", status.toString());
        json.add("statusInfo", statusInfo.toJsonObject());
        json.addProperty("filename", filename);
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
        if (jsonObject.has("status")) {
            this.status = LogStatusEnum.valueOf(jsonObject.get("status").getAsString());
        }

        if (jsonObject.has("statusInfo")) {
            this.statusInfo = new StatusInfo();
            this.statusInfo.fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("filename")) {
            this.filename = jsonObject.get("filename").getAsString();
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
        if (!(obj instanceof GetLogResponse))
            return false;
        GetLogResponse that = (GetLogResponse) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.filename, that.filename)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.filename != null ? this.filename.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
