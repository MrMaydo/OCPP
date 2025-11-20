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

public class ReserveNowRequest implements JsonInterface {

    /**
     * Id of reservation.
     * <p>
     * (Required)
     */
    @Required
    private Integer id;
    /**
     * Date and time at which the reservation expires.
     * <p>
     * (Required)
     */
    @Required
    private Date expiryDateTime;
    /**
     * This field specifies the connector type. Values defined in Appendix as ConnectorEnumStringType.
     */
    @Optional
    private String connectorType;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * <p>
     * (Required)
     */
    @Required
    private IdToken idToken;
    /**
     * This contains ID of the evse to be reserved.
     */
    @Optional
    private Integer evseId;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    @Optional
    private IdToken groupIdToken;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ReserveNowRequest() {
    }

    /**
     * @param evseId         This contains ID of the evse to be reserved.
     *                       .
     * @param connectorType  This field specifies the connector type. Values defined in Appendix as ConnectorEnumStringType.
     *                       .
     * @param id             Id of reservation.
     *                       .
     * @param expiryDateTime Date and time at which the reservation expires.
     *                       .
     */
    public ReserveNowRequest(Integer id, Date expiryDateTime, String connectorType, IdToken idToken, Integer evseId, IdToken groupIdToken, CustomData customData) {
        super();
        this.id = id;
        this.expiryDateTime = expiryDateTime;
        this.connectorType = connectorType;
        this.idToken = idToken;
        this.evseId = evseId;
        this.groupIdToken = groupIdToken;
        this.customData = customData;
    }

    /**
     * Id of reservation.
     * <p>
     * (Required)
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id of reservation.
     * <p>
     * (Required)
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Date and time at which the reservation expires.
     * <p>
     * (Required)
     */
    public Date getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * Date and time at which the reservation expires.
     * <p>
     * (Required)
     */
    public void setExpiryDateTime(Date expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }

    /**
     * This field specifies the connector type. Values defined in Appendix as ConnectorEnumStringType.
     */
    public String getConnectorType() {
        return connectorType;
    }

    /**
     * This field specifies the connector type. Values defined in Appendix as ConnectorEnumStringType.
     */
    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
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
     * This contains ID of the evse to be reserved.
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * This contains ID of the evse to be reserved.
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
