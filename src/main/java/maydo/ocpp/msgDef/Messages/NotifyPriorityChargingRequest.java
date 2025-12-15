package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * (2.1) Message sent by Charging Station to notify CSMS that it has switched to the priority charging profile,
 * that allows for the maximum possible current or power under current circumstances.
 * Message contains a transactionId, because it only applies to the transaction in progress.
 */
public class NotifyPriorityChargingRequest implements JsonInterface {

    /**
     * The transaction for which priority charging is requested.
     */
    @Required
    private String transactionId;

    /**
     * True if priority charging was activated. False if it has stopped using the priority charging profile.
     */
    @Required
    private Boolean activated;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyPriorityChargingRequest() {
    }


    public String getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public Boolean getActivated() {
        return activated;
    }


    public void setActivated(Boolean activated) {
        this.activated = activated;
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

        json.addProperty("transactionId", getTransactionId());

        json.addProperty("activated", getActivated());

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
        if (jsonObject.has("transactionId")) {
            setTransactionId(jsonObject.get("transactionId").getAsString());
        }

        if (jsonObject.has("activated")) {
            setActivated(jsonObject.get("activated").getAsBoolean());
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
        if (!(obj instanceof NotifyPriorityChargingRequest))
            return false;
        NotifyPriorityChargingRequest that = (NotifyPriorityChargingRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.transactionId, that.transactionId)
                && Objects.equals(this.activated, that.activated);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        result = 31 * result + (this.activated != null ? this.activated.hashCode() : 0);
        return result;
    }
}
