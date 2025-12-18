package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ClearTariffsResult;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
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

        JsonArray clearTariffsResultArray = new JsonArray();
        for (ClearTariffsResult item : getClearTariffsResult()) {
            clearTariffsResultArray.add(item.toJsonObject());
        }
        json.add("clearTariffsResult", clearTariffsResultArray);

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
        if (jsonObject.has("clearTariffsResult")) {
            setClearTariffsResult(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("clearTariffsResult");
            for (JsonElement el : arr) {
                ClearTariffsResult item = new ClearTariffsResult();
                item.fromJsonObject(el.getAsJsonObject());
                getClearTariffsResult().add(item);
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
        if (!(obj instanceof ClearTariffsResponse))
            return false;
        ClearTariffsResponse that = (ClearTariffsResponse) obj;
        return Objects.equals(getClearTariffsResult(), that.getClearTariffsResult())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getClearTariffsResult(),
                getCustomData()
        );
    }
}
