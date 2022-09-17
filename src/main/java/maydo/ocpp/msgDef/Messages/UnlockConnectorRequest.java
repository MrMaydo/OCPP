
package maydo.ocpp.msgDef.Messages;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class UnlockConnectorRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This contains the identifier of the EVSE for which a connector needs to be unlocked.
     * 
     * (Required)
     * 
     */
    private Integer evseId;
    /**
     * This contains the identifier of the connector that needs to be unlocked.
     * 
     * (Required)
     * 
     */
    private Integer connectorId;

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
     * This contains the identifier of the EVSE for which a connector needs to be unlocked.
     * 
     * (Required)
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * This contains the identifier of the EVSE for which a connector needs to be unlocked.
     * 
     * (Required)
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * This contains the identifier of the connector that needs to be unlocked.
     * 
     * (Required)
     * 
     */
    public Integer getConnectorId() {
        return connectorId;
    }

    /**
     * This contains the identifier of the connector that needs to be unlocked.
     * 
     * (Required)
     * 
     */
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

}
