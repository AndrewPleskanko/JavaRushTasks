package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("фамілія", 1);
        map.put("отчество", 100);
        map.put("папапапарам", 1000);
        map.put("ідє", 20);
        map.put("нас", 800);
        map.put("факінг", 100000);
        map.put("їде", 5);
        map.put("бб", 499);
        map.put("лох", 600);
        map.put("чмо", 700);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();

        while (entries.hasNext())
        {
            Map.Entry<String, Integer> entry = entries.next();

            if (entry.getValue() < 500)
            {
                entries.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}