package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.NetworkConnectionProfile;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

public class SetNetworkProfileRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Slot in which the configuration should be stored.
     * <p>
     * (Required)
     */
    @Required
    private Integer configurationSlot;
    /**
     * Communication_ Function
     * urn:x-oca:ocpp:uid:2:233304
     * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
     * <p>
     * (Required)
     */
    @Required
    private NetworkConnectionProfile connectionData;

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
     * Slot in which the configuration should be stored.
     * <p>
     * (Required)
     */
    public Integer getConfigurationSlot() {
        return configurationSlot;
    }

    /**
     * Slot in which the configuration should be stored.
     * <p>
     * (Required)
     */
    public void setConfigurationSlot(Integer configurationSlot) {
        this.configurationSlot = configurationSlot;
    }

    /**
     * Communication_ Function
     * urn:x-oca:ocpp:uid:2:233304
     * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
     * <p>
     * (Required)
     */
    public NetworkConnectionProfile getConnectionData() {
        return connectionData;
    }

    /**
     * Communication_ Function
     * urn:x-oca:ocpp:uid:2:233304
     * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
     * <p>
     * (Required)
     */
    public void setConnectionData(NetworkConnectionProfile connectionData) {
        this.connectionData = connectionData;
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
