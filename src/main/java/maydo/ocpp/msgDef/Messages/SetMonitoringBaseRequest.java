package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.MonitoringBaseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the SetMonitoringBaseRequest PDU sent by the CSMS to the Charging Station.
 */
public class SetMonitoringBaseRequest implements JsonInterface {

    /**
     * Specify which monitoring base will be set
     */
    @Required
    private MonitoringBaseEnum monitoringBase;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public SetMonitoringBaseRequest() {
    }


    public MonitoringBaseEnum getMonitoringBase() {
        return monitoringBase;
    }


    public void setMonitoringBase(MonitoringBaseEnum monitoringBase) {
        this.monitoringBase = monitoringBase;
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

        json.addProperty("monitoringBase", getMonitoringBase().toString());

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
        if (jsonObject.has("monitoringBase")) {
            setMonitoringBase(MonitoringBaseEnum.valueOf(jsonObject.get("monitoringBase").getAsString()));
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
        if (!(obj instanceof SetMonitoringBaseRequest))
            return false;
        SetMonitoringBaseRequest that = (SetMonitoringBaseRequest) obj;
        return Objects.equals(this.monitoringBase, that.monitoringBase)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getMonitoringBase(),
                getCustomData()
        );
    }
}
