package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.ChargingProfile;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ChargingLimitSourceEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import java.util.List;

public class ReportChargingProfilesRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    private CustomData customData;
    /**
     * Id used to match the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt; message with the resulting ReportChargingProfilesRequest messages. When the CSMS provided a requestId in the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt;, this field SHALL contain the same value.
     * <p>
     * (Required)
     */
    private Integer requestId;
    /**
     * Source that has installed this charging profile.
     * <p>
     * (Required)
     */
    private ChargingLimitSourceEnum chargingLimitSource;
    /**
     * (Required)
     */
    private List<ChargingProfile> chargingProfile = null;
    /**
     * To Be Continued. Default value when omitted: false. false indicates that there are no further messages as part of this report.
     */
    private Boolean tbc = false;
    /**
     * The evse to which the charging profile applies. If evseId = 0, the message contains an overall limit for the Charging Station.
     * <p>
     * (Required)
     */
    private Integer evseId;

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

    /**
     * Id used to match the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt; message with the resulting ReportChargingProfilesRequest messages. When the CSMS provided a requestId in the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt;, this field SHALL contain the same value.
     * <p>
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * Id used to match the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt; message with the resulting ReportChargingProfilesRequest messages. When the CSMS provided a requestId in the &lt;&lt;getchargingprofilesrequest, GetChargingProfilesRequest&gt;&gt;, this field SHALL contain the same value.
     * <p>
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * Source that has installed this charging profile.
     * <p>
     * (Required)
     */
    public ChargingLimitSourceEnum getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * Source that has installed this charging profile.
     * <p>
     * (Required)
     */
    public void setChargingLimitSource(ChargingLimitSourceEnum chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    /**
     * (Required)
     */
    public List<ChargingProfile> getChargingProfile() {
        return chargingProfile;
    }

    /**
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
     * <p>
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * The evse to which the charging profile applies. If evseId = 0, the message contains an overall limit for the Charging Station.
     * <p>
     * (Required)
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }
}
