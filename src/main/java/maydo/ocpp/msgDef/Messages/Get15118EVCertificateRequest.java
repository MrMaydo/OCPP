package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.Enumerations.CertificateActionEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class Get15118EVCertificateRequest implements JsonInterface {

    /**
     * Schema version currently used for the 15118 session between EV and Charging Station. Needed for parsing of the EXI stream by the CSMS.
     * 
     * 
     * (Required)
     */
    @Required
    private String iso15118SchemaVersion;
    /**
     * Defines whether certificate needs to be installed or updated.
     * 
     * (Required)
     */
    @Required
    private CertificateActionEnum action;
    /**
     * *(2.1)* Raw CertificateInstallationReq request from EV, Base64 encoded. +
     * Extended to support ISO 15118-20 certificates. The minimum supported length is 11000. If a longer _exiRequest_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "Get15118EVCertificateRequest.exiRequest" ].
     * 
     * (Required)
     */
    @Required
    private String exiRequest;
    /**
     * *(2.1)* Absent during ISO 15118-2 session. Required during ISO 15118-20 session. +
     * Maximum number of contracts that EV wants to install.
     */
    @Optional
    private Integer maximumContractCertificateChains;
    /**
     * *(2.1)*  Absent during ISO 15118-2 session. Optional during ISO 15118-20 session. List of EMAIDs for which contract certificates must be requested first, in case there are more certificates than allowed by _maximumContractCertificateChains_.
     */
    @Optional
    private List<String> prioritizedEMAIDs;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public Get15118EVCertificateRequest() {
    }

    /**
     * 
     * @param iso15118SchemaVersion
     *     Schema version currently used for the 15118 session between EV and Charging Station. Needed for parsing of the EXI stream by the CSMS.
     *     
     *     .
     * @param prioritizedEMAIDs
     *     *(2.1)*  Absent during ISO 15118-2 session. Optional during ISO 15118-20 session. List of EMAIDs for which contract certificates must be requested first, in case there are more certificates than allowed by _maximumContractCertificateChains_.
     *     .
     * @param exiRequest
     *     *(2.1)* Raw CertificateInstallationReq request from EV, Base64 encoded. +
     *     Extended to support ISO 15118-20 certificates. The minimum supported length is 11000. If a longer _exiRequest_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "Get15118EVCertificateRequest.exiRequest" ].
     *     .
     * @param maximumContractCertificateChains
     *     *(2.1)* Absent during ISO 15118-2 session. Required during ISO 15118-20 session. +
     *     Maximum number of contracts that EV wants to install.
     *     .
     */
    public Get15118EVCertificateRequest(String iso15118SchemaVersion, CertificateActionEnum action, String exiRequest, Integer maximumContractCertificateChains, List<String> prioritizedEMAIDs, CustomData customData) {
        super();
        this.iso15118SchemaVersion = iso15118SchemaVersion;
        this.action = action;
        this.exiRequest = exiRequest;
        this.maximumContractCertificateChains = maximumContractCertificateChains;
        this.prioritizedEMAIDs = prioritizedEMAIDs;
        this.customData = customData;
    }

    /**
     * Schema version currently used for the 15118 session between EV and Charging Station. Needed for parsing of the EXI stream by the CSMS.
     * 
     * 
     * (Required)
     */
    public String getIso15118SchemaVersion() {
        return iso15118SchemaVersion;
    }

    /**
     * Schema version currently used for the 15118 session between EV and Charging Station. Needed for parsing of the EXI stream by the CSMS.
     * 
     * 
     * (Required)
     */
    public void setIso15118SchemaVersion(String iso15118SchemaVersion) {
        this.iso15118SchemaVersion = iso15118SchemaVersion;
    }

    /**
     * Defines whether certificate needs to be installed or updated.
     * 
     * (Required)
     */
    public CertificateActionEnum getAction() {
        return action;
    }

    /**
     * Defines whether certificate needs to be installed or updated.
     * 
     * (Required)
     */
    public void setAction(CertificateActionEnum action) {
        this.action = action;
    }

    /**
     * *(2.1)* Raw CertificateInstallationReq request from EV, Base64 encoded. +
     * Extended to support ISO 15118-20 certificates. The minimum supported length is 11000. If a longer _exiRequest_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "Get15118EVCertificateRequest.exiRequest" ].
     * 
     * (Required)
     */
    public String getExiRequest() {
        return exiRequest;
    }

    /**
     * *(2.1)* Raw CertificateInstallationReq request from EV, Base64 encoded. +
     * Extended to support ISO 15118-20 certificates. The minimum supported length is 11000. If a longer _exiRequest_ is supported, then the supported length must be communicated in variable OCPPCommCtrlr.FieldLength[ "Get15118EVCertificateRequest.exiRequest" ].
     * 
     * (Required)
     */
    public void setExiRequest(String exiRequest) {
        this.exiRequest = exiRequest;
    }

    /**
     * *(2.1)* Absent during ISO 15118-2 session. Required during ISO 15118-20 session. +
     * Maximum number of contracts that EV wants to install.
     */
    public Integer getMaximumContractCertificateChains() {
        return maximumContractCertificateChains;
    }

    /**
     * *(2.1)* Absent during ISO 15118-2 session. Required during ISO 15118-20 session. +
     * Maximum number of contracts that EV wants to install.
     */
    public void setMaximumContractCertificateChains(Integer maximumContractCertificateChains) {
        this.maximumContractCertificateChains = maximumContractCertificateChains;
    }

    /**
     * *(2.1)*  Absent during ISO 15118-2 session. Optional during ISO 15118-20 session. List of EMAIDs for which contract certificates must be requested first, in case there are more certificates than allowed by _maximumContractCertificateChains_.
     */
    public List<String> getPrioritizedEMAIDs() {
        return prioritizedEMAIDs;
    }

    /**
     * *(2.1)*  Absent during ISO 15118-2 session. Optional during ISO 15118-20 session. List of EMAIDs for which contract certificates must be requested first, in case there are more certificates than allowed by _maximumContractCertificateChains_.
     */
    public void setPrioritizedEMAIDs(List<String> prioritizedEMAIDs) {
        this.prioritizedEMAIDs = prioritizedEMAIDs;
    }

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

    @Override
    public String toString() {
        return toJsonObject().toString();
    }

    @Override
    public JsonObject toJsonObject() {
        return null;
    }

    @Override
    public void fromString(String jsonString) {
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
