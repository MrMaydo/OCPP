package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ReportBaseEnum;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetBaseReportRequest {

    /**
     * The Id of the request.
     * 
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * This field specifies the report base.
     * 
     * (Required)
     */
    @Required
    private ReportBaseEnum reportBase;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public GetBaseReportRequest() {
    }

    /**
     * 
     * @param requestId
     *     The Id of the request.
     *     .
     */
    public GetBaseReportRequest(Integer requestId, ReportBaseEnum reportBase, CustomData customData) {
        super();
        this.requestId = requestId;
        this.reportBase = reportBase;
        this.customData = customData;
    }

    /**
     * The Id of the request.
     * 
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of the request.
     * 
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * This field specifies the report base.
     * 
     * (Required)
     */
    public ReportBaseEnum getReportBase() {
        return reportBase;
    }

    /**
     * This field specifies the report base.
     * 
     * (Required)
     */
    public void setReportBase(ReportBaseEnum reportBase) {
        this.reportBase = reportBase;
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
        if (!(obj instanceof GetBaseReportRequest))
            return false;
        GetBaseReportRequest that = (GetBaseReportRequest) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.reportBase, that.reportBase) 
                && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.reportBase != null ? this.reportBase.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        return result;
    }
}
