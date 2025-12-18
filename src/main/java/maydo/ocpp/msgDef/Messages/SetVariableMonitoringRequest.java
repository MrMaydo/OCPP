package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetMonitoringData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the SetVariableMonitoringRequest PDU sent by the CSMS to the Charging Station.
 */
public class SetVariableMonitoringRequest implements JsonInterface {

    /**
     * List of MonitoringData containing monitoring settings.
     */
    @Required
    private List<SetMonitoringData> setMonitoringData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetVariableMonitoringRequest() {
    }


    public List<SetMonitoringData> getSetMonitoringData() {
        return setMonitoringData;
    }


    public void setSetMonitoringData(List<SetMonitoringData> setMonitoringData) {
        this.setMonitoringData = setMonitoringData;
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

        JsonArray setMonitoringDataArray = new JsonArray();
        for (SetMonitoringData item : getSetMonitoringData()) {
            setMonitoringDataArray.add(item.toJsonObject());
        }
        json.add("setMonitoringData", setMonitoringDataArray);

        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("setMonitoringData")) {
            setSetMonitoringData(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("setMonitoringData");
            for (JsonElement el : arr) {
                SetMonitoringData item = new SetMonitoringData();
                item.fromJsonObject(el.getAsJsonObject());
                getSetMonitoringData().add(item);
            }
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
        if (!(obj instanceof SetVariableMonitoringRequest))
            return false;
        SetVariableMonitoringRequest that = (SetVariableMonitoringRequest) obj;
        return Objects.equals(getSetMonitoringData(), that.getSetMonitoringData())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getSetMonitoringData(),
                getCustomData()
        );
    }
}
