package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class ChargingPeriod implements JsonInterface {

    private List<CostDimension> dimensions;
    /**
     * Unique identifier of the Tariff that was used to calculate cost. If not provided, then cost was calculated by some other means.
     * 
     */
    @Optional
    private String tariffId;
    /**
     * Start timestamp of charging period. A period ends when the next period starts. The last period ends when the session ends.
     * 
     * 
     * (Required)
     */
    @Required
    private Date startPeriod;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ChargingPeriod() {
    }

    /**
     * 
     * @param startPeriod
     *     Start timestamp of charging period. A period ends when the next period starts. The last period ends when the session ends.
     *     
     *     .
     * @param tariffId
     *     Unique identifier of the Tariff that was used to calculate cost. If not provided, then cost was calculated by some other means.
     *     
     *     .
     */
    public ChargingPeriod(List<CostDimension> dimensions, String tariffId, Date startPeriod, CustomData customData) {
        super();
        this.dimensions = dimensions;
        this.tariffId = tariffId;
        this.startPeriod = startPeriod;
        this.customData = customData;
    }

    public List<CostDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<CostDimension> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * Unique identifier of the Tariff that was used to calculate cost. If not provided, then cost was calculated by some other means.
     * 
     */
    public String getTariffId() {
        return tariffId;
    }

    /**
     * Unique identifier of the Tariff that was used to calculate cost. If not provided, then cost was calculated by some other means.
     * 
     */
    public void setTariffId(String tariffId) {
        this.tariffId = tariffId;
    }

    /**
     * Start timestamp of charging period. A period ends when the next period starts. The last period ends when the session ends.
     * 
     * 
     * (Required)
     */
    public Date getStartPeriod() {
        return startPeriod;
    }

    /**
     * Start timestamp of charging period. A period ends when the next period starts. The last period ends when the session ends.
     * 
     * 
     * (Required)
     */
    public void setStartPeriod(Date startPeriod) {
        this.startPeriod = startPeriod;
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
        if (!(obj instanceof ChargingPeriod))
            return false;
        ChargingPeriod that = (ChargingPeriod) obj;
        return Objects.equals(this.startPeriod, that.startPeriod)
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.tariffId, that.tariffId) 
                && Objects.equals(this.dimensions, that.dimensions);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.startPeriod != null ? this.startPeriod.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.tariffId != null ? this.tariffId.hashCode() : 0);
        result = 31 * result + (this.dimensions != null ? this.dimensions.hashCode() : 0);
        return result;
    }
}
