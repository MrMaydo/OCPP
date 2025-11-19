package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class GetTariffsRequest {

    /**
     * EVSE id to get tariff from. When _evseId_ = 0, this gets tariffs from all EVSEs.
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
    public GetTariffsRequest() {
    }

    /**
     * 
     * @param evseId
     *     EVSE id to get tariff from. When _evseId_ = 0, this gets tariffs from all EVSEs.
     *     .
     */
    public GetTariffsRequest(Integer evseId, CustomData customData) {
        super();
        this.evseId = evseId;
        this.customData = customData;
    }

    /**
     * EVSE id to get tariff from. When _evseId_ = 0, this gets tariffs from all EVSEs.
     * 
     * (Required)
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * EVSE id to get tariff from. When _evseId_ = 0, this gets tariffs from all EVSEs.
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetTariffsRequest))
            return false;
        GetTariffsRequest that = (GetTariffsRequest) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
