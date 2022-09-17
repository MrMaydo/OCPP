
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ChargingLimitSourceEnum;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ReportChargingProfilesRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * Id used to match the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt; message with the resulting ReportChargingProfilesRequest messages. When the CSMS provided a requestId in the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt;, this field SHALL contain the same value.
     * 
     * (Required)
     * 
     */
    private Integer requestId;
    /**
     * Source that has installed this charging profile.
     * 
     * (Required)
     * 
     */
    private ChargingLimitSourceEnum chargingLimitSource;
    /**
     * 
     * (Required)
     * 
     */
    private List<ChargingProfile> chargingProfile = null;
    /**
     * To Be Continued. Default value when omitted: false. false indicates that there are no further messages as part of this report.
     * 
     * 
     */
    private Boolean tbc = false;
    /**
     * The evse to which the charging profile applies. If evseId = 0, the message contains an overall limit for the Charging Station.
     * 
     * (Required)
     * 
     */
    private Integer evseId;

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
     * Id used to match the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt; message with the resulting ReportChargingProfilesRequest messages. When the CSMS provided a requestId in the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt;, this field SHALL contain the same value.
     * 
     * (Required)
     * 
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * Id used to match the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt; message with the resulting ReportChargingProfilesRequest messages. When the CSMS provided a requestId in the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt;, this field SHALL contain the same value.
     * 
     * (Required)
     * 
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * Source that has installed this charging profile.
     * 
     * (Required)
     * 
     */
    public ChargingLimitSourceEnum getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * Source that has installed this charging profile.
     * 
     * (Required)
     * 
     */
    public void setChargingLimitSource(ChargingLimitSourceEnum chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    /**
     * 
     * (Required)
     * 
     */
    public List<ChargingProfile> getChargingProfile() {
        return chargingProfile;
    }

    /**
     * 
     * (Required)
     * 
     */
    public void setChargingProfile(List<ChargingProfile> chargingProfile) {
        this.chargingProfile = chargingProfile;
    }

    /**
     * To Be Continued. Default value when omitted: false. false indicates that there are no further messages as part of this report.
     * 
     * 
     */
    public Boolean getTbc() {
        return tbc;
    }

    /**
     * To Be Continued. Default value when omitted: false. false indicates that there are no further messages as part of this report.
     * 
     * 
     */
    public void setTbc(Boolean tbc) {
        this.tbc = tbc;
    }

    /**
     * The evse to which the charging profile applies. If evseId = 0, the message contains an overall limit for the Charging Station.
     * 
     * (Required)
     * 
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The evse to which the charging profile applies. If evseId = 0, the message contains an overall limit for the Charging Station.
     * 
     * (Required)
     * 
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

}
