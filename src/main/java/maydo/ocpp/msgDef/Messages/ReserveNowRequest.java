
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ConnectorEnum;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Generated;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class ReserveNowRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Id of reservation.
     * 
     * (Required)
     * 
     */
    private Integer id;
    /**
     * Date and time at which the reservation expires.
     * 
     * (Required)
     * 
     */
    private Date expiryDateTime;
    /**
     * This field specifies the connector type.
     * 
     * 
     */
    private ConnectorEnum connectorType;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     * 
     */
    private IdToken idToken;
    /**
     * This contains ID of the evse to be reserved.
     * 
     * 
     */
    private Integer evseId;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    private IdToken groupIdToken;

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
     * Id of reservation.
     * 
     * (Required)
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * Id of reservation.
     * 
     * (Required)
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Date and time at which the reservation expires.
     * 
     * (Required)
     * 
     */
    public Date getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * Date and time at which the reservation expires.
     * 
     * (Required)
     * 
     */
    public void setExpiryDateTime(Date expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }

    /**
     * This field specifies the connector type.
     * 
     * 
     */
    public ConnectorEnum getConnectorType() {
        return connectorType;
    }

    /**
     * This field specifies the connector type.
     * 
     * 
     */
    public void setConnectorType(ConnectorEnum connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     * 
     */
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * (Required)
     * 
     */
    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }

    /**
     * This contains ID of the evse to be reserved.
     * 
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * This contains ID of the evse to be reserved.
     * 
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    public IdToken getGroupIdToken() {
        return groupIdToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    public void setGroupIdToken(IdToken groupIdToken) {
        this.groupIdToken = groupIdToken;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
