package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.GetCertificateIdUseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class CertificateHashDataChain implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private CertificateHashData certificateHashData;
    /**
     * Indicates the type of the requested certificate(s).
     * 
     * (Required)
     */
    @Required
    private GetCertificateIdUseEnum certificateType;
    @Optional
    private List<CertificateHashData> childCertificateHashData;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public CertificateHashDataChain() {
    }

    public CertificateHashDataChain(CertificateHashData certificateHashData, GetCertificateIdUseEnum certificateType, List<CertificateHashData> childCertificateHashData, CustomData customData) {
        super();
        this.certificateHashData = certificateHashData;
        this.certificateType = certificateType;
        this.childCertificateHashData = childCertificateHashData;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public CertificateHashData getCertificateHashData() {
        return certificateHashData;
    }

    /**
     * 
     * (Required)
     */
    public void setCertificateHashData(CertificateHashData certificateHashData) {
        this.certificateHashData = certificateHashData;
    }

    /**
     * Indicates the type of the requested certificate(s).
     * 
     * (Required)
     */
    public GetCertificateIdUseEnum getCertificateType() {
        return certificateType;
    }

    /**
     * Indicates the type of the requested certificate(s).
     * 
     * (Required)
     */
    public void setCertificateType(GetCertificateIdUseEnum certificateType) {
        this.certificateType = certificateType;
    }

    public List<CertificateHashData> getChildCertificateHashData() {
        return childCertificateHashData;
    }

    public void setChildCertificateHashData(List<CertificateHashData> childCertificateHashData) {
        this.childCertificateHashData = childCertificateHashData;
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
