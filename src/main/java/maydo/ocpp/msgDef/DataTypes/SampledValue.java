package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.LocationEnum;
import maydo.ocpp.msgDef.Enumerations.MeasurandEnum;
import maydo.ocpp.msgDef.Enumerations.PhaseEnum;
import maydo.ocpp.msgDef.Enumerations.ReadingContextEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;


/**
 * Sampled_ Value
 * urn:x-oca:ocpp:uid:2:233266
 * Single sampled value in MeterValues. Each value can be accompanied by optional fields.
 * <p>
 * To save on mobile data usage, default values of all of the optional fields are such that. The value without any additional fields will be interpreted, as a register reading of active import energy in Wh (Watt-hour) units.
 */
public class SampledValue implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * Sampled_ Value. Value. Measure
     * urn:x-oca:ocpp:uid:1:569260
     * Indicates the measured value.
     * <p>
     * <p>
     * (Required)
     */
    private Float value;
    /**
     * Sampled_ Value. Context. Reading_ Context_ Code
     * urn:x-oca:ocpp:uid:1:569261
     * Type of detail value: start, end or sample. Default = "Sample.Periodic"
     */
    private ReadingContextEnum context = ReadingContextEnum.fromValue("Sample.Periodic");
    /**
     * Sampled_ Value. Measurand. Measurand_ Code
     * urn:x-oca:ocpp:uid:1:569263
     * Type of measurement. Default = "Energy.Active.Import.Register"
     */
    private MeasurandEnum measurand = MeasurandEnum.fromValue("Energy.Active.Import.Register");
    /**
     * Sampled_ Value. Phase. Phase_ Code
     * urn:x-oca:ocpp:uid:1:569264
     * Indicates how the measured value is to be interpreted. For instance between L1 and neutral (L1-N) Please note that not all values of phase are applicable to all Measurands. When phase is absent, the measured value is interpreted as an overall value.
     */
    private PhaseEnum phase;
    /**
     * Sampled_ Value. Location. Location_ Code
     * urn:x-oca:ocpp:uid:1:569265
     * Indicates where the measured value has been sampled. Default =  "Outlet"
     */
    private LocationEnum location = LocationEnum.fromValue("Outlet");
    /**
     * Represent a signed version of the meter value.
     */
    private SignedMeterValue signedMeterValue;
    /**
     * Represents a UnitOfMeasure with a multiplier
     */
    private UnitOfMeasure unitOfMeasure;

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
     * Sampled_ Value. Value. Measure
     * urn:x-oca:ocpp:uid:1:569260
     * Indicates the measured value.
     * <p>
     * <p>
     * (Required)
     */
    public Float getValue() {
        return value;
    }

    /**
     * Sampled_ Value. Value. Measure
     * urn:x-oca:ocpp:uid:1:569260
     * Indicates the measured value.
     * <p>
     * <p>
     * (Required)
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * Sampled_ Value. Context. Reading_ Context_ Code
     * urn:x-oca:ocpp:uid:1:569261
     * Type of detail value: start, end or sample. Default = "Sample.Periodic"
     */
    public ReadingContextEnum getContext() {
        return context;
    }

    /**
     * Sampled_ Value. Context. Reading_ Context_ Code
     * urn:x-oca:ocpp:uid:1:569261
     * Type of detail value: start, end or sample. Default = "Sample.Periodic"
     */
    public void setContext(ReadingContextEnum context) {
        this.context = context;
    }

    /**
     * Sampled_ Value. Measurand. Measurand_ Code
     * urn:x-oca:ocpp:uid:1:569263
     * Type of measurement. Default = "Energy.Active.Import.Register"
     */
    public MeasurandEnum getMeasurand() {
        return measurand;
    }

    /**
     * Sampled_ Value. Measurand. Measurand_ Code
     * urn:x-oca:ocpp:uid:1:569263
     * Type of measurement. Default = "Energy.Active.Import.Register"
     */
    public void setMeasurand(MeasurandEnum measurand) {
        this.measurand = measurand;
    }

    /**
     * Sampled_ Value. Phase. Phase_ Code
     * urn:x-oca:ocpp:uid:1:569264
     * Indicates how the measured value is to be interpreted. For instance between L1 and neutral (L1-N) Please note that not all values of phase are applicable to all Measurands. When phase is absent, the measured value is interpreted as an overall value.
     */
    public PhaseEnum getPhase() {
        return phase;
    }

    /**
     * Sampled_ Value. Phase. Phase_ Code
     * urn:x-oca:ocpp:uid:1:569264
     * Indicates how the measured value is to be interpreted. For instance between L1 and neutral (L1-N) Please note that not all values of phase are applicable to all Measurands. When phase is absent, the measured value is interpreted as an overall value.
     */
    public void setPhase(PhaseEnum phase) {
        this.phase = phase;
    }

    /**
     * Sampled_ Value. Location. Location_ Code
     * urn:x-oca:ocpp:uid:1:569265
     * Indicates where the measured value has been sampled. Default =  "Outlet"
     */
    public LocationEnum getLocation() {
        return location;
    }

    /**
     * Sampled_ Value. Location. Location_ Code
     * urn:x-oca:ocpp:uid:1:569265
     * Indicates where the measured value has been sampled. Default =  "Outlet"
     */
    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    /**
     * Represent a signed version of the meter value.
     */
    public SignedMeterValue getSignedMeterValue() {
        return signedMeterValue;
    }

    /**
     * Represent a signed version of the meter value.
     */
    public void setSignedMeterValue(SignedMeterValue signedMeterValue) {
        this.signedMeterValue = signedMeterValue;
    }

    /**
     * Represents a UnitOfMeasure with a multiplier
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Represents a UnitOfMeasure with a multiplier
     */
    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
