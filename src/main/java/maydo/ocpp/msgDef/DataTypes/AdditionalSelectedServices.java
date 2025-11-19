package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Part of ISO 15118-20 price schedule.
 */
public class AdditionalSelectedServices implements JsonInterface {

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private RationalNumber serviceFee;
    /**
     * Human readable string to identify this service.
     * <p>
     * (Required)
     */
    @Required
    private String serviceName;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public AdditionalSelectedServices() {
    }

    /**
     * @param serviceName Human readable string to identify this service.
     *                    .
     */
    public AdditionalSelectedServices(RationalNumber serviceFee, String serviceName, CustomData customData) {
        super();
        this.serviceFee = serviceFee;
        this.serviceName = serviceName;
        this.customData = customData;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    public RationalNumber getServiceFee() {
        return serviceFee;
    }

    /**
     * Part of ISO 15118-20 price schedule.
     * <p>
     * <p>
     * (Required)
     */
    public void setServiceFee(RationalNumber serviceFee) {
        this.serviceFee = serviceFee;
    }

    /**
     * Human readable string to identify this service.
     * <p>
     * (Required)
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Human readable string to identify this service.
     * <p>
     * (Required)
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
        if (!(obj instanceof AdditionalSelectedServices))
            return false;
        AdditionalSelectedServices that = (AdditionalSelectedServices) obj;
        return Objects.equals(this.serviceFee, that.serviceFee)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.serviceName, that.serviceName);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.serviceFee != null ? this.serviceFee.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.serviceName != null ? this.serviceName.hashCode() : 0);
        return result;
    }
}
