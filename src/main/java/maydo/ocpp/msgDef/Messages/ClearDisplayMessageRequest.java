package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class ClearDisplayMessageRequest implements JsonInterface {

    /**
     * Id of the message that SHALL be removed from the Charging Station.
     * 
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ClearDisplayMessageRequest() {
    }

    /**
     * 
     * @param id
     *     Id of the message that SHALL be removed from the Charging Station.
     *     .
     */
    public ClearDisplayMessageRequest(Integer id, CustomData customData) {
        super();
        this.id = id;
        this.customData = customData;
    }

    /**
     * Id of the message that SHALL be removed from the Charging Station.
     * 
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id of the message that SHALL be removed from the Charging Station.
     * 
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
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
        if (!(obj instanceof ClearDisplayMessageRequest))
            return false;
        ClearDisplayMessageRequest that = (ClearDisplayMessageRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        return result;
    }
}
