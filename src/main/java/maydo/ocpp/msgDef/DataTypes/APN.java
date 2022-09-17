
package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.APNAuthenticationEnum;

import javax.annotation.Generated;


/**
 * APN
 * urn:x-oca:ocpp:uid:2:233134
 * Collection of configuration data needed to make a data-connection over a cellular network.
 * 
 * NOTE: When asking a GSM modem to dial in, it is possible to specify which mobile operator should be used. This can be done with the mobile country code (MCC) in combination with a mobile network code (MNC). Example: If your preferred network is Vodafone Netherlands, the MCC=204 and the MNC=04 which means the key PreferredNetwork = 20404 Some modems allows to specify a preferred network, which means, if this network is not available, a different network is used. If you specify UseOnlyPreferredNetwork and this network is not available, the modem will not dial in.
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class APN {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * APN. APN. URI
     * urn:x-oca:ocpp:uid:1:568814
     * The Access Point Name as an URL.
     * 
     * (Required)
     * 
     */
    private String apn;
    /**
     * APN. APN. User_ Name
     * urn:x-oca:ocpp:uid:1:568818
     * APN username.
     * 
     * 
     */
    private String apnUserName;
    /**
     * APN. APN. Password
     * urn:x-oca:ocpp:uid:1:568819
     * APN Password.
     * 
     * 
     */
    private String apnPassword;
    /**
     * APN. SIMPIN. PIN_ Code
     * urn:x-oca:ocpp:uid:1:568821
     * SIM card pin code.
     * 
     * 
     */
    private Integer simPin;
    /**
     * APN. Preferred_ Network. Mobile_ Network_ ID
     * urn:x-oca:ocpp:uid:1:568822
     * Preferred network, written as MCC and MNC concatenated. See note.
     * 
     * 
     */
    private String preferredNetwork;
    /**
     * APN. Use_ Only_ Preferred_ Network. Indicator
     * urn:x-oca:ocpp:uid:1:568824
     * Default: false. Use only the preferred Network, do
     * not dial in when not available. See Note.
     * 
     * 
     */
    private Boolean useOnlyPreferredNetwork = false;
    /**
     * APN. APN_ Authentication. APN_ Authentication_ Code
     * urn:x-oca:ocpp:uid:1:568828
     * Authentication method.
     * 
     * (Required)
     * 
     */
    private APNAuthenticationEnum apnAuthentication;

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
     * APN. APN. URI
     * urn:x-oca:ocpp:uid:1:568814
     * The Access Point Name as an URL.
     * 
     * (Required)
     * 
     */
    public String getApn() {
        return apn;
    }

    /**
     * APN. APN. URI
     * urn:x-oca:ocpp:uid:1:568814
     * The Access Point Name as an URL.
     * 
     * (Required)
     * 
     */
    public void setApn(String apn) {
        this.apn = apn;
    }

    /**
     * APN. APN. User_ Name
     * urn:x-oca:ocpp:uid:1:568818
     * APN username.
     * 
     * 
     */
    public String getApnUserName() {
        return apnUserName;
    }

    /**
     * APN. APN. User_ Name
     * urn:x-oca:ocpp:uid:1:568818
     * APN username.
     * 
     * 
     */
    public void setApnUserName(String apnUserName) {
        this.apnUserName = apnUserName;
    }

    /**
     * APN. APN. Password
     * urn:x-oca:ocpp:uid:1:568819
     * APN Password.
     * 
     * 
     */
    public String getApnPassword() {
        return apnPassword;
    }

    /**
     * APN. APN. Password
     * urn:x-oca:ocpp:uid:1:568819
     * APN Password.
     * 
     * 
     */
    public void setApnPassword(String apnPassword) {
        this.apnPassword = apnPassword;
    }

    /**
     * APN. SIMPIN. PIN_ Code
     * urn:x-oca:ocpp:uid:1:568821
     * SIM card pin code.
     * 
     * 
     */
    public Integer getSimPin() {
        return simPin;
    }

    /**
     * APN. SIMPIN. PIN_ Code
     * urn:x-oca:ocpp:uid:1:568821
     * SIM card pin code.
     * 
     * 
     */
    public void setSimPin(Integer simPin) {
        this.simPin = simPin;
    }

    /**
     * APN. Preferred_ Network. Mobile_ Network_ ID
     * urn:x-oca:ocpp:uid:1:568822
     * Preferred network, written as MCC and MNC concatenated. See note.
     * 
     * 
     */
    public String getPreferredNetwork() {
        return preferredNetwork;
    }

    /**
     * APN. Preferred_ Network. Mobile_ Network_ ID
     * urn:x-oca:ocpp:uid:1:568822
     * Preferred network, written as MCC and MNC concatenated. See note.
     * 
     * 
     */
    public void setPreferredNetwork(String preferredNetwork) {
        this.preferredNetwork = preferredNetwork;
    }

    /**
     * APN. Use_ Only_ Preferred_ Network. Indicator
     * urn:x-oca:ocpp:uid:1:568824
     * Default: false. Use only the preferred Network, do
     * not dial in when not available. See Note.
     * 
     * 
     */
    public Boolean getUseOnlyPreferredNetwork() {
        return useOnlyPreferredNetwork;
    }

    /**
     * APN. Use_ Only_ Preferred_ Network. Indicator
     * urn:x-oca:ocpp:uid:1:568824
     * Default: false. Use only the preferred Network, do
     * not dial in when not available. See Note.
     * 
     * 
     */
    public void setUseOnlyPreferredNetwork(Boolean useOnlyPreferredNetwork) {
        this.useOnlyPreferredNetwork = useOnlyPreferredNetwork;
    }

    /**
     * APN. APN_ Authentication. APN_ Authentication_ Code
     * urn:x-oca:ocpp:uid:1:568828
     * Authentication method.
     * 
     * (Required)
     * 
     */
    public APNAuthenticationEnum getApnAuthentication() {
        return apnAuthentication;
    }

    /**
     * APN. APN_ Authentication. APN_ Authentication_ Code
     * urn:x-oca:ocpp:uid:1:568828
     * Authentication method.
     * 
     * (Required)
     * 
     */
    public void setApnAuthentication(APNAuthenticationEnum apnAuthentication) {
        this.apnAuthentication = apnAuthentication;
    }

}
