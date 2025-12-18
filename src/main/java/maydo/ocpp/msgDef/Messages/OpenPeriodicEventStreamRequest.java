package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ConstantStreamData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class OpenPeriodicEventStreamRequest implements JsonInterface {

    /**
     * Constant part of stream data
     */
    @Required
    private ConstantStreamData constantStreamData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public OpenPeriodicEventStreamRequest() {
    }


    public ConstantStreamData getConstantStreamData() {
        return constantStreamData;
    }


    public void setConstantStreamData(ConstantStreamData constantStreamData) {
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

        json.add("constantStreamData", getConstantStreamData().toJsonObject());

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
            setConstantStreamData(new ConstantStreamData());
            getConstantStreamData().fromJsonObject(jsonObject.getAsJsonObject("constantStreamData"));
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
        if (!(obj instanceof OpenPeriodicEventStreamRequest))
            return false;
        OpenPeriodicEventStreamRequest that = (OpenPeriodicEventStreamRequest) obj;
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
