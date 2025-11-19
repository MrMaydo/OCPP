package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class FixedVarGet implements JsonInterface {

    /**
     * (Required)
     */
    @Required
    private FixedVar fixedVar;
    /**
     * Id of setting
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String id;
    /**
     * True if setting is a default control.
     * <p>
     * (Required)
     */
    @Required
    private Boolean isDefault;
    /**
     * True if this setting is superseded by a lower priority setting
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Boolean isSuperseded;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public FixedVarGet() {
    }

    /**
     * @param isDefault    True if setting is a default control.
     *                     .
     * @param isSuperseded True if this setting is superseded by a lower priority setting
     *                     <p>
     *                     .
     * @param id           Id of setting
     *                     <p>
     *                     .
     */
    public FixedVarGet(FixedVar fixedVar, String id, Boolean isDefault, Boolean isSuperseded, CustomData customData) {
        super();
        this.fixedVar = fixedVar;
        this.id = id;
        this.isDefault = isDefault;
        this.isSuperseded = isSuperseded;
        this.customData = customData;
    }

    /**
     * (Required)
     */
    public FixedVar getFixedVar() {
        return fixedVar;
    }

    /**
     * (Required)
     */
    public void setFixedVar(FixedVar fixedVar) {
        this.fixedVar = fixedVar;
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
     * True if setting is a default control.
     * <p>
     * (Required)
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * True if setting is a default control.
     * <p>
     * (Required)
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * True if this setting is superseded by a lower priority setting
     * <p>
     * <p>
     * (Required)
     */
    public Boolean getIsSuperseded() {
        return isSuperseded;
    }

    /**
     * True if this setting is superseded by a lower priority setting
     * <p>
     * <p>
     * (Required)
     */
    public void setIsSuperseded(Boolean isSuperseded) {
        this.isSuperseded = isSuperseded;
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
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof FixedVarGet))
            return false;
        FixedVarGet that = (FixedVarGet) obj;
        return Objects.equals(this.fixedVar, that.fixedVar)
                && Objects.equals(this.isDefault, that.isDefault)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.isSuperseded, that.isSuperseded);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.fixedVar != null ? this.fixedVar.hashCode() : 0);
        result = 31 * result + (this.isDefault != null ? this.isDefault.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.isSuperseded != null ? this.isSuperseded.hashCode() : 0);
        return result;
    }
}
