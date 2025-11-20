package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.EnergyTransferModeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class NotifyAllowedEnergyTransferRequest implements JsonInterface {

    /**
     * The transaction for which the allowed energy transfer is allowed.
     * <p>
     * (Required)
     */
    @Required
    private String transactionId;
    /**
     * Modes of energy transfer that are accepted by CSMS.
     * <p>
     * (Required)
     */
    @Required
    private List<EnergyTransferModeEnum> allowedEnergyTransfer;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyAllowedEnergyTransferRequest() {
    }

    /**
     * @param allowedEnergyTransfer Modes of energy transfer that are accepted by CSMS.
     *                              .
     * @param transactionId         The transaction for which the allowed energy transfer is allowed.
     *                              .
     */
    public NotifyAllowedEnergyTransferRequest(String transactionId, List<EnergyTransferModeEnum> allowedEnergyTransfer, CustomData customData) {
        super();
        this.transactionId = transactionId;
        this.allowedEnergyTransfer = allowedEnergyTransfer;
        this.customData = customData;
    }

    /**
     * The transaction for which the allowed energy transfer is allowed.
     * <p>
     * (Required)
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * The transaction for which the allowed energy transfer is allowed.
     * <p>
     * (Required)
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Modes of energy transfer that are accepted by CSMS.
     * <p>
     * (Required)
     */
    public List<EnergyTransferModeEnum> getAllowedEnergyTransfer() {
        return allowedEnergyTransfer;
    }

    /**
     * Modes of energy transfer that are accepted by CSMS.
     * <p>
     * (Required)
     */
    public void setAllowedEnergyTransfer(List<EnergyTransferModeEnum> allowedEnergyTransfer) {
        this.allowedEnergyTransfer = allowedEnergyTransfer;
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

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof NotifyAllowedEnergyTransferRequest))
            return false;
        NotifyAllowedEnergyTransferRequest that = (NotifyAllowedEnergyTransferRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.allowedEnergyTransfer, that.allowedEnergyTransfer)
                && Objects.equals(this.transactionId, that.transactionId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.allowedEnergyTransfer != null ? this.allowedEnergyTransfer.hashCode() : 0);
        result = 31 * result + (this.transactionId != null ? this.transactionId.hashCode() : 0);
        return result;
    }
}
