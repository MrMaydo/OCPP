package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class ClearTariffsRequest implements JsonInterface {

    /**
     * List of tariff Ids to clear. When absent clears all tariffs at evseId.
     */
    @Optional
    private List<String> tariffIds;

    /**
     * When present only clear tariffs matching tariffIds at EVSE evseId.
     */
    @Optional
    private Integer evseId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ClearTariffsRequest() {
    }


    public List<String> getTariffIds() {
        return tariffIds;
    }


    public void setTariffIds(List<String> tariffIds) {
        this.tariffIds = tariffIds;
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
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

        if (getTariffIds() != null) {
            JsonArray tariffIdsArray = new JsonArray();
            for (String item : getTariffIds()) {
                tariffIdsArray.add(item);
            }
            json.add("tariffIds", tariffIdsArray);
        }
        if (getEvseId() != null) {
            json.addProperty("evseId", getEvseId());
        }
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
        if (jsonObject.has("tariffIds")) {
            setTariffIds(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("tariffIds");
            for (JsonElement el : arr) {
                getTariffIds().add(el.getAsString());
            }
        }

        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
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
        if (!(obj instanceof ClearTariffsRequest))
            return false;
        ClearTariffsRequest that = (ClearTariffsRequest) obj;
        return Objects.equals(getTariffIds(), that.getTariffIds())
                && Objects.equals(getEvseId(), that.getEvseId())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getTariffIds(),
                getEvseId(),
                getCustomData()
        );
    }
}
