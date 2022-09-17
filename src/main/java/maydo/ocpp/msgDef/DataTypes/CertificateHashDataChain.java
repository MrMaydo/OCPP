
package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.GetCertificateIdUseEnum;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CertificateHashDataChain {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * 
     * (Required)
     * 
     */
    private CertificateHashData certificateHashData;
    /**
     * Indicates the type of the requested certificate(s).
     * 
     * (Required)
     * 
     */
    private GetCertificateIdUseEnum certificateType;
    private List<CertificateHashData> childCertificateHashData = null;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public CertificateHashData getCertificateHashData() {
        return certificateHashData;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setCertificateHashData(CertificateHashData certificateHashData) {
        this.certificateHashData = certificateHashData;
    }

    /**
     * Indicates the type of the requested certificate(s).
     * 
     * (Required)
     * 
     */
    public GetCertificateIdUseEnum getCertificateType() {
        return certificateType;
    }

    /**
     * Indicates the type of the requested certificate(s).
     * 
     * (Required)
     * 
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

}
