package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ReservationUpdateStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class ReservationStatusUpdateRequest implements JsonInterface {

    /**
     * The ID of the reservation.
     * <p>
     * (Required)
     */
    @Required
    private Integer reservationId;
    /**
     * The updated reservation status.
     * <p>
     * (Required)
     */
    @Required
    private ReservationUpdateStatusEnum reservationUpdateStatus;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ReservationStatusUpdateRequest() {
    }

    /**
     * @param reservationId The ID of the reservation.
     *                      .
     */
    public ReservationStatusUpdateRequest(Integer reservationId, ReservationUpdateStatusEnum reservationUpdateStatus, CustomData customData) {
        super();
        this.reservationId = reservationId;
        this.reservationUpdateStatus = reservationUpdateStatus;
        this.customData = customData;
    }

    /**
     * The ID of the reservation.
     * <p>
     * (Required)
     */
    public Integer getReservationId() {
        return reservationId;
    }

    /**
     * The ID of the reservation.
     * <p>
     * (Required)
     */
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * The updated reservation status.
     * <p>
     * (Required)
     */
    public ReservationUpdateStatusEnum getReservationUpdateStatus() {
        return reservationUpdateStatus;
    }

    /**
     * The updated reservation status.
     * <p>
     * (Required)
     */
    public void setReservationUpdateStatus(ReservationUpdateStatusEnum reservationUpdateStatus) {
        this.reservationUpdateStatus = reservationUpdateStatus;
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
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ReservationStatusUpdateRequest))
            return false;
        ReservationStatusUpdateRequest that = (ReservationStatusUpdateRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.reservationId, that.reservationId)
                && Objects.equals(this.reservationUpdateStatus, that.reservationUpdateStatus);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.reservationId != null ? this.reservationId.hashCode() : 0);
        result = 31 * result + (this.reservationUpdateStatus != null ? this.reservationUpdateStatus.hashCode() : 0);
        return result;
    }
}
