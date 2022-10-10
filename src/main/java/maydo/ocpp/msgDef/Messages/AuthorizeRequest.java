package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.DataTypes.OCSPRequestData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;

public class AuthorizeRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * <p>
     * (Required)
     */
    @Required
    private IdToken idToken;
    /**
     * The X.509 certificated presented by EV and encoded in PEM format.
     */
    @Optional
    private String certificate;

    @Optional
    private List<OCSPRequestData> iso15118CertificateHashData = null;

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

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * <p>
     * (Required)
     */
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * <p>
     * (Required)
     */
    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }

    /**
     * The X.509 certificated presented by EV and encoded in PEM format.
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * The X.509 certificated presented by EV and encoded in PEM format.
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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
