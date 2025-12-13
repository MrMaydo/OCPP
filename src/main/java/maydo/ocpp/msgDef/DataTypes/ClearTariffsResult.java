package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.Enumerations.TariffClearStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 *
 */
public class ClearTariffsResult implements JsonInterface {

    /**
     * Additional info on status
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     * Optional. Id of tariff for which status is reported.
     * If no tariffs were found, then this field is absent, and status will be  NoTariff.
     */
    @Optional
    private String tariffId;

    /**
     *
     */
    @Required
    private TariffClearStatusEnum status;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public ClearTariffsResult() {
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }


    public String getTariffId() {
        return tariffId;
    }


    public void setTariffId(String tariffId) {
        this.tariffId = tariffId;
    }


    public TariffClearStatusEnum getStatus() {
        return status;
    }


    public void setStatus(TariffClearStatusEnum status) {
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
        json.add("statusInfo", statusInfo.toJsonObject());
        json.addProperty("tariffId", tariffId);
        json.addProperty("status", status.toString());
        json.add("customData", customData.toJsonObject());
        return json;
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("tariffId")) {
            setTariffId(jsonObject.get("tariffId").getAsString());
        }

        if (jsonObject.has("status")) {
            setStatus(TariffClearStatusEnum.valueOf(jsonObject.get("status").getAsString()));
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
        if (!(obj instanceof ClearTariffsResult))
            return false;
        ClearTariffsResult that = (ClearTariffsResult) obj;
        return Objects.equals(this.customData, that.customData)
                && Objects.equals(this.statusInfo, that.statusInfo)
                && Objects.equals(this.tariffId, that.tariffId)
                && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.statusInfo != null ? this.statusInfo.hashCode() : 0);
        result = 31 * result + (this.tariffId != null ? this.tariffId.hashCode() : 0);
        result = 31 * result + (this.status != null ? this.status.hashCode() : 0);
        return result;
    }
}
