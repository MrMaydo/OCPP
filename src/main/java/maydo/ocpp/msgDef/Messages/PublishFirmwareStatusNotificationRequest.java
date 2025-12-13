package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.PublishFirmwareStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the PublishFirmwareStatusNotificationRequest PDU sent by the Charging Station to the CSMS.
 */
public class PublishFirmwareStatusNotificationRequest implements JsonInterface {

    /**
     * This contains the progress status of the publishfirmware installation.
     */
    @Required
    private PublishFirmwareStatusEnum status;

    /**
     * Required if status is Published. Can be multiple URI’s, if the Local Controller supports e.g. HTTP, HTTPS, and FTP.
     */
    @Optional
    private List<String> location;

    /**
     * The request id that was provided in the PublishFirmwareRequest which triggered this action.
     */
    @Optional
    private Integer requestId;

    /**
     * (2.1) Detailed status info
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public PublishFirmwareStatusNotificationRequest() {
    }


    public PublishFirmwareStatusEnum getStatus() {
        return status;
    }


    public void setStatus(PublishFirmwareStatusEnum status) {
        this.status = status;
    }


    public List<String> getLocation() {
        return location;
    }


    public void setLocation(List<String> location) {
        this.location = location;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
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
        json.addProperty("requestId", requestId);
        json.add("statusInfo", statusInfo.toJsonObject());
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
            setStatus(PublishFirmwareStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("location")) {
            setLocation(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("location");
            for (JsonElement el : arr) {
                getLocation().add(el.getAsString());
            }
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
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
        if (!(obj instanceof PublishFirmwareStatusNotificationRequest))
            return false;
        PublishFirmwareStatusNotificationRequest that = (PublishFirmwareStatusNotificationRequest) obj;
        return Objects.equals(this.location, that.location)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.requestId, that.requestId)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.location != null ? this.location.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
