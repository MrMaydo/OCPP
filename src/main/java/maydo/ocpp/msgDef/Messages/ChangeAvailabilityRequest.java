package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.EVSE;
import maydo.ocpp.msgDef.Enumerations.OperationalStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class ChangeAvailabilityRequest implements JsonInterface {

    /**
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
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ChangeAvailabilityRequest() {
    }

    public ChangeAvailabilityRequest(EVSE evse, OperationalStatusEnum operationalStatus, CustomData customData) {
        super();
        this.evse = evse;
        this.operationalStatus = operationalStatus;
        this.customData = customData;
    }

    /**
     * Electric Vehicle Supply Equipment
     */
    public EVSE getEvse() {
        return evse;
    }

    /**
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
        if (!(obj instanceof ChangeAvailabilityRequest))
            return false;
        ChangeAvailabilityRequest that = (ChangeAvailabilityRequest) obj;
        return Objects.equals(this.operationalStatus, that.operationalStatus)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.evse, that.evse);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.operationalStatus != null ? this.operationalStatus.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.evse != null ? this.evse.hashCode() : 0);
        return result;
    }
}
