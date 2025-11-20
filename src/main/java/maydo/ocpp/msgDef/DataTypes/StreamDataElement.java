package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class StreamDataElement implements JsonInterface {

    /**
     * Offset relative to _basetime_ of this message. _basetime_ + _t_ is timestamp of recorded value.
     * <p>
     * (Required)
     */
    @Required
    private Float t;
    /**
     * (Required)
     */
    @Required
    private String v;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public StreamDataElement() {
    }

    /**
     * @param t Offset relative to _basetime_ of this message. _basetime_ + _t_ is timestamp of recorded value.
     *          .
     */
    public StreamDataElement(Float t, String v, CustomData customData) {
        super();
        this.t = t;
        this.v = v;
        this.customData = customData;
    }

    /**
     * Offset relative to _basetime_ of this message. _basetime_ + _t_ is timestamp of recorded value.
     * <p>
     * (Required)
     */
    public Float getT() {
        return t;
    }

    /**
     * Offset relative to _basetime_ of this message. _basetime_ + _t_ is timestamp of recorded value.
     * <p>
     * (Required)
     */
    public void setT(Float t) {
        this.t = t;
    }

    /**
     * (Required)
     */
    public String getV() {
        return v;
    }

    /**
     * (Required)
     */
    public void setV(String v) {
        this.v = v;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
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
