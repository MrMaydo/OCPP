package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class ConsumptionCost implements JsonInterface {

    /**
     * The lowest level of consumption that defines the starting point of this consumption block.
     * The block interval extends to the start of the next interval.
     */
    @Required
    private Float startValue;

    /**
     * This field contains the cost details.
     */
    @Required
    private List<Cost> cost;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ConsumptionCost() {
    }


    public Float getStartValue() {
        return startValue;
    }


    public void setStartValue(Float startValue) {
        this.startValue = startValue;
    }


    public List<Cost> getCost() {
        return cost;
    }


    public void setCost(List<Cost> cost) {
        this.cost = cost;
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

        json.addProperty("startValue", getStartValue());

        JsonArray costArray = new JsonArray();
        for (Cost item : getCost()) {
            costArray.add(item.toJsonObject());
        }
        json.add("cost", costArray);

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
        if (jsonObject.has("startValue")) {
            setStartValue(jsonObject.get("startValue").getAsFloat());
        }

        if (jsonObject.has("cost")) {
            setCost(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("cost");
            for (JsonElement el : arr) {
                Cost item = new Cost();
                item.fromJsonObject(el.getAsJsonObject());
                getCost().add(item);
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
        if (!(obj instanceof ConsumptionCost))
            return false;
        ConsumptionCost that = (ConsumptionCost) obj;
        return Objects.equals(getStartValue(), that.getStartValue())
                && Objects.equals(getCost(), that.getCost())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getStartValue(),
                getCost(),
                getCustomData()
        );
    }
}
