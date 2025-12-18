package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ConstantStreamData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class GetPeriodicEventStreamResponse implements JsonInterface {

    /**
     * List of constant part of streams
     */
    @Optional
    private List<ConstantStreamData> constantStreamData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetPeriodicEventStreamResponse() {
    }

    public List<ConstantStreamData> getConstantStreamData() {
        return constantStreamData;
    }

    public void setConstantStreamData(List<ConstantStreamData> constantStreamData) {
        this.constantStreamData = constantStreamData;
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

        if (getConstantStreamData() != null) {
            JsonArray constantStreamDataArray = new JsonArray();
            for (ConstantStreamData item : getConstantStreamData()) {
                constantStreamDataArray.add(item.toJsonObject());
            }
            json.add("constantStreamData", constantStreamDataArray);
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
        if (jsonObject.has("constantStreamData")) {
            setConstantStreamData(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("constantStreamData");
            for (JsonElement el : arr) {
                ConstantStreamData item = new ConstantStreamData();
                item.fromJsonObject(el.getAsJsonObject());
                getConstantStreamData().add(item);
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
        if (!(obj instanceof GetPeriodicEventStreamResponse))
            return false;
        GetPeriodicEventStreamResponse that = (GetPeriodicEventStreamResponse) obj;
        return Objects.equals(getConstantStreamData(), that.getConstantStreamData())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getConstantStreamData(),
                getCustomData()
        );
    }
}
