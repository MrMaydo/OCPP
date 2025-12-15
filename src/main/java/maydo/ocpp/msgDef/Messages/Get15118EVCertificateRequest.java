package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.CertificateActionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This message is sent by the Charging Station to the CSMS if an ISO 15118 vehicle selects the service Certificate installation.
 * NOTE:
 * This message is based on CertificateInstallationReq Res from ISO 15118 2.
 */
public class Get15118EVCertificateRequest implements JsonInterface {

    /**
     * Schema version currently used for the 15118 session between EV and Charging Station.
     * Needed for parsing of the EXI stream by the CSMS.
     */
    @Required
    private String iso15118SchemaVersion;

    /**
     * Defines whether certificate needs to be installed or updated.
     */
    @Required
    private CertificateActionEnum action;

    /**
     * (2.1) Raw CertificateInstallationReq request from EV, Base64 encoded. Extended to support ISO 15118-20 certificates.
     * The minimum supported length is 11000. If a longer exiRequest is supported,
     * then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "Get15118EVCertificateRequest.exiRequest" ].
     */
    @Required
    private String exiRequest;

    /**
     * (2.1) Absent during ISO 15118-2 session. Required during ISO 15118-20 session.
     * Maximum number of contracts that EV wants to install.
     */
    @Optional
    private Integer maximumContractCertificateChains;

    /**
     * (2.1) Absent during ISO 15118-2 session. Optional during ISO 15118-20 session.
     * List of EMAIDs for which contract certificates must be requested first,
     * in case there are more certificates than allowed by maximumContractCertificateChains.
     */
    @Optional
    private List<String> prioritizedEMAIDs;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Get15118EVCertificateRequest() {
    }


    public String getIso15118SchemaVersion() {
        return iso15118SchemaVersion;
    }


    public void setIso15118SchemaVersion(String iso15118SchemaVersion) {
        this.iso15118SchemaVersion = iso15118SchemaVersion;
    }


    public CertificateActionEnum getAction() {
        return action;
    }


    public void setAction(CertificateActionEnum action) {
        this.action = action;
    }


    public String getExiRequest() {
        return exiRequest;
    }


    public void setExiRequest(String exiRequest) {
        this.exiRequest = exiRequest;
    }


    public Integer getMaximumContractCertificateChains() {
        return maximumContractCertificateChains;
    }


    public void setMaximumContractCertificateChains(Integer maximumContractCertificateChains) {
        this.maximumContractCertificateChains = maximumContractCertificateChains;
    }


    public List<String> getPrioritizedEMAIDs() {
        return prioritizedEMAIDs;
    }


    public void setPrioritizedEMAIDs(List<String> prioritizedEMAIDs) {
        this.prioritizedEMAIDs = prioritizedEMAIDs;
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

        json.addProperty("iso15118SchemaVersion", getIso15118SchemaVersion());

        json.addProperty("action", getAction().toString());

        json.addProperty("exiRequest", getExiRequest());

        if (getMaximumContractCertificateChains() != null) {
            json.addProperty("maximumContractCertificateChains", getMaximumContractCertificateChains());
        }
        if (getPrioritizedEMAIDs() != null) {
            JsonArray prioritizedEMAIDsArray = new JsonArray();
            for (String item : getPrioritizedEMAIDs()) {
                prioritizedEMAIDsArray.add(item);
            }
            json.add("prioritizedEMAIDs", prioritizedEMAIDsArray);
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
        if (jsonObject.has("iso15118SchemaVersion")) {
            setIso15118SchemaVersion(jsonObject.get("iso15118SchemaVersion").getAsString());
        }

        if (jsonObject.has("action")) {
            setAction(CertificateActionEnum.valueOf(jsonObject.get("action").getAsString()));
        }

        if (jsonObject.has("exiRequest")) {
            setExiRequest(jsonObject.get("exiRequest").getAsString());
        }

        if (jsonObject.has("maximumContractCertificateChains")) {
            setMaximumContractCertificateChains(jsonObject.get("maximumContractCertificateChains").getAsInt());
        }

        if (jsonObject.has("prioritizedEMAIDs")) {
            setPrioritizedEMAIDs(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("prioritizedEMAIDs");
            for (JsonElement el : arr) {
                getPrioritizedEMAIDs().add(el.getAsString());
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
        if (!(obj instanceof Get15118EVCertificateRequest))
            return false;
        Get15118EVCertificateRequest that = (Get15118EVCertificateRequest) obj;
        return Objects.equals(this.iso15118SchemaVersion, that.iso15118SchemaVersion)
                && Objects.equals(this.prioritizedEMAIDs, that.prioritizedEMAIDs)
                && Objects.equals(this.action, that.action)
                && Objects.equals(this.exiRequest, that.exiRequest)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.maximumContractCertificateChains, that.maximumContractCertificateChains);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.iso15118SchemaVersion != null ? this.iso15118SchemaVersion.hashCode() : 0);
        result = 31 * result + (this.prioritizedEMAIDs != null ? this.prioritizedEMAIDs.hashCode() : 0);
        result = 31 * result + (this.action != null ? this.action.hashCode() : 0);
        result = 31 * result + (this.exiRequest != null ? this.exiRequest.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.maximumContractCertificateChains != null ? this.maximumContractCertificateChains.hashCode() : 0);
        return result;
    }
}
