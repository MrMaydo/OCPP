package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.*;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class ReportDERControlRequest {

    private List<DERCurveGet> curve;
    @Optional
    private List<EnterServiceGet> enterService;
    @Optional
    private List<FixedPFGet> fixedPFAbsorb;
    @Optional
    private List<FixedPFGet> fixedPFInject;
    @Optional
    private List<FixedVarGet> fixedVar;
    @Optional
    private List<FreqDroopGet> freqDroop;
    @Optional
    private List<GradientGet> gradient;
    @Optional
    private List<LimitMaxDischargeGet> limitMaxDischarge;
    /**
     * RequestId from GetDERControlRequest.
     * 
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * To Be Continued. Default value when omitted: false. +
     * False indicates that there are no further messages as part of this report.
     */
    @Optional
    private Boolean tbc;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ReportDERControlRequest() {
    }

    /**
     * 
     * @param tbc
     *     To Be Continued. Default value when omitted: false. +
     *     False indicates that there are no further messages as part of this report.
     *     .
     * @param requestId
     *     RequestId from GetDERControlRequest.
     *     .
     */
    public ReportDERControlRequest(List<DERCurveGet> curve, List<EnterServiceGet> enterService, List<FixedPFGet> fixedPFAbsorb, List<FixedPFGet> fixedPFInject, List<FixedVarGet> fixedVar, List<FreqDroopGet> freqDroop, List<GradientGet> gradient, List<LimitMaxDischargeGet> limitMaxDischarge, Integer requestId, Boolean tbc, CustomData customData) {
        super();
        this.curve = curve;
        this.enterService = enterService;
        this.fixedPFAbsorb = fixedPFAbsorb;
        this.fixedPFInject = fixedPFInject;
        this.fixedVar = fixedVar;
        this.freqDroop = freqDroop;
        this.gradient = gradient;
        this.limitMaxDischarge = limitMaxDischarge;
        this.requestId = requestId;
        this.tbc = tbc;
        this.customData = customData;
    }

    public List<DERCurveGet> getCurve() {
        return curve;
    }

    public void setCurve(List<DERCurveGet> curve) {
        this.curve = curve;
    }

    public List<EnterServiceGet> getEnterService() {
        return enterService;
    }

    public void setEnterService(List<EnterServiceGet> enterService) {
        this.enterService = enterService;
    }

    public List<FixedPFGet> getFixedPFAbsorb() {
        return fixedPFAbsorb;
    }

    public void setFixedPFAbsorb(List<FixedPFGet> fixedPFAbsorb) {
        this.fixedPFAbsorb = fixedPFAbsorb;
    }

    public List<FixedPFGet> getFixedPFInject() {
        return fixedPFInject;
    }

    public void setFixedPFInject(List<FixedPFGet> fixedPFInject) {
        this.fixedPFInject = fixedPFInject;
    }

    public List<FixedVarGet> getFixedVar() {
        return fixedVar;
    }

    public void setFixedVar(List<FixedVarGet> fixedVar) {
        this.fixedVar = fixedVar;
    }

    public List<FreqDroopGet> getFreqDroop() {
        return freqDroop;
    }

    public void setFreqDroop(List<FreqDroopGet> freqDroop) {
        this.freqDroop = freqDroop;
    }

    public List<GradientGet> getGradient() {
        return gradient;
    }

    public void setGradient(List<GradientGet> gradient) {
        this.gradient = gradient;
    }

    public List<LimitMaxDischargeGet> getLimitMaxDischarge() {
        return limitMaxDischarge;
    }

    public void setLimitMaxDischarge(List<LimitMaxDischargeGet> limitMaxDischarge) {
        this.limitMaxDischarge = limitMaxDischarge;
    }

    /**
     * RequestId from GetDERControlRequest.
     * 
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * RequestId from GetDERControlRequest.
     * 
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * To Be Continued. Default value when omitted: false. +
     * False indicates that there are no further messages as part of this report.
     */
    public Boolean getTbc() {
        return tbc;
    }

    /**
     * To Be Continued. Default value when omitted: false. +
     * False indicates that there are no further messages as part of this report.
     */
    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
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
        if (!(obj instanceof ReportDERControlRequest))
            return false;
        ReportDERControlRequest that = (ReportDERControlRequest) obj;
        return Objects.equals(this.tbc, that.tbc)
                && Objects.equals(this.curve, that.curve) 
                && Objects.equals(this.fixedPFAbsorb, that.fixedPFAbsorb) 
                && Objects.equals(this.fixedPFInject, that.fixedPFInject) 
                && Objects.equals(this.requestId, that.requestId) 
                && Objects.equals(this.gradient, that.gradient) 
                && Objects.equals(this.enterService, that.enterService) 
                && Objects.equals(this.limitMaxDischarge, that.limitMaxDischarge) 
                && Objects.equals(this.fixedVar, that.fixedVar) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.freqDroop, that.freqDroop);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.tbc != null ? this.tbc.hashCode() : 0);
        result = 31 * result + (this.curve != null ? this.curve.hashCode() : 0);
        result = 31 * result + (this.fixedPFAbsorb != null ? this.fixedPFAbsorb.hashCode() : 0);
        result = 31 * result + (this.fixedPFInject != null ? this.fixedPFInject.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.gradient != null ? this.gradient.hashCode() : 0);
        result = 31 * result + (this.enterService != null ? this.enterService.hashCode() : 0);
        result = 31 * result + (this.limitMaxDischarge != null ? this.limitMaxDischarge.hashCode() : 0);
        result = 31 * result + (this.fixedVar != null ? this.fixedVar.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.freqDroop != null ? this.freqDroop.hashCode() : 0);
        return result;
    }
}
