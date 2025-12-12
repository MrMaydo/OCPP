package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.TariffKindEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * Shows assignment of tariffs to EVSE or IdToken.
 */
public class TariffAssignment implements JsonInterface {

    /**
     * Tariff id.
     */
    @Required
    private String tariffId;

    /**
     * Kind of tariff (driver/default)
     */
    @Required
    private TariffKindEnum tariffKind;

    /**
     * Date/time when this tariff become active.
     */
    @Optional
    private Date validFrom;

    /**
     *
     */
    @Optional
    private List<Integer> evseIds;

    /**
     * IdTokens related to tariff
     */
    @Optional
    private List<String> idTokens;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public TariffAssignment() {
    }


    public String getTariffId() {
        return tariffId;
    }


    public void setTariffId(String tariffId) {
        this.tariffId = tariffId;
    }


    public TariffKindEnum getTariffKind() {
        return tariffKind;
    }


    public void setTariffKind(TariffKindEnum tariffKind) {
        this.tariffKind = tariffKind;
    }


    public Date getValidFrom() {
        return validFrom;
    }


    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public List<Integer> getEvseIds() {
        return evseIds;
    }

    public void setEvseIds(List<Integer> evseIds) {
        this.evseIds = evseIds;
    }


    public List<String> getIdTokens() {
        return idTokens;
    }


    public void setIdTokens(List<String> idTokens) {
        this.idTokens = idTokens;
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
        json.addProperty("tariffId", tariffId);
        json.addProperty("tariffKind", tariffKind.toString());
        json.addProperty("validFrom", new SimpleDateFormat(DATE_FORMAT).format(validFrom));
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
        if (jsonObject.has("tariffId")) {
            this.tariffId = jsonObject.get("tariffId").getAsString();
        }

        if (jsonObject.has("tariffKind")) {
            this.tariffKind = TariffKindEnum.valueOf(jsonObject.get("tariffKind").getAsString());
        }

        if (jsonObject.has("validFrom")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.validFrom = dateFormat.parse(jsonObject.get("validFrom").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for validFrom" + e);
            }
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
        if (!(obj instanceof TariffAssignment))
            return false;
        TariffAssignment that = (TariffAssignment) obj;
        return Objects.equals(this.tariffKind, that.tariffKind)
                && Objects.equals(this.evseIds, that.evseIds)
                && Objects.equals(this.idTokens, that.idTokens)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.tariffId, that.tariffId)
                && Objects.equals(this.validFrom, that.validFrom);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.tariffKind != null ? this.tariffKind.hashCode() : 0);
        result = 31 * result + (this.evseIds != null ? this.evseIds.hashCode() : 0);
        result = 31 * result + (this.idTokens != null ? this.idTokens.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.tariffId != null ? this.tariffId.hashCode() : 0);
        result = 31 * result + (this.validFrom != null ? this.validFrom.hashCode() : 0);
        return result;
    }
}
