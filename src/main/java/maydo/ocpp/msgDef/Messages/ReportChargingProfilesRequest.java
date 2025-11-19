package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class ReportChargingProfilesRequest implements JsonInterface {

    /**
     * Id used to match the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt; message with the resulting ReportChargingProfilesRequest messages. When the CSMS provided a requestId in the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt;, this field SHALL contain the same value.
     * 
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * Source that has installed this charging profile. Values defined in Appendix as ChargingLimitSourceEnumStringType.
     * 
     * (Required)
     */
    @Required
    private String chargingLimitSource;
    /**
     * 
     * (Required)
     */
    @Required
    private List<ChargingProfile> chargingProfile;
    /**
     * To Be Continued. Default value when omitted: false. false indicates that there are no further messages as part of this report.
     */
    @Optional
    private Boolean tbc = false;
    /**
     * The evse to which the charging profile applies. If evseId = 0, the message contains an overall limit for the Charging Station.
     * 
     * (Required)
     */
    @Required
    private Integer evseId;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ReportChargingProfilesRequest() {
    }

    /**
     * 
     * @param evseId
     *     The evse to which the charging profile applies. If evseId = 0, the message contains an overall limit for the Charging Station.
     *     .
     * @param tbc
     *     To Be Continued. Default value when omitted: false. false indicates that there are no further messages as part of this report.
     *     .
     * @param requestId
     *     Id used to match the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt; message with the resulting ReportChargingProfilesRequest messages. When the CSMS provided a requestId in the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt;, this field SHALL contain the same value.
     *     .
     * @param chargingLimitSource
     *     Source that has installed this charging profile. Values defined in Appendix as ChargingLimitSourceEnumStringType.
     *     .
     */
    public ReportChargingProfilesRequest(Integer requestId, String chargingLimitSource, List<ChargingProfile> chargingProfile, Boolean tbc, Integer evseId, CustomData customData) {
        super();
        this.requestId = requestId;
        this.chargingLimitSource = chargingLimitSource;
        this.chargingProfile = chargingProfile;
        this.tbc = tbc;
        this.evseId = evseId;
        this.customData = customData;
    }

    /**
     * Id used to match the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt; message with the resulting ReportChargingProfilesRequest messages. When the CSMS provided a requestId in the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt;, this field SHALL contain the same value.
     * 
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * Id used to match the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt; message with the resulting ReportChargingProfilesRequest messages. When the CSMS provided a requestId in the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt;, this field SHALL contain the same value.
     * 
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * Source that has installed this charging profile. Values defined in Appendix as ChargingLimitSourceEnumStringType.
     * 
     * (Required)
     */
    public String getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * Source that has installed this charging profile. Values defined in Appendix as ChargingLimitSourceEnumStringType.
     * 
     * (Required)
     */
    public void setChargingLimitSource(String chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    /**
     * 
     * (Required)
     */
    public List<ChargingProfile> getChargingProfile() {
        return chargingProfile;
    }

    /**
     * 
     * (Required)
     */
    public void setChargingProfile(List<ChargingProfile> chargingProfile) {
        this.chargingProfile = chargingProfile;
    }

    /**
     * To Be Continued. Default value when omitted: false. false indicates that there are no further messages as part of this report.
     */
    public Boolean getTbc() {
        return tbc;
    }

    /**
     * To Be Continued. Default value when omitted: false. false indicates that there are no further messages as part of this report.
     */
    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
    }

    /**
     * The evse to which the charging profile applies. If evseId = 0, the message contains an overall limit for the Charging Station.
     * 
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The evse to which the charging profile applies. If evseId = 0, the message contains an overall limit for the Charging Station.
     * 
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
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
        if (!(obj instanceof ReportChargingProfilesRequest))
            return false;
        ReportChargingProfilesRequest that = (ReportChargingProfilesRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.tbc, that.tbc) 
                && Objects.equals(this.requestId, that.requestId) 
                && Objects.equals(this.chargingProfile, that.chargingProfile) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.chargingLimitSource, that.chargingLimitSource);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.tbc != null ? this.tbc.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.chargingProfile != null ? this.chargingProfile.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.chargingLimitSource != null ? this.chargingLimitSource.hashCode() : 0);
        return result;
    }
}
