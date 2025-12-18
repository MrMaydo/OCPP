package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.ChargingProfilePurposeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A ChargingProfileCriterionType is a filter for charging profiles to be selected by a GetChargingProfilesRequest.
 */
public class ChargingProfileCriterion implements JsonInterface {

    /**
     * Defines the purpose of the schedule transferred by this profile
     */
    @Optional
    private ChargingProfilePurposeEnum chargingProfilePurpose;

    /**
     * Value determining level in hierarchy stack of profiles. Higher values have precedence over lower values.
     * Lowest level is 0.
     */
    @Optional
    private Integer stackLevel;

    /**
     * List of all the chargingProfileIds requested. Any ChargingProfile that matches one of these profiles will be reported.
     * If omitted, the Charging Station SHALL not filter on chargingProfileId. This field SHALL NOT contain more ids than set in ChargingProfileEntries.maxLimit
     */
    @Optional
    private List<Integer> chargingProfileId;

    /**
     * For which charging limit sources, charging profiles SHALL be reported.
     * If omitted, the Charging Station SHALL not filter on chargingLimitSource.
     * Values defined in Appendix as ChargingLimitSourceEnumStringType.
     */
    @Optional
    private List<String> chargingLimitSource;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ChargingProfileCriterion() {
    }


    public ChargingProfilePurposeEnum getChargingProfilePurpose() {
        return chargingProfilePurpose;
    }


    public void setChargingProfilePurpose(ChargingProfilePurposeEnum chargingProfilePurpose) {
        this.chargingProfilePurpose = chargingProfilePurpose;
    }


    public Integer getStackLevel() {
        return stackLevel;
    }


    public void setStackLevel(Integer stackLevel) {
        this.stackLevel = stackLevel;
    }


    public List<Integer> getChargingProfileId() {
        return chargingProfileId;
    }


    public void setChargingProfileId(List<Integer> chargingProfileId) {
        this.chargingProfileId = chargingProfileId;
    }


    public List<String> getChargingLimitSource() {
        return chargingLimitSource;
    }


    public void setChargingLimitSource(List<String> chargingLimitSource) {
        this.chargingLimitSource = chargingLimitSource;
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

        if (getChargingProfilePurpose() != null) {
            json.addProperty("chargingProfilePurpose", getChargingProfilePurpose().toString());
        }
        if (getStackLevel() != null) {
            json.addProperty("stackLevel", getStackLevel());
        }
        if (getChargingProfileId() != null) {
            JsonArray chargingProfileIdArray = new JsonArray();
            for (Integer item : getChargingProfileId()) {
                chargingProfileIdArray.add(item);
            }
            json.add("chargingProfileId", chargingProfileIdArray);
        }
        if (getChargingLimitSource() != null) {
            JsonArray chargingLimitSourceArray = new JsonArray();
            for (String item : getChargingLimitSource()) {
                chargingLimitSourceArray.add(item);
            }
            json.add("chargingLimitSource", chargingLimitSourceArray);
        }
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
        if (jsonObject.has("chargingProfilePurpose")) {
            setChargingProfilePurpose(ChargingProfilePurposeEnum.valueOf(jsonObject.get("chargingProfilePurpose").getAsString()));
        }

        if (jsonObject.has("stackLevel")) {
            setStackLevel(jsonObject.get("stackLevel").getAsInt());
        }

        if (jsonObject.has("chargingProfileId")) {
            setChargingProfileId(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("chargingProfileId");
            for (JsonElement el : arr) {
                getChargingProfileId().add(el.getAsInt());
            }
        }

        if (jsonObject.has("chargingLimitSource")) {
            setChargingLimitSource(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("chargingLimitSource");
            for (JsonElement el : arr) {
                getChargingLimitSource().add(el.getAsString());
            }
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
        return Objects.hash(
                getChargingProfilePurpose(),
                getStackLevel(),
                getChargingProfileId(),
                getChargingLimitSource(),
                getCustomData()
        );
    }
}
