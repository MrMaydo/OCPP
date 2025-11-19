package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.ReportData;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class NotifyReportRequest {

    /**
     * The id of the GetReportRequest  or GetBaseReportRequest that requested this report
     * 
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * 
     * (Required)
     */
    @Required
    private Date generatedAt;
    @Optional
    private List<ReportData> reportData;
    /**
     * “to be continued” indicator. Indicates whether another part of the report follows in an upcoming notifyReportRequest message. Default value when omitted is false.
     * 
     */
    @Optional
    private Boolean tbc = false;
    /**
     * Sequence number of this message. First message starts at 0.
     * 
     * (Required)
     */
    @Required
    private Integer seqNo;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyReportRequest() {
    }

    /**
     * 
     * @param tbc
     *     “to be continued” indicator. Indicates whether another part of the report follows in an upcoming notifyReportRequest message. Default value when omitted is false.
     *     
     *     .
     * @param seqNo
     *     Sequence number of this message. First message starts at 0.
     *     .
     * @param requestId
     *     The id of the GetReportRequest  or GetBaseReportRequest that requested this report
     *     .
     * @param generatedAt
     *     Timestamp of the moment this message was generated at the Charging Station.
     *     .
     */
    public NotifyReportRequest(Integer requestId, Date generatedAt, List<ReportData> reportData, Boolean tbc, Integer seqNo, CustomData customData) {
        super();
        this.requestId = requestId;
        this.generatedAt = generatedAt;
        this.reportData = reportData;
        this.tbc = tbc;
        this.seqNo = seqNo;
        this.customData = customData;
    }

    /**
     * The id of the GetReportRequest  or GetBaseReportRequest that requested this report
     * 
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The id of the GetReportRequest  or GetBaseReportRequest that requested this report
     * 
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * 
     * (Required)
     */
    public Date getGeneratedAt() {
        return generatedAt;
    }

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * 
     * (Required)
     */
    public void setGeneratedAt(Date generatedAt) {
        this.generatedAt = generatedAt;
    }

    public List<ReportData> getReportData() {
        return reportData;
    }

    public void setReportData(List<ReportData> reportData) {
        this.reportData = reportData;
    }

    /**
     * “to be continued” indicator. Indicates whether another part of the report follows in an upcoming notifyReportRequest message. Default value when omitted is false.
     * 
     */
    public Boolean getTbc() {
        return tbc;
    }

    /**
     * “to be continued” indicator. Indicates whether another part of the report follows in an upcoming notifyReportRequest message. Default value when omitted is false.
     * 
     */
    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
    }

    /**
     * Sequence number of this message. First message starts at 0.
     * 
     * (Required)
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence number of this message. First message starts at 0.
     * 
     * (Required)
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof NotifyReportRequest))
            return false;
        NotifyReportRequest that = (NotifyReportRequest) obj;
        return Objects.equals(this.tbc, that.tbc)
                && Objects.equals(this.seqNo, that.seqNo) 
                && Objects.equals(this.requestId, that.requestId) 
                && Objects.equals(this.generatedAt, that.generatedAt) 
                && Objects.equals(this.reportData, that.reportData) 
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.tbc != null ? this.tbc.hashCode() : 0);
        result = 31 * result + (this.seqNo != null ? this.seqNo.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.generatedAt != null ? this.generatedAt.hashCode() : 0);
        result = 31 * result + (this.reportData != null ? this.reportData.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
