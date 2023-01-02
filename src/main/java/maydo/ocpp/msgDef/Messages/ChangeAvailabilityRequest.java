package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.EVSE;
import maydo.ocpp.msgDef.Enumerations.OperationalStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class ChangeAvailabilityRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     */
    @Optional
    private EVSE evse;
    /**
     * This contains the type of availability change that the Charging Station should perform.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private OperationalStatusEnum operationalStatus;

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
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     */
    public EVSE getEvse() {
        return evse;
    }

    /**
     * EVSE
     * urn:x-oca:ocpp:uid:2:233123
     * Electric Vehicle Supply Equipment
     */
    public void setEvse(EVSE evse) {
        this.evse = evse;
    }

    /**
     * This contains the type of availability change that the Charging Station should perform.
     * <p>
     * <p>
     * (Required)
     */
    public OperationalStatusEnum getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * This contains the type of availability change that the Charging Station should perform.
     * <p>
     * <p>
     * (Required)
     */
    public void setOperationalStatus(OperationalStatusEnum operationalStatus) {
        this.operationalStatus = operationalStatus;
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
        if (!(obj instanceof ChangeAvailabilityRequest))
            return false;
        ChangeAvailabilityRequest that = (ChangeAvailabilityRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(evse, that.evse)
                && operationalStatus == that.operationalStatus;
    }

    @Override
    public int hashCode() {
        int result = (evse != null ? evse.hashCode() : 0);
        result = 31 * result + (operationalStatus != null ? operationalStatus.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
