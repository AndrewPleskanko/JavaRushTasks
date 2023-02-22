package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map <String, String> map = new HashMap<>();
        map.put("Antonio", "Pji");
        map.put("Antoni", "Pripi");
        map.put("Anton", "Pripizduji");
        map.put("Antoo", "Pripizduji");
        map.put("Antonio", "Pri");
        map.put("Anio", "Pripizduji");
        map.put("Antonio", "Pripizduji");
        map.put("Antonio", "Pripizd");
        map.put("Ant", "Pripizduji");
        map.put("Antonio", "Pr");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
