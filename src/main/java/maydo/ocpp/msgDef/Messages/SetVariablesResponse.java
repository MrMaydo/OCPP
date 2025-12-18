package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetVariableResult;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the SetVariablesResponse PDU sent by
 * the Charging Station to the CSMS in response to a SetVariablesRequest.
 */
public class SetVariablesResponse implements JsonInterface {

    /**
     * List of result statuses per Component-Variable.
     */
    @Required
    private List<SetVariableResult> setVariableResult;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetVariablesResponse() {
    }


    public List<SetVariableResult> getSetVariableResult() {
        return setVariableResult;
    }


    public void setSetVariableResult(List<SetVariableResult> setVariableResult) {
        this.setVariableResult = setVariableResult;
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

        JsonArray setVariableResultArray = new JsonArray();
        for (SetVariableResult item : getSetVariableResult()) {
            setVariableResultArray.add(item.toJsonObject());
        }
        json.add("setVariableResult", setVariableResultArray);

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
        if (jsonObject.has("setVariableResult")) {
            setSetVariableResult(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("setVariableResult");
            for (JsonElement el : arr) {
                SetVariableResult item = new SetVariableResult();
                item.fromJsonObject(el.getAsJsonObject());
                getSetVariableResult().add(item);
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
        if (!(obj instanceof SetVariablesResponse))
            return false;
        SetVariablesResponse that = (SetVariablesResponse) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.setVariableResult, that.setVariableResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getSetVariableResult(),
                getCustomData()
        );
    }
}
