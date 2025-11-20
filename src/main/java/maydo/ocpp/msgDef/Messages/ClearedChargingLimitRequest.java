package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class ClearedChargingLimitRequest implements JsonInterface {

    /**
     * Source of the charging limit. Allowed values defined in Appendix as ChargingLimitSourceEnumStringType.
     * <p>
     * (Required)
     */
    @Required
    private String chargingLimitSource;
    /**
     * EVSE Identifier.
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
    public ClearedChargingLimitRequest() {
    }

    /**
     * @param evseId              EVSE Identifier.
     *                            .
     * @param chargingLimitSource Source of the charging limit. Allowed values defined in Appendix as ChargingLimitSourceEnumStringType.
     *                            .
     */
    public ClearedChargingLimitRequest(String chargingLimitSource, Integer evseId, CustomData customData) {
        super();
        this.chargingLimitSource = chargingLimitSource;
        this.evseId = evseId;
        this.customData = customData;
    }

    /**
     * Source of the charging limit. Allowed values defined in Appendix as ChargingLimitSourceEnumStringType.
     * <p>
     * (Required)
     */
    public String getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * Source of the charging limit. Allowed values defined in Appendix as ChargingLimitSourceEnumStringType.
     * <p>
     * (Required)
     */
    public void setChargingLimitSource(String chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    /**
     * EVSE Identifier.
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * EVSE Identifier.
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
        json.addProperty("chargingLimitSource", chargingLimitSource);
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
        if (!(obj instanceof ClearedChargingLimitRequest))
            return false;
        ClearedChargingLimitRequest that = (ClearedChargingLimitRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.chargingLimitSource, that.chargingLimitSource);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.chargingLimitSource != null ? this.chargingLimitSource.hashCode() : 0);
        return result;
    }
}
