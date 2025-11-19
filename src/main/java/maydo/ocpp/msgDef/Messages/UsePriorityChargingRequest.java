package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class UsePriorityChargingRequest {

    /**
     * The transaction for which priority charging is requested.
     * 
     * (Required)
     */
    @Required
    private String transactionId;
    /**
     * True to request priority charging.
     * False to request stopping priority charging.
     * 
     * (Required)
     */
    @Required
    private Boolean activate;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public UsePriorityChargingRequest() {
    }

    /**
     * 
     * @param activate
     *     True to request priority charging.
     *     False to request stopping priority charging.
     *     .
     * @param transactionId
     *     The transaction for which priority charging is requested.
     *     .
     */
    public UsePriorityChargingRequest(String transactionId, Boolean activate, CustomData customData) {
        super();
        this.transactionId = transactionId;
        this.activate = activate;
        this.customData = customData;
    }

    /**
     * The transaction for which priority charging is requested.
     * 
     * (Required)
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * The transaction for which priority charging is requested.
     * 
     * (Required)
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * True to request priority charging.
     * False to request stopping priority charging.
     * 
     * (Required)
     */
    public Boolean getActivate() {
        return activate;
    }

    /**
     * True to request priority charging.
     * False to request stopping priority charging.
     * 
     * (Required)
     */
    public void setActivate(Boolean activate) {
        this.activate = activate;
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
