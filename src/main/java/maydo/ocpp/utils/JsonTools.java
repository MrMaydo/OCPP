package maydo.ocpp.utils;

import com.google.gson.*;
import maydo.ocpp.msgDef.annotations.Optional;

import java.lang.reflect.*;
import java.text.ParseException;
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
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return jsonObject;
    }

    private static <T> void addGenericToJsonObject(T object, JsonObject jsonObject, Field field) throws IllegalAccessException, InvocationTargetException {
        String fieldType = field.getType().getSimpleName();
        String fieldName = field.getName();

        if (field.get(object) == null) {
            if (field.isAnnotationPresent(Optional.class))
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
            copyListToJsonArray(jsonArray, (List<?>) fieldValue);
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


    public static <T> void fromJsonString(T object, String jsonString) {
        JsonObject jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();

        fromJsonObject(object, jsonObject);
    }

    public static <T> void fromJsonObject(T object, JsonObject jsonObject) {
        Class classType = object.getClass();
        Field[] declaredFields = classType.getDeclaredFields();
        try {
            for (Field field : declaredFields) {
                setFieldFromJson(object, jsonObject, field);
            }
        } catch (Exception e) {
            System.out.println(e.getCause().toString());
            throw new RuntimeException(e);
        }
    }

    private static <T> void setFieldFromJson(T object, JsonObject jsonObject, Field field) throws Exception {
        String fieldType;
        String fieldName;
        field.setAccessible(true);

        Class<?> clazz = Class.forName(field.getType().getTypeName());
//        Constructor<?> constructor = clazz.getConstructor();

//        field.set(object, constructor.newInstance());
        fieldType = field.getType().getSimpleName();
        fieldName = field.getName();
//        String parameter = jsonObject.get(fieldName).toString().replaceAll("\"", "");
        JsonElement parameter = jsonObject.get(fieldName);
        System.out.println("parameter:" + parameter);
        if(parameter.isJsonNull()){
            field.set(object, null);
            return;
        }
        if (fieldType.equals("Integer")) {
            field.set(object, parameter.getAsInt());
        } else if (fieldType.equals("Float")) {
            field.set(object, parameter.getAsFloat());
        } else if (fieldType.equals("Boolean")) {
            field.set(object, parameter.getAsBoolean());
        } else if (fieldType.equals("String")) {
            field.set(object, parameter.getAsString());
        } else if (fieldType.equals("Date")) {
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            date.setTime(dateFormat.parse(parameter.getAsString()).getTime());
            field.set(object, date);
        } else if (fieldType.equals("List")) {
            List<?> list;
            JsonArray jsonArray = parameter.getAsJsonArray();
            int start = field.getGenericType().toString().lastIndexOf("<") + 1;
            int stop = field.getGenericType().toString().lastIndexOf(">");
            String strListType = field.getGenericType().getTypeName().substring(start, stop);
            Class<?> listType = Class.forName(strListType);
            list = copyJsonArrayToList(jsonArray, listType);
            field.set(object, list);
        } else if (field.getType().getSuperclass().getSimpleName().equals("Enum")) {
//            String parameter = jsonObject.get(fieldName).toString().replaceAll("\"", "");
            Method method = field.getType().getDeclaredMethod("fromValue", String.class);
            field.set(object, method.invoke(null, parameter.getAsString()));
        } else {
            Constructor<?> constructor = clazz.getConstructor();
            field.set(object, constructor.newInstance());
            fromJsonObject(field.get(object), (JsonObject) parameter);
//            Method method = field.getType().getDeclaredMethod("fromJsonString", String.class);
//            field.set(object, method.invoke(null, parameter.getAsString()));
        }
    }

    private static <T> List<T> copyJsonArrayToList(JsonArray jsonArray, Class<?> listType) throws Exception {

        if (jsonArray == null) {
            return null;
        }

        if (listType.getSimpleName().equals("Integer")) {
            return (List<T>) addIntToList(jsonArray);
        } else if (listType.getSimpleName().equals("Float")) {
            return (List<T>) addFloatToList(jsonArray);
        } else if (listType.getSimpleName().equals("Boolean")) {
            return (List<T>) addBoolToList(jsonArray);
        } else if (listType.getSimpleName().equals("String")) {
            return (List<T>) addStringToList(jsonArray);
        } else if (listType.getSimpleName().equals("Date")) {
            return (List<T>) addDateToList(jsonArray);
        } else if (listType.getSuperclass().getSimpleName().equals("Enum")) {
            return (List<T>) addEnumToList(jsonArray, listType);
        } else {
//            jsonArray.add(toJsonObject(item));
            return null;
        }
    }

    private static Object addDateToList(JsonArray jsonArray) throws ParseException {
        List<Date> list = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        Date date;

        for (JsonElement element : jsonArray) {
            date = new Date();
            date.setTime(dateFormat.parse(element.getAsString()).getTime());
            list.add(date);
        }
        return list;
    }

    private static Object addEnumToList(JsonArray jsonArray, Class<?> listType) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Enum<? extends Enum<?>>> list = new ArrayList<>();
        Method method = listType.getDeclaredMethod("fromValue", String.class);

        for (JsonElement element : jsonArray) {
            list.add((Enum<? extends Enum<?>>) method.invoke(null, element.getAsString()));
        }
        return list;
    }

    private static Object addStringToList(JsonArray jsonArray) {
        List<String> list = new ArrayList<>();
        for (JsonElement element : jsonArray) {
            list.add(element.toString().replace("\"", ""));
        }
        return list;
    }

    private static Object addBoolToList(JsonArray jsonArray) {
        List<Boolean> list = new ArrayList<>();
        for (JsonElement element : jsonArray) {
            list.add(element.getAsBoolean());
        }
        return list;
    }

    private static List<Integer> addIntToList(JsonArray jsonArray) {
        List<Integer> list = new ArrayList<>();
        for (JsonElement element : jsonArray) {
            list.add(element.getAsInt());
        }
        return list;
    }

    private static List<Float> addFloatToList(JsonArray jsonArray) {
        List<Float> list = new ArrayList<>();
        for (JsonElement element : jsonArray) {
            list.add(element.getAsFloat());
        }
        return list;
    }

//    private static <T> T getInstance(T object, String className) throws Exception {
//        Class<?> clazz = Class.forName(className);
//        Constructor<?> constructor = clazz.getConstructor(String.class);
//        constructor.newInstance(new Object());
//
//    }
}
