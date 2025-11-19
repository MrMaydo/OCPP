package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Electric Vehicle Supply Equipment
 */
public class EVSE implements JsonInterface {

    /**
     * EVSE Identifier. This contains a number (&gt; 0) designating an EVSE of the Charging Station.
     * <p>
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * An id to designate a specific connector (on an EVSE) by connector index number.
     */
    @Optional
    private Integer connectorId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public EVSE() {
    }

    /**
     * @param connectorId An id to designate a specific connector (on an EVSE) by connector index number.
     *                    .
     * @param id          EVSE Identifier. This contains a number (&gt; 0) designating an EVSE of the Charging Station.
     *                    .
     */
    public EVSE(Integer id, Integer connectorId, CustomData customData) {
        super();
        this.id = id;
        this.connectorId = connectorId;
        this.customData = customData;
    }

    /**
     * EVSE Identifier. This contains a number (&gt; 0) designating an EVSE of the Charging Station.
     * <p>
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * EVSE Identifier. This contains a number (&gt; 0) designating an EVSE of the Charging Station.
     * <p>
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * An id to designate a specific connector (on an EVSE) by connector index number.
     */
    public Integer getConnectorId() {
        return connectorId;
    }

    /**
     * An id to designate a specific connector (on an EVSE) by connector index number.
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
        if (!(obj instanceof EVSE))
            return false;
        EVSE that = (EVSE) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.connectorId, that.connectorId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.connectorId != null ? this.connectorId.hashCode() : 0);
        return result;
    }
}
