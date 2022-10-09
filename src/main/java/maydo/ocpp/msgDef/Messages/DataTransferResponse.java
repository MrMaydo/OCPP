package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.DataTransferStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

public class DataTransferResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * This indicates the success or failure of the data transfer.
     * <p>
     * (Required)
     */
    private DataTransferStatusEnum status;
    /**
     * Element providing more information about the status.
     */
    private StatusInfo statusInfo;
    /**
     * Data without specified length or format, in response to request.
     */
    private Object data;

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
     * This indicates the success or failure of the data transfer.
     * <p>
     * (Required)
     */
    public DataTransferStatusEnum getStatus() {
        return status;
    }

    /**
     * This indicates the success or failure of the data transfer.
     * <p>
     * (Required)
     */
    public void setStatus(DataTransferStatusEnum status) {
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
     * Data without specified length or format, in response to request.
     */
    public Object getData() {
        return data;
    }

    /**
     * Data without specified length or format, in response to request.
     */
    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
