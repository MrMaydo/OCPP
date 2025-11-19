package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class Gradient {

    /**
     * Id of setting
     * 
     * 
     * 
     * (Required)
     */
    @Required
    private Integer priority;
    /**
     * Default ramp rate in seconds (0 if not applicable)
     * 
     * 
     * 
     * (Required)
     */
    @Required
    private Float gradient;
    /**
     * Soft-start ramp rate in seconds (0 if not applicable)
     * 
     * 
     * 
     * (Required)
     */
    @Required
    private Float softGradient;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public Gradient() {
    }

    /**
     * 
     * @param softGradient
     *     Soft-start ramp rate in seconds (0 if not applicable)
     *     
     *     
     *     .
     * @param gradient
     *     Default ramp rate in seconds (0 if not applicable)
     *     
     *     
     *     .
     * @param priority
     *     Id of setting
     *     
     *     
     *     .
     */
    public Gradient(Integer priority, Float gradient, Float softGradient, CustomData customData) {
        super();
        this.priority = priority;
        this.gradient = gradient;
        this.softGradient = softGradient;
        this.customData = customData;
    }

    /**
     * Id of setting
     * 
     * 
     * 
     * (Required)
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Id of setting
     * 
     * 
     * 
     * (Required)
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Default ramp rate in seconds (0 if not applicable)
     * 
     * 
     * 
     * (Required)
     */
    public Float getGradient() {
        return gradient;
    }

    /**
     * Default ramp rate in seconds (0 if not applicable)
     * 
     * 
     * 
     * (Required)
     */
    public void setGradient(Float gradient) {
        this.gradient = gradient;
    }

    /**
     * Soft-start ramp rate in seconds (0 if not applicable)
     * 
     * 
     * 
     * (Required)
     */
    public Float getSoftGradient() {
        return softGradient;
    }

    /**
     * Soft-start ramp rate in seconds (0 if not applicable)
     * 
     * 
     * 
     * (Required)
     */
    public void setSoftGradient(Float softGradient) {
        this.softGradient = softGradient;
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
