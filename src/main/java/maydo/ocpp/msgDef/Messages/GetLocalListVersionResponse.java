package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class GetLocalListVersionResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * This contains the current version number of the local authorization list in the Charging Station.
     * <p>
     * (Required)
     */
    @Required
    private Integer versionNumber;

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
     * This contains the current version number of the local authorization list in the Charging Station.
     * <p>
     * (Required)
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * This contains the current version number of the local authorization list in the Charging Station.
     * <p>
     * (Required)
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
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
        if (!(obj instanceof GetLocalListVersionResponse))
            return false;
        GetLocalListVersionResponse that = (GetLocalListVersionResponse) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(versionNumber, that.versionNumber);
    }

    @Override
    public int hashCode() {
        int result = (versionNumber != null ? versionNumber.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
