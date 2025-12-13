package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
 * A ChargingPeriodType consists of a start time, and a list of possible values that influence this period,
 * for example: amount of energy charged this period, maximum current during this period etc.
 */
public class ChargingPeriod implements JsonInterface {

    /**
     * List of volume per cost dimension for this charging period.
     */
    @Optional
    private List<CostDimension> dimensions;

    /**
     * Unique identifier of the Tariff that was used to calculate cost.
     * If not provided, then cost was calculated by some other means.
     */
    @Optional
    private String tariffId;

    /**
     * Start timestamp of charging period. A period ends when the next period starts.
     * The last period ends when the session ends.
     */
    @Required
    private Date startPeriod;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChargingPeriod() {
    }


    public List<CostDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<CostDimension> dimensions) {
        this.dimensions = dimensions;
    }


    public String getTariffId() {
        return tariffId;
    }


    public void setTariffId(String tariffId) {
        this.tariffId = tariffId;
    }


    public Date getStartPeriod() {
        return startPeriod;
    }


    public void setStartPeriod(Date startPeriod) {
        this.startPeriod = startPeriod;
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
        json.addProperty("startPeriod", new SimpleDateFormat(DATE_FORMAT).format(startPeriod));
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
        if (jsonObject.has("dimensions")) {
            setDimensions(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("dimensions");
            for (JsonElement el : arr) {
                CostDimension item = new CostDimension();
                item.fromJsonObject(el.getAsJsonObject());
                getDimensions().add(item);
            }
        }

        if (jsonObject.has("tariffId")) {
            setTariffId(jsonObject.get("tariffId").getAsString());
        }

        if (jsonObject.has("startPeriod")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setStartPeriod(dateFormat.parse(jsonObject.get("startPeriod").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for startPeriod" + e);
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
        if (!(obj instanceof ChargingPeriod))
            return false;
        ChargingPeriod that = (ChargingPeriod) obj;
        return Objects.equals(this.startPeriod, that.startPeriod)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.tariffId, that.tariffId)
                && Objects.equals(this.dimensions, that.dimensions);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.startPeriod != null ? this.startPeriod.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.tariffId != null ? this.tariffId.hashCode() : 0);
        result = 31 * result + (this.dimensions != null ? this.dimensions.hashCode() : 0);
        return result;
    }
}
