package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.ReportData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * This contains the field definition of the NotifyReportRequest PDU sent by the Charging Station to the CSMS.
 */
public class NotifyReportRequest implements JsonInterface {

    /**
     * The id of the GetReportRequest or GetBaseReportRequest that requested this report
     */
    @Required
    private Integer requestId;

    /**
     * Timestamp of the moment this message was generated at the Charging Station.
     */
    @Required
    private Date generatedAt;

    /**
     * List of ReportData.
     */
    @Optional
    private List<ReportData> reportData;

    /**
     * “to be continued” indicator.
     * Indicates whether another part of the report follows in an upcoming notifyReportRequest message.
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
     *
     */
    @Optional
    private CustomData customData;


    public NotifyReportRequest() {
    }


    public NotifyReportRequest(Integer requestId, Date generatedAt, List<ReportData> reportData, Boolean tbc, Integer seqNo, CustomData customData) {
        super();
        this.requestId = requestId;
        this.generatedAt = generatedAt;
        this.reportData = reportData;
        this.tbc = tbc;
        this.seqNo = seqNo;
        this.customData = customData;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public Date getGeneratedAt() {
        return generatedAt;
    }


    public void setGeneratedAt(Date generatedAt) {
        this.generatedAt = generatedAt;
    }

    public List<ReportData> getReportData() {
        return reportData;
    }

    public void setReportData(List<ReportData> reportData) {
        this.reportData = reportData;
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
        json.addProperty("requestId", requestId);
        json.addProperty("generatedAt", new SimpleDateFormat(DATE_FORMAT).format(generatedAt));
        json.addProperty("seqNo", seqNo);
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
        if (jsonObject.has("requestId")) {
            this.requestId = jsonObject.get("requestId").getAsInt();
        }

        if (jsonObject.has("generatedAt")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                this.generatedAt = dateFormat.parse(jsonObject.get("generatedAt").getAsString());
            } catch (ParseException e) {
                System.out.println("Invalid date format for generatedAt" + e);
            }
        }

        if (jsonObject.has("seqNo")) {
            this.seqNo = jsonObject.get("seqNo").getAsInt();
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
