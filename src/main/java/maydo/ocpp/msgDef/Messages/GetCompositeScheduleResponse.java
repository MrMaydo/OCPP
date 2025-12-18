package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CompositeSchedule;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.GenericStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the GetCompositeScheduleResponse PDU sent by the Charging Station to the CSMS in
 * response to a GetCompositeScheduleRequest.
 */
public class GetCompositeScheduleResponse implements JsonInterface {

    /**
     * The Charging Station will indicate if it was able to process the request
     */
    @Required
    private GenericStatusEnum status;

    /**
     * Detailed status information.
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     * This field contains the calculated composite schedule.
     * It may only be omitted when this message contains status Rejected.
     */
    @Optional
    private CompositeSchedule schedule;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetCompositeScheduleResponse() {
    }


    public GenericStatusEnum getStatus() {
        return status;
    }


    public void setStatus(GenericStatusEnum status) {
        this.status = status;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    public CompositeSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(CompositeSchedule schedule) {
        this.schedule = schedule;
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

        json.addProperty("status", getStatus().toString());

        if (getStatusInfo() != null) {
            json.add("statusInfo", getStatusInfo().toJsonObject());
        }
        if (getSchedule() != null) {
            json.add("schedule", getSchedule().toJsonObject());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

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
            setStatus(GenericStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("schedule")) {
            setSchedule(new CompositeSchedule());
            getSchedule().fromJsonObject(jsonObject.getAsJsonObject("schedule"));
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
        if (!(obj instanceof GetCompositeScheduleResponse))
            return false;
        GetCompositeScheduleResponse that = (GetCompositeScheduleResponse) obj;
        return Objects.equals(getStatus(), that.getStatus())
                && Objects.equals(getStatusInfo(), that.getStatusInfo())
                && Objects.equals(getSchedule(), that.getSchedule())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getStatus(),
                getStatusInfo(),
                getSchedule(),
                getCustomData()
        );
    }
}
