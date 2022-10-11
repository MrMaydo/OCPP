package maydo.ocpp.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import maydo.ocpp.msgDef.annotations.Optional;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
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
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return jsonObject;
    }

    private static <T> void addGenericToJsonObject(T object, JsonObject jsonObject, Field field) throws IllegalAccessException, InvocationTargetException {
        String fieldType = field.getType().getSimpleName();
        String fieldName = field.getName();

        if (field.get(object) == null) {
            if(field.isAnnotationPresent(Optional.class))
                return;

            jsonObject.addProperty(fieldName, (String) null);
            return;
        }
        Object fieldValue = field.get(object);
        if (fieldType.equals("Integer")) {
            jsonObject.addProperty(fieldName, (Integer) fieldValue);
        } else if (fieldType.equals("Float")) {
            jsonObject.addProperty(fieldName, (Float) fieldValue);
        } else if (fieldType.equals("Boolean")) {
            jsonObject.addProperty(fieldName, (Boolean) fieldValue);
        } else if (fieldType.equals("String")) {
            jsonObject.addProperty(fieldName, (String) fieldValue);
        } else if (fieldType.equals("Date")) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            jsonObject.addProperty(fieldName, dateFormat.format(fieldValue));
        } else if (fieldType.equals("List")) {
            JsonArray jsonArray = new JsonArray();
            copyListToJsonArray(jsonArray, (List) fieldValue);
            jsonObject.add(fieldName, jsonArray);
        } else if (field.getType().getSuperclass().getSimpleName().equals("Enum")) {
            jsonObject.addProperty(fieldName, fieldValue.toString());
        } else {
            jsonObject.add(fieldName, toJsonObject(fieldValue));
        }
    }

    private static void copyListToJsonArray(JsonArray jsonArray, List<?> list) {
        for (Object item : list) {
            if (item == null) {
                jsonArray.add((String) null);
                continue;
            }
            String itemType = item.getClass().getSimpleName();

            if (itemType.equals("Integer")) {
                jsonArray.add((Integer) item);
            } else if (itemType.equals("Float")) {
                jsonArray.add((Float) item);
            } else if (itemType.equals("Boolean")) {
                jsonArray.add((Boolean) item);
            } else if (itemType.equals("String")) {
                jsonArray.add((String) item);
            } else if (itemType.equals("Date")) {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                jsonArray.add(dateFormat.format(item));
            } else if (item.getClass().getSuperclass().getSimpleName().equals("Enum")) {
                jsonArray.add(item.toString());
            } else {
                jsonArray.add(toJsonObject(item));
            }
        }
    }
}
