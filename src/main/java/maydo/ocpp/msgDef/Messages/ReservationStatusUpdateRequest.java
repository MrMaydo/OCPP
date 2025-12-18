package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ReservationUpdateStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the ReservationStatusUpdateRequest PDU sent by the Charging Station to the CSMS.
 */
public class ReservationStatusUpdateRequest implements JsonInterface {

    /**
     * The ID of the reservation.
     */
    @Required
    private Integer reservationId;

    /**
     * The updated reservation status.
     */
    @Required
    private ReservationUpdateStatusEnum reservationUpdateStatus;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ReservationStatusUpdateRequest() {
    }


    public Integer getReservationId() {
        return reservationId;
    }


    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }


    public ReservationUpdateStatusEnum getReservationUpdateStatus() {
        return reservationUpdateStatus;
    }


    public void setReservationUpdateStatus(ReservationUpdateStatusEnum reservationUpdateStatus) {
        this.reservationUpdateStatus = reservationUpdateStatus;
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

        json.addProperty("reservationId", getReservationId());

        json.addProperty("reservationUpdateStatus", getReservationUpdateStatus().toString());

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
        if (jsonObject.has("reservationId")) {
            setReservationId(jsonObject.get("reservationId").getAsInt());
        }

        if (jsonObject.has("reservationUpdateStatus")) {
            setReservationUpdateStatus(ReservationUpdateStatusEnum.valueOf(jsonObject.get("reservationUpdateStatus").getAsString()));
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
        if (!(obj instanceof ReservationStatusUpdateRequest))
            return false;
        ReservationStatusUpdateRequest that = (ReservationStatusUpdateRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.reservationId, that.reservationId)
                && Objects.equals(this.reservationUpdateStatus, that.reservationUpdateStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getReservationId(),
                getReservationUpdateStatus(),
                getCustomData()
        );
    }
}
