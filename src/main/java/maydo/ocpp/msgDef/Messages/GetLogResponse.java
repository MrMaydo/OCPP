package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.LogStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetLogResponse implements JsonInterface {

    /**
     * This field indicates whether the Charging Station was able to accept the request.
     * <p>
     * (Required)
     */
    @Required
    private LogStatusEnum status;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;
    /**
     * This contains the name of the log file that will be uploaded. This field is not present when no logging information is available.
     */
    @Optional
    private String filename;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetLogResponse() {
    }

    /**
     * @param filename This contains the name of the log file that will be uploaded. This field is not present when no logging information is available.
     *                 .
     */
    public GetLogResponse(LogStatusEnum status, StatusInfo statusInfo, String filename, CustomData customData) {
        super();
        this.status = status;
        this.statusInfo = statusInfo;
        this.filename = filename;
        this.customData = customData;
    }

    /**
     * This field indicates whether the Charging Station was able to accept the request.
     * <p>
     * (Required)
     */
    public LogStatusEnum getStatus() {
        return status;
    }

    /**
     * This field indicates whether the Charging Station was able to accept the request.
     * <p>
     * (Required)
     */
    public void setStatus(LogStatusEnum status) {
        this.status = status;
    }

    /**
     * Element providing more information about the status.
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    /**
     * This contains the name of the log file that will be uploaded. This field is not present when no logging information is available.
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This contains the name of the log file that will be uploaded. This field is not present when no logging information is available.
     */
    public void setFilename(String filename) {
        this.filename = filename;
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
        json.addProperty("status", status.toString());
        json.add("statusInfo", statusInfo.toJsonObject());
        json.addProperty("filename", filename);
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
