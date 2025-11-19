package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetLocalListVersionResponse implements JsonInterface {

    /**
     * This contains the current version number of the local authorization list in the Charging Station.
     * 
     * (Required)
     */
    @Required
    private Integer versionNumber;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetLocalListVersionResponse() {
    }

    /**
     * 
     * @param versionNumber
     *     This contains the current version number of the local authorization list in the Charging Station.
     *     .
     */
    public GetLocalListVersionResponse(Integer versionNumber, CustomData customData) {
        super();
        this.versionNumber = versionNumber;
        this.customData = customData;
    }

    /**
     * This contains the current version number of the local authorization list in the Charging Station.
     * 
     * (Required)
     */
    public Integer getVersionNumber() {
        return versionNumber;
    }

    /**
     * This contains the current version number of the local authorization list in the Charging Station.
     * 
     * (Required)
     */
    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
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
        if (!(obj instanceof GetLocalListVersionResponse))
            return false;
        GetLocalListVersionResponse that = (GetLocalListVersionResponse) obj;
        return Objects.equals(this.versionNumber, that.versionNumber)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.versionNumber != null ? this.versionNumber.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
