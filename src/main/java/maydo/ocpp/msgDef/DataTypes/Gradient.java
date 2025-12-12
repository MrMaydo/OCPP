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
public class Gradient implements JsonInterface {

    /**
     * Id of setting
     */
    @Required
    private Integer priority;

    /**
     * Default ramp rate in seconds (0 if not applicable)
     */
    @Required
    private Float gradient;

    /**
     * Soft-start ramp rate in seconds (0 if not applicable)
     */
    @Required
    private Float softGradient;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Gradient() {
    }


    public Gradient(Integer priority, Float gradient, Float softGradient, CustomData customData) {
        super();
        this.priority = priority;
        this.gradient = gradient;
        this.softGradient = softGradient;
        this.customData = customData;
    }


    public Integer getPriority() {
        return priority;
    }


    public void setPriority(Integer priority) {
        this.priority = priority;
    }


    public Float getGradient() {
        return gradient;
    }


    public void setGradient(Float gradient) {
        this.gradient = gradient;
    }


    public Float getSoftGradient() {
        return softGradient;
    }


    public void setSoftGradient(Float softGradient) {
        this.softGradient = softGradient;
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
        json.addProperty("priority", priority);
        json.addProperty("gradient", gradient);
        json.addProperty("softGradient", softGradient);
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
        if (jsonObject.has("priority")) {
            this.priority = jsonObject.get("priority").getAsInt();
        }

        if (jsonObject.has("gradient")) {
            this.gradient = jsonObject.get("gradient").getAsFloat();
        }

        if (jsonObject.has("softGradient")) {
            this.softGradient = jsonObject.get("softGradient").getAsFloat();
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
        if (!(obj instanceof Gradient))
            return false;
        Gradient that = (Gradient) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.priority, that.priority)
                && Objects.equals(this.softGradient, that.softGradient)
                && Objects.equals(this.gradient, that.gradient);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
        result = 31 * result + (this.softGradient != null ? this.softGradient.hashCode() : 0);
        result = 31 * result + (this.gradient != null ? this.gradient.hashCode() : 0);
        return result;
    }
}
