package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdTokenInfo;
import maydo.ocpp.msgDef.DataTypes.Tariff;
import maydo.ocpp.msgDef.Enumerations.AuthorizeCertificateStatusEnum;
import maydo.ocpp.msgDef.Enumerations.EnergyTransferModeEnum;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.List;
import java.util.Objects;

public class AuthorizeResponse implements JsonInterface {

    /**
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     * <p>
     * (Required)
     */
    @Required
    private IdTokenInfo idTokenInfo;
    /**
     * Certificate status information.
     * - if all certificates are valid: return 'Accepted'.
     * - if one of the certificates was revoked, return 'CertificateRevoked'.
     */
    @Optional
    private AuthorizeCertificateStatusEnum certificateStatus;
    /**
     * *(2.1)* List of allowed energy transfer modes the EV can choose from. If omitted this defaults to charging only.
     */
    @Optional
    private List<EnergyTransferModeEnum> allowedEnergyTransfer;
    /**
     * A tariff is described by fields with prices for:
     * energy,
     * charging time,
     * idle time,
     * fixed fee,
     * reservation time,
     * reservation fixed fee. +
     * Each of these fields may have (optional) conditions that specify when a price is applicable. +
     * The _description_ contains a human-readable explanation of the tariff to be shown to the user. +
     * The other fields are parameters that define the tariff. These are used by the charging station to calculate the price.
     */
    @Optional
    private Tariff tariff;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public AuthorizeResponse() {
    }

    /**
     * @param allowedEnergyTransfer *(2.1)* List of allowed energy transfer modes the EV can choose from. If omitted this defaults to charging only.
     *                              <p>
     *                              <p>
     *                              .
     */
    public AuthorizeResponse(IdTokenInfo idTokenInfo, AuthorizeCertificateStatusEnum certificateStatus, List<EnergyTransferModeEnum> allowedEnergyTransfer, Tariff tariff, CustomData customData) {
        super();
        this.idTokenInfo = idTokenInfo;
        this.certificateStatus = certificateStatus;
        this.allowedEnergyTransfer = allowedEnergyTransfer;
        this.tariff = tariff;
        this.customData = customData;
    }

    /**
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     * <p>
     * (Required)
     */
    public IdTokenInfo getIdTokenInfo() {
        return idTokenInfo;
    }

    /**
     * Contains status information about an identifier.
     * It is advised to not stop charging for a token that expires during charging, as ExpiryDate is only used for caching purposes. If ExpiryDate is not given, the status has no end date.
     * <p>
     * (Required)
     */
    public void setIdTokenInfo(IdTokenInfo idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
    }

    /**
     * Certificate status information.
     * - if all certificates are valid: return 'Accepted'.
     * - if one of the certificates was revoked, return 'CertificateRevoked'.
     */
    public AuthorizeCertificateStatusEnum getCertificateStatus() {
        return certificateStatus;
    }

    /**
     * Certificate status information.
     * - if all certificates are valid: return 'Accepted'.
     * - if one of the certificates was revoked, return 'CertificateRevoked'.
     */
    public void setCertificateStatus(AuthorizeCertificateStatusEnum certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    /**
     * *(2.1)* List of allowed energy transfer modes the EV can choose from. If omitted this defaults to charging only.
     */
    public List<EnergyTransferModeEnum> getAllowedEnergyTransfer() {
        return allowedEnergyTransfer;
    }

    /**
     * *(2.1)* List of allowed energy transfer modes the EV can choose from. If omitted this defaults to charging only.
     */
    public void setAllowedEnergyTransfer(List<EnergyTransferModeEnum> allowedEnergyTransfer) {
        this.allowedEnergyTransfer = allowedEnergyTransfer;
    }

    /**
     * A tariff is described by fields with prices for:
     * energy,
     * charging time,
     * idle time,
     * fixed fee,
     * reservation time,
     * reservation fixed fee. +
     * Each of these fields may have (optional) conditions that specify when a price is applicable. +
     * The _description_ contains a human-readable explanation of the tariff to be shown to the user. +
     * The other fields are parameters that define the tariff. These are used by the charging station to calculate the price.
     */
    public Tariff getTariff() {
        return tariff;
    }

    /**
     * A tariff is described by fields with prices for:
     * energy,
     * charging time,
     * idle time,
     * fixed fee,
     * reservation time,
     * reservation fixed fee. +
     * Each of these fields may have (optional) conditions that specify when a price is applicable. +
     * The _description_ contains a human-readable explanation of the tariff to be shown to the user. +
     * The other fields are parameters that define the tariff. These are used by the charging station to calculate the price.
     */
    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
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
        JsonObject json = new JsonObject();
        json.add("idTokenInfo", idTokenInfo.toJsonObject());
        json.addProperty("certificateStatus", certificateStatus.toString());
        json.add("tariff", tariff.toJsonObject());
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
        if (jsonObject.has("idTokenInfo")) {
            this.idTokenInfo = new IdTokenInfo();
            this.idTokenInfo.fromJsonObject(jsonObject.getAsJsonObject("idTokenInfo"));
        }

        if (jsonObject.has("certificateStatus")) {
            this.certificateStatus = AuthorizeCertificateStatusEnum.valueOf(jsonObject.get("certificateStatus").getAsString());
        }

        if (jsonObject.has("tariff")) {
            this.tariff = new Tariff();
            this.tariff.fromJsonObject(jsonObject.getAsJsonObject("tariff"));
        }

        if (jsonObject.has("customData")) {
            this.customData = new CustomData();
            this.customData.fromJsonObject(jsonObject.getAsJsonObject("customData"));
        }

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof AuthorizeResponse))
            return false;
        AuthorizeResponse that = (AuthorizeResponse) obj;
        return Objects.equals(this.tariff, that.tariff)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.certificateStatus, that.certificateStatus)
                && Objects.equals(this.allowedEnergyTransfer, that.allowedEnergyTransfer)
                && Objects.equals(this.idTokenInfo, that.idTokenInfo);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.tariff != null ? this.tariff.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.certificateStatus != null ? this.certificateStatus.hashCode() : 0);
        result = 31 * result + (this.allowedEnergyTransfer != null ? this.allowedEnergyTransfer.hashCode() : 0);
        result = 31 * result + (this.idTokenInfo != null ? this.idTokenInfo.hashCode() : 0);
        return result;
    }
}
