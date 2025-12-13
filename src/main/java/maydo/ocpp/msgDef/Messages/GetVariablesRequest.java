package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.GetVariableData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the GetVariablesRequest PDU sent by the CSMS to the Charging Station.
 */
public class GetVariablesRequest implements JsonInterface {

    /**
     * List of requested variables.
     */
    @Required
    private List<GetVariableData> getVariableData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetVariablesRequest() {
    }


    public List<GetVariableData> getGetVariableData() {
        return getVariableData;
    }


    public void setGetVariableData(List<GetVariableData> getVariableData) {
        this.getVariableData = getVariableData;
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
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("getVariableData")) {
            setGetVariableData(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("getVariableData");
            for (JsonElement el : arr) {
                GetVariableData item = new GetVariableData();
                item.fromJsonObject(el.getAsJsonObject());
                getGetVariableData().add(item);
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
        if (!(obj instanceof GetVariablesRequest))
            return false;
        GetVariablesRequest that = (GetVariablesRequest) obj;
        return Objects.equals(this.getVariableData, that.getVariableData)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.getVariableData != null ? this.getVariableData.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
