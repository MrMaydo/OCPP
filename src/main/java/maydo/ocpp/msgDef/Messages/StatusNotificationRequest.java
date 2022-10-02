
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ConnectorStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Generated;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

@Generated("jsonschema2pojo")
public class StatusNotificationRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * The time for which the status is reported. If absent time of receipt of the message will be assumed.
     * 
     * (Required)
     * 
     */
    private Date timestamp;
    /**
     * This contains the current status of the Connector.
     * 
     * (Required)
     * 
     */
    private ConnectorStatusEnum connectorStatus;
    /**
     * The id of the EVSE to which the connector belongs for which the the status is reported.
     * 
     * (Required)
     * 
     */
    private Integer evseId;
    /**
     * The id of the connector within the EVSE for which the status is reported.
     * 
     * (Required)
     * 
     */
    private Integer connectorId;

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
     * The time for which the status is reported. If absent time of receipt of the message will be assumed.
     * 
     * (Required)
     * 
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * The time for which the status is reported. If absent time of receipt of the message will be assumed.
     * 
     * (Required)
     * 
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This contains the current status of the Connector.
     * 
     * (Required)
     * 
     */
    public ConnectorStatusEnum getConnectorStatus() {
        return connectorStatus;
    }

    /**
     * This contains the current status of the Connector.
     * 
     * (Required)
     * 
     */
    public void setConnectorStatus(ConnectorStatusEnum connectorStatus) {
        this.connectorStatus = connectorStatus;
    }

    /**
     * The id of the EVSE to which the connector belongs for which the the status is reported.
     * 
     * (Required)
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The id of the EVSE to which the connector belongs for which the the status is reported.
     * 
     * (Required)
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * The id of the connector within the EVSE for which the status is reported.
     * 
     * (Required)
     * 
     */
    public Integer getConnectorId() {
        return connectorId;
    }

    /**
     * The id of the connector within the EVSE for which the status is reported.
     * 
     * (Required)
     * 
     */
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonElement toJsonObject(){
        JsonElement jsonObject= new Gson().toJsonTree(this);
        return jsonObject;
    }
}
