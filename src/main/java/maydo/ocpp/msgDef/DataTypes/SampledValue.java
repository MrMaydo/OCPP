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

/**
 * Single sampled value in MeterValues. Each value can be accompanied by optional fields.
 * To save on mobile data usage, default values of all of the optional fields are such that.
 * The value without any additional fields will be interpreted,
 * as a register reading of active import energy in Wh (Watt-hour) units.
 */
public class SampledValue implements JsonInterface {

    /**
     *
     */
    @Required
    private Float value;

    /**
     * Indicates the measured value.
     */
    @Optional
    private MeasurandEnum measurand = MeasurandEnum.fromValue("Energy.Active.Import.Register");

    /**
     * Type of detail value: start, end or sample. Default = "Sample.Periodic"
     */
    @Optional
    private ReadingContextEnum context = ReadingContextEnum.fromValue("Sample.Periodic");

    /**
     * Indicates how the measured value is to be interpreted. For instance between L1 and neutral (L1-N)
     * Please note that not all values of phase are applicable to all Measurands.
     * When phase is absent, the measured value is interpreted as an overall value.
     */
    @Optional
    private PhaseEnum phase;

    /**
     * Indicates where the measured value has been sampled. Default = "Outlet"
     */
    @Optional
    private LocationEnum location = LocationEnum.fromValue("Outlet");

    /**
     * Contains the MeterValueSignature with sign/encoding method information.
     */
    @Optional
    private SignedMeterValue signedMeterValue;

    /**
     * Represents a UnitOfMeasure including a multiplier
     */
    @Optional
    private UnitOfMeasure unitOfMeasure;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SampledValue() {
    }


    public Float getValue() {
        return value;
    }


    public void setValue(Float value) {
        this.value = value;
    }


    public MeasurandEnum getMeasurand() {
        return measurand;
    }


    public void setMeasurand(MeasurandEnum measurand) {
        this.measurand = measurand;
    }


    public ReadingContextEnum getContext() {
        return context;
    }


    public void setContext(ReadingContextEnum context) {
        this.context = context;
    }


    public PhaseEnum getPhase() {
        return phase;
    }


    public void setPhase(PhaseEnum phase) {
        this.phase = phase;
    }


    public LocationEnum getLocation() {
        return location;
    }


    public void setLocation(LocationEnum location) {
        this.location = location;
    }


    public SignedMeterValue getSignedMeterValue() {
        return signedMeterValue;
    }


    public void setSignedMeterValue(SignedMeterValue signedMeterValue) {
        this.signedMeterValue = signedMeterValue;
    }


    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }


    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
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
            setValue(jsonObject.get("value").getAsFloat());
        }

        if (jsonObject.has("phase")) {
            setPhase(PhaseEnum.valueOf(jsonObject.get("phase").getAsString()));
        }

        if (jsonObject.has("signedMeterValue")) {
            setSignedMeterValue(new SignedMeterValue());
            getSignedMeterValue().fromJsonObject(jsonObject.getAsJsonObject("signedMeterValue"));
        }

        if (jsonObject.has("unitOfMeasure")) {
            setUnitOfMeasure(new UnitOfMeasure());
            getUnitOfMeasure().fromJsonObject(jsonObject.getAsJsonObject("unitOfMeasure"));
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
