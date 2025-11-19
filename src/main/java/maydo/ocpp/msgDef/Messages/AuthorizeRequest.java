package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.DataTypes.OCSPRequestData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class AuthorizeRequest implements JsonInterface {

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     */
    @Required
    private IdToken idToken;
    /**
     * *(2.1)* The X.509 certificate chain presented by EV and encoded in PEM format. Order of certificates in chain is from leaf up to (but excluding) root certificate. +
     * Only needed in case of central contract validation when Charging Station cannot validate the contract certificate.
     * 
     */
    @Optional
    private String certificate;
    @Optional
    private List<OCSPRequestData> iso15118CertificateHashData;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public AuthorizeRequest() {
    }

    /**
     * 
     * @param certificate
     *     *(2.1)* The X.509 certificate chain presented by EV and encoded in PEM format. Order of certificates in chain is from leaf up to (but excluding) root certificate. +
     *     Only needed in case of central contract validation when Charging Station cannot validate the contract certificate.
     *     
     *     .
     */
    public AuthorizeRequest(IdToken idToken, String certificate, List<OCSPRequestData> iso15118CertificateHashData, CustomData customData) {
        super();
        this.idToken = idToken;
        this.certificate = certificate;
        this.iso15118CertificateHashData = iso15118CertificateHashData;
        this.customData = customData;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     */
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     */
    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }

    /**
     * *(2.1)* The X.509 certificate chain presented by EV and encoded in PEM format. Order of certificates in chain is from leaf up to (but excluding) root certificate. +
     * Only needed in case of central contract validation when Charging Station cannot validate the contract certificate.
     * 
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * *(2.1)* The X.509 certificate chain presented by EV and encoded in PEM format. Order of certificates in chain is from leaf up to (but excluding) root certificate. +
     * Only needed in case of central contract validation when Charging Station cannot validate the contract certificate.
     * 
     */
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public List<OCSPRequestData> getIso15118CertificateHashData() {
        return iso15118CertificateHashData;
    }

    public void setIso15118CertificateHashData(List<OCSPRequestData> iso15118CertificateHashData) {
        this.iso15118CertificateHashData = iso15118CertificateHashData;
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
        if (!(obj instanceof AuthorizeRequest))
            return false;
        AuthorizeRequest that = (AuthorizeRequest) obj;
        return Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.certificate, that.certificate) 
                && Objects.equals(this.iso15118CertificateHashData, that.iso15118CertificateHashData) 
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.certificate != null ? this.certificate.hashCode() : 0);
        result = 31 * result + (this.iso15118CertificateHashData != null ? this.iso15118CertificateHashData.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
