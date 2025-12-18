package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.ComponentVariable;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.MonitoringCriterionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This contains the field definition of the GetMonitoringReportRequest PDU sent by the CSMS to the Charging Station.
 */
public class GetMonitoringReportRequest implements JsonInterface {

    /**
     * This field specifies the components and variables for which a monitoring report is requested.
     */
    @Optional
    private List<ComponentVariable> componentVariable;

    /**
     * The Id of the request.
     */
    @Required
    private Integer requestId;

    /**
     * This field contains criteria for components for which a monitoring report is requested
     */
    @Optional
    private List<MonitoringCriterionEnum> monitoringCriteria;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetMonitoringReportRequest() {
    }


    public List<ComponentVariable> getComponentVariable() {
        return componentVariable;
    }

    public void setComponentVariable(List<ComponentVariable> componentVariable) {
        this.componentVariable = componentVariable;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public List<MonitoringCriterionEnum> getMonitoringCriteria() {
        return monitoringCriteria;
    }


    public void setMonitoringCriteria(List<MonitoringCriterionEnum> monitoringCriteria) {
        this.monitoringCriteria = monitoringCriteria;
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

        if (getComponentVariable() != null) {
            JsonArray componentVariableArray = new JsonArray();
            for (ComponentVariable item : getComponentVariable()) {
                componentVariableArray.add(item.toJsonObject());
            }
            json.add("componentVariable", componentVariableArray);
        }
        json.addProperty("requestId", getRequestId());

        if (getMonitoringCriteria() != null) {
            JsonArray monitoringCriteriaArray = new JsonArray();
            for (MonitoringCriterionEnum item : getMonitoringCriteria()) {
                monitoringCriteriaArray.add(item.toString());
            }
            json.add("monitoringCriteria", monitoringCriteriaArray);
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
        if (jsonObject.has("componentVariable")) {
            setComponentVariable(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("componentVariable");
            for (JsonElement el : arr) {
                ComponentVariable item = new ComponentVariable();
                item.fromJsonObject(el.getAsJsonObject());
                getComponentVariable().add(item);
            }
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("monitoringCriteria")) {
            setMonitoringCriteria(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("monitoringCriteria");
            for (JsonElement el : arr) {
                getMonitoringCriteria().add(MonitoringCriterionEnum.valueOf(el.getAsString()));
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
        if (!(obj instanceof GetMonitoringReportRequest))
            return false;
        GetMonitoringReportRequest that = (GetMonitoringReportRequest) obj;
        return Objects.equals(getComponentVariable(), that.getComponentVariable())
                && Objects.equals(getRequestId(), that.getRequestId())
                && Objects.equals(getMonitoringCriteria(), that.getMonitoringCriteria())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getComponentVariable(),
                getRequestId(),
                getMonitoringCriteria(),
                getCustomData()
        );
    }
}
