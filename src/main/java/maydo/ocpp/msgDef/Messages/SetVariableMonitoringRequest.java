
package maydo.ocpp.msgDef.Messages;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetMonitoringData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SetVariableMonitoringRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * 
     * (Required)
     * 
     */
    private List<SetMonitoringData> setMonitoringData = null;

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
     * 
     * (Required)
     * 
     */
    public List<SetMonitoringData> getSetMonitoringData() {
        return setMonitoringData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setSetMonitoringData(List<SetMonitoringData> setMonitoringData) {
        this.setMonitoringData = setMonitoringData;
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
