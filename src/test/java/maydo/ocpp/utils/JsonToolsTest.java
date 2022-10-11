package maydo.ocpp.utils;

import com.google.gson.JsonObject;
import maydo.ocpp.utils.testObjects.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static maydo.ocpp.utils.JsonTools.toJsonObject;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonToolsTest {
    JsonObject jsonObject;
    String expectedJsonString;


    @BeforeEach
    void setUp() {
        jsonObject = new JsonObject();
    }

    @Test
    void toJsonObject_Integer() {
        IntObject object = new IntObject();

        expectedJsonString = "{\"intValue\":5}";
        object.setIntValue(5);
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Integer");
    }

    @Test
    void toJsonObject_NullInteger() {
        IntObject object = new IntObject();
        expectedJsonString = "{\"intValue\":null}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Integer");
    }

    @Test
    void toJsonObject_Float() {
        FloatObject object = new FloatObject();
        expectedJsonString = "{\"floatValue\":5.6}";
        object.setFloatValue((float) 5.6);
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Float");
    }

    @Test
    void toJsonObject_NullFloat() {
        FloatObject object = new FloatObject();
        expectedJsonString = "{\"floatValue\":null}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Float");
    }

    @Test
    void toJsonObject_Boolean() {
        BoolObject object = new BoolObject();
        expectedJsonString = "{\"boolValue\":true}";
        object.setBoolValue(true);
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Boolean");
    }

    @Test
    void toJsonObject_NullBoolean() {
        BoolObject object = new BoolObject();
        expectedJsonString = "{\"boolValue\":null}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Boolean");
    }

    @Test
    void toJsonObject_String() {
        StrObject object = new StrObject();
        expectedJsonString = "{\"strValue\":\"testValue\"}";
        object.setStrValue("testValue");
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting String");
    }

    @Test
    void toJsonObject_NullString() {
        StrObject object = new StrObject();
        expectedJsonString = "{\"strValue\":null}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting String");
    }

    @Test
    void toJsonObject_Enum() {
        EnumObject object = new EnumObject();
        expectedJsonString = "{\"enumValue\":\"boolean\"}";
        object.setEnumValue(TestEnum.BOOLEAN);
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Enum");
    }

    @Test
    void toJsonObject_NullEnum() {
        EnumObject object = new EnumObject();
        expectedJsonString = "{\"enumValue\":null}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Enum");
    }

    @Test
    void toJsonObject_Date() {
        DateObject object = new DateObject();
        expectedJsonString = "{\"dateValue\":\"2022-12-03T21:46:59.123Z\"}";
        object.setDateValue(createDate(2022, 12, 3, 21, 46, 59, 123));
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Date");
    }

    @Test
    void toJsonObject_NullDate() {
        DateObject object = new DateObject();
        expectedJsonString = "{\"dateValue\":null}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Date");
    }

    @Test
    void toJsonObject_ListInt() {
        ListObject object = new ListObject();
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(8);
        object.setListValue(list);
        expectedJsonString = "{\"listValue\":[2,5,2,8]}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting List<Integer>");
    }

    @Test
    void toJsonObject_ListBool() {
        ListObject object = new ListObject();
        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(true);
        object.setListValue(list);
        expectedJsonString = "{\"listValue\":[true,false,true,true]}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting List<Boolean>");
    }

    @Test
    void toJsonObject_ListStr() {
        ListObject object = new ListObject();
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("cde");
        list.add("efg");
        object.setListValue(list);
        expectedJsonString = "{\"listValue\":[\"abc\",\"cde\",\"efg\"]}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting List<String>");
    }

    @Test
    void toJsonObject_ListDate() {
        ListObject object = new ListObject();
        List<Date> list = new ArrayList<>();
        list.add(createDate(2022, 12, 3, 21, 46, 59, 123));
        list.add(createDate(2022, 1, 31, 8, 3, 9, 13));
        object.setListValue(list);
        expectedJsonString = "{\"listValue\":[" +
                "\"2022-12-03T21:46:59.123Z\"," +
                "\"2022-01-31T08:03:09.13Z\"" +
                "]}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting List<Date>");
    }

    @Test
    void toJsonObject_ListEnum() {
        ListObject object = new ListObject();
        List<TestEnum> list = new ArrayList<>();
        list.add(TestEnum.BOOLEAN);
        list.add(TestEnum.INTEGER);
        list.add(TestEnum.STRING);
        object.setListValue(list);
        expectedJsonString = "{\"listValue\":[" +
                "\"boolean\"," +
                "\"integer\"," +
                "\"string\"" +
                "]}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting List<Enum>");
    }

    @Test
    void toJsonObject_NullList() {
        ListObject object = new ListObject();
        expectedJsonString = "{\"listValue\":null}";
        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting List (null)");
    }

    @Test
    void toJsonObject_ComplexObject() {
        ComplexObject object = new ComplexObject();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(2);

        object.setIntObject(new IntObject());
        object.setStrObject(new StrObject());
        object.setDateObject(new DateObject());
        object.setListObject(new ListObject());

        object.getIntObject().setIntValue(6);
        object.getStrObject().setStrValue("abc");
        object.getDateObject().setDateValue(createDate(2022, 12, 3, 21, 46, 59, 123));
        object.getListObject().setListValue(list);

        expectedJsonString = "{" +
                "\"intObject\":{\"intValue\":6}," +
                "\"strObject\":{\"strValue\":\"abc\"}," +
                "\"dateObject\":{\"dateValue\":\"2022-12-03T21:46:59.123Z\"}," +
                "\"listObject\":{\"listValue\":[5,6,2]}" +
                "}";

        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Object with nested JsonObject");
    }

    @Test
    void toJsonObject_NullComplexObject() {
        ComplexObject object = new ComplexObject();

        object.setStrObject(new StrObject());
        object.setDateObject(new DateObject());
        object.setListObject(new ListObject());

        object.getStrObject().setStrValue("abc");
        object.getListObject().setListValue(null);

        expectedJsonString = "{" +
                "\"intObject\":null," +
                "\"strObject\":{\"strValue\":\"abc\"}," +
                "\"dateObject\":{\"dateValue\":null}," +
                "\"listObject\":{\"listValue\":null}" +
                "}";

        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Object with nested JsonObject");
    }

    @Test
    void toJsonObject_ListComplexObject() {
        ListObject object = new ListObject();
        List<ComplexObject> list = new ArrayList<>();
        ComplexObject item1 = new ComplexObject();
        ComplexObject item2 = new ComplexObject();
        ComplexObject item3 = new ComplexObject();
        List<Integer> itemList1 = new ArrayList<>();
        List<String> itemList2 = new ArrayList<>();
        itemList1.add(5);
        itemList1.add(6);
        itemList1.add(2);
        itemList2.add("a");
        itemList2.add("b");
        itemList2.add("c");

        item1.setIntObject(new IntObject());
        item1.setStrObject(new StrObject());
        item1.setDateObject(new DateObject());
        item1.setListObject(new ListObject());

        item1.getIntObject().setIntValue(6);
        item1.getStrObject().setStrValue("abc");
        item1.getDateObject().setDateValue(createDate(2022, 12, 3, 21, 46, 59, 123));
        item1.getListObject().setListValue(itemList1);


        item2.setIntObject(new IntObject());
        item2.setStrObject(new StrObject());
        item2.setDateObject(new DateObject());
        item2.setListObject(new ListObject());
        item2.getListObject().setListValue(itemList2);

//        item3.setIntObject(new IntObject());
//        item3.setStrObject(new StrObject());
//        item3.setDateObject(new DateObject());
//        item3.setListObject(new ListObject());

        list.add(item1);
        list.add(item2);
        list.add(item3);
        object.setListValue(list);
        expectedJsonString = "{\"listValue\":[" +
                "{\"intObject\":{\"intValue\":6}," +
                "\"strObject\":{\"strValue\":\"abc\"}," +
                "\"dateObject\":{\"dateValue\":\"2022-12-03T21:46:59.123Z\"}," +
                "\"listObject\":{\"listValue\":[5,6,2]}}," +

                "{\"intObject\":{\"intValue\":null}," +
                "\"strObject\":{\"strValue\":null}," +
                "\"dateObject\":{\"dateValue\":null}," +
                "\"listObject\":{\"listValue\":[\"a\",\"b\",\"c\"]}}," +

                "{\"intObject\":null," +
                "\"strObject\":null," +
                "\"listObject\":null" +
                "}" +
                "]}";

        assertEquals(expectedJsonString, toJsonObject(object).toString(),
                "Failed at converting Object with nested JsonObject");
    }

    Date createDate(int y, int m, int d, int h, int min, int s, int ms) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, y);
        cal.set(Calendar.MONTH, m - 1);
        cal.set(Calendar.DATE, d);
        cal.set(Calendar.HOUR_OF_DAY, h);
        cal.set(Calendar.MINUTE, min);
        cal.set(Calendar.SECOND, s);
        cal.set(Calendar.MILLISECOND, ms);

        return cal.getTime();
    }
}
