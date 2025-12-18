package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetMonitoringResult;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the SetVariableMonitoringResponse PDU sent by
 * the Charging Station to the CSMS in response to a SetVariableMonitoringRequest.
 */
public class SetVariableMonitoringResponse implements JsonInterface {

    /**
     * List of result statuses per monitor.
     */
    @Required
    private List<SetMonitoringResult> setMonitoringResult;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetVariableMonitoringResponse() {
    }


    public List<SetMonitoringResult> getSetMonitoringResult() {
        return setMonitoringResult;
    }


    public void setSetMonitoringResult(List<SetMonitoringResult> setMonitoringResult) {
        this.setMonitoringResult = setMonitoringResult;
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

        JsonArray setMonitoringResultArray = new JsonArray();
        for (SetMonitoringResult item : getSetMonitoringResult()) {
            setMonitoringResultArray.add(item.toJsonObject());
        }
        json.add("setMonitoringResult", setMonitoringResultArray);

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
        if (jsonObject.has("setMonitoringResult")) {
            setSetMonitoringResult(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("setMonitoringResult");
            for (JsonElement el : arr) {
                SetMonitoringResult item = new SetMonitoringResult();
                item.fromJsonObject(el.getAsJsonObject());
                getSetMonitoringResult().add(item);
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
        if (!(obj instanceof SetVariableMonitoringResponse))
            return false;
        SetVariableMonitoringResponse that = (SetVariableMonitoringResponse) obj;
        return Objects.equals(getSetMonitoringResult(), that.getSetMonitoringResult())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getSetMonitoringResult(),
                getCustomData()
        );
    }
}
