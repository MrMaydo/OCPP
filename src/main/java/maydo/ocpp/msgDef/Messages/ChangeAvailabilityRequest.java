package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.EVSE;
import maydo.ocpp.msgDef.Enumerations.OperationalStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the ChangeAvailabilityRequest PDU sent by the CSMS to the Charging Station.
 */
public class ChangeAvailabilityRequest implements JsonInterface {

    /**
     * Contains Id’s to designate a specific EVSE/connector by index numbers.
     * When omitted, the message refers to the Charging Station as a whole.
     */
    @Optional
    private EVSE evse;

    /**
     * This contains the type of availability change that the Charging Station should perform.
     */
    @Required
    private OperationalStatusEnum operationalStatus;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChangeAvailabilityRequest() {
    }


    public EVSE getEvse() {
        return evse;
    }


    public void setEvse(EVSE evse) {
        this.evse = evse;
    }


    public OperationalStatusEnum getOperationalStatus() {
        return operationalStatus;
    }


    public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
        this.operationalStatus = operationalStatus;
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

        if (getEvse() != null) {
            json.add("evse", getEvse().toJsonObject());
        }
        json.addProperty("operationalStatus", getOperationalStatus().toString());

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
        if (jsonObject.has("evse")) {
            setEvse(new EVSE());
            getEvse().fromJsonObject(jsonObject.getAsJsonObject("evse"));
        }

        if (jsonObject.has("operationalStatus")) {
            setOperationalStatus(OperationalStatusEnum.valueOf(jsonObject.get("operationalStatus").getAsString()));
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
        if (!(obj instanceof ChangeAvailabilityRequest))
            return false;
        ChangeAvailabilityRequest that = (ChangeAvailabilityRequest) obj;
        return Objects.equals(this.operationalStatus, that.operationalStatus)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.evse, that.evse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getEvse(),
                getOperationalStatus(),
                getCustomData()
        );
    }
}
