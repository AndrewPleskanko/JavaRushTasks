package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> familyCity = new HashMap<>();

        while (true) {
            String city = reader.readLine();
            if ((city==null) || city.isEmpty()) {
                break; }
            String familyName = reader.readLine();
            if ((familyName==null) || familyName.isEmpty())
            {break;}
            familyCity.put(city, familyName);
        }

        // Read the house number
        String cityz = reader.readLine();
        for (Map.Entry<String, String> whatElse : familyCity.entrySet()) {
            String key = whatElse.getKey();
            String value = whatElse.getValue();
            if ((cityz == null) || cityz.isEmpty()) {
                break;
            }
            if (cityz.equals(key)) {
                System.out.println(value);
                break;
            }
        }
    }
}
