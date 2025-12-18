package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the ClearedChargingLimitRequest PDU sent by the Charging Station to the CSMS.
 */
public class ClearedChargingLimitRequest implements JsonInterface {

    /**
     * Source of the charging limit. Allowed values defined in Appendix as ChargingLimitSourceEnumStringType.
     */
    @Required
    private String chargingLimitSource;

    /**
     * EVSE Identifier.
     */
    @Optional
    private Integer evseId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ClearedChargingLimitRequest() {
    }


    public String getChargingLimitSource() {
        return chargingLimitSource;
    }


    public void setChargingLimitSource(String chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
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

        json.addProperty("chargingLimitSource", getChargingLimitSource());

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
        if (jsonObject.has("chargingLimitSource")) {
            setChargingLimitSource(jsonObject.get("chargingLimitSource").getAsString());
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
        if (!(obj instanceof ClearedChargingLimitRequest))
            return false;
        ClearedChargingLimitRequest that = (ClearedChargingLimitRequest) obj;
        return Objects.equals(getChargingLimitSource(), that.getChargingLimitSource())
                && Objects.equals(getEvseId(), that.getEvseId())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getChargingLimitSource(),
                getEvseId(),
                getCustomData()
        );
    }
}
