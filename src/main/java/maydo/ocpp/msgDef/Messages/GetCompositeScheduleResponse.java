package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CompositeSchedule;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.GenericStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetCompositeScheduleResponse implements JsonInterface {

    /**
     * The Charging Station will indicate if it was
     * able to process the request
     * <p>
     * (Required)
     */
    @Required
    private GenericStatusEnum status;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;
    @Optional
    private CompositeSchedule schedule;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetCompositeScheduleResponse() {
    }

    public GetCompositeScheduleResponse(GenericStatusEnum status, StatusInfo statusInfo, CompositeSchedule schedule, CustomData customData) {
        super();
        this.status = status;
        this.statusInfo = statusInfo;
        this.schedule = schedule;
        this.customData = customData;
    }

    /**
     * The Charging Station will indicate if it was
     * able to process the request
     * <p>
     * (Required)
     */
    public GenericStatusEnum getStatus() {
        return status;
    }

    /**
     * The Charging Station will indicate if it was
     * able to process the request
     * <p>
     * (Required)
     */
    public void setStatus(GenericStatusEnum status) {
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

    public CompositeSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(CompositeSchedule schedule) {
        this.schedule = schedule;
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
        json.add("schedule", schedule.toJsonObject());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("status")) {
            this.status = GenericStatusEnum.valueOf(jsonObject.get("status").getAsString());
        }

        if (jsonObject.has("statusInfo")) {
            this.statusInfo = new StatusInfo();
            this.statusInfo.fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("schedule")) {
            this.schedule = new CompositeSchedule();
            this.schedule.fromJsonObject(jsonObject.getAsJsonObject("schedule"));
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
        if (!(obj instanceof GetCompositeScheduleResponse))
            return false;
        GetCompositeScheduleResponse that = (GetCompositeScheduleResponse) obj;
        return Objects.equals(this.schedule, that.schedule)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.schedule != null ? this.schedule.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
