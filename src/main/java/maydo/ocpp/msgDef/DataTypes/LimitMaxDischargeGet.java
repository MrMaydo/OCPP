package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class LimitMaxDischargeGet implements JsonInterface {

    /**
     * Id of setting
     * 
     * 
     * (Required)
     */
    @Required
    private String id;
    /**
     * True if setting is a default control.
     * 
     * (Required)
     */
    @Required
    private Boolean isDefault;
    /**
     * True if this setting is superseded by a higher priority setting (i.e. lower value of _priority_)
     * 
     * 
     * (Required)
     */
    @Required
    private Boolean isSuperseded;
    /**
     * 
     * (Required)
     */
    @Required
    private LimitMaxDischarge limitMaxDischarge;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public LimitMaxDischargeGet() {
    }

    /**
     * 
     * @param isDefault
     *     True if setting is a default control.
     *     .
     * @param isSuperseded
     *     True if this setting is superseded by a higher priority setting (i.e. lower value of _priority_)
     *     
     *     .
     * @param id
     *     Id of setting
     *     
     *     .
     */
    public LimitMaxDischargeGet(String id, Boolean isDefault, Boolean isSuperseded, LimitMaxDischarge limitMaxDischarge, CustomData customData) {
        super();
        this.id = id;
        this.isDefault = isDefault;
        this.isSuperseded = isSuperseded;
        this.limitMaxDischarge = limitMaxDischarge;
        this.customData = customData;
    }

    /**
     * Id of setting
     * 
     * 
     * (Required)
     */
    public String getId() {
        return id;
    }

    /**
     * Id of setting
     * 
     * 
     * (Required)
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * True if setting is a default control.
     * 
     * (Required)
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * True if setting is a default control.
     * 
     * (Required)
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * True if this setting is superseded by a higher priority setting (i.e. lower value of _priority_)
     * 
     * 
     * (Required)
     */
    public Boolean getIsSuperseded() {
        return isSuperseded;
    }

    /**
     * True if this setting is superseded by a higher priority setting (i.e. lower value of _priority_)
     * 
     * 
     * (Required)
     */
    public void setIsSuperseded(Boolean isSuperseded) {
        this.isSuperseded = isSuperseded;
    }

    /**
     * 
     * (Required)
     */
    public LimitMaxDischarge getLimitMaxDischarge() {
        return limitMaxDischarge;
    }

    /**
     * 
     * (Required)
     */
    public void setLimitMaxDischarge(LimitMaxDischarge limitMaxDischarge) {
        this.limitMaxDischarge = limitMaxDischarge;
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
        if (!(obj instanceof LimitMaxDischargeGet))
            return false;
        LimitMaxDischargeGet that = (LimitMaxDischargeGet) obj;
        return Objects.equals(this.limitMaxDischarge, that.limitMaxDischarge)
                && Objects.equals(this.isDefault, that.isDefault) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.id, that.id) 
                && Objects.equals(this.isSuperseded, that.isSuperseded);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.limitMaxDischarge != null ? this.limitMaxDischarge.hashCode() : 0);
        result = 31 * result + (this.isDefault != null ? this.isDefault.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.isSuperseded != null ? this.isSuperseded.hashCode() : 0);
        return result;
    }
}
