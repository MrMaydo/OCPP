package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ChargingProfilePurposeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.List;
import java.util.Objects;

public class ChargingProfileCriterion implements JsonInterface {

    /**
     * Defines the purpose of the schedule transferred by this profile
     */
    @Optional
    private ChargingProfilePurposeEnum chargingProfilePurpose;
    /**
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     */
    @Optional
    private Integer stackLevel;
    /**
     * List of all the chargingProfileIds requested. Any ChargingProfile that matches one of these profiles will be reported. If omitted, the Charging Station SHALL not filter on chargingProfileId. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-charging-profile-entries,ChargingProfileEntries.maxLimit&gt;&gt;
     */
    @Optional
    private List<Integer> chargingProfileId;
    /**
     * For which charging limit sources, charging profiles SHALL be reported. If omitted, the Charging Station SHALL not filter on chargingLimitSource. Values defined in Appendix as ChargingLimitSourceEnumStringType.
     */
    @Optional
    private List<String> chargingLimitSource;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ChargingProfileCriterion() {
    }

    /**
     * @param chargingProfileId   List of all the chargingProfileIds requested. Any ChargingProfile that matches one of these profiles will be reported. If omitted, the Charging Station SHALL not filter on chargingProfileId. This field SHALL NOT contain more ids than set in &lt;&lt;configkey-charging-profile-entries,ChargingProfileEntries.maxLimit&gt;&gt;
     *                            <p>
     *                            .
     * @param stackLevel          Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     *                            .
     * @param chargingLimitSource For which charging limit sources, charging profiles SHALL be reported. If omitted, the Charging Station SHALL not filter on chargingLimitSource. Values defined in Appendix as ChargingLimitSourceEnumStringType.
     *                            .
     */
    public ChargingProfileCriterion(ChargingProfilePurposeEnum chargingProfilePurpose, Integer stackLevel, List<Integer> chargingProfileId, List<String> chargingLimitSource, CustomData customData) {
        super();
        this.chargingProfilePurpose = chargingProfilePurpose;
        this.stackLevel = stackLevel;
        this.chargingProfileId = chargingProfileId;
        this.chargingLimitSource = chargingLimitSource;
        this.customData = customData;
    }

    /**
     * Defines the purpose of the schedule transferred by this profile
     */
    public ChargingProfilePurposeEnum getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    /**
     * Defines the purpose of the schedule transferred by this profile
     */
    public void setChargingProfilePurpose(ChargingProfilePurposeEnum chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }

    /**
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values. Lowest level is 0.
     */
    public Integer getStackLevel() {
        return stackLevel;
    }

    /**
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
     * For which charging limit sources, charging profiles SHALL be reported. If omitted, the Charging Station SHALL not filter on chargingLimitSource. Values defined in Appendix as ChargingLimitSourceEnumStringType.
     */
    public List<String> getChargingLimitSource() {
        return chargingLimitSource;
    }

    /**
     * For which charging limit sources, charging profiles SHALL be reported. If omitted, the Charging Station SHALL not filter on chargingLimitSource. Values defined in Appendix as ChargingLimitSourceEnumStringType.
     */
    public void setChargingLimitSource(List<String> chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
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
        if (!(obj instanceof ChargingProfileCriterion))
            return false;
        ChargingProfileCriterion that = (ChargingProfileCriterion) obj;
        return Objects.equals(this.chargingProfilePurpose, that.chargingProfilePurpose)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.stackLevel, that.stackLevel)
                && Objects.equals(this.chargingProfileId, that.chargingProfileId)
                && Objects.equals(this.chargingLimitSource, that.chargingLimitSource);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.chargingProfilePurpose != null ? this.chargingProfilePurpose.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.stackLevel != null ? this.stackLevel.hashCode() : 0);
        result = 31 * result + (this.chargingProfileId != null ? this.chargingProfileId.hashCode() : 0);
        result = 31 * result + (this.chargingLimitSource != null ? this.chargingLimitSource.hashCode() : 0);
        return result;
    }
}
