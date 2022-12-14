package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class RequestStartTransactionRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Number of the EVSE on which to start the transaction. EvseId SHALL be &gt; 0
     */
    @Optional
    private Integer evseId;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    @Optional
    private IdToken groupIdToken;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * <p>
     * (Required)
     */
    @Required
    private IdToken idToken;
    /**
     * Id given by the server to this start request. The Charging Station might return this in the &lt;&lt;transactioneventrequest, TransactionEventRequest&gt;&gt;, letting the server know which transaction was started for this request. Use to start a transaction.
     * <p>
     * (Required)
     */
    @Required
    private Integer remoteStartId;
    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     */
    @Optional
    private ChargingProfile chargingProfile;

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
     * Number of the EVSE on which to start the transaction. EvseId SHALL be &gt; 0
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * Number of the EVSE on which to start the transaction. EvseId SHALL be &gt; 0
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    public IdToken getGroupIdToken() {
        return groupIdToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    public void setGroupIdToken(IdToken groupIdToken) {
        this.groupIdToken = groupIdToken;
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
     * Id given by the server to this start request. The Charging Station might return this in the &lt;&lt;transactioneventrequest, TransactionEventRequest&gt;&gt;, letting the server know which transaction was started for this request. Use to start a transaction.
     * <p>
     * (Required)
     */
    public Integer getRemoteStartId() {
        return remoteStartId;
    }

    /**
     * Id given by the server to this start request. The Charging Station might return this in the &lt;&lt;transactioneventrequest, TransactionEventRequest&gt;&gt;, letting the server know which transaction was started for this request. Use to start a transaction.
     * <p>
     * (Required)
     */
    public void setRemoteStartId(Integer remoteStartId) {
        this.remoteStartId = remoteStartId;
    }

    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     */
    public ChargingProfile getChargingProfile() {
        return chargingProfile;
    }

    /**
     * Charging_ Profile
     * urn:x-oca:ocpp:uid:2:233255
     * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
     */
    public void setChargingProfile(ChargingProfile chargingProfile) {
        this.chargingProfile = chargingProfile;
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
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof RequestStartTransactionRequest))
            return false;
        RequestStartTransactionRequest that = (RequestStartTransactionRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(evseId, that.evseId)
                && Objects.equals(groupIdToken, that.groupIdToken)
                && Objects.equals(idToken, that.idToken)
                && Objects.equals(remoteStartId, that.remoteStartId)
                && Objects.equals(chargingProfile, that.chargingProfile);
    }

    @Override
    public int hashCode() {
        int result = (evseId != null ? evseId.hashCode() : 0);
        result = 31 * result + (groupIdToken != null ? groupIdToken.hashCode() : 0);
        result = 31 * result + (idToken != null ? idToken.hashCode() : 0);
        result = 31 * result + (remoteStartId != null ? remoteStartId.hashCode() : 0);
        result = 31 * result + (chargingProfile != null ? chargingProfile.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
