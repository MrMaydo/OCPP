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

        json.addProperty("priority", getPriority());

        json.addProperty("gradient", getGradient());

        json.addProperty("softGradient", getSoftGradient());

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
        if (jsonObject.has("priority")) {
            setPriority(jsonObject.get("priority").getAsInt());
        }

        if (jsonObject.has("gradient")) {
            setGradient(jsonObject.get("gradient").getAsFloat());
        }

        if (jsonObject.has("softGradient")) {
            setSoftGradient(jsonObject.get("softGradient").getAsFloat());
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
        if (!(obj instanceof Gradient))
            return false;
        Gradient that = (Gradient) obj;
        return Objects.equals(getPriority(), that.getPriority())
                && Objects.equals(getGradient(), that.getGradient())
                && Objects.equals(getSoftGradient(), that.getSoftGradient())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getPriority(),
                getGradient(),
                getSoftGradient(),
                getCustomData()
        );
    }
}
