package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.NetworkConnectionProfile;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * With this message the CSMS gains the ability to configure the connection data
 * (e.g. CSMS URL, OCPP version, APN, etc) on a Charging Station.
 */
public class SetNetworkProfileRequest implements JsonInterface {

    /**
     * Slot in which the configuration should be stored.
     */
    @Required
    private Integer configurationSlot;

    /**
     * Connection details.
     */
    @Required
    private NetworkConnectionProfile connectionData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetNetworkProfileRequest() {
    }


    public Integer getConfigurationSlot() {
        return configurationSlot;
    }


    public void setConfigurationSlot(Integer configurationSlot) {
        this.configurationSlot = configurationSlot;
    }


    public NetworkConnectionProfile getConnectionData() {
        return connectionData;
    }


    public void setConnectionData(NetworkConnectionProfile connectionData) {
        this.connectionData = connectionData;
    }


    public CustomData getCustomData() {
        return customData;
    }


    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        JsonObject json = new JsonObject();
        json.addProperty("configurationSlot", configurationSlot);
        json.add("connectionData", connectionData.toJsonObject());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("configurationSlot")) {
            setConfigurationSlot(jsonObject.get("configurationSlot").getAsInt());
        }

        if (jsonObject.has("connectionData")) {
            setConnectionData(new NetworkConnectionProfile());
            getConnectionData().fromJsonObject(jsonObject.getAsJsonObject("connectionData"));
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
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
