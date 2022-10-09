
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ResetEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

public class ResetRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * This contains the type of reset that the Charging Station or EVSE should perform.
     * 
     * (Required)
     * 
     */
    private ResetEnum type;
    /**
     * This contains the ID of a specific EVSE that needs to be reset, instead of the entire Charging Station.
     * 
     * 
     */
    private Integer evseId;

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
     * This contains the type of reset that the Charging Station or EVSE should perform.
     * 
     * (Required)
     * 
     */
    public ResetEnum getType() {
        return type;
    }

    /**
     * This contains the type of reset that the Charging Station or EVSE should perform.
     * 
     * (Required)
     * 
     */
    public void setType(ResetEnum type) {
        this.type = type;
    }

    /**
     * This contains the ID of a specific EVSE that needs to be reset, instead of the entire Charging Station.
     * 
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * This contains the ID of a specific EVSE that needs to be reset, instead of the entire Charging Station.
     * 
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
