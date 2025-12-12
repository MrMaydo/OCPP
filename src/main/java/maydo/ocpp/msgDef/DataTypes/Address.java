package maydo.ocpp.msgDef.DataTypes;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;


/**
 * (2.1) A generic address format.
 */
public class Address implements JsonInterface {

    /**
     * Name of person/company
     */
    @Required
    private String name;

    /**
     * Address line 1
     */
    @Required
    private String address1;

    /**
     * Address line 2
     */
    @Optional
    private String address2;

    /**
     * City
     */
    @Required
    private String city;

    /**
     * Postal code
     */
    @Optional
    private String postalCode;

    /**
     * Country name
     */
    @Required
    private String country;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public Address() {
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getAddress1() {
        return address1;
    }


    public void setAddress1(String address1) {
        this.address1 = address1;
    }


    public String getAddress2() {
        return address2;
    }


    public void setAddress2(String address2) {
        this.address2 = address2;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getPostalCode() {
        return postalCode;
    }


    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
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
        json.addProperty("name", name);
        json.addProperty("address1", address1);
        json.addProperty("address2", address2);
        json.addProperty("city", city);
        json.addProperty("postalCode", postalCode);
        json.addProperty("country", country);
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
        if (jsonObject.has("name")) {
            this.name = jsonObject.get("name").getAsString();
        }

        if (jsonObject.has("address1")) {
            this.address1 = jsonObject.get("address1").getAsString();
        }

        if (jsonObject.has("address2")) {
            this.address2 = jsonObject.get("address2").getAsString();
        }

        if (jsonObject.has("city")) {
            this.city = jsonObject.get("city").getAsString();
        }

        if (jsonObject.has("postalCode")) {
            this.postalCode = jsonObject.get("postalCode").getAsString();
        }

        if (jsonObject.has("country")) {
            this.country = jsonObject.get("country").getAsString();
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
        if (!(obj instanceof Address))
            return false;
        Address that = (Address) obj;
        return Objects.equals(this.country, that.country)
                && Objects.equals(this.address2, that.address2)
                && Objects.equals(this.city, that.city)
                && Objects.equals(this.address1, that.address1)
                && Objects.equals(this.postalCode, that.postalCode)
                && Objects.equals(this.name, that.name)
                && Objects.equals(this.customData, that.customData);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.country != null ? this.country.hashCode() : 0);
        result = 31 * result + (this.address2 != null ? this.address2.hashCode() : 0);
        result = 31 * result + (this.city != null ? this.city.hashCode() : 0);
        result = 31 * result + (this.address1 != null ? this.address1.hashCode() : 0);
        result = 31 * result + (this.postalCode != null ? this.postalCode.hashCode() : 0);
        result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        return result;
    }
}
