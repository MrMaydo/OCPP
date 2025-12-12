package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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

/**
 * This contains the field definition of the StatusNotificationRequest PDU sent by
 * the Charging Station to the CSMS. This message might be removed in a future version of OCPP.
 * It will be replaced by Device Management Monitoring events.
 */
public class StatusNotificationRequest implements JsonInterface {

    /**
     * The time for which the status is reported.
     */
    @Required
    private Date timestamp;

    /**
     * This contains the current status of the Connector.
     */
    @Required
    private ConnectorStatusEnum connectorStatus;

    /**
     * The id of the EVSE to which the connector belongs for which the the status is reported.
     */
    @Required
    private Integer evseId;

    /**
     * The id of the connector within the EVSE for which the status is reported.
     */
    @Required
    private Integer connectorId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public StatusNotificationRequest() {
    }


    public StatusNotificationRequest(Date timestamp, ConnectorStatusEnum connectorStatus, Integer evseId, Integer connectorId, CustomData customData) {
        super();
        this.timestamp = timestamp;
        this.connectorStatus = connectorStatus;
        this.evseId = evseId;
        this.connectorId = connectorId;
        this.customData = customData;
    }


    public Date getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }


    public ConnectorStatusEnum getConnectorStatus() {
        return connectorStatus;
    }


    public void setConnectorStatus(ConnectorStatusEnum connectorStatus) {
        this.connectorStatus = connectorStatus;
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public Integer getConnectorId() {
        return connectorId;
    }


    public void setConnectorId(Integer connectorId) {
        this.connectorId = connectorId;
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
        json.addProperty("timestamp", new SimpleDateFormat(DATE_FORMAT).format(timestamp));
        json.addProperty("connectorStatus", connectorStatus.toString());
        json.addProperty("evseId", evseId);
        json.addProperty("connectorId", connectorId);
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
