package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.OCPPInterfaceEnum;
import maydo.ocpp.msgDef.Enumerations.OCPPTransportEnum;
import maydo.ocpp.msgDef.Enumerations.OCPPVersionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
 */
public class NetworkConnectionProfile implements JsonInterface {

    /**
     * Collection of configuration data needed to make a data-connection over a cellular network.
     */
    @Optional
    private APN apn;

    /**
     * (2.1) This field is ignored, since the OCPP version to use is determined during the websocket handshake.
     * The field is only kept for backwards compatibility with the OCPP 2.0.1 JSON schema.
     */
    @Optional
    private OCPPVersionEnum ocppVersion;

    /**
     * Applicable Network Interface. Charging Station is allowed to use a different network interface to connect
     * if the given one does not work.
     */
    @Required
    private OCPPInterfaceEnum ocppInterface;

    /**
     * Defines the transport protocol (e.g. SOAP or JSON). Note: SOAP is not supported in OCPP 2.x,
     * but is supported by earlier versions of OCPP.
     */
    @Required
    private OCPPTransportEnum ocppTransport;

    /**
     * Duration in seconds before a message send by the Charging Station via this network connection times- out.
     * The best setting depends on the underlying network and response times of the CSMS.
     * If you are looking for a some guideline: use 30 seconds as a starting point.
     */
    @Required
    private Integer messageTimeout;

    /**
     * URL of the CSMS(s) that this Charging Station communicates with, without the Charging Station identity part.
     * The SecurityCtrlr.Identity field is appended to ocppCsmsUrl to provide the full websocket URL.
     */
    @Required
    private String ocppCsmsUrl;

    /**
     * This field specifies the security profile used when connecting to the CSMS with this NetworkConnectionProfile.
     */
    @Required
    private Integer securityProfile;

    /**
     * (2.1) Charging Station identity to be used as the basic authentication username.
     */
    @Optional
    private String identity;

    /**
     * (2.1) BasicAuthPassword to use for security profile 1 or 2.
     */
    @Optional
    private String basicAuthPassword;

    /**
     * Settings to be used to set up the VPN connection
     */
    @Optional
    private VPN vpn;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NetworkConnectionProfile() {
    }


    public NetworkConnectionProfile(APN apn, OCPPVersionEnum ocppVersion, OCPPInterfaceEnum ocppInterface, OCPPTransportEnum ocppTransport, Integer messageTimeout, String ocppCsmsUrl, Integer securityProfile, String identity, String basicAuthPassword, VPN vpn, CustomData customData) {
        super();
        this.apn = apn;
        this.ocppVersion = ocppVersion;
        this.ocppInterface = ocppInterface;
        this.ocppTransport = ocppTransport;
        this.messageTimeout = messageTimeout;
        this.ocppCsmsUrl = ocppCsmsUrl;
        this.securityProfile = securityProfile;
        this.identity = identity;
        this.basicAuthPassword = basicAuthPassword;
        this.vpn = vpn;
        this.customData = customData;
    }


    public APN getApn() {
        return apn;
    }


    public void setApn(APN apn) {
        this.apn = apn;
    }


    public OCPPVersionEnum getOcppVersion() {
        return ocppVersion;
    }


    public void setOcppVersion(OCPPVersionEnum ocppVersion) {
        this.ocppVersion = ocppVersion;
    }


    public OCPPInterfaceEnum getOcppInterface() {
        return ocppInterface;
    }


    public void setOcppInterface(OCPPInterfaceEnum ocppInterface) {
        this.ocppInterface = ocppInterface;
    }


    public OCPPTransportEnum getOcppTransport() {
        return ocppTransport;
    }


    public void setOcppTransport(OCPPTransportEnum ocppTransport) {
        this.ocppTransport = ocppTransport;
    }


    public Integer getMessageTimeout() {
        return messageTimeout;
    }


    public void setMessageTimeout(Integer messageTimeout) {
        this.messageTimeout = messageTimeout;
    }


    public String getOcppCsmsUrl() {
        return ocppCsmsUrl;
    }


    public void setOcppCsmsUrl(String ocppCsmsUrl) {
        this.ocppCsmsUrl = ocppCsmsUrl;
    }


    public Integer getSecurityProfile() {
        return securityProfile;
    }


    public void setSecurityProfile(Integer securityProfile) {
        this.securityProfile = securityProfile;
    }


