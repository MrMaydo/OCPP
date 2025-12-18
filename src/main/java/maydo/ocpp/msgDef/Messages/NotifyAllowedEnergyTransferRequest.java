package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.EnergyTransferModeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * (2.1) Message sent by CSMS to update the list of authorized energy services,
 * e.g. to allow bidirectional charging for a charging  session that is already in progress.
 * One example is that the EV has already started a transaction in charging-only mode and meanwhile the CSMS has found
 * that this EV is authorized by some secondary actor, such as an aggregating party, to use bidirectional charging.
 * This message is then used to give the EV the opportunity to change energy service from charging-only to bidirectional charging.
 * Another example is that the CSMS wishes to change the active energy service.
 * This is done by updating the list of authorized energy services and omitting the currently active energy service.
 */
public class NotifyAllowedEnergyTransferRequest implements JsonInterface {

    /**
     * The transaction for which the allowed energy transfer is allowed.
     */
    @Required
    private String transactionId;

    /**
     * Modes of energy transfer that are accepted by CSMS.
     */
    @Required
    private List<EnergyTransferModeEnum> allowedEnergyTransfer;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyAllowedEnergyTransferRequest() {
    }


    public String getTransactionId() {
        return transactionId;
    }


    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    public List<EnergyTransferModeEnum> getAllowedEnergyTransfer() {
        return allowedEnergyTransfer;
    }


    public void setAllowedEnergyTransfer(List<EnergyTransferModeEnum> allowedEnergyTransfer) {
        this.allowedEnergyTransfer = allowedEnergyTransfer;
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

        JsonArray allowedEnergyTransferArray = new JsonArray();
        for (EnergyTransferModeEnum item : getAllowedEnergyTransfer()) {
            allowedEnergyTransferArray.add(item.toString());
        }
        json.add("allowedEnergyTransfer", allowedEnergyTransferArray);

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

        if (jsonObject.has("allowedEnergyTransfer")) {
            setAllowedEnergyTransfer(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("allowedEnergyTransfer");
            for (JsonElement el : arr) {
                getAllowedEnergyTransfer().add(EnergyTransferModeEnum.valueOf(el.getAsString()));
            }
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
        if (!(obj instanceof NotifyAllowedEnergyTransferRequest))
            return false;
        NotifyAllowedEnergyTransferRequest that = (NotifyAllowedEnergyTransferRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.allowedEnergyTransfer, that.allowedEnergyTransfer)
                && Objects.equals(this.transactionId, that.transactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getTransactionId(),
                getAllowedEnergyTransfer(),
                getCustomData()
        );
    }
}
