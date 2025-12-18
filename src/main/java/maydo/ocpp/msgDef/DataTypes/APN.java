package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.APNAuthenticationEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Collection of configuration data needed to make a data-connection over a cellular network.
 */
public class APN implements JsonInterface {

    /**
     * The Access Point Name as an URL.
     */
    @Required
    private String apn;

    /**
     * APN username.
     */
    @Optional
    private String apnUserName;

    /**
     * (2.1) APN Password.
     */
    @Optional
    private String apnPassword;

    /**
     * SIM card pin code.
     */
    @Optional
    private Integer simPin;

    /**
     * Preferred network, written as MCC and MNC concatenated.
     */
    @Optional
    private String preferredNetwork;

    /**
     * Default: false. Use only the preferred Network, do not dial in when not available.
     */
    @Optional
    private Boolean useOnlyPreferredNetwork = false;

    /**
     * Authentication method.
     */
    @Required
    private APNAuthenticationEnum apnAuthentication;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public APN() {
    }


    public String getApn() {
        return apn;
    }


    public void setApn(String apn) {
        this.apn = apn;
    }


    public String getApnUserName() {
        return apnUserName;
    }


    public void setApnUserName(String apnUserName) {
        this.apnUserName = apnUserName;
    }


    public String getApnPassword() {
        return apnPassword;
    }


    public void setApnPassword(String apnPassword) {
        this.apnPassword = apnPassword;
    }


    public Integer getSimPin() {
        return simPin;
    }


    public void setSimPin(Integer simPin) {
        this.simPin = simPin;
    }


    public String getPreferredNetwork() {
        return preferredNetwork;
    }


    public void setPreferredNetwork(String preferredNetwork) {
        this.preferredNetwork = preferredNetwork;
    }


    public Boolean getUseOnlyPreferredNetwork() {
        return useOnlyPreferredNetwork;
    }


    public void setUseOnlyPreferredNetwork(Boolean useOnlyPreferredNetwork) {
        this.useOnlyPreferredNetwork = useOnlyPreferredNetwork;
    }


    public APNAuthenticationEnum getApnAuthentication() {
        return apnAuthentication;
    }


    public void setApnAuthentication(APNAuthenticationEnum apnAuthentication) {
        this.apnAuthentication = apnAuthentication;
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

        json.addProperty("apn", getApn());

        if (getApnUserName() != null) {
            json.addProperty("apnUserName", getApnUserName());
        }
        if (getApnPassword() != null) {
            json.addProperty("apnPassword", getApnPassword());
        }
        if (getSimPin() != null) {
            json.addProperty("simPin", getSimPin());
        }
        if (getPreferredNetwork() != null) {
            json.addProperty("preferredNetwork", getPreferredNetwork());
        }
        if (getUseOnlyPreferredNetwork() != null) {
            json.addProperty("useOnlyPreferredNetwork", getUseOnlyPreferredNetwork());
        }
        json.addProperty("apnAuthentication", getApnAuthentication().toString());

        if (getCustomData() != null) {
            json.add("customData", getCustomData().toJsonObject());
        }

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
            setApn(jsonObject.get("apn").getAsString());
        }

        if (jsonObject.has("apnUserName")) {
            setApnUserName(jsonObject.get("apnUserName").getAsString());
        }

        if (jsonObject.has("apnPassword")) {
            setApnPassword(jsonObject.get("apnPassword").getAsString());
        }

        if (jsonObject.has("simPin")) {
            setSimPin(jsonObject.get("simPin").getAsInt());
        }

        if (jsonObject.has("preferredNetwork")) {
            setPreferredNetwork(jsonObject.get("preferredNetwork").getAsString());
        }

        if (jsonObject.has("useOnlyPreferredNetwork")) {
            setUseOnlyPreferredNetwork(jsonObject.get("useOnlyPreferredNetwork").getAsBoolean());
        }

        if (jsonObject.has("apnAuthentication")) {
            setApnAuthentication(APNAuthenticationEnum.valueOf(jsonObject.get("apnAuthentication").getAsString()));
        }

        if (jsonObject.has("customData")) {
            setCustomData(new CustomData());
            getCustomData().fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof APN))
            return false;
        APN that = (APN) obj;
        return Objects.equals(getApn(), that.getApn())
                && Objects.equals(getApnUserName(), that.getApnUserName())
                && Objects.equals(getApnPassword(), that.getApnPassword())
                && Objects.equals(getSimPin(), that.getSimPin())
                && Objects.equals(getPreferredNetwork(), that.getPreferredNetwork())
                && Objects.equals(getUseOnlyPreferredNetwork(), that.getUseOnlyPreferredNetwork())
                && Objects.equals(getApnAuthentication(), that.getApnAuthentication())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getApn(),
                getApnUserName(),
                getApnPassword(),
                getSimPin(),
                getPreferredNetwork(),
                getUseOnlyPreferredNetwork(),
                getApnAuthentication(),
                getCustomData()
        );
    }
}
