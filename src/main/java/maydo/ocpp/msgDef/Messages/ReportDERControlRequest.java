package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.*;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Reports DER controls requested by a GetDERControlRequest message. The report may consist of more than one message.
 */
public class ReportDERControlRequest implements JsonInterface {

    /**
     * RequestId from GetDERControlRequest.
     */
    @Required
    private Integer requestId;

    /**
     * Voltage/Frequency/Active/Reactive curve
     */
    @Optional
    private List<DERCurveGet> curve;

    /**
     * Enter service after trip parameters
     */
    @Optional
    private List<EnterServiceGet> enterService;

    /**
     * Fixed power factor setpoint when absorbing active power
     */
    @Optional
    private List<FixedPFGet> fixedPFAbsorb;

    /**
     * Fixed power factor setpoint when injecting active power
     */
    @Optional
    private List<FixedPFGet> fixedPFInject;

    /**
     * Fixed reactive power setting
     */
    @Optional
    private List<FixedVarGet> fixedVar;

    /**
     * Frequency-Watt parameterized mode
     */
    @Optional
    private List<FreqDroopGet> freqDroop;

    /**
     * Gradient settings
     */
    @Optional
    private List<GradientGet> gradient;

    /**
     * Limit maximum discharge as percentage of rated capability
     */
    @Optional
    private List<LimitMaxDischargeGet> limitMaxDischarge;

    /**
     * To Be Continued. Default value when omitted: false. False indicates that there are no further messages as part of this report.
     */
    @Optional
    private Boolean tbc;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ReportDERControlRequest() {
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


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public Boolean getTbc() {
        return tbc;
    }


    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
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

        json.addProperty("requestId", getRequestId());

        if (getCurve() != null) {
            JsonArray curveArray = new JsonArray();
            for (DERCurveGet item : getCurve()) {
                curveArray.add(item.toJsonObject());
            }
            json.add("curve", curveArray);
        }
        if (getEnterService() != null) {
            JsonArray enterServiceArray = new JsonArray();
            for (EnterServiceGet item : getEnterService()) {
                enterServiceArray.add(item.toJsonObject());
            }
            json.add("enterService", enterServiceArray);
        }
        if (getFixedPFAbsorb() != null) {
            JsonArray fixedPFAbsorbArray = new JsonArray();
            for (FixedPFGet item : getFixedPFAbsorb()) {
                fixedPFAbsorbArray.add(item.toJsonObject());
            }
            json.add("fixedPFAbsorb", fixedPFAbsorbArray);
        }
        if (getFixedPFInject() != null) {
            JsonArray fixedPFInjectArray = new JsonArray();
            for (FixedPFGet item : getFixedPFInject()) {
                fixedPFInjectArray.add(item.toJsonObject());
            }
            json.add("fixedPFInject", fixedPFInjectArray);
        }
        if (getFixedVar() != null) {
            JsonArray fixedVarArray = new JsonArray();
            for (FixedVarGet item : getFixedVar()) {
                fixedVarArray.add(item.toJsonObject());
            }
            json.add("fixedVar", fixedVarArray);
        }
        if (getFreqDroop() != null) {
            JsonArray freqDroopArray = new JsonArray();
            for (FreqDroopGet item : getFreqDroop()) {
                freqDroopArray.add(item.toJsonObject());
            }
            json.add("freqDroop", freqDroopArray);
        }
        if (getGradient() != null) {
            JsonArray gradientArray = new JsonArray();
            for (GradientGet item : getGradient()) {
                gradientArray.add(item.toJsonObject());
            }
            json.add("gradient", gradientArray);
        }
        if (getLimitMaxDischarge() != null) {
            JsonArray limitMaxDischargeArray = new JsonArray();
            for (LimitMaxDischargeGet item : getLimitMaxDischarge()) {
                limitMaxDischargeArray.add(item.toJsonObject());
            }
            json.add("limitMaxDischarge", limitMaxDischargeArray);
        }
        if (getTbc() != null) {
            json.addProperty("tbc", getTbc());
        }
        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("curve")) {
            setCurve(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("curve");
            for (JsonElement el : arr) {
                DERCurveGet item = new DERCurveGet();
                item.fromJsonObject(el.getAsJsonObject());
                getCurve().add(item);
            }
        }

        if (jsonObject.has("enterService")) {
            setEnterService(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("enterService");
            for (JsonElement el : arr) {
                EnterServiceGet item = new EnterServiceGet();
                item.fromJsonObject(el.getAsJsonObject());
                getEnterService().add(item);
            }
        }

        if (jsonObject.has("fixedPFAbsorb")) {
            setFixedPFAbsorb(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("fixedPFAbsorb");
            for (JsonElement el : arr) {
                FixedPFGet item = new FixedPFGet();
                item.fromJsonObject(el.getAsJsonObject());
                getFixedPFAbsorb().add(item);
            }
        }

        if (jsonObject.has("fixedPFInject")) {
            setFixedPFInject(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("fixedPFInject");
            for (JsonElement el : arr) {
                FixedPFGet item = new FixedPFGet();
                item.fromJsonObject(el.getAsJsonObject());
                getFixedPFInject().add(item);
            }
        }

        if (jsonObject.has("fixedVar")) {
            setFixedVar(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("fixedVar");
            for (JsonElement el : arr) {
                FixedVarGet item = new FixedVarGet();
                item.fromJsonObject(el.getAsJsonObject());
                getFixedVar().add(item);
            }
        }

        if (jsonObject.has("freqDroop")) {
            setFreqDroop(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("freqDroop");
            for (JsonElement el : arr) {
                FreqDroopGet item = new FreqDroopGet();
                item.fromJsonObject(el.getAsJsonObject());
                getFreqDroop().add(item);
            }
        }

        if (jsonObject.has("gradient")) {
            setGradient(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("gradient");
            for (JsonElement el : arr) {
                GradientGet item = new GradientGet();
                item.fromJsonObject(el.getAsJsonObject());
                getGradient().add(item);
            }
        }

        if (jsonObject.has("limitMaxDischarge")) {
            setLimitMaxDischarge(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("limitMaxDischarge");
            for (JsonElement el : arr) {
                LimitMaxDischargeGet item = new LimitMaxDischargeGet();
                item.fromJsonObject(el.getAsJsonObject());
                getLimitMaxDischarge().add(item);
            }
        }

        if (jsonObject.has("tbc")) {
            setTbc(jsonObject.get("tbc").getAsBoolean());
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
        return Objects.hash(
                getRequestId(),
                getCurve(),
                getEnterService(),
                getFixedPFAbsorb(),
                getFixedPFInject(),
                getFixedVar(),
                getFreqDroop(),
                getGradient(),
                getLimitMaxDischarge(),
                getTbc(),
                getCustomData()
        );
    }
}
