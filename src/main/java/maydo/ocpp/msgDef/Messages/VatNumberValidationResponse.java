package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.Address;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.GenericStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class VatNumberValidationResponse implements JsonInterface {

    /**
     * Result of operation.
     */
    @Required
    private GenericStatusEnum status;

    /**
     * Additional info on status
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     * VAT number that was requested.
     */
    @Required
    private String vatNumber;

    /**
     * Company address associated with vatNumber.
     */
    @Optional
    private Address company;

    /**
     * EVSE id for which check was requested.
     */
    @Optional
    private Integer evseId;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public VatNumberValidationResponse() {
    }


    public Address getCompany() {
        return company;
    }


    public void setCompany(Address company) {
        this.company = company;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }


    public String getVatNumber() {
        return vatNumber;
    }


    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }


    public Integer getEvseId() {
        return evseId;
    }


    public void setEvseId(Integer evseId) {
        this.evseId = evseId;
    }


    public GenericStatusEnum getStatus() {
        return status;
    }


    public void setStatus(GenericStatusEnum status) {
        this.status = status;
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

        json.addProperty("status", getStatus().toString());

        if (getStatusInfo() != null) {
            json.add("statusInfo", getStatusInfo().toJsonObject());
        }
        json.addProperty("vatNumber", getVatNumber());

        if (getCompany() != null) {
            json.add("company", getCompany().toJsonObject());
        }
        if (getEvseId() != null) {
            json.addProperty("evseId", getEvseId());
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
        if (jsonObject.has("status")) {
            setStatus(GenericStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("vatNumber")) {
            setVatNumber(jsonObject.get("vatNumber").getAsString());
        }

        if (jsonObject.has("company")) {
            setCompany(new Address());
            getCompany().fromJsonObject(jsonObject.getAsJsonObject("company"));
        }

        if (jsonObject.has("evseId")) {
            setEvseId(jsonObject.get("evseId").getAsInt());
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
        if (!(obj instanceof VatNumberValidationResponse))
            return false;
        VatNumberValidationResponse that = (VatNumberValidationResponse) obj;
        return Objects.equals(getStatus(), that.getStatus())
                && Objects.equals(getStatusInfo(), that.getStatusInfo())
                && Objects.equals(getVatNumber(), that.getVatNumber())
                && Objects.equals(getCompany(), that.getCompany())
                && Objects.equals(getEvseId(), that.getEvseId())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getStatus(),
                getStatusInfo(),
                getVatNumber(),
                getCompany(),
                getEvseId(),
                getCustomData()
        );
    }
}
