package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.NetworkConnectionProfile;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

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
        if (!(obj instanceof SetNetworkProfileRequest))
            return false;
        SetNetworkProfileRequest that = (SetNetworkProfileRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(configurationSlot, that.configurationSlot)
                && Objects.equals(connectionData, that.connectionData);
    }

    @Override
    public int hashCode() {
        int result = (configurationSlot != null ? configurationSlot.hashCode() : 0);
        result = 31 * result + (connectionData != null ? connectionData.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
