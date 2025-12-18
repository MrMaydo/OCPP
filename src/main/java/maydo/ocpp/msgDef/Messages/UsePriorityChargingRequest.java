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

        json.addProperty("transactionId", getTransactionId());

        json.addProperty("activate", getActivate());

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

        if (jsonObject.has("activate")) {
            setActivate(jsonObject.get("activate").getAsBoolean());
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
        if (!(obj instanceof UsePriorityChargingRequest))
            return false;
        UsePriorityChargingRequest that = (UsePriorityChargingRequest) obj;
        return Objects.equals(getTransactionId(), that.getTransactionId())
                && Objects.equals(getActivate(), that.getActivate())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getTransactionId(),
                getActivate(),
                getCustomData()
        );
    }
}
