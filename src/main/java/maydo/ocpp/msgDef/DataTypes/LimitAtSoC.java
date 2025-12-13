package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class LimitAtSoC implements JsonInterface {

    /**
     * The SoC value beyond which the charging rate limit should be applied.
     */
    @Required
    private Integer soc;

    /**
     * Charging rate limit beyond the SoC value. The unit is defined by chargingSchedule.chargingRateUnit.
     */
    @Required
    private Float limit;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public LimitAtSoC() {
    }


    public Integer getSoc() {
        return soc;
    }


    public void setSoc(Integer soc) {
        this.soc = soc;
    }


    public Float getLimit() {
        return limit;
    }


    public void setLimit(Float limit) {
        this.limit = limit;
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
        json.addProperty("soc", soc);
        json.addProperty("limit", limit);
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
        if (jsonObject.has("soc")) {
            setSoc(jsonObject.get("soc").getAsInt());
        }

        if (jsonObject.has("limit")) {
            setLimit(jsonObject.get("limit").getAsFloat());
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
        if (!(obj instanceof LimitAtSoC))
            return false;
        LimitAtSoC that = (LimitAtSoC) obj;
        return Objects.equals(this.limit, that.limit)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.soc, that.soc);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.limit != null ? this.limit.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.soc != null ? this.soc.hashCode() : 0);
        return result;
    }
}
