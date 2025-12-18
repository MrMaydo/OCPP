package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.TariffKindEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

        json.addProperty("tariffId", getTariffId());

        json.addProperty("tariffKind", getTariffKind().toString());

        if (getValidFrom() != null) {
            json.addProperty("validFrom", new SimpleDateFormat(DATE_FORMAT).format(getValidFrom()));
        }
        if (getEvseIds() != null) {
            JsonArray evseIdsArray = new JsonArray();
            for (Integer item : getEvseIds()) {
                evseIdsArray.add(item);
            }
            json.add("evseIds", evseIdsArray);
        }
        if (getIdTokens() != null) {
            JsonArray idTokensArray = new JsonArray();
            for (String item : getIdTokens()) {
                idTokensArray.add(item);
            }
            json.add("idTokens", idTokensArray);
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
        if (jsonObject.has("tariffId")) {
            setTariffId(jsonObject.get("tariffId").getAsString());
        }

        if (jsonObject.has("tariffKind")) {
            setTariffKind(TariffKindEnum.valueOf(jsonObject.get("tariffKind").getAsString()));
        }

        if (jsonObject.has("validFrom")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setValidFrom(dateFormat.parse(jsonObject.get("validFrom").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for validFrom" + e);
            }
        }

        if (jsonObject.has("evseIds")) {
            setEvseIds(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("evseIds");
            for (JsonElement el : arr) {
                getEvseIds().add(el.getAsInt());
            }
        }

        if (jsonObject.has("idTokens")) {
            setIdTokens(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("idTokens");
            for (JsonElement el : arr) {
                getIdTokens().add(el.getAsString());
            }
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
        if (!(obj instanceof TariffAssignment))
            return false;
        TariffAssignment that = (TariffAssignment) obj;
        return Objects.equals(getTariffId(), that.getTariffId())
                && Objects.equals(getTariffKind(), that.getTariffKind())
                && Objects.equals(getValidFrom(), that.getValidFrom())
                && Objects.equals(getEvseIds(), that.getEvseIds())
                && Objects.equals(getIdTokens(), that.getIdTokens())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getTariffId(),
                getTariffKind(),
                getValidFrom(),
                getEvseIds(),
                getIdTokens(),
                getCustomData()
        );
    }
}
