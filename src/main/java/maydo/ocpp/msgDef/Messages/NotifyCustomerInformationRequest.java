package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.Objects;

public class NotifyCustomerInformationRequest implements JsonInterface {

    /**
     * (Part of) the requested data. No format specified in which the data is returned. Should be human readable.
     * <p>
     * (Required)
     */
    @Required
    private String data;
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
     * The Id of the request.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public NotifyCustomerInformationRequest() {
    }

    /**
     * @param data        (Part of) the requested data. No format specified in which the data is returned. Should be human readable.
     *                    .
     * @param tbc         “to be continued” indicator. Indicates whether another part of the monitoringData follows in an upcoming notifyMonitoringReportRequest message. Default value when omitted is false.
     *                    .
     * @param seqNo       Sequence number of this message. First message starts at 0.
     *                    .
     * @param requestId   The Id of the request.
     *                    <p>
     *                    .
     * @param generatedAt Timestamp of the moment this message was generated at the Charging Station.
     *                    .
     */
    public NotifyCustomerInformationRequest(String data, Boolean tbc, Integer seqNo, Date generatedAt, Integer requestId, CustomData customData) {
        super();
        this.data = data;
        this.tbc = tbc;
        this.seqNo = seqNo;
        this.generatedAt = generatedAt;
        this.requestId = requestId;
        this.customData = customData;
    }

    /**
     * (Part of) the requested data. No format specified in which the data is returned. Should be human readable.
     * <p>
     * (Required)
     */
    public String getData() {
        return data;
    }

    /**
     * (Part of) the requested data. No format specified in which the data is returned. Should be human readable.
     * <p>
     * (Required)
     */
    public void setData(String data) {
        this.data = data;
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
     * The Id of the request.
     * <p>
     * <p>
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of the request.
     * <p>
     * <p>
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
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
        return null;
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
