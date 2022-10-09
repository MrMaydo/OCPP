package maydo.ocpp.utils;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static maydo.ocpp.config.Configuration.DATE_FORMAT;

public class JsonTools {

    public static <T> JsonObject toJsonObject(T object) {
        JsonObject jsonObject = new JsonObject();
        Class classType = object.getClass();
        Field[] declaredFields = classType.getDeclaredFields();
        try {
            for (Field field : declaredFields) {
                field.setAccessible(true);
                addGenericToJsonObject(object, jsonObject, field);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return jsonObject;
    }

    private static <T> void addGenericToJsonObject(T object, JsonObject jsonObject, Field field) throws IllegalAccessException, InvocationTargetException {
        String fieldType = field.getType().getSimpleName();
        String fieldName = field.getName();

        if (field.get(object) == null){
            jsonObject.addProperty(fieldName, (String) null);
            return;
        }

        if(fieldType.equals("Integer")){
            Integer value = (Integer) field.get(object);
            jsonObject.addProperty(fieldName, value);
        }
        else if(fieldType.equals("Float")){
            Float value = (Float) field.get(object);
            jsonObject.addProperty(fieldName, value);
        }
        else if (fieldType.equals("Boolean")) {
            Boolean value = (Boolean) field.get(object);
            jsonObject.addProperty(fieldName, value);
        }
        else if (fieldType.equals("String")) {
            String value = (String) field.get(object);
            jsonObject.addProperty(fieldName, value);
        }
        else if (fieldType.equals("Date")) {
            Date value = (Date) field.get(object);
            SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            jsonObject.addProperty(fieldName, dateFormat.format(value));
        }
        else if (fieldType.equals("List")) {
            JsonArray jsonArray = new JsonArray();
            List<?> list = (List) field.get(object);
            copyListToJsonArray(jsonArray, list);
            jsonObject.add(fieldName, jsonArray);
        }
        else if (field.getType().getSuperclass().getSimpleName().equals("Enum")){
            Enum value = (Enum) field.get(object);
            jsonObject.addProperty(fieldName, value.toString());
        }
        else {
            jsonObject.add(fieldName, toJsonObject(field.get(object)));
        }
    }

    private static void copyListToJsonArray(JsonArray jsonArray, List<?> list){
        for (Object item : list) {
            if (item == null) {
                jsonArray.add((String) null);
                continue;
            }
            String itemType = item.getClass().getSimpleName();

            if(itemType.equals("Integer")){
                jsonArray.add((Integer) item);
            }
            else if(itemType.equals("Float")){
                jsonArray.add((Float) item);
            }
            else if (itemType.equals("Boolean")) {
                jsonArray.add((Boolean) item);
            }
            else if (itemType.equals("String")) {
                jsonArray.add((String) item);
            }
            else if (itemType.equals("Date")) {
                Date dateValue = (Date) item;
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                jsonArray.add(dateFormat.format(dateValue));
            }
            else if (itemType.equals("Enum")){
                jsonArray.add(item.toString());
            }
            else {
                jsonArray.add(toJsonObject(item));
            }
        }
    }
}
