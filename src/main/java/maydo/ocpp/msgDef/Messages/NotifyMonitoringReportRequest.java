package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.MonitoringData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * This contains the field definition of the NotifyMonitoringRequest PDU sent by the Charging Station to the CSMS.
 */
public class NotifyMonitoringReportRequest implements JsonInterface {

    /**
     * List of MonitoringData containing monitoring settings.
     */
    private List<MonitoringData> monitor;

    /**
     * The id of the GetMonitoringRequest that requested this report.
     */
    @Required
    private Integer requestId;

    /**
     * “to be continued” indicator.
     * Indicates whether another part of the monitoringData follows in an upcoming notifyMonitoringReportRequest message.
     * Default value when omitted is false.
     */
    @Optional
    private Boolean tbc = false;

    /**
     * Sequence number of this message. First message starts at 0.
     */
    @Required
    private Integer seqNo;

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     */
    @Required
    private Date generatedAt;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyMonitoringReportRequest() {
    }


    public List<MonitoringData> getMonitor() {
        return monitor;
    }

    public void setMonitor(List<MonitoringData> monitor) {
        this.monitor = monitor;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public Boolean getTbc() {
        return tbc;
    }


    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
    }


    public Integer getSeqNo() {
        return seqNo;
    }


    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }


    public Date getGeneratedAt() {
        return generatedAt;
    }


    public void setGeneratedAt(Date generatedAt) {
        this.generatedAt = generatedAt;
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

        JsonArray monitorArray = new JsonArray();
        for (MonitoringData item : getMonitor()) {
            monitorArray.add(item.toJsonObject());
        }
        json.add("monitor", monitorArray);

        json.addProperty("requestId", getRequestId());

        json.addProperty("seqNo", getSeqNo());

        json.addProperty("generatedAt", new SimpleDateFormat(DATE_FORMAT).format(getGeneratedAt()));

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
        if (jsonObject.has("monitor")) {
            setMonitor(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("monitor");
            for (JsonElement el : arr) {
                MonitoringData item = new MonitoringData();
                item.fromJsonObject(el.getAsJsonObject());
                getMonitor().add(item);
            }
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("seqNo")) {
            setSeqNo(jsonObject.get("seqNo").getAsInt());
        }

        if (jsonObject.has("generatedAt")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setGeneratedAt(dateFormat.parse(jsonObject.get("generatedAt").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for generatedAt" + e);
            }
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
        if (!(obj instanceof NotifyMonitoringReportRequest))
            return false;
        NotifyMonitoringReportRequest that = (NotifyMonitoringReportRequest) obj;
        return Objects.equals(this.tbc, that.tbc)
                && Objects.equals(this.seqNo, that.seqNo)
                && Objects.equals(this.requestId, that.requestId)
                && Objects.equals(this.generatedAt, that.generatedAt)
                && Objects.equals(this.monitor, that.monitor)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getMonitor(),
                getRequestId(),
                getSeqNo(),
                getGeneratedAt(),
                getCustomData()
        );
    }
}
