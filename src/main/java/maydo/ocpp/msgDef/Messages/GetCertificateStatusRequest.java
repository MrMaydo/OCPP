package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.OCSPRequestData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the GetCertificateStatusRequest PDU sent by the Charging Station to the CSMS.
 */
public class GetCertificateStatusRequest implements JsonInterface {

    /**
     * Indicates the certificate of which the status is requested.
     */
    @Required
    private OCSPRequestData ocspRequestData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetCertificateStatusRequest() {
    }


    public OCSPRequestData getOcspRequestData() {
        return ocspRequestData;
    }


    public void setOcspRequestData(OCSPRequestData ocspRequestData) {
        this.ocspRequestData = ocspRequestData;
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

        json.add("ocspRequestData", getOcspRequestData().toJsonObject());

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
        if (jsonObject.has("ocspRequestData")) {
            setOcspRequestData(new OCSPRequestData());
            getOcspRequestData().fromJsonObject(jsonObject.getAsJsonObject("ocspRequestData"));
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
        if (!(obj instanceof GetCertificateStatusRequest))
            return false;
        GetCertificateStatusRequest that = (GetCertificateStatusRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.ocspRequestData, that.ocspRequestData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getOcspRequestData(),
                getCustomData()
        );
    }
}
