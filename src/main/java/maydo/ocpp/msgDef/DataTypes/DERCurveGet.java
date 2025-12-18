package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.DERControlEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class DERCurveGet implements JsonInterface {

    /**
     * Parameters defining the DER curve
     */
    @Required
    private DERCurve curve;

    /**
     * Id of DER curve
     */
    @Required
    private String id;

    /**
     * Type of DER curve
     */
    @Required
    private DERControlEnum curveType;

    /**
     * True if this is a default curve
     */
    @Required
    private Boolean isDefault;

    /**
     * True if this setting is superseded by a higher priority setting (i.e. lower value of priority)
     */
    @Required
    private Boolean isSuperseded;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public DERCurveGet() {
    }


    public DERCurve getCurve() {
        return curve;
    }


    public void setCurve(DERCurve curve) {
        this.curve = curve;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public DERControlEnum getCurveType() {
        return curveType;
    }


    public void setCurveType(DERControlEnum curveType) {
        this.curveType = curveType;
    }


    public Boolean getIsDefault() {
        return isDefault;
    }


    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }


    public Boolean getIsSuperseded() {
        return isSuperseded;
    }


    public void setIsSuperseded(Boolean isSuperseded) {
        this.isSuperseded = isSuperseded;
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

        json.add("curve", getCurve().toJsonObject());

        json.addProperty("id", getId());

        json.addProperty("curveType", getCurveType().toString());

        json.addProperty("isDefault", getIsDefault());

        json.addProperty("isSuperseded", getIsSuperseded());

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
        if (jsonObject.has("curve")) {
            setCurve(new DERCurve());
            getCurve().fromJsonObject(jsonObject.getAsJsonObject("curve"));
        }

        if (jsonObject.has("id")) {
            setId(jsonObject.get("id").getAsString());
        }

        if (jsonObject.has("curveType")) {
            setCurveType(DERControlEnum.valueOf(jsonObject.get("curveType").getAsString()));
        }

        if (jsonObject.has("isDefault")) {
            setIsDefault(jsonObject.get("isDefault").getAsBoolean());
        }

        if (jsonObject.has("isSuperseded")) {
            setIsSuperseded(jsonObject.get("isSuperseded").getAsBoolean());
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
        if (!(obj instanceof DERCurveGet))
            return false;
        DERCurveGet that = (DERCurveGet) obj;
        return Objects.equals(getCurve(), that.getCurve())
                && Objects.equals(getId(), that.getId())
                && Objects.equals(getCurveType(), that.getCurveType())
                && Objects.equals(getIsDefault(), that.getIsDefault())
                && Objects.equals(getIsSuperseded(), that.getIsSuperseded())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getCurve(),
                getId(),
                getCurveType(),
                getIsDefault(),
                getIsSuperseded(),
                getCustomData()
        );
    }
}
