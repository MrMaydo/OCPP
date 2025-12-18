package maydo.ocpp.msgDef.Messages;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import maydo.ocpp.msgDef.DataTypes.CustomData;
import maydo.ocpp.msgDef.DataTypes.StreamDataElement;
import maydo.ocpp.msgDef.JsonInterface;
import maydo.ocpp.msgDef.annotations.Optional;
import maydo.ocpp.msgDef.annotations.Required;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

/**
 * This is a message of messageType SEND. It does not have a response.
 */
public class NotifyPeriodicEventStream implements JsonInterface {

    /**
     * Variable part of stream data
     */
    @Required
    private List<StreamDataElement> data;

    /**
     * Id of stream.
     */
    @Required
    private Integer id;

    /**
     * Number of data elements still pending to be sent.
     */
    @Required
    private Integer pending;

    /**
     * Base timestamp to add to time offset of values.
     */
    @Required
    private Date basetime;

    /**
     *
     */
    @Optional
    private CustomData customData;


    public NotifyPeriodicEventStream() {
    }


    public List<StreamDataElement> getData() {
        return data;
    }


    public void setData(List<StreamDataElement> data) {
        this.data = data;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getPending() {
        return pending;
    }


    public void setPending(Integer pending) {
        this.pending = pending;
    }


    public Date getBasetime() {
        return basetime;
    }


    public void setBasetime(Date basetime) {
        this.basetime = basetime;
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

        JsonArray dataArray = new JsonArray();
        for (StreamDataElement item : getData()) {
            dataArray.add(item.toJsonObject());
        }
        json.add("data", dataArray);

        json.addProperty("id", getId());

        json.addProperty("pending", getPending());

        json.addProperty("basetime", new SimpleDateFormat(DATE_FORMAT).format(getBasetime()));

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
        if (jsonObject.has("data")) {
            setData(new ArrayList<>());
            JsonArray arr = jsonObject.getAsJsonArray("data");
            for (JsonElement el : arr) {
                StreamDataElement item = new StreamDataElement();
                item.fromJsonObject(el.getAsJsonObject());
                getData().add(item);
            }
        }

        if (jsonObject.has("id")) {
            setId(jsonObject.get("id").getAsInt());
        }

        if (jsonObject.has("pending")) {
            setPending(jsonObject.get("pending").getAsInt());
        }

        if (jsonObject.has("basetime")) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                setBasetime(dateFormat.parse(jsonObject.get("basetime").getAsString()));
            } catch (ParseException e) {
                System.out.println("Invalid date format for basetime" + e);
            }
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
        if (!(obj instanceof NotifyPeriodicEventStream))
            return false;
        NotifyPeriodicEventStream that = (NotifyPeriodicEventStream) obj;
        return Objects.equals(getData(), that.getData())
                && Objects.equals(getId(), that.getId())
                && Objects.equals(getPending(), that.getPending())
                && Objects.equals(getBasetime(), that.getBasetime())
                && Objects.equals(getCustomData(), that.getCustomData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getData(),
                getId(),
                getPending(),
                getBasetime(),
                getCustomData()
        );
    }
}
