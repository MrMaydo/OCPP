package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.CertificateActionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;
import maydo.ocpp.utils.JsonTools;

import java.util.Objects;

public class Get15118EVCertificateRequest implements JsonInterface {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;
    /**
     * Schema version currently used for the 15118 session between EV and Charging Station. Needed for parsing of the EXI stream by the CSMS.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private String iso15118SchemaVersion;
    /**
     * Defines whether certificate needs to be installed or updated.
     * <p>
     * (Required)
     */
    @Required
    private CertificateActionEnum action;
    /**
     * Raw CertificateInstallationReq request from EV, Base64 encoded.
     * <p>
     * (Required)
     */
    @Required
    private String exiRequest;

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
     * Schema version currently used for the 15118 session between EV and Charging Station. Needed for parsing of the EXI stream by the CSMS.
     * <p>
     * <p>
     * (Required)
     */
    public String getIso15118SchemaVersion() {
        return iso15118SchemaVersion;
    }

    /**
     * Schema version currently used for the 15118 session between EV and Charging Station. Needed for parsing of the EXI stream by the CSMS.
     * <p>
     * <p>
     * (Required)
     */
    public void setIso15118SchemaVersion(String iso15118SchemaVersion) {
        this.iso15118SchemaVersion = iso15118SchemaVersion;
    }

    /**
     * Defines whether certificate needs to be installed or updated.
     * <p>
     * (Required)
     */
    public CertificateActionEnum getAction() {
        return action;
    }

    /**
     * Defines whether certificate needs to be installed or updated.
     * <p>
     * (Required)
     */
    public void setAction(CertificateActionEnum action) {
        this.action = action;
    }

    /**
     * Raw CertificateInstallationReq request from EV, Base64 encoded.
     * <p>
     * (Required)
     */
    public String getExiRequest() {
        return exiRequest;
    }

    /**
     * Raw CertificateInstallationReq request from EV, Base64 encoded.
     * <p>
     * (Required)
     */
    public void setExiRequest(String exiRequest) {
        this.exiRequest = exiRequest;
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
        if (!(obj instanceof Get15118EVCertificateRequest))
            return false;
        Get15118EVCertificateRequest that = (Get15118EVCertificateRequest) obj;
        return Objects.equals(customData, that.customData)
                && Objects.equals(iso15118SchemaVersion, that.iso15118SchemaVersion)
                && action == that.action && Objects.equals(exiRequest, that.exiRequest);
    }

    @Override
    public int hashCode() {
        int result = (iso15118SchemaVersion != null ? iso15118SchemaVersion.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (exiRequest != null ? exiRequest.hashCode() : 0);
        result = 31 * result + (customData != null ? customData.hashCode() : 0);
        return result;
    }
}
