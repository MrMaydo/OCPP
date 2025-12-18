package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.SetVariableData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the SetVariablesRequest PDU sent by the CSMS to the Charging Station.
 */
public class SetVariablesRequest implements JsonInterface {

    /**
     * List of Component-Variable pairs and attribute values to set.
     */
    @Required
    private List<SetVariableData> setVariableData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetVariablesRequest() {
    }


    public List<SetVariableData> getSetVariableData() {
        return setVariableData;
    }


    public void setSetVariableData(List<SetVariableData> setVariableData) {
        this.setVariableData = setVariableData;
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

        JsonArray setVariableDataArray = new JsonArray();
        for (SetVariableData item : getSetVariableData()) {
            setVariableDataArray.add(item.toJsonObject());
        }
        json.add("setVariableData", setVariableDataArray);

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
        if (jsonObject.has("setVariableData")) {
            setSetVariableData(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("setVariableData");
            for (JsonElement el : arr) {
                SetVariableData item = new SetVariableData();
                item.fromJsonObject(el.getAsJsonObject());
                getSetVariableData().add(item);
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
        if (!(obj instanceof SetVariablesRequest))
            return false;
        SetVariablesRequest that = (SetVariablesRequest) obj;
        return Objects.equals(getSetVariableData(), that.getSetVariableData())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getSetVariableData(),
                getCustomData()
        );
    }
}
