package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.MonitoringData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Date;
import java.util.List;

public class NotifyMonitoringReportRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    @Optional
    private List<MonitoringData> monitor = null;
    /**
     * The id of the GetMonitoringRequest that requested this report.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * “to be continued” indicator. Indicates whether another part of the monitoringData follows in an upcoming notifyMonitoringReportRequest message. Default value when omitted is false.
     */
    @Optional
    private Boolean tbc = false;
    /**
     * Sequence number of this message. First message starts at 0.
     * <p>
     * (Required)
     */
    @Required
    private Integer seqNo;
    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * <p>
     * (Required)
     */
    @Required
    private Date generatedAt;

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

    public List<MonitoringData> getMonitor() {
        return monitor;
    }

    public void setMonitor(List<MonitoringData> monitor) {
        this.monitor = monitor;
    }

    /**
     * The id of the GetMonitoringRequest that requested this report.
     * <p>
     * <p>
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The id of the GetMonitoringRequest that requested this report.
     * <p>
     * <p>
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * “to be continued” indicator. Indicates whether another part of the monitoringData follows in an upcoming notifyMonitoringReportRequest message. Default value when omitted is false.
     */
    public Boolean getTbc() {
        return tbc;
    }

    /**
     * “to be continued” indicator. Indicates whether another part of the monitoringData follows in an upcoming notifyMonitoringReportRequest message. Default value when omitted is false.
     */
    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
    }

    /**
     * Sequence number of this message. First message starts at 0.
     * <p>
     * (Required)
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence number of this message. First message starts at 0.
     * <p>
     * (Required)
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * <p>
     * (Required)
     */
    public Date getGeneratedAt() {
        return generatedAt;
    }

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * <p>
     * (Required)
     */
    public void setGeneratedAt(Date generatedAt) {
        this.generatedAt = generatedAt;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
