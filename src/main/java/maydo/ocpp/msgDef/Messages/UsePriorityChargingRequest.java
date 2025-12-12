package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * (2.1) Message sent by CSMS to tell Charging Station to switch to the priority charging profile,
 * that allows for the maximum possible current or power under current circumstances.
 * Message contains a transactionId, because it only applies to the transaction in progress.
 */
public class UsePriorityChargingRequest implements JsonInterface {

    /**
     * The transaction for which priority charging is requested.
     */
    @Required
    private String transactionId;

    /**
     * True to request priority charging. False to request stopping priority charging.
     */
    @Required
    private Boolean activate;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public UsePriorityChargingRequest() {
    }


    public String getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public Boolean getActivate() {
        return activate;
    }


    public void setActivate(Boolean activate) {
        this.activate = activate;
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
        json.addProperty("transactionId", transactionId);
        json.addProperty("activate", activate);
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
        if (jsonObject.has("transactionId")) {
            this.transactionId = jsonObject.get("transactionId").getAsString();
        }

        if (jsonObject.has("activate")) {
            this.activate = jsonObject.get("activate").getAsBoolean();
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
        if (!(obj instanceof UsePriorityChargingRequest))
            return false;
        UsePriorityChargingRequest that = (UsePriorityChargingRequest) obj;
        return Objects.equals(this.activate, that.activate)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.transactionId, that.transactionId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.activate != null ? this.activate.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        return result;
    }
}
