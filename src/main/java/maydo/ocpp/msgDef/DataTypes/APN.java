package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.APNAuthenticationEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class APN implements JsonInterface {

    /**
     * The Access Point Name as an URL.
     * <p>
     * (Required)
     */
    @Required
    private String apn;
    /**
     * APN username.
     */
    @Optional
    private String apnUserName;
    /**
     * *(2.1)* APN Password.
     */
    @Optional
    private String apnPassword;
    /**
     * SIM card pin code.
     */
    @Optional
    private Integer simPin;
    /**
     * Preferred network, written as MCC and MNC concatenated. See note.
     */
    @Optional
    private String preferredNetwork;
    /**
     * Default: false. Use only the preferred Network, do
     * not dial in when not available. See Note.
     */
    @Optional
    private Boolean useOnlyPreferredNetwork = false;
    /**
     * Authentication method.
     * <p>
     * (Required)
     */
    @Required
    private APNAuthenticationEnum apnAuthentication;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public APN() {
    }

    /**
     * @param preferredNetwork        Preferred network, written as MCC and MNC concatenated. See note.
     *                                .
     * @param apnUserName             APN username.
     *                                .
     * @param useOnlyPreferredNetwork Default: false. Use only the preferred Network, do
     *                                not dial in when not available. See Note.
     *                                .
     * @param simPin                  SIM card pin code.
     *                                .
     * @param apn                     The Access Point Name as an URL.
     *                                .
     * @param apnPassword             *(2.1)* APN Password.
     *                                .
     */
    public APN(String apn, String apnUserName, String apnPassword, Integer simPin, String preferredNetwork, Boolean useOnlyPreferredNetwork, APNAuthenticationEnum apnAuthentication, CustomData customData) {
        super();
        this.apn = apn;
        this.apnUserName = apnUserName;
        this.apnPassword = apnPassword;
        this.simPin = simPin;
        this.preferredNetwork = preferredNetwork;
        this.useOnlyPreferredNetwork = useOnlyPreferredNetwork;
        this.apnAuthentication = apnAuthentication;
        this.customData = customData;
    }

    /**
     * The Access Point Name as an URL.
     * <p>
     * (Required)
     */
    public String getApn() {
        return apn;
    }

    /**
     * The Access Point Name as an URL.
     * <p>
     * (Required)
     */
    public void setApn(String apn) {
        this.apn = apn;
    }

    /**
     * APN username.
     */
    public String getApnUserName() {
        return apnUserName;
    }

    /**
     * APN username.
     */
    public void setApnUserName(String apnUserName) {
        this.apnUserName = apnUserName;
    }

    /**
     * *(2.1)* APN Password.
     */
    public String getApnPassword() {
        return apnPassword;
    }

    /**
     * *(2.1)* APN Password.
     */
    public void setApnPassword(String apnPassword) {
        this.apnPassword = apnPassword;
    }

    /**
     * SIM card pin code.
     */
    public Integer getSimPin() {
        return simPin;
    }

    /**
     * SIM card pin code.
     */
    public void setSimPin(Integer simPin) {
        this.simPin = simPin;
    }

    /**
     * Preferred network, written as MCC and MNC concatenated. See note.
     */
    public String getPreferredNetwork() {
        return preferredNetwork;
    }

    /**
     * Preferred network, written as MCC and MNC concatenated. See note.
     */
    public void setPreferredNetwork(String preferredNetwork) {
        this.preferredNetwork = preferredNetwork;
    }

    /**
     * Default: false. Use only the preferred Network, do
     * not dial in when not available. See Note.
     */
    public Boolean getUseOnlyPreferredNetwork() {
        return useOnlyPreferredNetwork;
    }

    /**
     * Default: false. Use only the preferred Network, do
     * not dial in when not available. See Note.
     */
    public void setUseOnlyPreferredNetwork(Boolean useOnlyPreferredNetwork) {
        this.useOnlyPreferredNetwork = useOnlyPreferredNetwork;
    }

    /**
     * Authentication method.
     * <p>
     * (Required)
     */
    public APNAuthenticationEnum getApnAuthentication() {
        return apnAuthentication;
    }

    /**
     * Authentication method.
     * <p>
     * (Required)
     */
    public void setApnAuthentication(APNAuthenticationEnum apnAuthentication) {
        this.apnAuthentication = apnAuthentication;
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
        if (!(obj instanceof APN))
            return false;
        APN that = (APN) obj;
        return Objects.equals(this.preferredNetwork, that.preferredNetwork)
                && Objects.equals(this.apnUserName, that.apnUserName)
                && Objects.equals(this.apnAuthentication, that.apnAuthentication)
                && Objects.equals(this.useOnlyPreferredNetwork, that.useOnlyPreferredNetwork)
                && Objects.equals(this.simPin, that.simPin)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.apn, that.apn)
                && Objects.equals(this.apnPassword, that.apnPassword);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.preferredNetwork != null ? this.preferredNetwork.hashCode() : 0);
        result = 31 * result + (this.apnUserName != null ? this.apnUserName.hashCode() : 0);
        result = 31 * result + (this.apnAuthentication != null ? this.apnAuthentication.hashCode() : 0);
        result = 31 * result + (this.useOnlyPreferredNetwork != null ? this.useOnlyPreferredNetwork.hashCode() : 0);
        result = 31 * result + (this.simPin != null ? this.simPin.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.apn != null ? this.apn.hashCode() : 0);
        result = 31 * result + (this.apnPassword != null ? this.apnPassword.hashCode() : 0);
        return result;
    }
}
