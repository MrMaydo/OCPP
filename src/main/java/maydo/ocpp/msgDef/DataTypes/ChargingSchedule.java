
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ChargingRateUnitEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;


/**
 * Charging_ Schedule
 * urn:x-oca:ocpp:uid:2:233256
 * Charging schedule structure defines a list of charging periods, as used in: GetCompositeSchedule.conf and ChargingProfile.
 */
@Generated("jsonschema2pojo")
public class ChargingSchedule implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * Identifies the ChargingSchedule.
     * <p>
     * (Required)
     */
    private Integer id;
    /**
     * Charging_ Schedule. Start_ Schedule. Date_ Time
     * urn:x-oca:ocpp:uid:1:569237
     * Starting point of an absolute schedule. If absent the schedule will be relative to start of charging.
     */
    private Date startSchedule;
    /**
     * Charging_ Schedule. Duration. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569236
     * Duration of the charging schedule in seconds. If the duration is left empty, the last period will continue indefinitely or until end of the transaction if chargingProfilePurpose = TxProfile.
     */
    private Integer duration;
    /**
     * Charging_ Schedule. Charging_ Rate_ Unit. Charging_ Rate_ Unit_ Code
     * urn:x-oca:ocpp:uid:1:569238
     * The unit of measure Limit is expressed in.
     * <p>
     * (Required)
     */
    private ChargingRateUnitEnum chargingRateUnit;
    /**
     * (Required)
     */
    private List<ChargingSchedulePeriod> chargingSchedulePeriod = null;
    /**
     * Charging_ Schedule. Min_ Charging_ Rate. Numeric
     * urn:x-oca:ocpp:uid:1:569239
     * Minimum charging rate supported by the EV. The unit of measure is defined by the chargingRateUnit. This parameter is intended to be used by a local smart charging algorithm to optimize the power allocation for in the case a charging process is inefficient at lower charging rates. Accepts at most one digit fraction (e.g. 8.1)
     */
    private Float minChargingRate;
    /**
     * Sales_ Tariff
     * urn:x-oca:ocpp:uid:2:233272
     * NOTE: This dataType is based on dataTypes from &lt;&lt;ref-ISOIEC15118-2,ISO 15118-2&gt;&gt;.
     */
    private SalesTariff salesTariff;

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

    /**
     * Identifies the ChargingSchedule.
     * <p>
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Identifies the ChargingSchedule.
     * <p>
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Charging_ Schedule. Start_ Schedule. Date_ Time
     * urn:x-oca:ocpp:uid:1:569237
     * Starting point of an absolute schedule. If absent the schedule will be relative to start of charging.
     */
    public Date getStartSchedule() {
        return startSchedule;
    }

    /**
     * Charging_ Schedule. Start_ Schedule. Date_ Time
     * urn:x-oca:ocpp:uid:1:569237
     * Starting point of an absolute schedule. If absent the schedule will be relative to start of charging.
     */
    public void setStartSchedule(Date startSchedule) {
        this.startSchedule = startSchedule;
    }

    /**
     * Charging_ Schedule. Duration. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569236
     * Duration of the charging schedule in seconds. If the duration is left empty, the last period will continue indefinitely or until end of the transaction if chargingProfilePurpose = TxProfile.
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Charging_ Schedule. Duration. Elapsed_ Time
     * urn:x-oca:ocpp:uid:1:569236
     * Duration of the charging schedule in seconds. If the duration is left empty, the last period will continue indefinitely or until end of the transaction if chargingProfilePurpose = TxProfile.
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Charging_ Schedule. Charging_ Rate_ Unit. Charging_ Rate_ Unit_ Code
     * urn:x-oca:ocpp:uid:1:569238
     * The unit of measure Limit is expressed in.
     * <p>
     * (Required)
     */
    public ChargingRateUnitEnum getChargingRateUnit() {
        return chargingRateUnit;
    }

    /**
     * Charging_ Schedule. Charging_ Rate_ Unit. Charging_ Rate_ Unit_ Code
     * urn:x-oca:ocpp:uid:1:569238
     * The unit of measure Limit is expressed in.
     * <p>
     * (Required)
     */
    public void setChargingRateUnit(ChargingRateUnitEnum chargingRateUnit) {
        this.chargingRateUnit = chargingRateUnit;
    }

    /**
     * (Required)
     */
    public List<ChargingSchedulePeriod> getChargingSchedulePeriod() {
        return chargingSchedulePeriod;
    }

    /**
     * (Required)
     */
    public void setChargingSchedulePeriod(List<ChargingSchedulePeriod> chargingSchedulePeriod) {
        this.chargingSchedulePeriod = chargingSchedulePeriod;
    }

    /**
     * Charging_ Schedule. Min_ Charging_ Rate. Numeric
     * urn:x-oca:ocpp:uid:1:569239
     * Minimum charging rate supported by the EV. The unit of measure is defined by the chargingRateUnit. This parameter is intended to be used by a local smart charging algorithm to optimize the power allocation for in the case a charging process is inefficient at lower charging rates. Accepts at most one digit fraction (e.g. 8.1)
     */
    public Float getMinChargingRate() {
        return minChargingRate;
    }

    /**
     * Charging_ Schedule. Min_ Charging_ Rate. Numeric
     * urn:x-oca:ocpp:uid:1:569239
     * Minimum charging rate supported by the EV. The unit of measure is defined by the chargingRateUnit. This parameter is intended to be used by a local smart charging algorithm to optimize the power allocation for in the case a charging process is inefficient at lower charging rates. Accepts at most one digit fraction (e.g. 8.1)
     */
    public void setMinChargingRate(Float minChargingRate) {
        this.minChargingRate = minChargingRate;
    }

    /**
     * Sales_ Tariff
     * urn:x-oca:ocpp:uid:2:233272
     * NOTE: This dataType is based on dataTypes from &lt;&lt;ref-ISOIEC15118-2,ISO 15118-2&gt;&gt;.
     */
    public SalesTariff getSalesTariff() {
        return salesTariff;
    }

    /**
     * Sales_ Tariff
     * urn:x-oca:ocpp:uid:2:233272
     * NOTE: This dataType is based on dataTypes from &lt;&lt;ref-ISOIEC15118-2,ISO 15118-2&gt;&gt;.
     */
    public void setSalesTariff(SalesTariff salesTariff) {
        this.salesTariff = salesTariff;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
