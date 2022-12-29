package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.APNAuthenticationEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;


/**
 * APN
 * urn:x-oca:ocpp:uid:2:233134
 * Collection of configuration data needed to make a data-connection over a cellular network.
 * <p>
 * NOTE: When asking a GSM modem to dial in, it is possible to specify which mobile operator should be used. This can be done with the mobile country code (MCC) in combination with a mobile network code (MNC). Example: If your preferred network is Vodafone Netherlands, the MCC=204 and the MNC=04 which means the key PreferredNetwork = 20404 Some modems allows to specify a preferred network, which means, if this network is not available, a different network is used. If you specify UseOnlyPreferredNetwork and this network is not available, the modem will not dial in.
 */
public class APN implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * APN. APN. URI
     * urn:x-oca:ocpp:uid:1:568814
     * The Access Point Name as an URL.
     * <p>
     * (Required)
     */
    @Required
    private String apn;
    /**
     * APN. APN. User_ Name
     * urn:x-oca:ocpp:uid:1:568818
     * APN username.
     */
    @Optional
    private String apnUserName;
    /**
     * APN. APN. Password
     * urn:x-oca:ocpp:uid:1:568819
     * APN Password.
     */
    @Optional
    private String apnPassword;
    /**
     * APN. SIMPIN. PIN_ Code
     * urn:x-oca:ocpp:uid:1:568821
     * SIM card pin code.
     */
    @Optional
    private Integer simPin;
    /**
     * APN. Preferred_ Network. Mobile_ Network_ ID
     * urn:x-oca:ocpp:uid:1:568822
     * Preferred network, written as MCC and MNC concatenated. See note.
     */
    @Optional
    private String preferredNetwork;
    /**
     * APN. Use_ Only_ Preferred_ Network. Indicator
     * urn:x-oca:ocpp:uid:1:568824
     * Default: false. Use only the preferred Network, do
     * not dial in when not available. See Note.
     */
    @Optional
    private Boolean useOnlyPreferredNetwork = false;
    /**
     * APN. APN_ Authentication. APN_ Authentication_ Code
     * urn:x-oca:ocpp:uid:1:568828
     * Authentication method.
     * <p>
     * (Required)
     */
    @Required
    private APNAuthenticationEnum apnAuthentication;

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
     * APN. APN. URI
     * urn:x-oca:ocpp:uid:1:568814
     * The Access Point Name as an URL.
     * <p>
     * (Required)
     */
    public String getApn() {
        return apn;
    }

    /**
     * APN. APN. URI
     * urn:x-oca:ocpp:uid:1:568814
     * The Access Point Name as an URL.
     * <p>
     * (Required)
     */
    public void setApn(String apn) {
        this.apn = apn;
    }

    /**
     * APN. APN. User_ Name
     * urn:x-oca:ocpp:uid:1:568818
     * APN username.
     */
    public String getApnUserName() {
        return apnUserName;
    }

    /**
     * APN. APN. User_ Name
     * urn:x-oca:ocpp:uid:1:568818
     * APN username.
     */
    public void setApnUserName(String apnUserName) {
        this.apnUserName = apnUserName;
    }

    /**
     * APN. APN. Password
     * urn:x-oca:ocpp:uid:1:568819
     * APN Password.
     */
    public String getApnPassword() {
        return apnPassword;
    }

    /**
     * APN. APN. Password
     * urn:x-oca:ocpp:uid:1:568819
     * APN Password.
     */
    public void setApnPassword(String apnPassword) {
        this.apnPassword = apnPassword;
    }

    /**
     * APN. SIMPIN. PIN_ Code
     * urn:x-oca:ocpp:uid:1:568821
     * SIM card pin code.
     */
    public Integer getSimPin() {
        return simPin;
    }

    /**
     * APN. SIMPIN. PIN_ Code
     * urn:x-oca:ocpp:uid:1:568821
     * SIM card pin code.
     */
    public void setSimPin(Integer simPin) {
        this.simPin = simPin;
    }

    /**
     * APN. Preferred_ Network. Mobile_ Network_ ID
     * urn:x-oca:ocpp:uid:1:568822
     * Preferred network, written as MCC and MNC concatenated. See note.
     */
    public String getPreferredNetwork() {
        return preferredNetwork;
    }

    /**
     * APN. Preferred_ Network. Mobile_ Network_ ID
     * urn:x-oca:ocpp:uid:1:568822
     * Preferred network, written as MCC and MNC concatenated. See note.
     */
    public void setPreferredNetwork(String preferredNetwork) {
        this.preferredNetwork = preferredNetwork;
    }

    /**
     * APN. Use_ Only_ Preferred_ Network. Indicator
     * urn:x-oca:ocpp:uid:1:568824
     * Default: false. Use only the preferred Network, do
     * not dial in when not available. See Note.
     */
    public Boolean getUseOnlyPreferredNetwork() {
        return useOnlyPreferredNetwork;
    }

    /**
     * APN. Use_ Only_ Preferred_ Network. Indicator
     * urn:x-oca:ocpp:uid:1:568824
     * Default: false. Use only the preferred Network, do
     * not dial in when not available. See Note.
     */
    public void setUseOnlyPreferredNetwork(Boolean useOnlyPreferredNetwork) {
        this.useOnlyPreferredNetwork = useOnlyPreferredNetwork;
    }

    /**
     * APN. APN_ Authentication. APN_ Authentication_ Code
     * urn:x-oca:ocpp:uid:1:568828
     * Authentication method.
     * <p>
     * (Required)
     */
    public APNAuthenticationEnum getApnAuthentication() {
        return apnAuthentication;
    }

    /**
     * APN. APN_ Authentication. APN_ Authentication_ Code
     * urn:x-oca:ocpp:uid:1:568828
     * Authentication method.
     * <p>
     * (Required)
     */
    public void setApnAuthentication(APNAuthenticationEnum apnAuthentication) {
        this.apnAuthentication = apnAuthentication;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof APN))
            return false;
        APN that = (APN) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(apn, that.apn)
                && Objects.equals(apnUserName, that.apnUserName)
                && Objects.equals(apnPassword, that.apnPassword)
                && Objects.equals(simPin, that.simPin)
                && Objects.equals(preferredNetwork, that.preferredNetwork)
                && Objects.equals(useOnlyPreferredNetwork, that.useOnlyPreferredNetwork)
                && apnAuthentication == that.apnAuthentication;
    }

    @Override
    public int hashCode() {
        int result = (apn != null ? apn.hashCode() : 0);
        result = 31 * result + (apnUserName != null ? apnUserName.hashCode() : 0);
        result = 31 * result + (apnPassword != null ? apnPassword.hashCode() : 0);
        result = 31 * result + (simPin != null ? simPin.hashCode() : 0);
        result = 31 * result + (preferredNetwork != null ? preferredNetwork.hashCode() : 0);
        result = 31 * result + (useOnlyPreferredNetwork != null ? useOnlyPreferredNetwork.hashCode() : 0);
        result = 31 * result + (apnAuthentication != null ? apnAuthentication.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
