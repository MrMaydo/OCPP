package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.EnergyTransferModeEnum;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class NotifyAllowedEnergyTransferRequest {

    /**
     * The transaction for which the allowed energy transfer is allowed.
     * 
     * (Required)
     */
    @Required
    private String transactionId;
    /**
     * Modes of energy transfer that are accepted by CSMS.
     * 
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
     * 
     * @param allowedEnergyTransfer
     *     Modes of energy transfer that are accepted by CSMS.
     *     .
     * @param transactionId
     *     The transaction for which the allowed energy transfer is allowed.
     *     .
     */
    public NotifyAllowedEnergyTransferRequest(String transactionId, List<EnergyTransferModeEnum> allowedEnergyTransfer, CustomData customData) {
        super();
        this.transactionId = transactionId;
        this.allowedEnergyTransfer = allowedEnergyTransfer;
        this.customData = customData;
    }

    /**
     * The transaction for which the allowed energy transfer is allowed.
     * 
     * (Required)
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * The transaction for which the allowed energy transfer is allowed.
     * 
     * (Required)
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Modes of energy transfer that are accepted by CSMS.
     * 
     * (Required)
     */
    public List<EnergyTransferModeEnum> getAllowedEnergyTransfer() {
        return allowedEnergyTransfer;
    }

    /**
     * Modes of energy transfer that are accepted by CSMS.
     * 
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
