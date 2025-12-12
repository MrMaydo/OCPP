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


    public CustomerInformationRequest(CertificateHashData customerCertificate, IdToken idToken, Integer requestId, Boolean report, Boolean clear, String customerIdentifier, CustomData customData) {
        super();
        this.customerCertificate = customerCertificate;
        this.idToken = idToken;
        this.requestId = requestId;
        this.report = report;
        this.clear = clear;
        this.customerIdentifier = customerIdentifier;
        this.customData = customData;
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
        json.add("customerCertificate", customerCertificate.toJsonObject());
        json.add("idToken", idToken.toJsonObject());
        json.addProperty("requestId", requestId);
        json.addProperty("report", report);
        json.addProperty("clear", clear);
        json.addProperty("customerIdentifier", customerIdentifier);
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
        if (jsonObject.has("customerCertificate")) {
            this.customerCertificate = new CertificateHashData();
            this.customerCertificate.fromJsonObject(jsonObject.getAsJsonObject("customerCertificate"));
        }

        if (jsonObject.has("idToken")) {
            this.idToken = new IdToken();
            this.idToken.fromJsonObject(jsonObject.getAsJsonObject("idToken"));
        }

        if (jsonObject.has("requestId")) {
            this.requestId = jsonObject.get("requestId").getAsInt();
        }

        if (jsonObject.has("report")) {
            this.report = jsonObject.get("report").getAsBoolean();
        }

        if (jsonObject.has("clear")) {
            this.clear = jsonObject.get("clear").getAsBoolean();
        }

        if (jsonObject.has("customerIdentifier")) {
            this.customerIdentifier = jsonObject.get("customerIdentifier").getAsString();
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
        int result = 1;
        result = 31 * result + (this.customerCertificate != null ? this.customerCertificate.hashCode() : 0);
        result = 31 * result + (this.requestId != null ? this.requestId.hashCode() : 0);
        result = 31 * result + (this.idToken != null ? this.idToken.hashCode() : 0);
        result = 31 * result + (this.report != null ? this.report.hashCode() : 0);
        result = 31 * result + (this.clear != null ? this.clear.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.customerIdentifier != null ? this.customerIdentifier.hashCode() : 0);
        return result;
    }
}
