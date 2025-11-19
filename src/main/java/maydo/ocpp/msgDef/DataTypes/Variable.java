package maydo.ocpp.msgDef.DataTypes;

import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.util.Objects;

/**
 * Reference key to a component-variable.
 */
public class Variable implements JsonInterface {

    /**
     * Name of the variable. Name should be taken from the list of standardized variable names whenever possible. Case Insensitive. strongly advised to use Camel Case.
     * <p>
     * (Required)
     */
    @Required
    private String name;
    /**
     * Name of instance in case the variable exists as multiple instances. Case Insensitive. strongly advised to use Camel Case.
     */
    @Optional
    private String instance;
    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     */
    @Optional
    private CustomData customData;

    /**
     * No args constructor for use in serialization
     */
    public Variable() {
    }

    /**
     * @param instance Name of instance in case the variable exists as multiple instances. Case Insensitive. strongly advised to use Camel Case.
     *                 .
     * @param name     Name of the variable. Name should be taken from the list of standardized variable names whenever possible. Case Insensitive. strongly advised to use Camel Case.
     *                 .
     */
    public Variable(String name, String instance, CustomData customData) {
        super();
        this.name = name;
        this.instance = instance;
        this.customData = customData;
    }

    /**
     * Name of the variable. Name should be taken from the list of standardized variable names whenever possible. Case Insensitive. strongly advised to use Camel Case.
     * <p>
     * (Required)
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the variable. Name should be taken from the list of standardized variable names whenever possible. Case Insensitive. strongly advised to use Camel Case.
     * <p>
     * (Required)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name of instance in case the variable exists as multiple instances. Case Insensitive. strongly advised to use Camel Case.
     */
    public String getInstance() {
        return instance;
    }

    /**
     * Name of instance in case the variable exists as multiple instances. Case Insensitive. strongly advised to use Camel Case.
     */
    public void setInstance(String instance) {
        this.instance = instance;
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
        if (!(obj instanceof Variable))
            return false;
        Variable that = (Variable) obj;
        return Objects.equals(this.name, that.name)
                && Objects.equals(this.customData, that.customData)
                && Objects.equals(this.instance, that.instance);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
        result = 31 * result + (this.customData != null ? this.customData.hashCode() : 0);
        result = 31 * result + (this.instance != null ? this.instance.hashCode() : 0);
        return result;
    }
}
