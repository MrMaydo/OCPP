
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.ReportData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class NotifyReportRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * The id of the GetReportRequest  or GetBaseReportRequest that requested this report
     * 
     * (Required)
     * 
     */
    private Integer requestId;
    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * 
     * (Required)
     * 
     */
    private Date generatedAt;
    private List<ReportData> reportData = null;
    /**
     * “to be continued” indicator. Indicates whether another part of the report follows in an upcoming notifyReportRequest message. Default value when omitted is false.
     * 
     * 
     * 
     */
    private Boolean tbc = false;
    /**
     * Sequence number of this message. First message starts at 0.
     * 
     * (Required)
     * 
     */
    private Integer seqNo;

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
     * The id of the GetReportRequest  or GetBaseReportRequest that requested this report
     * 
     * (Required)
     * 
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The id of the GetReportRequest  or GetBaseReportRequest that requested this report
     * 
     * (Required)
     * 
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * 
     * (Required)
     * 
     */
    public Date getGeneratedAt() {
        return generatedAt;
    }

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     * 
     * (Required)
     * 
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
     * 
     * 
     */
    public Boolean getTbc() {
        return tbc;
    }

    /**
     * “to be continued” indicator. Indicates whether another part of the report follows in an upcoming notifyReportRequest message. Default value when omitted is false.
     * 
     * 
     * 
     */
    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
    }

    /**
     * Sequence number of this message. First message starts at 0.
     * 
     * (Required)
     * 
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence number of this message. First message starts at 0.
     * 
     * (Required)
     * 
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
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
