
package maydo.ocpp.msgDef.Messages;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.ReportBaseEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.utils.JsonTools;

import javax.annotation.Generated;

public class GetBaseReportRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    /**
     * The Id of the request.
     * 
     * (Required)
     * 
     */
    private Integer requestId;
    /**
     * This field specifies the report base.
     * 
     * (Required)
     * 
     */
    private ReportBaseEnum reportBase;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    /**
     * The Id of the request.
     * 
     * (Required)
     * 
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of the request.
     * 
     * (Required)
     * 
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * This field specifies the report base.
     * 
     * (Required)
     * 
     */
    public ReportBaseEnum getReportBase() {
        return reportBase;
    }

    /**
     * This field specifies the report base.
     * 
     * (Required)
     * 
     */
    public void setReportBase(ReportBaseEnum reportBase) {
        this.reportBase = reportBase;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject(){
        return JsonTools.toJsonObject(this);
    }
}
