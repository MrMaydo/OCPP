package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class VatNumberValidationRequest implements JsonInterface {

    /**
     * VAT number to check.
     */
    @Required
    private String vatNumber;

    /**
     * EVSE id for which check is done
     */
    @Optional
    private Integer evseId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public VatNumberValidationRequest() {
    }


    public String getVatNumber() {
        return vatNumber;
    }


    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
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
        json.addProperty("vatNumber", vatNumber);
        json.addProperty("evseId", evseId);
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
        if (jsonObject.has("vatNumber")) {
            this.vatNumber = jsonObject.get("vatNumber").getAsString();
        }

        if (jsonObject.has("evseId")) {
            this.evseId = jsonObject.get("evseId").getAsInt();
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
        if (!(obj instanceof VatNumberValidationRequest))
            return false;
        VatNumberValidationRequest that = (VatNumberValidationRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.vatNumber, that.vatNumber);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.vatNumber != null ? this.vatNumber.hashCode() : 0);
        return result;
    }
}
