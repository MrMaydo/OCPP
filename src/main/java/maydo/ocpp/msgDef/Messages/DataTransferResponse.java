package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.DataTransferStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the DataTransferResponse PDU sent by
 * the Charging Station to the CSMS or vice versa in response to a DataTransferRequest.
 */
public class DataTransferResponse implements JsonInterface {

    /**
     * This indicates the success or failure of the data transfer.
     */
    @Required
    private DataTransferStatusEnum status;

    /**
     * Detailed status information.
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     * Data without specified length or format, in response to request.
     */
    @Optional
    private String data;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public DataTransferResponse() {
    }


    public DataTransferStatusEnum getStatus() {
        return status;
    }


    public void setStatus(DataTransferStatusEnum status) {
        this.status = status;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }


    public Object getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
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
        json.addProperty("data", data.toString());
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
            setStatus(DataTransferStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("data")) {
            setData(jsonObject.get("data").getAsString());
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
        if (!(obj instanceof DataTransferResponse))
            return false;
        DataTransferResponse that = (DataTransferResponse) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.data, that.data)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.data != null ? this.data.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
