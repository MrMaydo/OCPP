package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class StreamDataElement implements JsonInterface {

    /**
     * Offset relative to basetime of this message. basetime + t is timestamp of recorded value.
     */
    @Required
    private Float t;

    /**
     *
     */
    @Required
    private String v;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public StreamDataElement() {
    }


    public StreamDataElement(Float t, String v, CustomData customData) {
        super();
        this.t = t;
        this.v = v;
        this.customData = customData;
    }


    public Float getT() {
        return t;
    }


    public void setT(Float t) {
        this.t = t;
    }


    public String getV() {
        return v;
    }


    public void setV(String v) {
        this.v = v;
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
        json.addProperty("t", t);
        json.addProperty("v", v);
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
        if (jsonObject.has("t")) {
            this.t = jsonObject.get("t").getAsFloat();
        }

        if (jsonObject.has("v")) {
            this.v = jsonObject.get("v").getAsString();
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
        if (!(obj instanceof StreamDataElement))
            return false;
        StreamDataElement that = (StreamDataElement) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.t, that.t)
                && Objects.equals(this.v, that.v);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.t != null ? this.t.hashCode() : 0);
        result = 31 * result + (this.v != null ? this.v.hashCode() : 0);
        return result;
    }
}
