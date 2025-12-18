package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.DataTypes.TariffAssignment;
import maydo.ocpp.msgDef.Enumerations.TariffGetStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
public class GetTariffsResponse implements JsonInterface {

    /**
     * Status of operation
     */
    @Required
    private TariffGetStatusEnum status;

    /**
     * Details status information
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     * Installed default and user-specific tariffs per EVSE
     */
    @Optional
    private List<TariffAssignment> tariffAssignments;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetTariffsResponse() {
    }


    public TariffGetStatusEnum getStatus() {
        return status;
    }


    public void setStatus(TariffGetStatusEnum status) {
        this.status = status;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    public List<TariffAssignment> getTariffAssignments() {
        return tariffAssignments;
    }

    public void setTariffAssignments(List<TariffAssignment> tariffAssignments) {
        this.tariffAssignments = tariffAssignments;
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
        if (getTariffAssignments() != null) {
            JsonArray tariffAssignmentsArray = new JsonArray();
            for (TariffAssignment item : getTariffAssignments()) {
                tariffAssignmentsArray.add(item.toJsonObject());
            }
            json.add("tariffAssignments", tariffAssignmentsArray);
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
            setStatus(TariffGetStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("tariffAssignments")) {
            setTariffAssignments(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("tariffAssignments");
            for (JsonElement el : arr) {
                TariffAssignment item = new TariffAssignment();
                item.fromJsonObject(el.getAsJsonObject());
                getTariffAssignments().add(item);
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
        if (!(obj instanceof GetTariffsResponse))
            return false;
        GetTariffsResponse that = (GetTariffsResponse) obj;
        return Objects.equals(getStatus(), that.getStatus())
                && Objects.equals(getStatusInfo(), that.getStatusInfo())
                && Objects.equals(getTariffAssignments(), that.getTariffAssignments())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getStatus(),
                getStatusInfo(),
                getTariffAssignments(),
                getCustomData()
        );
    }
}
