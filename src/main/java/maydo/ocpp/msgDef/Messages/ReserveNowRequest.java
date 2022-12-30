package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.Enumerations.ConnectorEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.Objects;

public class ReserveNowRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
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
     * This field specifies the connector type.
     */
    @Optional
    private ConnectorEnum connectorType;
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
     * This field specifies the connector type.
     */
    public ConnectorEnum getConnectorType() {
        return connectorType;
    }

    /**
     * This field specifies the connector type.
     */
    public void setConnectorType(ConnectorEnum connectorType) {
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
        if (!(obj instanceof ReserveNowRequest))
            return false;
        ReserveNowRequest that = (ReserveNowRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(id, that.id)
                && Objects.equals(expiryDateTime, that.expiryDateTime)
                && connectorType == that.connectorType
                && Objects.equals(idToken, that.idToken)
                && Objects.equals(evseId, that.evseId)
                && Objects.equals(groupIdToken, that.groupIdToken);
    }

    @Override
    public int hashCode() {
        int result = (id != null ? id.hashCode() : 0);
        result = 31 * result + (expiryDateTime != null ? expiryDateTime.hashCode() : 0);
        result = 31 * result + (connectorType != null ? connectorType.hashCode() : 0);
        result = 31 * result + (idToken != null ? idToken.hashCode() : 0);
        result = 31 * result + (evseId != null ? evseId.hashCode() : 0);
        result = 31 * result + (groupIdToken != null ? groupIdToken.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
