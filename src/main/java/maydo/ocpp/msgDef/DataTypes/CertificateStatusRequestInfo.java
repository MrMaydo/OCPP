package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.CertificateStatusSourceEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class CertificateStatusRequestInfo implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private CertificateHashData certificateHashData;
    /**
     * Source of status: OCSP, CRL
     * 
     * (Required)
     */
    @Required
    private CertificateStatusSourceEnum source;
    /**
     * URL(s) of _source_.
     * 
     * (Required)
     */
    @Required
    private List<String> urls;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public CertificateStatusRequestInfo() {
    }

    /**
     * 
     * @param urls
     *     URL(s) of _source_.
     *     .
     */
    public CertificateStatusRequestInfo(CertificateHashData certificateHashData, CertificateStatusSourceEnum source, List<String> urls, CustomData customData) {
        super();
        this.certificateHashData = certificateHashData;
        this.source = source;
        this.urls = urls;
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
     * Source of status: OCSP, CRL
     * 
     * (Required)
     */
    public CertificateStatusSourceEnum getSource() {
        return source;
    }

    /**
     * Source of status: OCSP, CRL
     * 
     * (Required)
     */
    public void setSource(CertificateStatusSourceEnum source) {
        this.source = source;
    }

    /**
     * URL(s) of _source_.
     * 
     * (Required)
     */
    public List<String> getUrls() {
        return urls;
    }

    /**
     * URL(s) of _source_.
     * 
     * (Required)
     */
    public void setUrls(List<String> urls) {
        this.urls = urls;
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
        if (!(obj instanceof CertificateStatusRequestInfo))
            return false;
        CertificateStatusRequestInfo that = (CertificateStatusRequestInfo) obj;
        return Objects.equals(this.urls, that.urls)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateHashData, that.certificateHashData)
                && Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.urls != null ? this.urls.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.certificateHashData != null ? this.certificateHashData.hashCode() : 0);
        result = 31 * result + (this.source != null ? this.source.hashCode() : 0);
        return result;
    }
}
