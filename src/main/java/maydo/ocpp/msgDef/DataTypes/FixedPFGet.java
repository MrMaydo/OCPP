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
public class FixedPFGet implements JsonInterface {

    /**
     * FixedPF for AbsorbW or InjectW
     */
    @Required
    private FixedPF fixedPF;

    /**
     * Id of setting.
     */
    @Required
    private String id;

    /**
     * True if setting is a default control.
     */
    @Required
    private Boolean isDefault;

    /**
     * True if this setting is superseded by a lower priority setting.
     */
    @Required
    private Boolean isSuperseded;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public FixedPFGet() {
    }


    public FixedPF getFixedPF() {
        return fixedPF;
    }


    public void setFixedPF(FixedPF fixedPF) {
        this.fixedPF = fixedPF;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public Boolean getIsDefault() {
        return isDefault;
    }


    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }


    public Boolean getIsSuperseded() {
        return isSuperseded;
    }


    public void setIsSuperseded(Boolean isSuperseded) {
        this.isSuperseded = isSuperseded;
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
        json.add("fixedPF", fixedPF.toJsonObject());
        json.addProperty("id", id);
        json.addProperty("isDefault", isDefault);
        json.addProperty("isSuperseded", isSuperseded);
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
        if (jsonObject.has("fixedPF")) {
            setFixedPF(new FixedPF());
            getFixedPF().fromJsonObject(jsonObject.getAsJsonObject("fixedPF"));
        }

        if (jsonObject.has("id")) {
            setId(jsonObject.get("id").getAsString());
        }

        if (jsonObject.has("isDefault")) {
            setIsDefault(jsonObject.get("isDefault").getAsBoolean());
        }

        if (jsonObject.has("isSuperseded")) {
            setIsSuperseded(jsonObject.get("isSuperseded").getAsBoolean());
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
        if (!(obj instanceof FixedPFGet))
            return false;
        FixedPFGet that = (FixedPFGet) obj;
        return Objects.equals(this.fixedPF, that.fixedPF)
                && Objects.equals(this.isDefault, that.isDefault)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.isSuperseded, that.isSuperseded);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.fixedPF != null ? this.fixedPF.hashCode() : 0);
        result = 31 * result + (this.isDefault != null ? this.isDefault.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.isSuperseded != null ? this.isSuperseded.hashCode() : 0);
        return result;
    }
}
