package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ConnectorStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.Objects;

public class StatusNotificationRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * The time for which the status is reported. If absent time of receipt of the message will be assumed.
     * <p>
     * (Required)
     */
    @Required
    private Date timestamp;
    /**
     * This contains the current status of the Connector.
     * <p>
     * (Required)
     */
    @Required
    private ConnectorStatusEnum connectorStatus;
    /**
     * The id of the EVSE to which the connector belongs for which the the status is reported.
     * <p>
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * The id of the connector within the EVSE for which the status is reported.
     * <p>
     * (Required)
     */
    @Required
    private Integer connectorId;

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
     * The time for which the status is reported. If absent time of receipt of the message will be assumed.
     * <p>
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * The time for which the status is reported. If absent time of receipt of the message will be assumed.
     * <p>
     * (Required)
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This contains the current status of the Connector.
     * <p>
     * (Required)
     */
    public ConnectorStatusEnum getConnectorStatus() {
        return connectorStatus;
    }

    /**
     * This contains the current status of the Connector.
     * <p>
     * (Required)
     */
    public void setConnectorStatus(ConnectorStatusEnum connectorStatus) {
        this.connectorStatus = connectorStatus;
    }

    /**
     * The id of the EVSE to which the connector belongs for which the the status is reported.
     * <p>
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The id of the EVSE to which the connector belongs for which the the status is reported.
     * <p>
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * The id of the connector within the EVSE for which the status is reported.
     * <p>
     * (Required)
     */
    public Integer getConnectorId() {
        return connectorId;
    }

    /**
     * The id of the connector within the EVSE for which the status is reported.
     * <p>
     * (Required)
     */
    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
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
        if (!(obj instanceof StatusNotificationRequest))
            return false;
        StatusNotificationRequest that = (StatusNotificationRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(timestamp, that.timestamp)
                && connectorStatus == that.connectorStatus
                && Objects.equals(evseId, that.evseId)
                && Objects.equals(connectorId, that.connectorId);
    }

    @Override
    public int hashCode() {
        int result = (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (connectorStatus != null ? connectorStatus.hashCode() : 0);
        result = 31 * result + (evseId != null ? evseId.hashCode() : 0);
        result = 31 * result + (connectorId != null ? connectorId.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
