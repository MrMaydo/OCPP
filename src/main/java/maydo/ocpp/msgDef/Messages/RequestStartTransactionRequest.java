package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class RequestStartTransactionRequest implements JsonInterface {

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
     * Id given by the server to this start request. The Charging Station will return this in the &lt;&lt;transactioneventrequest, TransactionEventRequest&gt;&gt;, letting the server know which transaction was started for this request. Use to start a transaction.
     * <p>
     * (Required)
     */
    @Required
    private Integer remoteStartId;
    /**
     * A ChargingProfile consists of 1 to 3 ChargingSchedules with a list of ChargingSchedulePeriods, describing the amount of power or current that can be delivered per time interval.
     * <p>
     * image::images/ChargingProfile-Simple.png[]
     */
    @Optional
    private ChargingProfile chargingProfile;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public RequestStartTransactionRequest() {
    }

    /**
     * @param evseId        Number of the EVSE on which to start the transaction. EvseId SHALL be &gt; 0
     *                      .
     * @param remoteStartId Id given by the server to this start request. The Charging Station will return this in the &lt;&lt;transactioneventrequest, TransactionEventRequest&gt;&gt;, letting the server know which transaction was started for this request. Use to start a transaction.
     *                      .
     */
    public RequestStartTransactionRequest(Integer evseId, IdToken groupIdToken, IdToken idToken, Integer remoteStartId, ChargingProfile chargingProfile, CustomData customData) {
        super();
        this.evseId = evseId;
        this.groupIdToken = groupIdToken;
        this.idToken = idToken;
        this.remoteStartId = remoteStartId;
        this.chargingProfile = chargingProfile;
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
     * Id given by the server to this start request. The Charging Station will return this in the &lt;&lt;transactioneventrequest, TransactionEventRequest&gt;&gt;, letting the server know which transaction was started for this request. Use to start a transaction.
     * <p>
     * (Required)
     */
    public Integer getRemoteStartId() {
        return remoteStartId;
    }

    /**
     * Id given by the server to this start request. The Charging Station will return this in the &lt;&lt;transactioneventrequest, TransactionEventRequest&gt;&gt;, letting the server know which transaction was started for this request. Use to start a transaction.
     * <p>
     * (Required)
     */
    public void setRemoteStartId(Integer remoteStartId) {
        this.remoteStartId = remoteStartId;
    }

    /**
     * A ChargingProfile consists of 1 to 3 ChargingSchedules with a list of ChargingSchedulePeriods, describing the amount of power or current that can be delivered per time interval.
     * <p>
     * image::images/ChargingProfile-Simple.png[]
     */
    public ChargingProfile getChargingProfile() {
        return chargingProfile;
    }

    /**
     * A ChargingProfile consists of 1 to 3 ChargingSchedules with a list of ChargingSchedulePeriods, describing the amount of power or current that can be delivered per time interval.
     * <p>
     * image::images/ChargingProfile-Simple.png[]
     */
    public void setChargingProfile(ChargingProfile chargingProfile) {
        this.chargingProfile = chargingProfile;
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
        JsonObject json = new JsonObject();
        json.addProperty("evseId", evseId);
        json.add("groupIdToken", groupIdToken.toJsonObject());
        json.add("idToken", idToken.toJsonObject());
        json.addProperty("remoteStartId", remoteStartId);
        json.add("chargingProfile", chargingProfile.toJsonObject());
        json.add("customData", customData.toJsonObject());
        return json;
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
        if (!(obj instanceof RequestStartTransactionRequest))
            return false;
        RequestStartTransactionRequest that = (RequestStartTransactionRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.remoteStartId, that.remoteStartId)
                && Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.chargingProfile, that.chargingProfile)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.groupIdToken, that.groupIdToken);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.remoteStartId != null ? this.remoteStartId.hashCode() : 0);
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.chargingProfile != null ? this.chargingProfile.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.groupIdToken != null ? this.groupIdToken.hashCode() : 0);
        return result;
    }
}
