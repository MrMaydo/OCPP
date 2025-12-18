package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the CancelReservationRequest PDU sent by the CSMS to the Charging Station.
 */
public class CancelReservationRequest implements JsonInterface {

    /**
     * Id of the reservation to cancel.
     */
    @Required
    private Integer reservationId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CancelReservationRequest() {
    }


    public Integer getReservationId() {
        return reservationId;
    }


    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
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

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof CancelReservationRequest))
            return false;
        CancelReservationRequest that = (CancelReservationRequest) obj;
        return Objects.equals(getReservationId(), that.getReservationId())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getReservationId(),
                getCustomData()
        );
    }
}
