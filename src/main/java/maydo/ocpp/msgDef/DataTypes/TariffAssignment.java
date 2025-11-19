package maydo.ocpp.msgDef.DataTypes;

import maydo.ocpp.msgDef.Enumerations.TariffKindEnum;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class TariffAssignment {

    /**
     * Tariff id.
     * 
     * (Required)
     */
    @Required
    private String tariffId;
    /**
     * Kind of tariff (driver/default)
     * 
     * (Required)
     */
    @Required
    private TariffKindEnum tariffKind;
    /**
     * Date/time when this tariff become active.
     */
    @Optional
    private Date validFrom*/
    @Optional
    private List<Integer> evseIds;
    /**
     * IdTokens related to tariff
     */
    @Optional
    private List<String> idTokens;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public TariffAssignment() {
    }

    /**
     * 
     * @param idTokens
     *     IdTokens related to tariff
     *     .
     * @param tariffId
     *     Tariff id.
     *     .
     * @param validFrom
     *     Date/time when this tariff become active.
     *     .
     */
    public TariffAssignment(String tariffId, TariffKindEnum tariffKind, Date validFrom, List<Integer> evseIds, List<String> idTokens, CustomData customData) {
        super();
        this.tariffId = tariffId;
        this.tariffKind = tariffKind;
        this.validFrom = validFrom;
        this.evseIds = evseIds;
        this.idTokens = idTokens;
        this.customData = customData;
    }

    /**
     * Tariff id.
     * 
     * (Required)
     */
    public String getTariffId() {
        return tariffId;
    }

    /**
     * Tariff id.
     * 
     * (Required)
     */
    public void setTariffId(String tariffId) {
        this.tariffId = tariffId;
    }

    /**
     * Kind of tariff (driver/default)
     * 
     * (Required)
     */
    public TariffKindEnum getTariffKind() {
        return tariffKind;
    }

    /**
     * Kind of tariff (driver/default)
     * 
     * (Required)
     */
    public void setTariffKind(TariffKindEnum tariffKind) {
        this.tariffKind = tariffKind;
    }

    /**
     * Date/time when this tariff become active.
     */
    public Date getValidFrom() {
        return validFrom;
    }

    /**
     * Date/time when this tariff become active.
     */
    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public List<Integer> getEvseIds() {
        return evseIds;
    }

    public void setEvseIds(List<Integer> evseIds) {
        this.evseIds = evseIds;
    }

    /**
     * IdTokens related to tariff
     */
    public List<String> getIdTokens() {
        return idTokens;
    }

    /**
     * IdTokens related to tariff
     */
    public void setIdTokens(List<String> idTokens) {
        this.idTokens = idTokens;
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
        if (!(obj instanceof TariffAssignment))
            return false;
        TariffAssignment that = (TariffAssignment) obj;
        return Objects.equals(this.tariffKind, that.tariffKind)
                && Objects.equals(this.evseIds, that.evseIds) 
                && Objects.equals(this.idTokens, that.idTokens) 
                && Objects.equals(this.customData, that.customData) 
                && Objects.equals(this.tariffId, that.tariffId) 
                && Objects.equals(this.validFrom, that.validFrom);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.tariffKind != null ? this.tariffKind.hashCode() : 0);
        result = 31 * result + (this.evseIds != null ? this.evseIds.hashCode() : 0);
        result = 31 * result + (this.idTokens != null ? this.idTokens.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.tariffId != null ? this.tariffId.hashCode() : 0);
        result = 31 * result + (this.validFrom != null ? this.validFrom.hashCode() : 0);
        return result;
    }
}
