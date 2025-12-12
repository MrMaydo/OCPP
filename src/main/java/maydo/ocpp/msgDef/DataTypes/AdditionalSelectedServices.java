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
public class AdditionalSelectedServices implements JsonInterface {

    /**
     * Part of ISO 15118-20 price schedule.
     */
    @Required
    private RationalNumber serviceFee;

    /**
     * Human readable string to identify this service.
     */
    @Required
    private String serviceName;

    /**
     * Cost of the service.
     */
    @Optional
    private CustomData customData;


    public AdditionalSelectedServices() {
    }


    public RationalNumber getServiceFee() {
        return serviceFee;
    }


    public void setServiceFee(RationalNumber serviceFee) {
        this.serviceFee = serviceFee;
    }


    public String getServiceName() {
        return serviceName;
    }


    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
        json.add("serviceFee", serviceFee.toJsonObject());
        json.addProperty("serviceName", serviceName);
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
        if (jsonObject.has("serviceFee")) {
            this.serviceFee = new RationalNumber();
            this.serviceFee.fromJsonObject(jsonObject.getAsJsonObject("serviceFee"));
        }

        if (jsonObject.has("serviceName")) {
            this.serviceName = jsonObject.get("serviceName").getAsString();
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
