package maydo.ocpp.msgDef;

import com.google.gson.JsonObject;

public interface JsonInterface {

    public JsonObject toJsonObject();

    public void fromString(String jsonString);

    public void fromJsonObject(JsonObject jsonObject);
}
