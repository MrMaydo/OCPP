package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ResetEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class ResetRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * This contains the type of reset that the Charging Station or EVSE should perform.
     * <p>
     * (Required)
     */
    @Required
    private ResetEnum type;
    /**
     * This contains the ID of a specific EVSE that needs to be reset, instead of the entire Charging Station.
     */
    @Optional
    private Integer evseId;

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
     * This contains the type of reset that the Charging Station or EVSE should perform.
     * <p>
     * (Required)
     */
    public ResetEnum getType() {
        return type;
    }

    /**
     * This contains the type of reset that the Charging Station or EVSE should perform.
     * <p>
     * (Required)
     */
    public void setType(ResetEnum type) {
        this.type = type;
    }

    /**
     * This contains the ID of a specific EVSE that needs to be reset, instead of the entire Charging Station.
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * This contains the ID of a specific EVSE that needs to be reset, instead of the entire Charging Station.
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
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
        if (!(obj instanceof ResetRequest))
            return false;
        ResetRequest that = (ResetRequest) obj;
        return Objects.equals(customData, that.customData)
                && type == that.type
                && Objects.equals(evseId, that.evseId);
    }

    @Override
    public int hashCode() {
        int result = (type != null ? type.hashCode() : 0);
        result = 31 * result + (evseId != null ? evseId.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
