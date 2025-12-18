package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the ClearVariableMonitoringRequest PDU sent by the CSMS to the Charging Station.
 */
public class ClearVariableMonitoringRequest implements JsonInterface {

    /**
     * List of the monitors to be cleared, identified by there Id.
     */
    @Required
    private List<Integer> id;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ClearVariableMonitoringRequest() {
    }


    public List<Integer> getId() {
        return id;
    }


    public void setId(List<Integer> id) {
        this.id = id;
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

        JsonArray idArray = new JsonArray();
        for (Integer item : getId()) {
            idArray.add(item);
        }
        json.add("id", idArray);

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
        if (jsonObject.has("id")) {
            setId(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("id");
            for (JsonElement el : arr) {
                getId().add(el.getAsInt());
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
        if (!(obj instanceof ClearVariableMonitoringRequest))
            return false;
        ClearVariableMonitoringRequest that = (ClearVariableMonitoringRequest) obj;
        return Objects.equals(getId(), that.getId())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getId(),
                getCustomData()
        );
    }
}
