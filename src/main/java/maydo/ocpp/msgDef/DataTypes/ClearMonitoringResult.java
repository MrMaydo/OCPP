package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ClearMonitoringStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class ClearMonitoringResult implements JsonInterface {

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
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ClearMonitoringResult() {
    }

    /**
     * @param id Id of the monitor of which a clear was requested.
     *           <p>
     *           .
     */
    public ClearMonitoringResult(ClearMonitoringStatusEnum status, Integer id, StatusInfo statusInfo, CustomData customData) {
        super();
        this.status = status;
        this.id = id;
        this.statusInfo = statusInfo;
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
        json.addProperty("id", id);
        json.add("statusInfo", statusInfo.toJsonObject());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("status")) {
            this.status = ClearMonitoringStatusEnum.valueOf(jsonObject.get("status").getAsString());
        }

        if (jsonObject.has("id")) {
            this.id = jsonObject.get("id").getAsInt();
        }

        if (jsonObject.has("statusInfo")) {
            this.statusInfo = new StatusInfo();
            this.statusInfo.fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
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
        if (!(obj instanceof ClearMonitoringResult))
            return false;
        ClearMonitoringResult that = (ClearMonitoringResult) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
