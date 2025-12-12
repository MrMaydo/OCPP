package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.GetCertificateIdUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 *
 */
public class CertificateHashDataChain implements JsonInterface {

    /**
     * Information to identify a certificate.
     */
    @Required
    private CertificateHashData certificateHashData;

    /**
     * Indicates the type of the requested certificate(s)
     */
    @Required
    private GetCertificateIdUseEnum certificateType;

    /**
     * Information to identify the child certificate(s).
     */
    @Optional
    private List<CertificateHashData> childCertificateHashData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CertificateHashDataChain() {
    }


    public CertificateHashData getCertificateHashData() {
        return certificateHashData;
    }


    public void setCertificateHashData(CertificateHashData certificateHashData) {
        this.certificateHashData = certificateHashData;
    }


    public GetCertificateIdUseEnum getCertificateType() {
        return certificateType;
    }


    public void setCertificateType(GetCertificateIdUseEnum certificateType) {
        this.certificateType = certificateType;
    }

    public List<CertificateHashData> getChildCertificateHashData() {
        return childCertificateHashData;
    }

    public void setChildCertificateHashData(List<CertificateHashData> childCertificateHashData) {
        this.childCertificateHashData = childCertificateHashData;
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
        json.add("certificateHashData", certificateHashData.toJsonObject());
        json.addProperty("certificateType", certificateType.toString());
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
        if (jsonObject.has("certificateHashData")) {
            this.certificateHashData = new CertificateHashData();
            this.certificateHashData.fromJsonObject(jsonObject.getAsJsonObject("certificateHashData"));
        }

        if (jsonObject.has("certificateType")) {
            this.certificateType = GetCertificateIdUseEnum.valueOf(jsonObject.get("certificateType").getAsString());
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
        if (!(obj instanceof CertificateHashDataChain))
            return false;
        CertificateHashDataChain that = (CertificateHashDataChain) obj;
        return Objects.equals(this.childCertificateHashData, that.childCertificateHashData)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateHashData, that.certificateHashData)
                && Objects.equals(this.certificateType, that.certificateType);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.childCertificateHashData != null ? this.childCertificateHashData.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.certificateHashData != null ? this.certificateHashData.hashCode() : 0);
        result = 31 * result + (this.certificateType != null ? this.certificateType.hashCode() : 0);
        return result;
    }
}
