package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.DataTypes.OCSPRequestData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the AuthorizeRequest PDU sent by the Charging Station to the CSMS.
 */
public class AuthorizeRequest implements JsonInterface {

    /**
     * This contains the identifier that needs to be authorized.
     */
    @Required
    private IdToken idToken;

    /**
     * (2.1) The X.509 certificate chain presented by EV and encoded in PEM format.
     * Order of certificates in chain is from leaf up to (but excluding) root certificate.
     * Only needed in case of central contract validation when Charging Station cannot validate the contract certificate.
     */
    @Optional
    private String certificate;

    /**
     * Contains the information needed to verify the EV Contract Certificate via OCSP.
     * Not needed if certificate is provided.
     */
    @Optional
    private List<OCSPRequestData> iso15118CertificateHashData;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public AuthorizeRequest() {
    }


    public AuthorizeRequest(IdToken idToken, String certificate, List<OCSPRequestData> iso15118CertificateHashData, CustomData customData) {
        super();
        this.idToken = idToken;
        this.certificate = certificate;
        this.iso15118CertificateHashData = iso15118CertificateHashData;
        this.customData = customData;
    }


    public IdToken getIdToken() {
        return idToken;
    }


    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }


    public String getCertificate() {
        return certificate;
    }


    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public List<OCSPRequestData> getIso15118CertificateHashData() {
        return iso15118CertificateHashData;
    }

    public void setIso15118CertificateHashData(List<OCSPRequestData> iso15118CertificateHashData) {
        this.iso15118CertificateHashData = iso15118CertificateHashData;
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
        json.add("idToken", idToken.toJsonObject());
        json.addProperty("certificate", certificate);
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
        if (jsonObject.has("idToken")) {
            this.idToken = new IdToken();
            this.idToken.fromJsonObject(jsonObject.getAsJsonObject("idToken"));
        }

        if (jsonObject.has("certificate")) {
            this.certificate = jsonObject.get("certificate").getAsString();
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
