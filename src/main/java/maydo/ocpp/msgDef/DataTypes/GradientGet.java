package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GradientGet implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private Gradient gradient;
    /**
     * Id of setting
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String id;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GradientGet() {
    }

    /**
     * @param id Id of setting
     *           <p>
     *           .
     */
    public GradientGet(Gradient gradient, String id, CustomData customData) {
        super();
        this.gradient = gradient;
        this.id = id;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public Gradient getGradient() {
        return gradient;
    }

    /**
     * (Required)
     */
    public void setGradient(Gradient gradient) {
        this.gradient = gradient;
    }

    /**
     * Id of setting
     * <p>
     * <p>
     * (Required)
     */
    public String getId() {
        return id;
    }

    /**
     * Id of setting
     * <p>
     * <p>
     * (Required)
     */
    public void setId(String id) {
        this.id = id;
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
        json.add("gradient", gradient.toJsonObject());
        json.addProperty("id", id);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("gradient")) {
            this.gradient = new Gradient();
            this.gradient.fromJsonObject(jsonObject.getAsJsonObject("gradient"));
        }

        if (jsonObject.has("id")) {
            this.id = jsonObject.get("id").getAsString();
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
        if (!(obj instanceof GradientGet))
            return false;
        GradientGet that = (GradientGet) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.gradient, that.gradient);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.gradient != null ? this.gradient.hashCode() : 0);
        return result;
    }
}
