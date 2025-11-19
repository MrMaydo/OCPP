package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class CancelReservationRequest {

    /**
     * Id of the reservation to cancel.
     * 
     * (Required)
     */
    @Required
    private Integer reservationId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public CancelReservationRequest() {
    }

    /**
     * 
     * @param reservationId
     *     Id of the reservation to cancel.
     *     .
     */
    public CancelReservationRequest(Integer reservationId, CustomData customData) {
        super();
        this.reservationId = reservationId;
        this.customData = customData;
    }

    /**
     * Id of the reservation to cancel.
     * 
     * (Required)
     */
    public Integer getReservationId() {
        return reservationId;
    }

    /**
     * Id of the reservation to cancel.
     * 
     * (Required)
     */
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
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
        if (!(obj instanceof CancelReservationRequest))
            return false;
        CancelReservationRequest that = (CancelReservationRequest) obj;
        return Objects.equals(this.reservationId, that.reservationId)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.reservationId != null ? this.reservationId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
