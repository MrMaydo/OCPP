package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.ChargingLimitSourceEnum;
import maydo.ocpp.msgDef.Enumerations.ChargingProfilePurposeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;


/**
 * Charging_ Profile
 * urn:x-oca:ocpp:uid:2:233255
 * A ChargingProfile consists of ChargingSchedule, describing the amount of power or current that can be delivered per time interval.
 */
public class ChargingProfileCriterion implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Charging_ Profile. Charging_ Profile_ Purpose. Charging_ Profile_ Purpose_ Code
     * urn:x-oca:ocpp:uid:1:569231
     * Defines the purpose of the schedule transferred by this profile
     */
    @Optional
    private ChargingProfilePurposeEnum chargingProfilePurpose;
    /**
     * Charging_ Profile. Stack_ Level. Counter
     * urn:x-oca:ocpp:uid:1:569230
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     */
    @Optional
    private Integer stackLevel;
    /**
     * List of all the chargingProfileIds requested. Any ChargingProfile that matches one of these profiles will be reported. If omitted, the Charging Station SHALL not filter on chargingProfileId. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-charging-profile-entries,ChargingProfileEntries.maxLimit&gt;&gt;
     */
    @Optional
    private List<Integer> chargingProfileId = null;
    /**
     * For which charging limit sources, charging profiles SHALL be reported. If omitted, the Charging Station SHALL not filter on chargingLimitSource.
     */
    @Optional
    private List<ChargingLimitSourceEnum> chargingLimitSource = null;

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
     * Charging_ Profile. Charging_ Profile_ Purpose. Charging_ Profile_ Purpose_ Code
     * urn:x-oca:ocpp:uid:1:569231
     * Defines the purpose of the schedule transferred by this profile
     */
    public ChargingProfilePurposeEnum getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    /**
     * Charging_ Profile. Charging_ Profile_ Purpose. Charging_ Profile_ Purpose_ Code
     * urn:x-oca:ocpp:uid:1:569231
     * Defines the purpose of the schedule transferred by this profile
     */
    public void setChargingProfilePurpose(ChargingProfilePurposeEnum chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }

    /**
     * Charging_ Profile. Stack_ Level. Counter
     * urn:x-oca:ocpp:uid:1:569230
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     */
    public Integer getStackLevel() {
        return stackLevel;
    }

    /**
     * Charging_ Profile. Stack_ Level. Counter
     * urn:x-oca:ocpp:uid:1:569230
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     */
    public void setStackLevel(Integer stackLevel) {
        this.stackLevel = stackLevel;
    }

    /**
     * List of all the chargingProfileIds requested. Any ChargingProfile that matches one of these profiles will be reported. If omitted, the Charging Station SHALL not filter on chargingProfileId. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-charging-profile-entries,ChargingProfileEntries.maxLimit&gt;&gt;
     */
    public List<Integer> getChargingProfileId() {
        return chargingProfileId;
    }

    /**
     * List of all the chargingProfileIds requested. Any ChargingProfile that matches one of these profiles will be reported. If omitted, the Charging Station SHALL not filter on chargingProfileId. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-charging-profile-entries,ChargingProfileEntries.maxLimit&gt;&gt;
     */
    public void setChargingProfileId(List<Integer> chargingProfileId) {
        this.chargingProfileId = chargingProfileId;
    }

    /**
     * For which charging limit sources, charging profiles SHALL be reported. If omitted, the Charging Station SHALL not filter on chargingLimitSource.
     */
    public List<ChargingLimitSourceEnum> getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * For which charging limit sources, charging profiles SHALL be reported. If omitted, the Charging Station SHALL not filter on chargingLimitSource.
     */
    public void setChargingLimitSource(List<ChargingLimitSourceEnum> chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof ChargingProfileCriterion))
            return false;
        ChargingProfileCriterion that = (ChargingProfileCriterion) obj;
        return Objects.equals(customData, that.customData)
                && chargingProfilePurpose == that.chargingProfilePurpose
                && Objects.equals(stackLevel, that.stackLevel)
                && Objects.equals(chargingProfileId, that.chargingProfileId)
                && Objects.equals(chargingLimitSource, that.chargingLimitSource);
    }

    @Override
    public int hashCode() {
        int result = (chargingProfilePurpose != null ? chargingProfilePurpose.hashCode() : 0);
        result = 31 * result + (stackLevel != null ? stackLevel.hashCode() : 0);
        result = 31 * result + (chargingProfileId != null ? chargingProfileId.hashCode() : 0);
        result = 31 * result + (chargingLimitSource != null ? chargingLimitSource.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
