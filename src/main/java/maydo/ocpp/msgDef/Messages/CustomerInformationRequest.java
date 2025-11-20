package maydo.ocpp.msgDef.Messages;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.DataTypes.CertificateHashData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

public class CustomerInformationRequest implements JsonInterface {

    private CertificateHashData customerCertificate;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    @Optional
    private IdToken idToken;
    /**
     * The Id of the request.
     * <p>
     * <p>
     * (Required)
     */
    @Required
    private Integer requestId;
    /**
     * Flag indicating whether the Charging Station should return NotifyCustomerInformationRequest messages containing information about the customer referred to.
     * <p>
     * (Required)
     */
    @Required
    private Boolean report;
    /**
     * Flag indicating whether the Charging Station should clear all information about the customer referred to.
     * <p>
     * (Required)
     */
    @Required
    private Boolean clear;
    /**
     * A (e.g. vendor specific) identifier of the customer this request refers to. This field contains a custom identifier other than IdToken and Certificate.
     * One of the possible identifiers (customerIdentifier, customerIdToken or customerCertificate) should be in the request message.
     */
    @Optional
    private String customerIdentifier;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public CustomerInformationRequest() {
    }

    /**
     * @param requestId          The Id of the request.
     *                           <p>
     *                           .
     * @param report             Flag indicating whether the Charging Station should return NotifyCustomerInformationRequest messages containing information about the customer referred to.
     *                           .
     * @param clear              Flag indicating whether the Charging Station should clear all information about the customer referred to.
     *                           .
     * @param customerIdentifier A (e.g. vendor specific) identifier of the customer this request refers to. This field contains a custom identifier other than IdToken and Certificate.
     *                           One of the possible identifiers (customerIdentifier, customerIdToken or customerCertificate) should be in the request message.
     *                           .
     */
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

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     */
    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }

    /**
     * The Id of the request.
     * <p>
     * <p>
     * (Required)
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of the request.
     * <p>
     * <p>
     * (Required)
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * Flag indicating whether the Charging Station should return NotifyCustomerInformationRequest messages containing information about the customer referred to.
     * <p>
     * (Required)
     */
    public Boolean getReport() {
        return report;
    }

    /**
     * Flag indicating whether the Charging Station should return NotifyCustomerInformationRequest messages containing information about the customer referred to.
     * <p>
     * (Required)
     */
    public void setReport(Boolean report) {
        this.report = report;
    }

    /**
     * Flag indicating whether the Charging Station should clear all information about the customer referred to.
     * <p>
     * (Required)
     */
    public Boolean getClear() {
        return clear;
    }

    /**
     * Flag indicating whether the Charging Station should clear all information about the customer referred to.
     * <p>
     * (Required)
     */
    public void setClear(Boolean clear) {
        this.clear = clear;
    }

    /**
     * A (e.g. vendor specific) identifier of the customer this request refers to. This field contains a custom identifier other than IdToken and Certificate.
     * One of the possible identifiers (customerIdentifier, customerIdToken or customerCertificate) should be in the request message.
     */
    public String getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * A (e.g. vendor specific) identifier of the customer this request refers to. This field contains a custom identifier other than IdToken and Certificate.
     * One of the possible identifiers (customerIdentifier, customerIdToken or customerCertificate) should be in the request message.
     */
    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
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
    }

    @Override
    public void fromJsonObject(JsonObject jsonObject) {
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
