package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.CancelReservationStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class CancelReservationResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * This indicates the success or failure of the canceling of a reservation by CSMS.
     * <p>
     * (Required)
     */
    @Required
    private CancelReservationStatusEnum status;
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
     * This indicates the success or failure of the canceling of a reservation by CSMS.
     * <p>
     * (Required)
     */
    public CancelReservationStatusEnum getStatus() {
        return status;
    }

    /**
     * This indicates the success or failure of the canceling of a reservation by CSMS.
     * <p>
     * (Required)
     */
    public void setStatus(CancelReservationStatusEnum status) {
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
        if (!(obj instanceof CancelReservationResponse))
            return false;
        CancelReservationResponse that = (CancelReservationResponse) obj;
        return Objects.equals(customData, that.customData)
                && status == that.status
                && Objects.equals(statusInfo, that.statusInfo);
    }

    @Override
    public int hashCode() {
        int result = (status != null ? status.hashCode() : 0);
        result = 31 * result + (statusInfo != null ? statusInfo.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
