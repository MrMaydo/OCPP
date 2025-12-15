package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * Tax percentage
 */
public class TaxRate implements JsonInterface {

    /**
     * Type of this tax, e.g. "Federal ", "State", for information on receipt.
     */
    @Required
    private String type;

    /**
     * Tax percentage
     */
    @Required
    private Float tax;

    /**
     * Stack level for this type of tax. Default value, when absent, is 0.
     * <p> stack = 0: tax on net price; </p>
     * <p> stack = 1: tax added on top of stack 0; </p>
     * <p> stack = 2: tax added on top of stack 1, etc. </p>
     */
    @Optional
    private Integer stack;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TaxRate() {
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public Float getTax() {
        return tax;
    }


    public void setTax(Float tax) {
        this.tax = tax;
    }


    public Integer getStack() {
        return stack;
    }


    public void setStack(Integer stack) {
        this.stack = stack;
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

        json.addProperty("type", getType());

        json.addProperty("tax", getTax());

        if (getStack() != null) {
            json.addProperty("stack", getStack());
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
        if (jsonObject.has("type")) {
            setType(jsonObject.get("type").getAsString());
        }

        if (jsonObject.has("tax")) {
            setTax(jsonObject.get("tax").getAsFloat());
        }

        if (jsonObject.has("stack")) {
            setStack(jsonObject.get("stack").getAsInt());
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
