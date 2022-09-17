
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.NetworkConnectionProfile;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SetNetworkProfileRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Slot in which the configuration should be stored.
     * 
     * (Required)
     * 
     */
    private Integer configurationSlot;
    /**
     * Communication_ Function
     * urn:x-oca:ocpp:uid:2:233304
     * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
     * 
     * (Required)
     * 
     */
    private NetworkConnectionProfile connectionData;

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
     * Slot in which the configuration should be stored.
     * 
     * (Required)
     * 
     */
    public Integer getConfigurationSlot() {
        return configurationSlot;
    }

    /**
     * Slot in which the configuration should be stored.
     * 
     * (Required)
     * 
     */
    public void setConfigurationSlot(Integer configurationSlot) {
        this.configurationSlot = configurationSlot;
    }

    /**
     * Communication_ Function
     * urn:x-oca:ocpp:uid:2:233304
     * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
     * 
     * (Required)
     * 
     */
    public NetworkConnectionProfile getConnectionData() {
        return connectionData;
    }

    /**
     * Communication_ Function
     * urn:x-oca:ocpp:uid:2:233304
     * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
     * 
     * (Required)
     * 
     */
    public void setConnectionData(NetworkConnectionProfile connectionData) {
        this.connectionData = connectionData;
    }

}
