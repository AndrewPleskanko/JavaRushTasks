package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("фамілія", "ім'я");
        map.put("отчество", "хуйлуша");
        map.put("папапапарам", "паравозик");
        map.put("ідє", "до");
        map.put("нас", "папапапарам");
        map.put("факінг", "слейвс");
        map.put("їде", "до");
        map.put("бб", "ім'я");
        map.put("лох", "ім'я");
        map.put("чмо", "підор");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for(String s : map.values()){
            if(s.equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        for(String x : map.keySet()){
            if(x.equals(lastName))
                return 1;
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
