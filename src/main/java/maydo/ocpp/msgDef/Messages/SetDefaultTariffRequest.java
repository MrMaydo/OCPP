package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.Tariff;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class SetDefaultTariffRequest implements JsonInterface {

    /**
     * EVSE that tariff applies to. When _evseId_ = 0, then tarriff applies to all EVSEs.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * A tariff is described by fields with prices for:
     * energy,
     * charging time,
     * idle time,
     * fixed fee,
     * reservation time,
     * reservation fixed fee. +
     * Each of these fields may have (optional) conditions that specify when a price is applicable. +
     * The _description_ contains a human-readable explanation of the tariff to be shown to the user. +
     * The other fields are parameters that define the tariff. These are used by the charging station to calculate the price.
     * <p>
     * (Required)
     */
    @Required
    private Tariff tariff;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SetDefaultTariffRequest() {
    }

    /**
     * @param evseId EVSE that tariff applies to. When _evseId_ = 0, then tarriff applies to all EVSEs.
     *               <p>
     *               .
     */
    public SetDefaultTariffRequest(Integer evseId, Tariff tariff, CustomData customData) {
        super();
        this.evseId = evseId;
        this.tariff = tariff;
        this.customData = customData;
    }

    /**
     * EVSE that tariff applies to. When _evseId_ = 0, then tarriff applies to all EVSEs.
     * <p>
     * <p>
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * EVSE that tariff applies to. When _evseId_ = 0, then tarriff applies to all EVSEs.
     * <p>
     * <p>
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * A tariff is described by fields with prices for:
     * energy,
     * charging time,
     * idle time,
     * fixed fee,
     * reservation time,
     * reservation fixed fee. +
     * Each of these fields may have (optional) conditions that specify when a price is applicable. +
     * The _description_ contains a human-readable explanation of the tariff to be shown to the user. +
     * The other fields are parameters that define the tariff. These are used by the charging station to calculate the price.
     * <p>
     * (Required)
     */
    public Tariff getTariff() {
        return tariff;
    }

    /**
     * A tariff is described by fields with prices for:
     * energy,
     * charging time,
     * idle time,
     * fixed fee,
     * reservation time,
     * reservation fixed fee. +
     * Each of these fields may have (optional) conditions that specify when a price is applicable. +
     * The _description_ contains a human-readable explanation of the tariff to be shown to the user. +
     * The other fields are parameters that define the tariff. These are used by the charging station to calculate the price.
     * <p>
     * (Required)
     */
    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
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
        json.add("tariff", tariff.toJsonObject());
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
        if (!(obj instanceof SetDefaultTariffRequest))
            return false;
        SetDefaultTariffRequest that = (SetDefaultTariffRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.tariff, that.tariff)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.tariff != null ? this.tariff.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
