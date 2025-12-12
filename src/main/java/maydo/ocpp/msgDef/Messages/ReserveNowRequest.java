package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * This contains the field definition of the ReserveNowRequest PDU sent by the CSMS to the Charging Station.
 */
public class ReserveNowRequest implements JsonInterface {

    /**
     * Id of reservation.
     */
    @Required
    private Integer id;

    /**
     * Date and time at which the reservation expires.
     */
    @Required
    private Date expiryDateTime;

    /**
     * This field specifies the connector type. Values defined in Appendix as ConnectorEnumStringType.
     */
    @Optional
    private String connectorType;

    /**
     * The identifier for which the reservation is made.
     */
    @Required
    private IdToken idToken;

    /**
     * This contains ID of the evse to be reserved.
     */
    @Optional
    private Integer evseId;

    /**
     * The group identifier for which the reservation is made
     */
    @Optional
    private IdToken groupIdToken;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ReserveNowRequest() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Date getExpiryDateTime() {
        return expiryDateTime;
    }


    public void setExpiryDateTime(Date expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }


    public String getConnectorType() {
        return connectorType;
    }


    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }


    public IdToken getIdToken() {
        return idToken;
    }


    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
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
        json.addProperty("id", id);
        json.addProperty("expiryDateTime", new SimpleDateFormat(DATE_FORMAT).format(expiryDateTime));
        json.addProperty("connectorType", connectorType);
        json.add("idToken", idToken.toJsonObject());
        json.addProperty("evseId", evseId);
        json.add("groupIdToken", groupIdToken.toJsonObject());
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
        if (jsonObject.has("id")) {
            this.id = jsonObject.get("id").getAsInt();
        }

        if (jsonObject.has("expiryDateTime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.expiryDateTime = dateFormat.parse(jsonObject.get("expiryDateTime").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for expiryDateTime" + e);
            }
        }

        if (jsonObject.has("connectorType")) {
            this.connectorType = jsonObject.get("connectorType").getAsString();
        }

        if (jsonObject.has("idToken")) {
            this.idToken = new IdToken();
            this.idToken.fromJsonObject(jsonObject.getAsJsonObject("idToken"));
        }

        if (jsonObject.has("evseId")) {
            this.evseId = jsonObject.get("evseId").getAsInt();
        }

        if (jsonObject.has("groupIdToken")) {
            this.groupIdToken = new IdToken();
            this.groupIdToken.fromJsonObject(jsonObject.getAsJsonObject("groupIdToken"));
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
        if (!(obj instanceof ReserveNowRequest))
            return false;
        ReserveNowRequest that = (ReserveNowRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.connectorType, that.connectorType)
                && Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.id, that.id)
                && Objects.equals(this.expiryDateTime, that.expiryDateTime)
                && Objects.equals(this.groupIdToken, that.groupIdToken);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.connectorType != null ? this.connectorType.hashCode() : 0);
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.id != null ? this.id.hashCode() : 0);
        result = 31 * result + (this.expiryDateTime != null ? this.expiryDateTime.hashCode() : 0);
        result = 31 * result + (this.groupIdToken != null ? this.groupIdToken.hashCode() : 0);
        return result;
    }
}
