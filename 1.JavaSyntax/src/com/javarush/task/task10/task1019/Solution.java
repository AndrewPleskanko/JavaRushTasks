package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> passportsAndNames = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                passportsAndNames.put(name, id);

            } catch (NumberFormatException e) {
                break;
            }
        }
        for (Map.Entry<String, Integer> pair : passportsAndNames.entrySet()) {
            String key = pair.getKey();                      //ключ
            int value = pair.getValue();                  //значение
            System.out.println(value + " " + key);
        }
    }
}