    public String getIdentity() {
        return identity;
    }


    public void setIdentity(String identity) {
        this.identity = identity;
    }


    public String getBasicAuthPassword() {
        return basicAuthPassword;
    }


    public void setBasicAuthPassword(String basicAuthPassword) {
        this.basicAuthPassword = basicAuthPassword;
    }


    public VPN getVpn() {
        return vpn;
    }


    public void setVpn(VPN vpn) {
        this.vpn = vpn;
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
        json.add("apn", apn.toJsonObject());
        json.addProperty("ocppVersion", ocppVersion.toString());
        json.addProperty("ocppInterface", ocppInterface.toString());
        json.addProperty("ocppTransport", ocppTransport.toString());
        json.addProperty("messageTimeout", messageTimeout);
        json.addProperty("ocppCsmsUrl", ocppCsmsUrl);
        json.addProperty("securityProfile", securityProfile);
        json.addProperty("identity", identity);
        json.addProperty("basicAuthPassword", basicAuthPassword);
        json.add("vpn", vpn.toJsonObject());
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
        if (jsonObject.has("apn")) {
            this.apn = new APN();
            this.apn.fromJsonObject(jsonObject.getAsJsonObject("apn"));
        }

        if (jsonObject.has("ocppVersion")) {
            this.ocppVersion = OCPPVersionEnum.valueOf(jsonObject.get("ocppVersion").getAsString());
        }

        if (jsonObject.has("ocppInterface")) {
            this.ocppInterface = OCPPInterfaceEnum.valueOf(jsonObject.get("ocppInterface").getAsString());
        }

        if (jsonObject.has("ocppTransport")) {
            this.ocppTransport = OCPPTransportEnum.valueOf(jsonObject.get("ocppTransport").getAsString());
        }

        if (jsonObject.has("messageTimeout")) {
            this.messageTimeout = jsonObject.get("messageTimeout").getAsInt();
        }

        if (jsonObject.has("ocppCsmsUrl")) {
            this.ocppCsmsUrl = jsonObject.get("ocppCsmsUrl").getAsString();
        }

        if (jsonObject.has("securityProfile")) {
            this.securityProfile = jsonObject.get("securityProfile").getAsInt();
        }

        if (jsonObject.has("identity")) {
            this.identity = jsonObject.get("identity").getAsString();
        }

        if (jsonObject.has("basicAuthPassword")) {
            this.basicAuthPassword = jsonObject.get("basicAuthPassword").getAsString();
        }

        if (jsonObject.has("vpn")) {
            this.vpn = new VPN();
            this.vpn.fromJsonObject(jsonObject.getAsJsonObject("vpn"));
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
        if (!(obj instanceof NetworkConnectionProfile))
            return false;
        NetworkConnectionProfile that = (NetworkConnectionProfile) obj;
        return Objects.equals(this.ocppTransport, that.ocppTransport)
                && Objects.equals(this.securityProfile, that.securityProfile)
                && Objects.equals(this.vpn, that.vpn)
                && Objects.equals(this.ocppVersion, that.ocppVersion)
                && Objects.equals(this.identity, that.identity)
                && Objects.equals(this.basicAuthPassword, that.basicAuthPassword)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.ocppCsmsUrl, that.ocppCsmsUrl)
                && Objects.equals(this.apn, that.apn)
                && Objects.equals(this.ocppInterface, that.ocppInterface)
                && Objects.equals(this.messageTimeout, that.messageTimeout);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.ocppTransport != null ? this.ocppTransport.hashCode() : 0);
        result = 31 * result + (this.securityProfile != null ? this.securityProfile.hashCode() : 0);
        result = 31 * result + (this.vpn != null ? this.vpn.hashCode() : 0);
        result = 31 * result + (this.ocppVersion != null ? this.ocppVersion.hashCode() : 0);
        result = 31 * result + (this.identity != null ? this.identity.hashCode() : 0);
        result = 31 * result + (this.basicAuthPassword != null ? this.basicAuthPassword.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.ocppCsmsUrl != null ? this.ocppCsmsUrl.hashCode() : 0);
        result = 31 * result + (this.apn != null ? this.apn.hashCode() : 0);
        result = 31 * result + (this.ocppInterface != null ? this.ocppInterface.hashCode() : 0);
        result = 31 * result + (this.messageTimeout != null ? this.messageTimeout.hashCode() : 0);
        return result;
    }
}
