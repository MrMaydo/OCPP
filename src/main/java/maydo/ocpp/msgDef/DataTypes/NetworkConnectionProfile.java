
package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.OCPPInterfaceEnum;
import maydo.ocpp.msgDef.Enumerations.OCPPTransportEnum;
import maydo.ocpp.msgDef.Enumerations.OCPPVersionEnum;

import javax.annotation.Generated;


/**
 * Communication_ Function
 * urn:x-oca:ocpp:uid:2:233304
 * The NetworkConnectionProfile defines the functional and technical parameters of a communication link.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class NetworkConnectionProfile {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * APN
     * urn:x-oca:ocpp:uid:2:233134
     * Collection of configuration data needed to make a data-connection over a cellular network.
     * 
     * NOTE: When asking a GSM modem to dial in, it is possible to specify which mobile operator should be used. This can be done with the mobile country code (MCC) in combination with a mobile network code (MNC). Example: If your preferred network is Vodafone Netherlands, the MCC=204 and the MNC=04 which means the key PreferredNetwork = 20404 Some modems allows to specify a preferred network, which means, if this network is not available, a different network is used. If you specify UseOnlyPreferredNetwork and this network is not available, the modem will not dial in.
     * 
     * 
     */
    private APN apn;
    /**
     * Communication_ Function. OCPP_ Version. OCPP_ Version_ Code
     * urn:x-oca:ocpp:uid:1:569355
     * Defines the OCPP version used for this communication function.
     * 
     * (Required)
     * 
     */
    private OCPPVersionEnum ocppVersion;
    /**
     * Communication_ Function. OCPP_ Transport. OCPP_ Transport_ Code
     * urn:x-oca:ocpp:uid:1:569356
     * Defines the transport protocol (e.g. SOAP or JSON). Note: SOAP is not supported in OCPP 2.0, but is supported by other versions of OCPP.
     * 
     * (Required)
     * 
     */
    private OCPPTransportEnum ocppTransport;
    /**
     * Communication_ Function. OCPP_ Central_ System_ URL. URI
     * urn:x-oca:ocpp:uid:1:569357
     * URL of the CSMS(s) that this Charging Station  communicates with.
     * 
     * (Required)
     * 
     */
    private String ocppCsmsUrl;
    /**
     * Duration in seconds before a message send by the Charging Station via this network connection times-out.
     * The best setting depends on the underlying network and response times of the CSMS.
     * If you are looking for a some guideline: use 30 seconds as a starting point.
     * 
     * (Required)
     * 
     */
    private Integer messageTimeout;
    /**
     * This field specifies the security profile used when connecting to the CSMS with this NetworkConnectionProfile.
     * 
     * (Required)
     * 
     */
    private Integer securityProfile;
    /**
     * Applicable Network Interface.
     * 
     * (Required)
     * 
     */
    private OCPPInterfaceEnum ocppInterface;
    /**
     * VPN
     * urn:x-oca:ocpp:uid:2:233268
     * VPN Configuration settings
     * 
     * 
     */
    private VPN vpn;

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
     * APN
     * urn:x-oca:ocpp:uid:2:233134
     * Collection of configuration data needed to make a data-connection over a cellular network.
     * 
     * NOTE: When asking a GSM modem to dial in, it is possible to specify which mobile operator should be used. This can be done with the mobile country code (MCC) in combination with a mobile network code (MNC). Example: If your preferred network is Vodafone Netherlands, the MCC=204 and the MNC=04 which means the key PreferredNetwork = 20404 Some modems allows to specify a preferred network, which means, if this network is not available, a different network is used. If you specify UseOnlyPreferredNetwork and this network is not available, the modem will not dial in.
     * 
     * 
     */
    public APN getApn() {
        return apn;
    }

    /**
     * APN
     * urn:x-oca:ocpp:uid:2:233134
     * Collection of configuration data needed to make a data-connection over a cellular network.
     * 
     * NOTE: When asking a GSM modem to dial in, it is possible to specify which mobile operator should be used. This can be done with the mobile country code (MCC) in combination with a mobile network code (MNC). Example: If your preferred network is Vodafone Netherlands, the MCC=204 and the MNC=04 which means the key PreferredNetwork = 20404 Some modems allows to specify a preferred network, which means, if this network is not available, a different network is used. If you specify UseOnlyPreferredNetwork and this network is not available, the modem will not dial in.
     * 
     * 
     */
    public void setApn(APN apn) {
        this.apn = apn;
    }

    /**
     * Communication_ Function. OCPP_ Version. OCPP_ Version_ Code
     * urn:x-oca:ocpp:uid:1:569355
     * Defines the OCPP version used for this communication function.
     * 
     * (Required)
     * 
     */
    public OCPPVersionEnum getOcppVersion() {
        return ocppVersion;
    }

    /**
     * Communication_ Function. OCPP_ Version. OCPP_ Version_ Code
     * urn:x-oca:ocpp:uid:1:569355
     * Defines the OCPP version used for this communication function.
     * 
     * (Required)
     * 
     */
    public void setOcppVersion(OCPPVersionEnum ocppVersion) {
        this.ocppVersion = ocppVersion;
    }

    /**
     * Communication_ Function. OCPP_ Transport. OCPP_ Transport_ Code
     * urn:x-oca:ocpp:uid:1:569356
     * Defines the transport protocol (e.g. SOAP or JSON). Note: SOAP is not supported in OCPP 2.0, but is supported by other versions of OCPP.
     * 
     * (Required)
     * 
     */
    public OCPPTransportEnum getOcppTransport() {
        return ocppTransport;
    }

    /**
     * Communication_ Function. OCPP_ Transport. OCPP_ Transport_ Code
     * urn:x-oca:ocpp:uid:1:569356
     * Defines the transport protocol (e.g. SOAP or JSON). Note: SOAP is not supported in OCPP 2.0, but is supported by other versions of OCPP.
     * 
     * (Required)
     * 
     */
    public void setOcppTransport(OCPPTransportEnum ocppTransport) {
        this.ocppTransport = ocppTransport;
    }

    /**
     * Communication_ Function. OCPP_ Central_ System_ URL. URI
     * urn:x-oca:ocpp:uid:1:569357
     * URL of the CSMS(s) that this Charging Station  communicates with.
     * 
     * (Required)
     * 
     */
    public String getOcppCsmsUrl() {
        return ocppCsmsUrl;
    }

    /**
     * Communication_ Function. OCPP_ Central_ System_ URL. URI
     * urn:x-oca:ocpp:uid:1:569357
     * URL of the CSMS(s) that this Charging Station  communicates with.
     * 
     * (Required)
     * 
     */
    public void setOcppCsmsUrl(String ocppCsmsUrl) {
        this.ocppCsmsUrl = ocppCsmsUrl;
    }

    /**
     * Duration in seconds before a message send by the Charging Station via this network connection times-out.
     * The best setting depends on the underlying network and response times of the CSMS.
     * If you are looking for a some guideline: use 30 seconds as a starting point.
     * 
     * (Required)
     * 
     */
    public Integer getMessageTimeout() {
        return messageTimeout;
    }

    /**
     * Duration in seconds before a message send by the Charging Station via this network connection times-out.
     * The best setting depends on the underlying network and response times of the CSMS.
     * If you are looking for a some guideline: use 30 seconds as a starting point.
     * 
     * (Required)
     * 
     */
    public void setMessageTimeout(Integer messageTimeout) {
        this.messageTimeout = messageTimeout;
    }

    /**
     * This field specifies the security profile used when connecting to the CSMS with this NetworkConnectionProfile.
     * 
     * (Required)
     * 
     */
    public Integer getSecurityProfile() {
        return securityProfile;
    }

    /**
     * This field specifies the security profile used when connecting to the CSMS with this NetworkConnectionProfile.
     * 
     * (Required)
     * 
     */
    public void setSecurityProfile(Integer securityProfile) {
        this.securityProfile = securityProfile;
    }

    /**
     * Applicable Network Interface.
     * 
     * (Required)
     * 
     */
    public OCPPInterfaceEnum getOcppInterface() {
        return ocppInterface;
    }

    /**
     * Applicable Network Interface.
     * 
     * (Required)
     * 
     */
    public void setOcppInterface(OCPPInterfaceEnum ocppInterface) {
        this.ocppInterface = ocppInterface;
    }

    /**
     * VPN
     * urn:x-oca:ocpp:uid:2:233268
     * VPN Configuration settings
     * 
     * 
     */
    public VPN getVpn() {
        return vpn;
    }

    /**
     * VPN
     * urn:x-oca:ocpp:uid:2:233268
     * VPN Configuration settings
     * 
     * 
     */
    public void setVpn(VPN vpn) {
        this.vpn = vpn;
    }

}
