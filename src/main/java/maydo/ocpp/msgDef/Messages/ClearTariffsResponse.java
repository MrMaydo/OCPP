package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ClearTariffsResult;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 *
 */
public class ClearTariffsResponse implements JsonInterface {

    /**
     * Result per tariff.
     */
    @Required
    private List<ClearTariffsResult> clearTariffsResult;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ClearTariffsResponse() {
    }

    public ClearTariffsResponse(List<ClearTariffsResult> clearTariffsResult, CustomData customData) {
        super();
        this.clearTariffsResult = clearTariffsResult;
        this.customData = customData;
    }


    public List<ClearTariffsResult> getClearTariffsResult() {
        return clearTariffsResult;
    }


    public void setClearTariffsResult(List<ClearTariffsResult> clearTariffsResult) {
        this.clearTariffsResult = clearTariffsResult;
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
        if (!(obj instanceof ClearTariffsResponse))
            return false;
        ClearTariffsResponse that = (ClearTariffsResponse) obj;
        return Objects.equals(this.clearTariffsResult, that.clearTariffsResult)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.clearTariffsResult != null ? this.clearTariffsResult.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
