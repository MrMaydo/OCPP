package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.Address;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.GenericStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class VatNumberValidationResponse implements JsonInterface {

    /**
     * *(2.1)* A generic address format.
     */
    @Optional
    private Address company;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;
    /**
     * VAT number that was requested.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String vatNumber;
    /**
     * EVSE id for which check was requested.
     */
    @Optional
    private Integer evseId;
    /**
     * Result of operation.
     * <p>
     * (Required)
     */
    @Required
    private GenericStatusEnum status;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public VatNumberValidationResponse() {
    }

    /**
     * @param evseId    EVSE id for which check was requested.
     *                  <p>
     *                  .
     * @param vatNumber VAT number that was requested.
     *                  <p>
     *                  .
     */
    public VatNumberValidationResponse(Address company, StatusInfo statusInfo, String vatNumber, Integer evseId, GenericStatusEnum status, CustomData customData) {
        super();
        this.company = company;
        this.statusInfo = statusInfo;
        this.vatNumber = vatNumber;
        this.evseId = evseId;
        this.status = status;
        this.customData = customData;
    }

    /**
     * *(2.1)* A generic address format.
     */
    public Address getCompany() {
        return company;
    }

    /**
     * *(2.1)* A generic address format.
     */
    public void setCompany(Address company) {
        this.company = company;
    }

    /**
     * Element providing more information about the status.
     */
    public StatusInfo getStatusInfo() {
        return statusInfo;
    }

    /**
     * Element providing more information about the status.
     */
    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    /**
     * VAT number that was requested.
     * <p>
     * <p>
     * (Required)
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * VAT number that was requested.
     * <p>
     * <p>
     * (Required)
     */
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    /**
     * EVSE id for which check was requested.
     */
    public Integer getEvseId() {
        return evseId;
    }

    /**
     * EVSE id for which check was requested.
     */
    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }

    /**
     * Result of operation.
     * <p>
     * (Required)
     */
    public GenericStatusEnum getStatus() {
        return status;
    }

    /**
     * Result of operation.
     * <p>
     * (Required)
     */
    public void setStatus(GenericStatusEnum status) {
        this.status = status;
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
        json.add("company", company.toJsonObject());
        json.add("statusInfo", statusInfo.toJsonObject());
        json.addProperty("vatNumber", vatNumber);
        json.addProperty("evseId", evseId);
        json.addProperty("status", status.toString());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("company")) {
            this.company = new Address();
            this.company.fromJsonObject(jsonObject.getAsJsonObject("company"));
        }

        if (jsonObject.has("statusInfo")) {
            this.statusInfo = new StatusInfo();
            this.statusInfo.fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("vatNumber")) {
            this.vatNumber = jsonObject.get("vatNumber").getAsString();
        }

        if (jsonObject.has("evseId")) {
            this.evseId = jsonObject.get("evseId").getAsInt();
        }

        if (jsonObject.has("status")) {
            this.status = GenericStatusEnum.valueOf(jsonObject.get("status").getAsString());
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof VatNumberValidationResponse))
            return false;
        VatNumberValidationResponse that = (VatNumberValidationResponse) obj;
        return Objects.equals(this.evseId, that.evseId)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.company, that.company)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.vatNumber, that.vatNumber)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.evseId != null ? this.evseId.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.company != null ? this.company.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.vatNumber != null ? this.vatNumber.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
