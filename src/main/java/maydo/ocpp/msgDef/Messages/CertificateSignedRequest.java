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

        json.addProperty("certificateChain", getCertificateChain());

        if (getCertificateType() != null) {
            json.addProperty("certificateType", getCertificateType().toString());
        }
        if (getRequestId() != null) {
            json.addProperty("requestId", getRequestId());
        }
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
        if (jsonObject.has("certificateChain")) {
            setCertificateChain(jsonObject.get("certificateChain").getAsString());
        }

        if (jsonObject.has("certificateType")) {
            setCertificateType(CertificateSigningUseEnum.valueOf(jsonObject.get("certificateType").getAsString()));
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
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
        if (!(obj instanceof CertificateSignedRequest))
            return false;
        CertificateSignedRequest that = (CertificateSignedRequest) obj;
        return Objects.equals(getCertificateChain(), that.getCertificateChain())
                && Objects.equals(getCertificateType(), that.getCertificateType())
                && Objects.equals(getRequestId(), that.getRequestId())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getCertificateChain(),
                getCertificateType(),
                getRequestId(),
                getCustomData()
        );
    }
}
