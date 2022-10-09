
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

public class CancelReservationRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    private CustomData customData;
    /**
     * Id of the reservation to cancel.
     *
     * (Required)
     *
     */
    private Integer reservationId;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * Id of the reservation to cancel.
     *
     * (Required)
     *
     */
    public Integer getReservationId() {
        return reservationId;
    }

    /**
     * Id of the reservation to cancel.
     *
     * (Required)
     *
     */
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
