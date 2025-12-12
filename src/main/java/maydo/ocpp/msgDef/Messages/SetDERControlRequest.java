package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.*;
import maydo.ocpp.msgDef.Enumerations.DERControlEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class SetDERControlRequest implements JsonInterface {

    /**
     * True if this is a default DER control
     */
    @Required
    private Boolean isDefault;

    /**
     * Unique id of this control, e.g. UUID
     */
    @Required
    private String controlId;

    /**
     * Type of control. Determines which setting field below is used.
     */
    @Required
    private DERControlEnum controlType;

    /**
     * Voltage/Frequency/Active/Reactive curve
     */
    @Optional
    private DERCurve curve;

    /**
     * Enter service after trip parameters (default control only)
     */
    @Optional
    private EnterService enterService;

    /**
     * Fixed power factor setpoint when absorbing active power
     */
    @Optional
    private FixedPF fixedPFAbsorb;

    /**
     * Fixed power factor setpoint when injecting active power
     */
    @Optional
    private FixedPF fixedPFInject;

    /**
     * Fixed reactive power
     */
    @Optional
    private FixedVar fixedVar;

    /**
     * Frequency-Watt parameterized mode
     */
    @Optional
    private FreqDroop freqDroop;

    /**
     * Gradient (default ramp rate) settings (default control only)
     */
    @Optional
    private Gradient gradient;

    /**
     * Limit maximum discharge as percentage of rated capability
     */
    @Optional
    private LimitMaxDischarge limitMaxDischarge;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetDERControlRequest() {
    }


    public SetDERControlRequest(Boolean isDefault, String controlId, DERControlEnum controlType, DERCurve curve, EnterService enterService, FixedPF fixedPFAbsorb, FixedPF fixedPFInject, FixedVar fixedVar, FreqDroop freqDroop, Gradient gradient, LimitMaxDischarge limitMaxDischarge, CustomData customData) {
        super();
        this.isDefault = isDefault;
        this.controlId = controlId;
        this.controlType = controlType;
        this.curve = curve;
        this.enterService = enterService;
        this.fixedPFAbsorb = fixedPFAbsorb;
        this.fixedPFInject = fixedPFInject;
        this.fixedVar = fixedVar;
        this.freqDroop = freqDroop;
        this.gradient = gradient;
        this.limitMaxDischarge = limitMaxDischarge;
        this.customData = customData;
    }


    public Boolean getIsDefault() {
        return isDefault;
    }


    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }


    public String getControlId() {
        return controlId;
    }


    public void setControlId(String controlId) {
        this.controlId = controlId;
    }


    public DERControlEnum getControlType() {
        return controlType;
    }


    public void setControlType(DERControlEnum controlType) {
        this.controlType = controlType;
    }

    public DERCurve getCurve() {
        return curve;
    }

    public void setCurve(DERCurve curve) {
        this.curve = curve;
    }

    public EnterService getEnterService() {
        return enterService;
    }

    public void setEnterService(EnterService enterService) {
        this.enterService = enterService;
    }

    public FixedPF getFixedPFAbsorb() {
        return fixedPFAbsorb;
    }

    public void setFixedPFAbsorb(FixedPF fixedPFAbsorb) {
        this.fixedPFAbsorb = fixedPFAbsorb;
    }

    public FixedPF getFixedPFInject() {
        return fixedPFInject;
    }

    public void setFixedPFInject(FixedPF fixedPFInject) {
        this.fixedPFInject = fixedPFInject;
    }

    public FixedVar getFixedVar() {
        return fixedVar;
    }

    public void setFixedVar(FixedVar fixedVar) {
        this.fixedVar = fixedVar;
    }

    public FreqDroop getFreqDroop() {
        return freqDroop;
    }

    public void setFreqDroop(FreqDroop freqDroop) {
        this.freqDroop = freqDroop;
    }

    public Gradient getGradient() {
        return gradient;
    }

    public void setGradient(Gradient gradient) {
        this.gradient = gradient;
    }

    public LimitMaxDischarge getLimitMaxDischarge() {
        return limitMaxDischarge;
    }

    public void setLimitMaxDischarge(LimitMaxDischarge limitMaxDischarge) {
        this.limitMaxDischarge = limitMaxDischarge;
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
        json.addProperty("isDefault", isDefault);
        json.addProperty("controlId", controlId);
        json.addProperty("controlType", controlType.toString());
        json.add("curve", curve.toJsonObject());
        json.add("enterService", enterService.toJsonObject());
        json.add("fixedPFAbsorb", fixedPFAbsorb.toJsonObject());
        json.add("fixedPFInject", fixedPFInject.toJsonObject());
        json.add("fixedVar", fixedVar.toJsonObject());
        json.add("freqDroop", freqDroop.toJsonObject());
        json.add("gradient", gradient.toJsonObject());
        json.add("limitMaxDischarge", limitMaxDischarge.toJsonObject());
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
        if (jsonObject.has("isDefault")) {
            this.isDefault = jsonObject.get("isDefault").getAsBoolean();
        }

        if (jsonObject.has("controlId")) {
            this.controlId = jsonObject.get("controlId").getAsString();
        }

        if (jsonObject.has("controlType")) {
            this.controlType = DERControlEnum.valueOf(jsonObject.get("controlType").getAsString());
        }

        if (jsonObject.has("curve")) {
            this.curve = new DERCurve();
            this.curve.fromJsonObject(jsonObject.getAsJsonObject("curve"));
        }

        if (jsonObject.has("enterService")) {
            this.enterService = new EnterService();
            this.enterService.fromJsonObject(jsonObject.getAsJsonObject("enterService"));
        }

        if (jsonObject.has("fixedPFAbsorb")) {
            this.fixedPFAbsorb = new FixedPF();
            this.fixedPFAbsorb.fromJsonObject(jsonObject.getAsJsonObject("fixedPFAbsorb"));
        }

        if (jsonObject.has("fixedPFInject")) {
            this.fixedPFInject = new FixedPF();
            this.fixedPFInject.fromJsonObject(jsonObject.getAsJsonObject("fixedPFInject"));
        }

        if (jsonObject.has("fixedVar")) {
            this.fixedVar = new FixedVar();
            this.fixedVar.fromJsonObject(jsonObject.getAsJsonObject("fixedVar"));
        }

        if (jsonObject.has("freqDroop")) {
            this.freqDroop = new FreqDroop();
            this.freqDroop.fromJsonObject(jsonObject.getAsJsonObject("freqDroop"));
        }

        if (jsonObject.has("gradient")) {
            this.gradient = new Gradient();
            this.gradient.fromJsonObject(jsonObject.getAsJsonObject("gradient"));
        }

        if (jsonObject.has("limitMaxDischarge")) {
            this.limitMaxDischarge = new LimitMaxDischarge();
            this.limitMaxDischarge.fromJsonObject(jsonObject.getAsJsonObject("limitMaxDischarge"));
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
        if (!(obj instanceof SetDERControlRequest))
            return false;
        SetDERControlRequest that = (SetDERControlRequest) obj;
        return Objects.equals(this.curve, that.curve)
                && Objects.equals(this.fixedPFAbsorb, that.fixedPFAbsorb)
                && Objects.equals(this.fixedPFInject, that.fixedPFInject)
                && Objects.equals(this.gradient, that.gradient)
                && Objects.equals(this.limitMaxDischarge, that.limitMaxDischarge)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.controlId, that.controlId)
                && Objects.equals(this.freqDroop, that.freqDroop)
                && Objects.equals(this.isDefault, that.isDefault)
                && Objects.equals(this.controlType, that.controlType)
                && Objects.equals(this.enterService, that.enterService)
                && Objects.equals(this.fixedVar, that.fixedVar);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.curve != null ? this.curve.hashCode() : 0);
        result = 31 * result + (this.fixedPFAbsorb != null ? this.fixedPFAbsorb.hashCode() : 0);
        result = 31 * result + (this.fixedPFInject != null ? this.fixedPFInject.hashCode() : 0);
        result = 31 * result + (this.gradient != null ? this.gradient.hashCode() : 0);
        result = 31 * result + (this.limitMaxDischarge != null ? this.limitMaxDischarge.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.controlId != null ? this.controlId.hashCode() : 0);
        result = 31 * result + (this.freqDroop != null ? this.freqDroop.hashCode() : 0);
        result = 31 * result + (this.isDefault != null ? this.isDefault.hashCode() : 0);
        result = 31 * result + (this.controlType != null ? this.controlType.hashCode() : 0);
        result = 31 * result + (this.enterService != null ? this.enterService.hashCode() : 0);
        result = 31 * result + (this.fixedVar != null ? this.fixedVar.hashCode() : 0);
        return result;
    }
}
