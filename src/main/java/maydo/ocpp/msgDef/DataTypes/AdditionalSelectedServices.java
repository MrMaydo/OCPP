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
     * Human-readable string to identify this service.
     */
    @Required
    private String serviceName;

    /**
     * Part of ISO 15118-20 price schedule.
     */
    @Required
    private RationalNumber serviceFee;

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

        json.addProperty("serviceName", getServiceName());

        json.add("serviceFee", getServiceFee().toJsonObject());

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
        if (jsonObject.has("serviceName")) {
            setServiceName(jsonObject.get("serviceName").getAsString());
        }

        if (jsonObject.has("serviceFee")) {
            setServiceFee(new RationalNumber());
            getServiceFee().fromJsonObject(jsonObject.getAsJsonObject("serviceFee"));
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
        if (!(obj instanceof AdditionalSelectedServices))
            return false;
        AdditionalSelectedServices that = (AdditionalSelectedServices) obj;
        return Objects.equals(this.serviceFee, that.serviceFee)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.serviceName, that.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getServiceName(),
                getServiceFee(),
                getCustomData()
        );
    }
}
