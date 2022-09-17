
package maydo.ocpp.msgDef.Messages;

import maydo.ocpp.msgDef.DataTypes.CertificateHashData;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.IdToken;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class CustomerInformationRequest {

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    private CustomData customData;
    private CertificateHashData customerCertificate;
    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    private IdToken idToken;
    /**
     * The Id of the request.
     * 
     * 
     * (Required)
     * 
     */
    private Integer requestId;
    /**
     * Flag indicating whether the Charging Station should return NotifyCustomerInformationRequest messages containing information about the customer referred to.
     * 
     * (Required)
     * 
     */
    private Boolean report;
    /**
     * Flag indicating whether the Charging Station should clear all information about the customer referred to.
     * 
     * (Required)
     * 
     */
    private Boolean clear;
    /**
     * A (e.g. vendor specific) identifier of the customer this request refers to. This field contains a custom identifier other than IdToken and Certificate.
     * One of the possible identifiers (customerIdentifier, customerIdToken or customerCertificate) should be in the request message.
     * 
     * 
     */
    private String customerIdentifier;

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public CustomData getCustomData() {
        return customData;
    }

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     * 
     */
    public void setCustomData(CustomData customData) {
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
     * 
     * 
     */
    public IdToken getIdToken() {
        return idToken;
    }

    /**
     * Contains a case insensitive identifier to use for the authorization and the type of authorization to support multiple forms of identifiers.
     * 
     * 
     */
    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }

    /**
     * The Id of the request.
     * 
     * 
     * (Required)
     * 
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * The Id of the request.
     * 
     * 
     * (Required)
     * 
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * Flag indicating whether the Charging Station should return NotifyCustomerInformationRequest messages containing information about the customer referred to.
     * 
     * (Required)
     * 
     */
    public Boolean getReport() {
        return report;
    }

    /**
     * Flag indicating whether the Charging Station should return NotifyCustomerInformationRequest messages containing information about the customer referred to.
     * 
     * (Required)
     * 
     */
    public void setReport(Boolean report) {
        this.report = report;
    }

    /**
     * Flag indicating whether the Charging Station should clear all information about the customer referred to.
     * 
     * (Required)
     * 
     */
    public Boolean getClear() {
        return clear;
    }

    /**
     * Flag indicating whether the Charging Station should clear all information about the customer referred to.
     * 
     * (Required)
     * 
     */
    public void setClear(Boolean clear) {
        this.clear = clear;
    }

    /**
     * A (e.g. vendor specific) identifier of the customer this request refers to. This field contains a custom identifier other than IdToken and Certificate.
     * One of the possible identifiers (customerIdentifier, customerIdToken or customerCertificate) should be in the request message.
     * 
     * 
     */
    public String getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * A (e.g. vendor specific) identifier of the customer this request refers to. This field contains a custom identifier other than IdToken and Certificate.
     * One of the possible identifiers (customerIdentifier, customerIdToken or customerCertificate) should be in the request message.
     * 
     * 
     */
    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

}
