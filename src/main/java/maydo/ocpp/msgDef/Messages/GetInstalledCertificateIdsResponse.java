package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CertificateHashDataChain;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StatusInfo;
import maydo.ocpp.msgDef.Enumerations.GetInstalledCertificateStatusEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.List;
import java.util.Objects;

public class GetInstalledCertificateIdsResponse implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Charging Station indicates if it can process the request.
     * <p>
     * (Required)
     */
    @Required
    private GetInstalledCertificateStatusEnum status;
    /**
     * Element providing more information about the status.
     */
    @Optional
    private StatusInfo statusInfo;

    @Optional
    private List<CertificateHashDataChain> certificateHashDataChain = null;

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

    /**
     * Charging Station indicates if it can process the request.
     * <p>
     * (Required)
     */
    public GetInstalledCertificateStatusEnum getStatus() {
        return status;
    }

    /**
     * Charging Station indicates if it can process the request.
     * <p>
     * (Required)
     */
    public void setStatus(GetInstalledCertificateStatusEnum status) {
        this.status = status;
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

    public List<CertificateHashDataChain> getCertificateHashDataChain() {
        return certificateHashDataChain;
    }

    public void setCertificateHashDataChain(List<CertificateHashDataChain> certificateHashDataChain) {
        this.certificateHashDataChain = certificateHashDataChain;
    }

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return JsonTools.toJsonObject(this);
    }

    @Override
    public void fromString(String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        fromJsonObject(jsonObject);
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
        JsonTools.fromJsonObject(this, jsonObject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof GetInstalledCertificateIdsResponse))
            return false;
        GetInstalledCertificateIdsResponse that = (GetInstalledCertificateIdsResponse) obj;
        return Objects.equals(customData, that.customData)
                && status == that.status
                && Objects.equals(statusInfo, that.statusInfo)
                && Objects.equals(certificateHashDataChain, that.certificateHashDataChain);
    }

    @Override
    public int hashCode() {
        int result = (status != null ? status.hashCode() : 0);
        result = 31 * result + (statusInfo != null ? statusInfo.hashCode() : 0);
        result = 31 * result + (certificateHashDataChain != null ? certificateHashDataChain.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
