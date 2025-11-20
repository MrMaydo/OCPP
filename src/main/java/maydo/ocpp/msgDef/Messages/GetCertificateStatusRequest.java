package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.OCSPRequestData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetCertificateStatusRequest implements JsonInterface {

    /**
     * Information about a certificate for an OCSP check.
     * <p>
     * (Required)
     */
    @Required
    private OCSPRequestData ocspRequestData;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetCertificateStatusRequest() {
    }

    public GetCertificateStatusRequest(OCSPRequestData ocspRequestData, CustomData customData) {
        super();
        this.ocspRequestData = ocspRequestData;
        this.customData = customData;
    }

    /**
     * Information about a certificate for an OCSP check.
     * <p>
     * (Required)
     */
    public OCSPRequestData getOcspRequestData() {
        return ocspRequestData;
    }

    /**
     * Information about a certificate for an OCSP check.
     * <p>
     * (Required)
     */
    public void setOcspRequestData(OCSPRequestData ocspRequestData) {
        this.ocspRequestData = ocspRequestData;
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
        JsonObject json = new JsonObject();
        json.add("ocspRequestData", ocspRequestData.toJsonObject());
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
        if (jsonObject.has("ocspRequestData")) {
            this.ocspRequestData = new OCSPRequestData();
            this.ocspRequestData.fromJsonObject(jsonObject.getAsJsonObject("ocspRequestData"));
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
        if (!(obj instanceof GetCertificateStatusRequest))
            return false;
        GetCertificateStatusRequest that = (GetCertificateStatusRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.ocspRequestData, that.ocspRequestData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.ocspRequestData != null ? this.ocspRequestData.hashCode() : 0);
        return result;
    }
}
