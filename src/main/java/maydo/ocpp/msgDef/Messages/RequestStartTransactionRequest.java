package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definitions of the RequestStartTransactionRequest PDU sent to Charging Station by CSMS.
 */
public class RequestStartTransactionRequest implements JsonInterface {

    /**
     * Number of the EVSE on which to start the transaction. EvseId SHALL be > 0
     */
    @Optional
    private Integer evseId;

    /**
     * The groupIdToken is only relevant when the transaction is to be started on an EVSE for which
     * a reservation for groupIdToken is active,
     * and the configuration variable AuthorizeRemoteStart = false (otherwise the AuthorizeResponse could return the groupIdToken).
     */
    @Optional
    private IdToken groupIdToken;

    /**
     * The identifier that the Charging Station must use to start a transaction.
     */
    @Required
    private IdToken idToken;

    /**
     * Id given by the server to this start request. The Charging Station will return this in the TransactionEventRequest,
     * letting the server know which transaction was started for this request.
     * Use to start a transaction.
     */
    @Required
    private Integer remoteStartId;

    /**
     * Charging Profile to be used by the Charging Station for the requested transaction.
     * ChargingProfilePurpose MUST be set to TxProfile
     */
    @Optional
    private ChargingProfile chargingProfile;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public RequestStartTransactionRequest() {
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public IdToken getGroupIdToken() {
        return groupIdToken;
    }


    public void setGroupIdToken(IdToken groupIdToken) {
        this.groupIdToken = groupIdToken;
    }


    public IdToken getIdToken() {
        return idToken;
    }


    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }


    public Integer getRemoteStartId() {
        return remoteStartId;
    }


    public void setRemoteStartId(Integer remoteStartId) {
        this.remoteStartId = remoteStartId;
    }


    public ChargingProfile getChargingProfile() {
        return chargingProfile;
    }


    public void setChargingProfile(ChargingProfile chargingProfile) {
        this.chargingProfile = chargingProfile;
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

        if (getEvseId() != null) {
            json.addProperty("evseId", getEvseId());
        }
        if (getGroupIdToken() != null) {
            json.add("groupIdToken", getGroupIdToken().toJsonObject());
        }
        json.add("idToken", getIdToken().toJsonObject());

        json.addProperty("remoteStartId", getRemoteStartId());

        if (getChargingProfile() != null) {
            json.add("chargingProfile", getChargingProfile().toJsonObject());
        }
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
        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
        }

        if (jsonObject.has("groupIdToken")) {
            setGroupIdToken(new IdToken());
            getGroupIdToken().fromJsonObject(jsonObject.getAsJsonObject("groupIdToken"));
        }

        if (jsonObject.has("idToken")) {
            setIdToken(new IdToken());
            getIdToken().fromJsonObject(jsonObject.getAsJsonObject("idToken"));
        }

        if (jsonObject.has("remoteStartId")) {
            setRemoteStartId(jsonObject.get("remoteStartId").getAsInt());
        }

        if (jsonObject.has("chargingProfile")) {
            setChargingProfile(new ChargingProfile());
            getChargingProfile().fromJsonObject(jsonObject.getAsJsonObject("chargingProfile"));
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
