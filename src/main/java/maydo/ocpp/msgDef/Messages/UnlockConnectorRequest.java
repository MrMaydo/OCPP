package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class UnlockConnectorRequest implements JsonInterface {

    /**
     * This contains the identifier of the EVSE for which a connector needs to be unlocked.
     * <p>
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * This contains the identifier of the connector that needs to be unlocked.
     * <p>
     * (Required)
     */
    @Required
    private Integer connectorId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public UnlockConnectorRequest() {
    }

    /**
     * @param evseId      This contains the identifier of the EVSE for which a connector needs to be unlocked.
     *                    .
     * @param connectorId This contains the identifier of the connector that needs to be unlocked.
     *                    .
     */
    public UnlockConnectorRequest(Integer evseId, Integer connectorId, CustomData customData) {
        super();
        this.evseId = evseId;
        this.connectorId = connectorId;
        this.customData = customData;
    }

    /**
     * This contains the identifier of the EVSE for which a connector needs to be unlocked.
     * <p>
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * This contains the identifier of the EVSE for which a connector needs to be unlocked.
     * <p>
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * This contains the identifier of the connector that needs to be unlocked.
     * <p>
     * (Required)
     */
    public Integer getConnectorId() {
        return connectorId;
    }

    /**
     * This contains the identifier of the connector that needs to be unlocked.
     * <p>
     * (Required)
     */
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
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
        if (!(obj instanceof UnlockConnectorRequest))
            return false;
        UnlockConnectorRequest that = (UnlockConnectorRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.connectorId, that.connectorId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.connectorId != null ? this.connectorId.hashCode() : 0);
        return result;
    }
}
