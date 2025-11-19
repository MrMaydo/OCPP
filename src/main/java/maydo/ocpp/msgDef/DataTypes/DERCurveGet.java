package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.DERControlEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class DERCurveGet implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private DERCurve curve;
    /**
     * Id of DER curve
     * 
     * 
     * (Required)
     */
    @Required
    private String id;
    /**
     * Type of DER curve
     * 
     * 
     * (Required)
     */
    @Required
    private DERControlEnum curveType;
    /**
     * True if this is a default curve
     * 
     * 
     * (Required)
     */
    @Required
    private Boolean isDefault;
    /**
     * True if this setting is superseded by a higher priority setting (i.e. lower value of _priority_)
     * 
     * 
     * (Required)
     */
    @Required
    private Boolean isSuperseded;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public DERCurveGet() {
    }

    /**
     * 
     * @param isDefault
     *     True if this is a default curve
     *     
     *     .
     * @param isSuperseded
     *     True if this setting is superseded by a higher priority setting (i.e. lower value of _priority_)
     *     
     *     .
     * @param id
     *     Id of DER curve
     *     
     *     .
     */
    public DERCurveGet(DERCurve curve, String id, DERControlEnum curveType, Boolean isDefault, Boolean isSuperseded, CustomData customData) {
        super();
        this.curve = curve;
        this.id = id;
        this.curveType = curveType;
        this.isDefault = isDefault;
        this.isSuperseded = isSuperseded;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public DERCurve getCurve() {
        return curve;
    }

    /**
     * 
     * (Required)
     */
    public void setCurve(DERCurve curve) {
        this.curve = curve;
    }

    /**
     * Id of DER curve
     * 
     * 
     * (Required)
     */
    public String getId() {
        return id;
    }

    /**
     * Id of DER curve
     * 
     * 
     * (Required)
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Type of DER curve
     * 
     * 
     * (Required)
     */
    public DERControlEnum getCurveType() {
        return curveType;
    }

    /**
     * Type of DER curve
     * 
     * 
     * (Required)
     */
    public void setCurveType(DERControlEnum curveType) {
        this.curveType = curveType;
    }

    /**
     * True if this is a default curve
     * 
     * 
     * (Required)
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * True if this is a default curve
     * 
     * 
     * (Required)
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * True if this setting is superseded by a higher priority setting (i.e. lower value of _priority_)
     * 
     * 
     * (Required)
     */
    public Boolean getIsSuperseded() {
        return isSuperseded;
    }

    /**
     * True if this setting is superseded by a higher priority setting (i.e. lower value of _priority_)
     * 
     * 
     * (Required)
     */
    public void setIsSuperseded(Boolean isSuperseded) {
        this.isSuperseded = isSuperseded;
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
        if (!(obj instanceof DERCurveGet))
            return false;
        DERCurveGet that = (DERCurveGet) obj;
        return Objects.equals(this.curveType, that.curveType)
                && Objects.equals(this.isDefault, that.isDefault) 
                && Objects.equals(this.isSuperseded, that.isSuperseded) 
                && Objects.equals(this.curve, that.curve) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.curveType != null ? this.curveType.hashCode() : 0);
        result = 31 * result + (this.isDefault != null ? this.isDefault.hashCode() : 0);
        result = 31 * result + (this.isSuperseded != null ? this.isSuperseded.hashCode() : 0);
        result = 31 * result + (this.curve != null ? this.curve.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        return result;
    }
}
