package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.ClearMonitoringStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class ClearMonitoringResult implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Result of the clear request for this monitor, identified by its Id.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private ClearMonitoringStatusEnum status;
    /**
     * Id of the monitor of which a clear was requested.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;

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
     * Result of the clear request for this monitor, identified by its Id.
     * <p>
     * <p>
     * (Required)
     */
    public ClearMonitoringStatusEnum getStatus() {
        return status;
    }

    /**
     * Result of the clear request for this monitor, identified by its Id.
     * <p>
     * <p>
     * (Required)
     */
    public void setStatus(ClearMonitoringStatusEnum status) {
        this.status = status;
    }

    /**
     * Id of the monitor of which a clear was requested.
     * <p>
     * <p>
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id of the monitor of which a clear was requested.
     * <p>
     * <p>
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
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
        if (!(obj instanceof ClearMonitoringResult))
            return false;
        ClearMonitoringResult that = (ClearMonitoringResult) obj;
        return Objects.equals(customData, that.customData)
                && status == that.status
                && Objects.equals(id, that.id)
                && Objects.equals(statusInfo, that.statusInfo);
    }

    @Override
    public int hashCode() {
        int result = (status != null ? status.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (statusInfo != null ? statusInfo.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
