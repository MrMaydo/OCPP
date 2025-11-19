package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class LimitAtSoC implements JsonInterface {

    /**
     * The SoC value beyond which the charging rate limit should be applied.
     * <p>
     * (Required)
     */
    @Required
    private Integer soc;
    /**
     * Charging rate limit beyond the SoC value.
     * The unit is defined by _chargingSchedule.chargingRateUnit_.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float limit;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public LimitAtSoC() {
    }

    /**
     * @param soc   The SoC value beyond which the charging rate limit should be applied.
     *              .
     * @param limit Charging rate limit beyond the SoC value.
     *              The unit is defined by _chargingSchedule.chargingRateUnit_.
     *              <p>
     *              .
     */
    public LimitAtSoC(Integer soc, Float limit, CustomData customData) {
        super();
        this.soc = soc;
        this.limit = limit;
        this.customData = customData;
    }

    /**
     * The SoC value beyond which the charging rate limit should be applied.
     * <p>
     * (Required)
     */
    public Integer getSoc() {
        return soc;
    }

    /**
     * The SoC value beyond which the charging rate limit should be applied.
     * <p>
     * (Required)
     */
    public void setSoc(Integer soc) {
        this.soc = soc;
    }

    /**
     * Charging rate limit beyond the SoC value.
     * The unit is defined by _chargingSchedule.chargingRateUnit_.
     * <p>
     * <p>
     * (Required)
     */
    public Float getLimit() {
        return limit;
    }

    /**
     * Charging rate limit beyond the SoC value.
     * The unit is defined by _chargingSchedule.chargingRateUnit_.
     * <p>
     * <p>
     * (Required)
     */
    public void setLimit(Float limit) {
        this.limit = limit;
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
        return null;
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
