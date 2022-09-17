
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.GetCertificateIdUseEnum;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class GetInstalledCertificateIdsRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Indicates the type of certificates requested. When omitted, all certificate types are requested.
     * 
     * 
     */
    private List<GetCertificateIdUseEnum> certificateType = null;

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
     * Indicates the type of certificates requested. When omitted, all certificate types are requested.
     * 
     * 
     */
    public List<GetCertificateIdUseEnum> getCertificateType() {
        return certificateType;
    }

    /**
     * Indicates the type of certificates requested. When omitted, all certificate types are requested.
     * 
     * 
     */
    public void setCertificateType(List<GetCertificateIdUseEnum> certificateType) {
        this.certificateType = certificateType;
    }

}
