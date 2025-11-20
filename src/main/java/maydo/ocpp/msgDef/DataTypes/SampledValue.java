package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.LocationEnum;
import maydo.ocpp.msgDef.Enumerations.MeasurandEnum;
import maydo.ocpp.msgDef.Enumerations.PhaseEnum;
import maydo.ocpp.msgDef.Enumerations.ReadingContextEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class SampledValue implements JsonInterface {

    /**
     * Indicates the measured value.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Float value;
    /**
     * Type of measurement. Default = "Energy.Active.Import.Register"
     */
    @Optional
    private MeasurandEnum measurand = MeasurandEnum.fromValue("Energy.Active.Import.Register");
    /**
     * Type of detail value: start, end or sample. Default = "Sample.Periodic"
     */
    @Optional
    private ReadingContextEnum context = ReadingContextEnum.fromValue("Sample.Periodic");
    /**
     * Indicates how the measured value is to be interpreted. For instance between L1 and neutral (L1-N) Please note that not all values of phase are applicable to all Measurands. When phase is absent, the measured value is interpreted as an overall value.
     */
    @Optional
    private PhaseEnum phase;
    /**
     * Indicates where the measured value has been sampled. Default =  "Outlet"
     */
    @Optional
    private LocationEnum location = LocationEnum.fromValue("Outlet");
    /**
     * Represent a signed version of the meter value.
     */
    @Optional
    private SignedMeterValue signedMeterValue;
    /**
     * Represents a UnitOfMeasure with a multiplier
     */
    @Optional
    private UnitOfMeasure unitOfMeasure;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SampledValue() {
    }

    /**
     * @param value Indicates the measured value.
     *              <p>
     *              .
     */
    public SampledValue(Float value, MeasurandEnum measurand, ReadingContextEnum context, PhaseEnum phase, LocationEnum location, SignedMeterValue signedMeterValue, UnitOfMeasure unitOfMeasure, CustomData customData) {
        super();
        this.value = value;
        this.measurand = measurand;
        this.context = context;
        this.phase = phase;
        this.location = location;
        this.signedMeterValue = signedMeterValue;
        this.unitOfMeasure = unitOfMeasure;
        this.customData = customData;
    }

    /**
     * Indicates the measured value.
     * <p>
     * <p>
     * (Required)
     */
    public Float getValue() {
        return value;
    }

    /**
     * Indicates the measured value.
     * <p>
     * <p>
     * (Required)
     */
    public void setValue(Float value) {
        this.value = value;
    }

    /**
     * Type of measurement. Default = "Energy.Active.Import.Register"
     */
    public MeasurandEnum getMeasurand() {
        return measurand;
    }

    /**
     * Type of measurement. Default = "Energy.Active.Import.Register"
     */
    public void setMeasurand(MeasurandEnum measurand) {
        this.measurand = measurand;
    }

    /**
     * Type of detail value: start, end or sample. Default = "Sample.Periodic"
     */
    public ReadingContextEnum getContext() {
        return context;
    }

    /**
     * Type of detail value: start, end or sample. Default = "Sample.Periodic"
     */
    public void setContext(ReadingContextEnum context) {
        this.context = context;
    }

    /**
     * Indicates how the measured value is to be interpreted. For instance between L1 and neutral (L1-N) Please note that not all values of phase are applicable to all Measurands. When phase is absent, the measured value is interpreted as an overall value.
     */
    public PhaseEnum getPhase() {
        return phase;
    }

    /**
     * Indicates how the measured value is to be interpreted. For instance between L1 and neutral (L1-N) Please note that not all values of phase are applicable to all Measurands. When phase is absent, the measured value is interpreted as an overall value.
     */
    public void setPhase(PhaseEnum phase) {
        this.phase = phase;
    }

    /**
     * Indicates where the measured value has been sampled. Default =  "Outlet"
     */
    public LocationEnum getLocation() {
        return location;
    }

    /**
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
        json.addProperty("value", value);
        json.addProperty("phase", phase.toString());
        json.add("signedMeterValue", signedMeterValue.toJsonObject());
        json.add("unitOfMeasure", unitOfMeasure.toJsonObject());
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
        if (jsonObject.has("value")) {
            this.value = jsonObject.get("value").getAsFloat();
        }

        if (jsonObject.has("phase")) {
            this.phase = PhaseEnum.valueOf(jsonObject.get("phase").getAsString());
        }

        if (jsonObject.has("signedMeterValue")) {
            this.signedMeterValue = new SignedMeterValue();
            this.signedMeterValue.fromJsonObject(jsonObject.getAsJsonObject("signedMeterValue"));
        }

        if (jsonObject.has("unitOfMeasure")) {
            this.unitOfMeasure = new UnitOfMeasure();
            this.unitOfMeasure.fromJsonObject(jsonObject.getAsJsonObject("unitOfMeasure"));
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SampledValue))
            return false;
        SampledValue that = (SampledValue) obj;
        return Objects.equals(this.phase, that.phase)
                && Objects.equals(this.signedMeterValue, that.signedMeterValue)
                && Objects.equals(this.unitOfMeasure, that.unitOfMeasure)
                && Objects.equals(this.context, that.context)
                && Objects.equals(this.measurand, that.measurand)
                && Objects.equals(this.location, that.location)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.phase != null ? this.phase.hashCode() : 0);
        result = 31 * result + (this.signedMeterValue != null ? this.signedMeterValue.hashCode() : 0);
        result = 31 * result + (this.unitOfMeasure != null ? this.unitOfMeasure.hashCode() : 0);
        result = 31 * result + (this.context != null ? this.context.hashCode() : 0);
        result = 31 * result + (this.measurand != null ? this.measurand.hashCode() : 0);
        result = 31 * result + (this.location != null ? this.location.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
        return result;
    }
}
