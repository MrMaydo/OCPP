package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class NotifyWebPaymentStartedRequest implements JsonInterface {

    /**
     * EVSE id for which transaction is requested.
     */
    @Required
    private Integer evseId;

    /**
     * Timeout value in seconds after which no result of web payment process (e.g. QR code scanning) is to be expected anymore.
     */
    @Required
    private Integer timeout;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyWebPaymentStartedRequest() {
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public Integer getTimeout() {
        return timeout;
    }


    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
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
        json.addProperty("evseId", evseId);
        json.addProperty("timeout", timeout);
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
        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
        }

        if (jsonObject.has("timeout")) {
            setTimeout(jsonObject.get("timeout").getAsInt());
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
        if (!(obj instanceof NotifyWebPaymentStartedRequest))
            return false;
        NotifyWebPaymentStartedRequest that = (NotifyWebPaymentStartedRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.timeout, that.timeout);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.timeout != null ? this.timeout.hashCode() : 0);
        return result;
    }
}
