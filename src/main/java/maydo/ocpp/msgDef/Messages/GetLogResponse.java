package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.LogStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class GetLogResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetLogResponse))
            return false;
        GetLogResponse that = (GetLogResponse) obj;
        return Objects.equals(customData, that.customData)
                && status == that.status
                && Objects.equals(statusInfo, that.statusInfo)
                && Objects.equals(filename, that.filename);
    }

    @Override
    public int hashCode() {
        int result = (status != null ? status.hashCode() : 0);
        result = 31 * result + (statusInfo != null ? statusInfo.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
