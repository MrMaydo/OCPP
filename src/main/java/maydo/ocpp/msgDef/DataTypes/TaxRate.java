package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Tax percentage
 */
public class TaxRate implements JsonInterface {

    /**
     * Type of this tax, e.g.  "Federal ",  "State", for information on receipt.
     * <p>
     * (Required)
     */
    @Required
    private String type;
    /**
     * Tax percentage
     * <p>
     * (Required)
     */
    @Required
    private Float tax;
    /**
     * Stack level for this type of tax. Default value, when absent, is 0. +
     * _stack_ = 0: tax on net price; +
     * _stack_ = 1: tax added on top of _stack_ 0; +
     * _stack_ = 2: tax added on top of _stack_ 1, etc.
     */
    @Optional
    private Integer stack;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TaxRate() {
    }

    /**
     * @param stack Stack level for this type of tax. Default value, when absent, is 0. +
     *              _stack_ = 0: tax on net price; +
     *              _stack_ = 1: tax added on top of _stack_ 0; +
     *              _stack_ = 2: tax added on top of _stack_ 1, etc.
     *              .
     * @param tax   Tax percentage
     *              .
     * @param type  Type of this tax, e.g.  "Federal ",  "State", for information on receipt.
     *              .
     */
    public TaxRate(String type, Float tax, Integer stack, CustomData customData) {
        super();
        this.type = type;
        this.tax = tax;
        this.stack = stack;
        this.customData = customData;
    }

    /**
     * Type of this tax, e.g.  "Federal ",  "State", for information on receipt.
     * <p>
     * (Required)
     */
    public String getType() {
        return type;
    }

    /**
     * Type of this tax, e.g.  "Federal ",  "State", for information on receipt.
     * <p>
     * (Required)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Tax percentage
     * <p>
     * (Required)
     */
    public Float getTax() {
        return tax;
    }

    /**
     * Tax percentage
     * <p>
     * (Required)
     */
    public void setTax(Float tax) {
        this.tax = tax;
    }

    /**
     * Stack level for this type of tax. Default value, when absent, is 0. +
     * _stack_ = 0: tax on net price; +
     * _stack_ = 1: tax added on top of _stack_ 0; +
     * _stack_ = 2: tax added on top of _stack_ 1, etc.
     */
    public Integer getStack() {
        return stack;
    }

    /**
     * Stack level for this type of tax. Default value, when absent, is 0. +
     * _stack_ = 0: tax on net price; +
     * _stack_ = 1: tax added on top of _stack_ 0; +
     * _stack_ = 2: tax added on top of _stack_ 1, etc.
     */
    public void setStack(Integer stack) {
        this.stack = stack;
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
        if (!(obj instanceof TaxRate))
            return false;
        TaxRate that = (TaxRate) obj;
        return Objects.equals(this.tax, that.tax)
                && Objects.equals(this.stack, that.stack)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.tax != null ? this.tax.hashCode() : 0);
        result = 31 * result + (this.stack != null ? this.stack.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
        return result;
    }
}
