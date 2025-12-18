package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.UnlockStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the UnlockConnectorResponse PDU sent by
 * the Charging Station to the CSMS in response to an UnlockConnectorRequest.
 */
public class UnlockConnectorResponse implements JsonInterface {

    /**
     * This indicates whether the Charging Station has unlocked the connector.
     */
    @Required
    private UnlockStatusEnum status;

    /**
     * Detailed status information.
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public UnlockConnectorResponse() {
    }


    public UnlockStatusEnum getStatus() {
        return status;
    }


    public void setStatus(UnlockStatusEnum status) {
        this.status = status;
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

        json.addProperty("status", getStatus().toString());

        if (getStatusInfo() != null) {
            json.add("statusInfo", getStatusInfo().toJsonObject());
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
            setStatus(UnlockStatusEnum.valueOf(jsonObject.get("status").getAsString()));
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
        if (!(obj instanceof UnlockConnectorResponse))
            return false;
        UnlockConnectorResponse that = (UnlockConnectorResponse) obj;
        return Objects.equals(getStatus(), that.getStatus())
                && Objects.equals(getStatusInfo(), that.getStatusInfo())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getStatus(),
                getStatusInfo(),
                getCustomData()
        );
    }
}
