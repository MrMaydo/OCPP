package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.Enumerations.ChargingProfilePurposeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.Objects;

public class ClearChargingProfile implements JsonInterface {

    /**
     * Specifies the id of the EVSE for which to clear charging profiles. An evseId of zero (0) specifies the charging profile for the overall Charging Station. Absence of this parameter means the clearing applies to all charging profiles that match the other criteria in the request.
     */
    @Optional
    private Integer evseId;
    /**
     * Specifies to purpose of the charging profiles that will be cleared, if they meet the other criteria in the request.
     */
    @Optional
    private ChargingProfilePurposeEnum chargingProfilePurpose;
    /**
     * Specifies the stackLevel for which charging profiles will be cleared, if they meet the other criteria in the request.
     */
    @Optional
    private Integer stackLevel;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ClearChargingProfile() {
    }

    /**
     * @param evseId     Specifies the id of the EVSE for which to clear charging profiles. An evseId of zero (0) specifies the charging profile for the overall Charging Station. Absence of this parameter means the clearing applies to all charging profiles that match the other criteria in the request.
     *                   <p>
     *                   .
     * @param stackLevel Specifies the stackLevel for which charging profiles will be cleared, if they meet the other criteria in the request.
     *                   .
     */
    public ClearChargingProfile(Integer evseId, ChargingProfilePurposeEnum chargingProfilePurpose, Integer stackLevel, CustomData customData) {
        super();
        this.evseId = evseId;
        this.chargingProfilePurpose = chargingProfilePurpose;
        this.stackLevel = stackLevel;
        this.customData = customData;
    }

    /**
     * Specifies the id of the EVSE for which to clear charging profiles. An evseId of zero (0) specifies the charging profile for the overall Charging Station. Absence of this parameter means the clearing applies to all charging profiles that match the other criteria in the request.
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * Specifies the id of the EVSE for which to clear charging profiles. An evseId of zero (0) specifies the charging profile for the overall Charging Station. Absence of this parameter means the clearing applies to all charging profiles that match the other criteria in the request.
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Specifies to purpose of the charging profiles that will be cleared, if they meet the other criteria in the request.
     */
    public ChargingProfilePurposeEnum getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }

    /**
     * Specifies to purpose of the charging profiles that will be cleared, if they meet the other criteria in the request.
     */
    public void setChargingProfilePurpose(ChargingProfilePurposeEnum chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }

    /**
     * Specifies the stackLevel for which charging profiles will be cleared, if they meet the other criteria in the request.
     */
    public Integer getStackLevel() {
        return stackLevel;
    }

    /**
     * Specifies the stackLevel for which charging profiles will be cleared, if they meet the other criteria in the request.
     */
    public void setStackLevel(Integer stackLevel) {
        this.stackLevel = stackLevel;
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
        JsonObject json = new JsonObject();
        json.addProperty("evseId", evseId);
        json.addProperty("chargingProfilePurpose", chargingProfilePurpose.toString());
        json.addProperty("stackLevel", stackLevel);
        json.add("customData", customData.toJsonObject());
        return json;
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
        if (!(obj instanceof ClearChargingProfile))
            return false;
        ClearChargingProfile that = (ClearChargingProfile) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.chargingProfilePurpose, that.chargingProfilePurpose)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.stackLevel, that.stackLevel);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.chargingProfilePurpose != null ? this.chargingProfilePurpose.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.stackLevel != null ? this.stackLevel.hashCode() : 0);
        return result;
    }
}
