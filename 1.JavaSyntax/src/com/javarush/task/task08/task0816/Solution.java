package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Смирно", dateFormat.parse("MAY 1 2012"));
        map.put("Смирн", dateFormat.parse("MAY 1 2012"));
        map.put("Смир", dateFormat.parse("MAY 1 2012"));
        map.put("Сми", dateFormat.parse("MAY 1 2012"));
        map.put("См", dateFormat.parse("MAY 1 2012"));
        map.put("Св", dateFormat.parse("MAY 1 2012"));
        map.put("Смирновs", dateFormat.parse("MAY 1 2012"));
        map.put("Смирновd", dateFormat.parse("MAY 1 2012"));
        map.put("Смирновf", dateFormat.parse("MAY 1 2012"));
       return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while(iterator.hasNext())
        {
            Map.Entry<String,Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if(rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}
