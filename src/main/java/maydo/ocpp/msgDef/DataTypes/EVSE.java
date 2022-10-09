package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;


/**
 * EVSE
 * urn:x-oca:ocpp:uid:2:233123
 * Electric Vehicle Supply Equipment
 */
public class EVSE implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * EVSE Identifier. This contains a number (&gt; 0) designating an EVSE of the Charging Station.
     * <p>
     * (Required)
     */
    private Integer id;
    /**
     * An id to designate a specific connector (on an EVSE) by connector index number.
     */
    private Integer connectorId;

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
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
     * EVSE Identifier. This contains a number (&gt; 0) designating an EVSE of the Charging Station.
     * <p>
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Identified_ Object. MRID. Numeric_ Identifier
     * urn:x-enexis:ecdm:uid:1:569198
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
