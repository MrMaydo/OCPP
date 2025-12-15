package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * This contains the field definition of the NotifyCustomerInformationRequest PDU sent by the Charging Station to the CSMS.
 */
public class NotifyCustomerInformationRequest implements JsonInterface {

    /**
     * (Part of) the requested data. No format specified in which the data is returned. Should be human readable.
     */
    @Required
    private String data;

    /**
     * “to be continued” indicator. Indicates whether another part of the monitoringData follows in
     * an upcoming notifyMonitoringReportRequest message. Default value when omitted is false.
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
     * The Id of the request.
     */
    @Required
    private Integer requestId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyCustomerInformationRequest() {
    }


    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
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


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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

        json.addProperty("data", getData());

        json.addProperty("seqNo", getSeqNo());

        json.addProperty("generatedAt", new SimpleDateFormat(DATE_FORMAT).format(getGeneratedAt()));

        json.addProperty("requestId", getRequestId());

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
        if (jsonObject.has("data")) {
            setData(jsonObject.get("data").getAsString());
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

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
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
        if (!(obj instanceof NotifyCustomerInformationRequest))
            return false;
        NotifyCustomerInformationRequest that = (NotifyCustomerInformationRequest) obj;
        return Objects.equals(this.data, that.data)
                && Objects.equals(this.tbc, that.tbc)
                && Objects.equals(this.seqNo, that.seqNo)
                && Objects.equals(this.requestId, that.requestId)
                && Objects.equals(this.generatedAt, that.generatedAt)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.data != null ? this.data.hashCode() : 0);
        result = 31 * result + (this.tbc != null ? this.tbc.hashCode() : 0);
        result = 31 * result + (this.seqNo != null ? this.seqNo.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.generatedAt != null ? this.generatedAt.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
