package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.GetCertificateStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the GetCertificateStatusResponse PDU sent by the CSMS to the Charging Station.
 */
public class GetCertificateStatusResponse implements JsonInterface {

    /**
     * This indicates whether the charging station was able to retrieve the OCSP certificate status.
     */
    @Required
    private GetCertificateStatusEnum status;

    /**
     * Detailed status information.
     */
    @Optional
    private StatusInfo statusInfo;

    /**
     * (2.1) OCSPResponse class as defined in IETF RFC 6960. DER encoded (as defined in IETF RFC 6960),
     * and then base64 encoded. MAY only be omitted when status is not Accepted.
     * The minimum supported length is 18000. If a longer ocspResult is supported, then the supported length
     * must be communicated in variable OCPPCommCtrlr.FieldLength[ "GetCertificateStatusResponse.ocspResult" ].
     */
    @Optional
    private String ocspResult;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public GetCertificateStatusResponse() {
    }


    public GetCertificateStatusEnum getStatus() {
        return status;
    }


    public void setStatus(GetCertificateStatusEnum status) {
        this.status = status;
    }


    public StatusInfo getStatusInfo() {
        return statusInfo;
    }


    public void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }


    public String getOcspResult() {
        return ocspResult;
    }


    public void setOcspResult(String ocspResult) {
        this.ocspResult = ocspResult;
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
        if (getOcspResult() != null) {
            json.addProperty("ocspResult", getOcspResult());
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
            setStatus(GetCertificateStatusEnum.valueOf(jsonObject.get("status").getAsString()));
        }

        if (jsonObject.has("statusInfo")) {
            setStatusInfo(new StatusInfo());
            getStatusInfo().fromJsonObject(jsonObject.getAsJsonObject("statusInfo"));
        }

        if (jsonObject.has("ocspResult")) {
            setOcspResult(jsonObject.get("ocspResult").getAsString());
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
        if (!(obj instanceof GetCertificateStatusResponse))
            return false;
        GetCertificateStatusResponse that = (GetCertificateStatusResponse) obj;
        return Objects.equals(getStatus(), that.getStatus())
                && Objects.equals(getStatusInfo(), that.getStatusInfo())
                && Objects.equals(getOcspResult(), that.getOcspResult())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getStatus(),
                getStatusInfo(),
                getOcspResult(),
                getCustomData()
        );
    }
}
