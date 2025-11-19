package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Part of ISO 15118-20 price schedule.
 * 
 * 
 * 
 */
public class RationalNumber implements JsonInterface {

    /**
     * The exponent to base 10 (dec)
     * 
     * (Required)
     */
    @Required
    private Integer exponent;
    /**
     * Value which shall be multiplied.
     * 
     * (Required)
     */
    @Required
    private Integer value;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public RationalNumber() {
    }

    /**
     * 
     * @param value
     *     Value which shall be multiplied.
     *     .
     * @param exponent
     *     The exponent to base 10 (dec)
     *     .
     */
    public RationalNumber(Integer exponent, Integer value, CustomData customData) {
        super();
        this.exponent = exponent;
        this.value = value;
        this.customData = customData;
    }

    /**
     * The exponent to base 10 (dec)
     * 
     * (Required)
     */
    public Integer getExponent() {
        return exponent;
    }

    /**
     * The exponent to base 10 (dec)
     * 
     * (Required)
     */
    public void setExponent(Integer exponent) {
        this.exponent = exponent;
    }

    /**
     * Value which shall be multiplied.
     * 
     * (Required)
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Value which shall be multiplied.
     * 
     * (Required)
     */
    public void setValue(Integer value) {
        this.value = value;
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
        if (!(obj instanceof RationalNumber))
            return false;
        RationalNumber that = (RationalNumber) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.value, that.value) 
                && Objects.equals(this.exponent, that.exponent);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
        result = 31 * result + (this.exponent != null ? this.exponent.hashCode() : 0);
        return result;
    }
}
