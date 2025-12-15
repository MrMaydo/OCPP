package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ClearMonitoringResult;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the ClearVariableMonitoringResponse PDU sent by the Charging Station to the CSMS.
 */
public class ClearVariableMonitoringResponse implements JsonInterface {

    /**
     * List of status per monitor.
     */
    @Required
    private List<ClearMonitoringResult> clearMonitoringResult;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ClearVariableMonitoringResponse() {
    }


    public List<ClearMonitoringResult> getClearMonitoringResult() {
        return clearMonitoringResult;
    }


    public void setClearMonitoringResult(List<ClearMonitoringResult> clearMonitoringResult) {
        this.clearMonitoringResult = clearMonitoringResult;
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

        JsonArray clearMonitoringResultArray = new JsonArray();
        for (ClearMonitoringResult item : getClearMonitoringResult()) {
            clearMonitoringResultArray.add(item.toJsonObject());
        }
        json.add("clearMonitoringResult", clearMonitoringResultArray);

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
        if (jsonObject.has("clearMonitoringResult")) {
            setClearMonitoringResult(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("clearMonitoringResult");
            for (JsonElement el : arr) {
                ClearMonitoringResult item = new ClearMonitoringResult();
                item.fromJsonObject(el.getAsJsonObject());
                getClearMonitoringResult().add(item);
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
        if (!(obj instanceof ClearVariableMonitoringResponse))
            return false;
        ClearVariableMonitoringResponse that = (ClearVariableMonitoringResponse) obj;
        return Objects.equals(this.clearMonitoringResult, that.clearMonitoringResult)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.clearMonitoringResult != null ? this.clearMonitoringResult.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
