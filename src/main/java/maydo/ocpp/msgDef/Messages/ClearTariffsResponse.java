package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.ClearTariffsResult;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class ClearTariffsResponse implements JsonInterface {

    /**
     * 
     * (Required)
     */
    @Required
    private List<ClearTariffsResult> clearTariffsResult;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public ClearTariffsResponse() {
    }

    public ClearTariffsResponse(List<ClearTariffsResult> clearTariffsResult, CustomData customData) {
        super();
        this.clearTariffsResult = clearTariffsResult;
        this.customData = customData;
    }

    /**
     * 
     * (Required)
     */
    public List<ClearTariffsResult> getClearTariffsResult() {
        return clearTariffsResult;
    }

    /**
     * 
     * (Required)
     */
    public void setClearTariffsResult(List<ClearTariffsResult> clearTariffsResult) {
        this.clearTariffsResult = clearTariffsResult;
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
        if (!(obj instanceof ClearTariffsResponse))
            return false;
        ClearTariffsResponse that = (ClearTariffsResponse) obj;
        return Objects.equals(this.clearTariffsResult, that.clearTariffsResult)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.clearTariffsResult != null ? this.clearTariffsResult.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
