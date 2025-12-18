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
public class FixedVarGet implements JsonInterface {

    /**
     * Fixed Var setpoint
     */
    @Required
    private FixedVar fixedVar;

    /**
     * Id of setting
     */
    @Required
    private String id;

    /**
     * True if setting is a default control.
     */
    @Required
    private Boolean isDefault;

    /**
     * True if this setting is superseded by a lower priority setting
     */
    @Required
    private Boolean isSuperseded;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public FixedVarGet() {
    }


    public FixedVar getFixedVar() {
        return fixedVar;
    }


    public void setFixedVar(FixedVar fixedVar) {
        this.fixedVar = fixedVar;
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

        json.add("fixedVar", getFixedVar().toJsonObject());

        json.addProperty("id", getId());

        json.addProperty("isDefault", getIsDefault());

        json.addProperty("isSuperseded", getIsSuperseded());

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
        if (jsonObject.has("fixedVar")) {
            setFixedVar(new FixedVar());
            getFixedVar().fromJsonObject(jsonObject.getAsJsonObject("fixedVar"));
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
        if (!(obj instanceof FixedVarGet))
            return false;
        FixedVarGet that = (FixedVarGet) obj;
        return Objects.equals(getFixedVar(), that.getFixedVar())
                && Objects.equals(getId(), that.getId())
                && Objects.equals(getIsDefault(), that.getIsDefault())
                && Objects.equals(getIsSuperseded(), that.getIsSuperseded())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getFixedVar(),
                getId(),
                getIsDefault(),
                getIsSuperseded(),
                getCustomData()
        );
    }
}
