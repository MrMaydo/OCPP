package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.ReportData;
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

        json.addProperty("requestId", getRequestId());

        json.addProperty("generatedAt", new SimpleDateFormat(DATE_FORMAT).format(getGeneratedAt()));

        if (getReportData() != null) {
            JsonArray reportDataArray = new JsonArray();
            for (ReportData item : getReportData()) {
                reportDataArray.add(item.toJsonObject());
            }
            json.add("reportData", reportDataArray);
        }
        if (getTbc() != null) {
            json.addProperty("tbc", getTbc());
        }
        json.addProperty("seqNo", getSeqNo());

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
        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("generatedAt")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setGeneratedAt(dateFormat.parse(jsonObject.get("generatedAt").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for generatedAt" + e);
            }
        }

        if (jsonObject.has("reportData")) {
            setReportData(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("reportData");
            for (JsonElement el : arr) {
                ReportData item = new ReportData();
                item.fromJsonObject(el.getAsJsonObject());
                getReportData().add(item);
            }
        }

        if (jsonObject.has("tbc")) {
            setTbc(jsonObject.get("tbc").getAsBoolean());
        }

        if (jsonObject.has("seqNo")) {
            setSeqNo(jsonObject.get("seqNo").getAsInt());
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
        if (!(obj instanceof NotifyReportRequest))
            return false;
        NotifyReportRequest that = (NotifyReportRequest) obj;
        return Objects.equals(getRequestId(), that.getRequestId())
                && Objects.equals(getGeneratedAt(), that.getGeneratedAt())
                && Objects.equals(getReportData(), that.getReportData())
                && Objects.equals(getTbc(), that.getTbc())
                && Objects.equals(getSeqNo(), that.getSeqNo())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getRequestId(),
                getGeneratedAt(),
                getReportData(),
                getTbc(),
                getSeqNo(),
                getCustomData()
        );
    }
}
