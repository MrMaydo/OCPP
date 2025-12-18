package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
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

import java.util.ArrayList;
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

        json.add("idTokenInfo", getIdTokenInfo().toJsonObject());

        if (getCertificateStatus() != null) {
            json.addProperty("certificateStatus", getCertificateStatus().toString());
        }
        if (getAllowedEnergyTransfer() != null) {
            JsonArray allowedEnergyTransferArray = new JsonArray();
            for (EnergyTransferModeEnum item : getAllowedEnergyTransfer()) {
                allowedEnergyTransferArray.add(item.toString());
            }
            json.add("allowedEnergyTransfer", allowedEnergyTransferArray);
        }
        if (getTariff() != null) {
            json.add("tariff", getTariff().toJsonObject());
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
        if (jsonObject.has("idTokenInfo")) {
            setIdTokenInfo(new IdTokenInfo());
            getIdTokenInfo().fromJsonObject(jsonObject.getAsJsonObject("idTokenInfo"));
        }

        if (jsonObject.has("certificateStatus")) {
            setCertificateStatus(AuthorizeCertificateStatusEnum.valueOf(jsonObject.get("certificateStatus").getAsString()));
        }

        if (jsonObject.has("allowedEnergyTransfer")) {
            setAllowedEnergyTransfer(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("allowedEnergyTransfer");
            for (JsonElement el : arr) {
                getAllowedEnergyTransfer().add(EnergyTransferModeEnum.valueOf(el.getAsString()));
            }
        }

        if (jsonObject.has("tariff")) {
            setTariff(new Tariff());
            getTariff().fromJsonObject(jsonObject.getAsJsonObject("tariff"));
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
        if (!(obj instanceof AuthorizeResponse))
            return false;
        AuthorizeResponse that = (AuthorizeResponse) obj;
        return Objects.equals(getIdTokenInfo(), that.getIdTokenInfo())
                && Objects.equals(getCertificateStatus(), that.getCertificateStatus())
                && Objects.equals(getAllowedEnergyTransfer(), that.getAllowedEnergyTransfer())
                && Objects.equals(getTariff(), that.getTariff())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getIdTokenInfo(),
                getCertificateStatus(),
                getAllowedEnergyTransfer(),
                getTariff(),
                getCustomData()
        );
    }
}
