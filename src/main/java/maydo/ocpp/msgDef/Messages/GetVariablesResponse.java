package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.GetVariableResult;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the GetVariablesResponse PDU sent by
 * the CSMS to the Charging Station in response to GetVariablesRequest.
 */
public class GetVariablesResponse implements JsonInterface {

    /**
     * List of requested variables and their values.
     */
    @Required
    private List<GetVariableResult> getVariableResult;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetVariablesResponse() {
    }

    public GetVariablesResponse(List<GetVariableResult> getVariableResult, CustomData customData) {
        super();
        this.getVariableResult = getVariableResult;
        this.customData = customData;
    }


    public List<GetVariableResult> getGetVariableResult() {
        return getVariableResult;
    }


    public void setGetVariableResult(List<GetVariableResult> getVariableResult) {
        this.getVariableResult = getVariableResult;
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
        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetVariablesResponse))
            return false;
        GetVariablesResponse that = (GetVariablesResponse) obj;
        return Objects.equals(this.getVariableResult, that.getVariableResult)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.getVariableResult != null ? this.getVariableResult.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
