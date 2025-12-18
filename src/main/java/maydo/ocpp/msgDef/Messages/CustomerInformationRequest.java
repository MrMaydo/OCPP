package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CertificateHashData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * This contains the field definition of the CustomerInformationRequest PDU sent by the CSMS to the Charging Station.
 */
public class CustomerInformationRequest implements JsonInterface {

    /**
     * The Certificate of the customer this request refers to.
     * One of the possible identifiers (customerIdentifier, customerIdToken or customerCertificate) should be in the request message.
     */
    @Optional
    private CertificateHashData customerCertificate;

    /**
     * The IdToken of the customer this request refers to.
     * One of the possible identifiers (customerIdentifier, customerIdToken or customerCertificate) should be in the request message.
     */
    @Optional
    private IdToken idToken;

    /**
     * The Id of the request.
     */
    @Required
    private Integer requestId;

    /**
     * Flag indicating whether the Charging Station should return NotifyCustomerInformationRequest messages
     * containing information about the customer referred to.
     */
    @Required
    private Boolean report;

    /**
     * Flag indicating whether the Charging Station should clear all information about the customer referred to.
     */
    @Required
    private Boolean clear;

    /**
     * A (e.g. vendor specific) identifier of the customer this request refers to.
     * This field contains a custom identifier other than IdToken and Certificate.
     * One of the possible identifiers (customerIdentifier, customerIdToken or customerCertificate) should be in the request message.
     */
    @Optional
    private String customerIdentifier;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public CustomerInformationRequest() {
    }


    public CertificateHashData getCustomerCertificate() {
        return customerCertificate;
    }

    public void setCustomerCertificate(CertificateHashData customerCertificate) {
        this.customerCertificate = customerCertificate;
    }


    public IdToken getIdToken() {
        return idToken;
    }


    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }


    public Integer getRequestId() {
        return requestId;
    }


    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }


    public Boolean getReport() {
        return report;
    }


    public void setReport(Boolean report) {
        this.report = report;
    }


    public Boolean getClear() {
        return clear;
    }


    public void setClear(Boolean clear) {
        this.clear = clear;
    }


    public String getCustomerIdentifier() {
        return customerIdentifier;
    }


    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
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

        if (getCustomerCertificate() != null) {
            json.add("customerCertificate", getCustomerCertificate().toJsonObject());
        }
        if (getIdToken() != null) {
            json.add("idToken", getIdToken().toJsonObject());
        }
        json.addProperty("requestId", getRequestId());

        json.addProperty("report", getReport());

        json.addProperty("clear", getClear());

        if (getCustomerIdentifier() != null) {
            json.addProperty("customerIdentifier", getCustomerIdentifier());
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
        if (jsonObject.has("customerCertificate")) {
            setCustomerCertificate(new CertificateHashData());
            getCustomerCertificate().fromJsonObject(jsonObject.getAsJsonObject("customerCertificate"));
        }

        if (jsonObject.has("idToken")) {
            setIdToken(new IdToken());
            getIdToken().fromJsonObject(jsonObject.getAsJsonObject("idToken"));
        }

        if (jsonObject.has("requestId")) {
            setRequestId(jsonObject.get("requestId").getAsInt());
        }

        if (jsonObject.has("report")) {
            setReport(jsonObject.get("report").getAsBoolean());
        }

        if (jsonObject.has("clear")) {
            setClear(jsonObject.get("clear").getAsBoolean());
        }

        if (jsonObject.has("customerIdentifier")) {
            setCustomerIdentifier(jsonObject.get("customerIdentifier").getAsString());
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
        if (!(obj instanceof CustomerInformationRequest))
            return false;
        CustomerInformationRequest that = (CustomerInformationRequest) obj;
        return Objects.equals(this.customerCertificate, that.customerCertificate)
                && Objects.equals(this.requestId, that.requestId)
                && Objects.equals(this.idToken, that.idToken)
                && Objects.equals(this.report, that.report)
                && Objects.equals(this.clear, that.clear)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.customerIdentifier, that.customerIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getCustomerCertificate(),
                getIdToken(),
                getRequestId(),
                getReport(),
                getClear(),
                getCustomerIdentifier(),
                getCustomData()
        );
    }
}
