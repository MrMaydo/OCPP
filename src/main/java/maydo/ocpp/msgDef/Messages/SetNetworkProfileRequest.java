package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.NetworkConnectionProfile;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class SetNetworkProfileRequest implements JsonInterface {

    /**
     * Slot in which the configuration should be stored.
     * 
     * (Required)
     */
    @Required
    private Integer configurationSlot;
    /**
     * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
     * 
     * (Required)
     */
    @Required
    private NetworkConnectionProfile connectionData;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SetNetworkProfileRequest() {
    }

    /**
     * 
     * @param configurationSlot
     *     Slot in which the configuration should be stored.
     *     .
     */
    public SetNetworkProfileRequest(Integer configurationSlot, NetworkConnectionProfile connectionData, CustomData customData) {
        super();
        this.configurationSlot = configurationSlot;
        this.connectionData = connectionData;
        this.customData = customData;
    }

    /**
     * Slot in which the configuration should be stored.
     * 
     * (Required)
     */
    public Integer getConfigurationSlot() {
        return configurationSlot;
    }

    /**
     * Slot in which the configuration should be stored.
     * 
     * (Required)
     */
    public void setConfigurationSlot(Integer configurationSlot) {
        this.configurationSlot = configurationSlot;
    }

    /**
     * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
     * 
     * (Required)
     */
    public NetworkConnectionProfile getConnectionData() {
        return connectionData;
    }

    /**
     * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
     * 
     * (Required)
     */
    public void setConnectionData(NetworkConnectionProfile connectionData) {
        this.connectionData = connectionData;
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
        if (!(obj instanceof SetNetworkProfileRequest))
            return false;
        SetNetworkProfileRequest that = (SetNetworkProfileRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.connectionData, that.connectionData) 
                && Objects.equals(this.configurationSlot, that.configurationSlot);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.connectionData != null ? this.connectionData.hashCode() : 0);
        result = 31 * result + (this.configurationSlot != null ? this.configurationSlot.hashCode() : 0);
        return result;
    }
}
