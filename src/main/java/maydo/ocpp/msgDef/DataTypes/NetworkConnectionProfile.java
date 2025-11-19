package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.OCPPInterfaceEnum;
import maydo.ocpp.msgDef.Enumerations.OCPPTransportEnum;
import maydo.ocpp.msgDef.Enumerations.OCPPVersionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class NetworkConnectionProfile implements JsonInterface {

    /**
     * Collection of configuration data needed to make a data-connection over a cellular network.
     * <p>
     * NOTE: When asking a GSM modem to dial in, it is possible to specify which mobile operator should be used. This can be done with the mobile country code (MCC) in combination with a mobile network code (MNC). Example: If your preferred network is Vodafone Netherlands, the MCC=204 and the MNC=04 which means the key PreferredNetwork = 20404 Some modems allows to specify a preferred network, which means, if this network is not available, a different network is used. If you specify UseOnlyPreferredNetwork and this network is not available, the modem will not dial in.
     */
    @Optional
    private APN apn;
    /**
     * *(2.1)* This field is ignored, since the OCPP version to use is determined during the websocket handshake. The field is only kept for backwards compatibility with the OCPP 2.0.1 JSON schema.
     */
    @Optional
    private OCPPVersionEnum ocppVersion;
    /**
     * Applicable Network Interface. Charging Station is allowed to use a different network interface to connect if the given one does not work.
     * <p>
     * (Required)
     */
    @Required
    private OCPPInterfaceEnum ocppInterface;
    /**
     * Defines the transport protocol (e.g. SOAP or JSON). Note: SOAP is not supported in OCPP 2.x, but is supported by earlier versions of OCPP.
     * <p>
     * (Required)
     */
    @Required
    private OCPPTransportEnum ocppTransport;
    /**
     * Duration in seconds before a message send by the Charging Station via this network connection times-out.
     * The best setting depends on the underlying network and response times of the CSMS.
     * If you are looking for a some guideline: use 30 seconds as a starting point.
     * <p>
     * (Required)
     */
    @Required
    private Integer messageTimeout;
    /**
     * URL of the CSMS(s) that this Charging Station communicates with, without the Charging Station identity part. +
     * The SecurityCtrlr.Identity field is appended to _ocppCsmsUrl_ to provide the full websocket URL.
     * <p>
     * (Required)
     */
    @Required
    private String ocppCsmsUrl;
    /**
     * This field specifies the security profile used when connecting to the CSMS with this NetworkConnectionProfile.
     * <p>
     * (Required)
     */
    @Required
    private Integer securityProfile;
    /**
     * *(2.1)* Charging Station identity to be used as the basic authentication username.
     */
    @Optional
    private String identity;
    /**
     * *(2.1)* BasicAuthPassword to use for security profile 1 or 2.
     */
    @Optional
    private String basicAuthPassword;
    /**
     * VPN Configuration settings
     */
    @Optional
    private VPN vpn;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NetworkConnectionProfile() {
    }

    /**
     * @param securityProfile   This field specifies the security profile used when connecting to the CSMS with this NetworkConnectionProfile.
     *                          .
     * @param identity          *(2.1)* Charging Station identity to be used as the basic authentication username.
     *                          .
     * @param basicAuthPassword *(2.1)* BasicAuthPassword to use for security profile 1 or 2.
     *                          .
     * @param ocppCsmsUrl       URL of the CSMS(s) that this Charging Station communicates with, without the Charging Station identity part. +
     *                          The SecurityCtrlr.Identity field is appended to _ocppCsmsUrl_ to provide the full websocket URL.
     *                          .
     * @param messageTimeout    Duration in seconds before a message send by the Charging Station via this network connection times-out.
     *                          The best setting depends on the underlying network and response times of the CSMS.
     *                          If you are looking for a some guideline: use 30 seconds as a starting point.
     *                          .
     */
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

    /**
     * Collection of configuration data needed to make a data-connection over a cellular network.
     * <p>
     * NOTE: When asking a GSM modem to dial in, it is possible to specify which mobile operator should be used. This can be done with the mobile country code (MCC) in combination with a mobile network code (MNC). Example: If your preferred network is Vodafone Netherlands, the MCC=204 and the MNC=04 which means the key PreferredNetwork = 20404 Some modems allows to specify a preferred network, which means, if this network is not available, a different network is used. If you specify UseOnlyPreferredNetwork and this network is not available, the modem will not dial in.
     */
    public APN getApn() {
        return apn;
    }

    /**
     * Collection of configuration data needed to make a data-connection over a cellular network.
     * <p>
     * NOTE: When asking a GSM modem to dial in, it is possible to specify which mobile operator should be used. This can be done with the mobile country code (MCC) in combination with a mobile network code (MNC). Example: If your preferred network is Vodafone Netherlands, the MCC=204 and the MNC=04 which means the key PreferredNetwork = 20404 Some modems allows to specify a preferred network, which means, if this network is not available, a different network is used. If you specify UseOnlyPreferredNetwork and this network is not available, the modem will not dial in.
     */
    public void setApn(APN apn) {
        this.apn = apn;
    }

    /**
     * *(2.1)* This field is ignored, since the OCPP version to use is determined during the websocket handshake. The field is only kept for backwards compatibility with the OCPP 2.0.1 JSON schema.
     */
    public OCPPVersionEnum getOcppVersion() {
        return ocppVersion;
    }

    /**
     * *(2.1)* This field is ignored, since the OCPP version to use is determined during the websocket handshake. The field is only kept for backwards compatibility with the OCPP 2.0.1 JSON schema.
     */
    public void setOcppVersion(OCPPVersionEnum ocppVersion) {
        this.ocppVersion = ocppVersion;
    }

    /**
     * Applicable Network Interface. Charging Station is allowed to use a different network interface to connect if the given one does not work.
     * <p>
     * (Required)
     */
    public OCPPInterfaceEnum getOcppInterface() {
        return ocppInterface;
    }

    /**
     * Applicable Network Interface. Charging Station is allowed to use a different network interface to connect if the given one does not work.
     * <p>
     * (Required)
     */
    public void setOcppInterface(OCPPInterfaceEnum ocppInterface) {
        this.ocppInterface = ocppInterface;
    }

    /**
     * Defines the transport protocol (e.g. SOAP or JSON). Note: SOAP is not supported in OCPP 2.x, but is supported by earlier versions of OCPP.
     * <p>
     * (Required)
     */
    public OCPPTransportEnum getOcppTransport() {
        return ocppTransport;
    }

    /**
     * Defines the transport protocol (e.g. SOAP or JSON). Note: SOAP is not supported in OCPP 2.x, but is supported by earlier versions of OCPP.
     * <p>
     * (Required)
     */
    public void setOcppTransport(OCPPTransportEnum ocppTransport) {
        this.ocppTransport = ocppTransport;
    }

    /**
     * Duration in seconds before a message send by the Charging Station via this network connection times-out.
     * The best setting depends on the underlying network and response times of the CSMS.
     * If you are looking for a some guideline: use 30 seconds as a starting point.
     * <p>
     * (Required)
     */
    public Integer getMessageTimeout() {
        return messageTimeout;
    }

    /**
     * Duration in seconds before a message send by the Charging Station via this network connection times-out.
     * The best setting depends on the underlying network and response times of the CSMS.
     * If you are looking for a some guideline: use 30 seconds as a starting point.
     * <p>
     * (Required)
     */
    public void setMessageTimeout(Integer messageTimeout) {
        this.messageTimeout = messageTimeout;
    }

    /**
     * URL of the CSMS(s) that this Charging Station communicates with, without the Charging Station identity part. +
     * The SecurityCtrlr.Identity field is appended to _ocppCsmsUrl_ to provide the full websocket URL.
     * <p>
     * (Required)
     */
    public String getOcppCsmsUrl() {
        return ocppCsmsUrl;
    }

    /**
     * URL of the CSMS(s) that this Charging Station communicates with, without the Charging Station identity part. +
     * The SecurityCtrlr.Identity field is appended to _ocppCsmsUrl_ to provide the full websocket URL.
     * <p>
     * (Required)
     */
    public void setOcppCsmsUrl(String ocppCsmsUrl) {
        this.ocppCsmsUrl = ocppCsmsUrl;
    }

    /**
     * This field specifies the security profile used when connecting to the CSMS with this NetworkConnectionProfile.
     * <p>
     * (Required)
     */
    public Integer getSecurityProfile() {
        return securityProfile;
    }

    /**
     * This field specifies the security profile used when connecting to the CSMS with this NetworkConnectionProfile.
     * <p>
     * (Required)
     */
    public void setSecurityProfile(Integer securityProfile) {
        this.securityProfile = securityProfile;
    }

    /**
     * *(2.1)* Charging Station identity to be used as the basic authentication username.
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * *(2.1)* Charging Station identity to be used as the basic authentication username.
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * *(2.1)* BasicAuthPassword to use for security profile 1 or 2.
     */
    public String getBasicAuthPassword() {
        return basicAuthPassword;
    }

    /**
     * *(2.1)* BasicAuthPassword to use for security profile 1 or 2.
     */
    public void setBasicAuthPassword(String basicAuthPassword) {
        this.basicAuthPassword = basicAuthPassword;
    }

    /**
     * VPN Configuration settings
     */
    public VPN getVpn() {
        return vpn;
    }

    /**
     * VPN Configuration settings
     */
    public void setVpn(VPN vpn) {
        this.vpn = vpn;
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
