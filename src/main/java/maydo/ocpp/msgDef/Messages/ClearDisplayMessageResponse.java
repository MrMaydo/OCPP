package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.ClearMessageStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class ClearDisplayMessageResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Returns whether the Charging Station has been able to remove the message.
     * <p>
     * (Required)
     */
    @Required
    private ClearMessageStatusEnum status;
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
     * Returns whether the Charging Station has been able to remove the message.
     * <p>
     * (Required)
     */
    public ClearMessageStatusEnum getStatus() {
        return status;
    }

    /**
     * Returns whether the Charging Station has been able to remove the message.
     * <p>
     * (Required)
     */
    public void setStatus(ClearMessageStatusEnum status) {
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
        if (!(obj instanceof ClearDisplayMessageResponse))
            return false;
        ClearDisplayMessageResponse that = (ClearDisplayMessageResponse) obj;
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
