package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ConnectorStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class StatusNotificationRequest implements JsonInterface {

    /**
     * The time for which the status is reported.
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
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public StatusNotificationRequest() {
    }

    /**
     * @param evseId      The id of the EVSE to which the connector belongs for which the the status is reported.
     *                    .
     * @param connectorId The id of the connector within the EVSE for which the status is reported.
     *                    .
     * @param timestamp   The time for which the status is reported.
     *                    .
     */
    public StatusNotificationRequest(Date timestamp, ConnectorStatusEnum connectorStatus, Integer evseId, Integer connectorId, CustomData customData) {
        super();
        this.timestamp = timestamp;
        this.connectorStatus = connectorStatus;
        this.evseId = evseId;
        this.connectorId = connectorId;
        this.customData = customData;
    }

    /**
     * The time for which the status is reported.
     * <p>
     * (Required)
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * The time for which the status is reported.
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
        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(timestamp));
        json.addProperty("connectorStatus", connectorStatus.toString());
        json.addProperty("evseId", evseId);
        json.addProperty("connectorId", connectorId);
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("timestamp")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.timestamp = dateFormat.parse(jsonObject.get("timestamp").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for timestamp" + e);
            }
        }

        if (jsonObject.has("connectorStatus")) {
            this.connectorStatus = ConnectorStatusEnum.valueOf(jsonObject.get("connectorStatus").getAsString());
        }

        if (jsonObject.has("evseId")) {
            this.evseId = jsonObject.get("evseId").getAsInt();
        }

        if (jsonObject.has("connectorId")) {
            this.connectorId = jsonObject.get("connectorId").getAsInt();
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
        if (!(obj instanceof StatusNotificationRequest))
            return false;
        StatusNotificationRequest that = (StatusNotificationRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.connectorStatus, that.connectorStatus)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.connectorId, that.connectorId)
                && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.connectorStatus != null ? this.connectorStatus.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.connectorId != null ? this.connectorId.hashCode() : 0);
        result = 31 * result + (this.timestamp != null ? this.timestamp.hashCode() : 0);
        return result;
    }
}
