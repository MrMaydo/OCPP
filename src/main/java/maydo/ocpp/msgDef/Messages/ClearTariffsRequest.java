package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

public class ClearTariffsRequest implements JsonInterface {

    /**
     * List of tariff Ids to clear. When absent clears all tariffs at _evseId_.
     */
    @Optional
    private List<String> tariffIds;
    /**
     * When present only clear tariffs matching _tariffIds_ at EVSE _evseId_.
     */
    @Optional
    private Integer evseId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ClearTariffsRequest() {
    }

    /**
     * @param tariffIds List of tariff Ids to clear. When absent clears all tariffs at _evseId_.
     *                  <p>
     *                  .
     * @param evseId    When present only clear tariffs matching _tariffIds_ at EVSE _evseId_.
     *                  <p>
     *                  .
     */
    public ClearTariffsRequest(List<String> tariffIds, Integer evseId, CustomData customData) {
        super();
        this.tariffIds = tariffIds;
        this.evseId = evseId;
        this.customData = customData;
    }

    /**
     * List of tariff Ids to clear. When absent clears all tariffs at _evseId_.
     */
    public List<String> getTariffIds() {
        return tariffIds;
    }

    /**
     * List of tariff Ids to clear. When absent clears all tariffs at _evseId_.
     */
    public void setTariffIds(List<String> tariffIds) {
        this.tariffIds = tariffIds;
    }

    /**
     * When present only clear tariffs matching _tariffIds_ at EVSE _evseId_.
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * When present only clear tariffs matching _tariffIds_ at EVSE _evseId_.
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
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
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
