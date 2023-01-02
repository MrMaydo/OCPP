package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ReservationUpdateStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class ReservationStatusUpdateRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
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
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public void setCustomData(CustomData customData) {
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ReservationStatusUpdateRequest))
            return false;
        ReservationStatusUpdateRequest that = (ReservationStatusUpdateRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(reservationId, that.reservationId)
                && reservationUpdateStatus == that.reservationUpdateStatus;
    }

    @Override
    public int hashCode() {
        int result = (reservationId != null ? reservationId.hashCode() : 0);
        result = 31 * result + (reservationUpdateStatus != null ? reservationUpdateStatus.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
