package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class NotifyPriorityChargingRequest implements JsonInterface {

    /**
     * The transaction for which priority charging is requested.
     * <p>
     * (Required)
     */
    @Required
    private String transactionId;
    /**
     * True if priority charging was activated. False if it has stopped using the priority charging profile.
     * <p>
     * (Required)
     */
    @Required
    private Boolean activated;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyPriorityChargingRequest() {
    }

    /**
     * @param transactionId The transaction for which priority charging is requested.
     *                      .
     * @param activated     True if priority charging was activated. False if it has stopped using the priority charging profile.
     *                      .
     */
    public NotifyPriorityChargingRequest(String transactionId, Boolean activated, CustomData customData) {
        super();
        this.transactionId = transactionId;
        this.activated = activated;
        this.customData = customData;
    }

    /**
     * The transaction for which priority charging is requested.
     * <p>
     * (Required)
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * The transaction for which priority charging is requested.
     * <p>
     * (Required)
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * True if priority charging was activated. False if it has stopped using the priority charging profile.
     * <p>
     * (Required)
     */
    public Boolean getActivated() {
        return activated;
    }

    /**
     * True if priority charging was activated. False if it has stopped using the priority charging profile.
     * <p>
     * (Required)
     */
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        JsonObject json = new JsonObject();
        json.addProperty("transactionId", transactionId);
        json.addProperty("activated", activated);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("transactionId")) {
            this.transactionId = jsonObject.get("transactionId").getAsString();
        }

        if (jsonObject.has("activated")) {
            this.activated = jsonObject.get("activated").getAsBoolean();
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
