package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.MonitoringData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class NotifyMonitoringReportRequest implements JsonInterface {

    private List<MonitoringData> monitor;
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
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyMonitoringReportRequest() {
    }

    /**
     * @param tbc         “to be continued” indicator. Indicates whether another part of the monitoringData follows in an upcoming notifyMonitoringReportRequest message. Default value when omitted is false.
     *                    .
     * @param seqNo       Sequence number of this message. First message starts at 0.
     *                    .
     * @param requestId   The id of the GetMonitoringRequest that requested this report.
     *                    <p>
     *                    .
     * @param generatedAt Timestamp of the moment this message was generated at the Charging Station.
     *                    .
     */
    public NotifyMonitoringReportRequest(List<MonitoringData> monitor, Integer requestId, Boolean tbc, Integer seqNo, Date generatedAt, CustomData customData) {
        super();
        this.monitor = monitor;
        this.requestId = requestId;
        this.tbc = tbc;
        this.seqNo = seqNo;
        this.generatedAt = generatedAt;
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
        json.addProperty("requestId", requestId);
        json.addProperty("seqNo", seqNo);
        json.addProperty("generatedAt", new SimpleDateFormat(DATE_FORMAT).format(generatedAt));
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
        int result = 1;
        result = 31 * result + (this.tbc != null ? this.tbc.hashCode() : 0);
        result = 31 * result + (this.seqNo != null ? this.seqNo.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.generatedAt != null ? this.generatedAt.hashCode() : 0);
        result = 31 * result + (this.monitor != null ? this.monitor.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
