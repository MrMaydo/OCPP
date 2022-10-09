
package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.CostKindEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;


/**
 * Cost
 * urn:x-oca:ocpp:uid:2:233258
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Cost implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Cost. Cost_ Kind. Cost_ Kind_ Code
     * urn:x-oca:ocpp:uid:1:569243
     * The kind of cost referred to in the message element amount
     * 
     * (Required)
     * 
     */
    private CostKindEnum costKind;
    /**
     * Cost. Amount. Amount
     * urn:x-oca:ocpp:uid:1:569244
     * The estimated or actual cost per kWh
     * 
     * (Required)
     * 
     */
    private Integer amount;
    /**
     * Cost. Amount_ Multiplier. Integer
     * urn:x-oca:ocpp:uid:1:569245
     * Values: -3..3, The amountMultiplier defines the exponent to base 10 (dec). The final value is determined by: amount * 10 ^ amountMultiplier
     * 
     * 
     */
    private Integer amountMultiplier;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * Cost. Cost_ Kind. Cost_ Kind_ Code
     * urn:x-oca:ocpp:uid:1:569243
     * The kind of cost referred to in the message element amount
     * 
     * (Required)
     * 
     */
    public CostKindEnum getCostKind() {
        return costKind;
    }

    /**
     * Cost. Cost_ Kind. Cost_ Kind_ Code
     * urn:x-oca:ocpp:uid:1:569243
     * The kind of cost referred to in the message element amount
     * 
     * (Required)
     * 
     */
    public void setCostKind(CostKindEnum costKind) {
        this.costKind = costKind;
    }

    /**
     * Cost. Amount. Amount
     * urn:x-oca:ocpp:uid:1:569244
     * The estimated or actual cost per kWh
     * 
     * (Required)
     * 
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * Cost. Amount. Amount
     * urn:x-oca:ocpp:uid:1:569244
     * The estimated or actual cost per kWh
     * 
     * (Required)
     * 
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Cost. Amount_ Multiplier. Integer
     * urn:x-oca:ocpp:uid:1:569245
     * Values: -3..3, The amountMultiplier defines the exponent to base 10 (dec). The final value is determined by: amount * 10 ^ amountMultiplier
     * 
     * 
     */
    public Integer getAmountMultiplier() {
        return amountMultiplier;
    }

    /**
     * Cost. Amount_ Multiplier. Integer
     * urn:x-oca:ocpp:uid:1:569245
     * Values: -3..3, The amountMultiplier defines the exponent to base 10 (dec). The final value is determined by: amount * 10 ^ amountMultiplier
     * 
     * 
     */
    public void setAmountMultiplier(Integer amountMultiplier) {
        this.amountMultiplier = amountMultiplier;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
