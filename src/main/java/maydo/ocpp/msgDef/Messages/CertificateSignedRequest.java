package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.CertificateSigningUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the CertificateSignedRequest PDU sent by the CSMS to the Charging Station.
 */
public class CertificateSignedRequest implements JsonInterface {

    /**
     * The signed PEM encoded X.509 certificate.
     * This SHALL also contain the necessary sub CA certificates, when applicable.
     * The order of the bundle follows the certificate chain, starting from the leaf certificate.
     * The Configuration Variable MaxCertificateChainSize can be used to limit the maximum size of this field.
     */
    @Required
    private String certificateChain;

    /**
     * Indicates the type of the signed certificate that is returned.
     * When omitted the certificate is used for both the 15118 connection (if implemented)
     * and the Charging Station to CSMS connection.
     * This field is required when a typeOfCertificate was included in the SignCertificateRequest
     * that requested this certificate to be signed
     * AND both the 15118 connection and the Charging Station connection are implemented.
     */
    @Optional
    private CertificateSigningUseEnum certificateType;

    /**
     * (2.1) RequestId to correlate this message with the SignCertificateRequest.
     */
    @Optional
    private Integer requestId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CertificateSignedRequest() {
    }


    public String getCertificateChain() {
        return certificateChain;
    }


    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }


    public CertificateSigningUseEnum getCertificateType() {
        return certificateType;
    }


    public void setCertificateType(CertificateSigningUseEnum certificateType) {
        this.certificateType = certificateType;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
        json.addProperty("certificateChain", certificateChain);
        json.addProperty("certificateType", certificateType.toString());
        json.addProperty("requestId", requestId);
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
        if (jsonObject.has("certificateChain")) {
            this.certificateChain = jsonObject.get("certificateChain").getAsString();
        }

        if (jsonObject.has("certificateType")) {
            this.certificateType = CertificateSigningUseEnum.valueOf(jsonObject.get("certificateType").getAsString());
        }

        if (jsonObject.has("requestId")) {
            this.requestId = jsonObject.get("requestId").getAsInt();
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
        if (!(obj instanceof CertificateSignedRequest))
            return false;
        CertificateSignedRequest that = (CertificateSignedRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateChain, that.certificateChain)
                && Objects.equals(this.requestId, that.requestId)
                && Objects.equals(this.certificateType, that.certificateType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.certificateChain != null ? this.certificateChain.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.certificateType != null ? this.certificateType.hashCode() : 0);
        return result;
    }
}
