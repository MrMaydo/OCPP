package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.*;
import maydo.ocpp.msgDef.Enumerations.DERControlEnum;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class SetDERControlRequest {

    /**
     * True if this is a default DER control
     * 
     * 
     * (Required)
     */
    @Required
    private Boolean isDefault;
    /**
     * Unique id of this control, e.g. UUID
     * 
     * 
     * (Required)
     */
    @Required
    private String controlId;
    /**
     * Type of control.  Determines which setting field below is used.
     * 
     * 
     * (Required)
     */
    @Required
    private DERControlEnum controlType;
    @Optional
    private DERCurve curve;
    @Optional
    private EnterService enterService;
    @Optional
    private FixedPF fixedPFAbsorb;
    @Optional
    private FixedPF fixedPFInject;
    @Optional
    private FixedVar fixedVar;
    @Optional
    private FreqDroop freqDroop;
    @Optional
    private Gradient gradient;
    @Optional
    private LimitMaxDischarge limitMaxDischarge;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public SetDERControlRequest() {
    }

    /**
     * 
     * @param isDefault
     *     True if this is a default DER control
     *     
     *     .
     * @param controlId
     *     Unique id of this control, e.g. UUID
     *     
     *     .
     */
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

    /**
     * True if this is a default DER control
     * 
     * 
     * (Required)
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * True if this is a default DER control
     * 
     * 
     * (Required)
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Unique id of this control, e.g. UUID
     * 
     * 
     * (Required)
     */
    public String getControlId() {
        return controlId;
    }

    /**
     * Unique id of this control, e.g. UUID
     * 
     * 
     * (Required)
     */
    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * Type of control.  Determines which setting field below is used.
     * 
     * 
     * (Required)
     */
    public DERControlEnum getControlType() {
        return controlType;
    }

    /**
     * Type of control.  Determines which setting field below is used.
     * 
     * 
     * (Required)
     */
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
