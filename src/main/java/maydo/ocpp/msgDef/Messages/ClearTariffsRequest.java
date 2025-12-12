package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

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
        json.addProperty("evseId", evseId);
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
        if (jsonObject.has("evseId")) {
            this.evseId = jsonObject.get("evseId").getAsInt();
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ClearTariffsRequest))
            return false;
        ClearTariffsRequest that = (ClearTariffsRequest) obj;
        return Objects.equals(this.tariffIds, that.tariffIds)
                && Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.tariffIds != null ? this.tariffIds.hashCode() : 0);
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
