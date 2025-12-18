package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.Tariff;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class SetDefaultTariffRequest implements JsonInterface {

    /**
     * EVSE that tariff applies to. When evseId = 0, then tarriff applies to all EVSEs.
     */
    @Required
    private Integer evseId;

    /**
     * Tariff structure.
     */
    @Required
    private Tariff tariff;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetDefaultTariffRequest() {
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public Tariff getTariff() {
        return tariff;
    }


    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
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

        json.addProperty("evseId", getEvseId());

        json.add("tariff", getTariff().toJsonObject());

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
        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
        }

        if (jsonObject.has("tariff")) {
            setTariff(new Tariff());
            getTariff().fromJsonObject(jsonObject.getAsJsonObject("tariff"));
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
        if (!(obj instanceof SetDefaultTariffRequest))
            return false;
        SetDefaultTariffRequest that = (SetDefaultTariffRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.tariff, that.tariff)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getEvseId(),
                getTariff(),
                getCustomData()
        );
    }
}
