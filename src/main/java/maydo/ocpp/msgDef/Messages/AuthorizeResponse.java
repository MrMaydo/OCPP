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

/**
 * This contains the field definition of the AuthorizeResponse PDU sent by the CSMS to the Charging Station in response to an
 * AuthorizeRequest.
 */
public class AuthorizeResponse implements JsonInterface {

    /**
     * This contains information about authorization status, expiry and group id.
     */
    @Required
    private IdTokenInfo idTokenInfo;

    /**
     * Certificate status information:
     * <p> - if all certificates are valid, return: 'Accepted'. </p>
     * <p> - if one of the certificates was revoked, return: 'CertificateRevoked'. </p>
     */
    @Optional
    private AuthorizeCertificateStatusEnum certificateStatus;

    /**
     * (2.1) List of allowed energy transfer modes the EV can choose from. If omitted this defaults to charging only.
     */
    @Optional
    private List<EnergyTransferModeEnum> allowedEnergyTransfer;

    /**
     * (2.1) Tariff for this idToken.
     */
    @Optional
    private Tariff tariff;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public AuthorizeResponse() {
    }


    public AuthorizeResponse(IdTokenInfo idTokenInfo, AuthorizeCertificateStatusEnum certificateStatus, List<EnergyTransferModeEnum> allowedEnergyTransfer, Tariff tariff, CustomData customData) {
        super();
        this.idTokenInfo = idTokenInfo;
        this.certificateStatus = certificateStatus;
        this.allowedEnergyTransfer = allowedEnergyTransfer;
        this.tariff = tariff;
        this.customData = customData;
    }


    public IdTokenInfo getIdTokenInfo() {
        return idTokenInfo;
    }


    public void setIdTokenInfo(IdTokenInfo idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
    }


    public AuthorizeCertificateStatusEnum getCertificateStatus() {
        return certificateStatus;
    }


    public void setCertificateStatus(AuthorizeCertificateStatusEnum certificateStatus) {
        this.certificateStatus = certificateStatus;
    }


    public List<EnergyTransferModeEnum> getAllowedEnergyTransfer() {
        return allowedEnergyTransfer;
    }


    public void setAllowedEnergyTransfer(List<EnergyTransferModeEnum> allowedEnergyTransfer) {
        this.allowedEnergyTransfer = allowedEnergyTransfer;
    }


    public Tariff getTariff() {
        return tariff;
    }


    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
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
