package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("фамілія", "ім'я");
        map.put("отчество", "fafas");
        map.put("папапапарам", "паравозик");
        map.put("ідє", "до");
        map.put("нас", "папапапарам");
        map.put("afggykjnb", "asfawad");
        map.put("afafadfa", "до");
        map.put("бб", "ім'я");
        map.put("dfsdfsх", "ім'я");
        map.put("gdsgs", "hhhhhh");

        return map;
    }

//    "ім'я" "fafas" "паравозик" "до" "папапапарам" "asfawad" "до" "ім'я" "ім'я" "hhhhhh"
//    "ім'я" "fafas" "паравозик" "до" "папапапарам" "asfawad" "до" "ім'я" "ім'я" "hhhhhh"

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        List<String> seasons = new ArrayList<>(map.values());

        for (int i = 0; i < seasons.size() - 1; i++) {
            for (int j = i + 1; j < seasons.size(); j++) {
                if (seasons.get(i).equals(seasons.get(j))) {
                    removeItemFromMapByValue(map, seasons.get(i));
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
