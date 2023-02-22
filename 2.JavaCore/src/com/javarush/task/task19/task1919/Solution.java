package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new FileReader(args[0])));
        Map<String, Double> map = new TreeMap<String, Double>();
        while (reader.ready()) {
            String[] tmp = reader.readLine().split(" ");
            String key = tmp[0];
            if (!map.containsKey(tmp[0])) {
                map.put(tmp[0], Double.parseDouble(tmp[1]));
            } else {
                Double value = map.get(key) + Double.parseDouble(tmp[1]);
                map.put(tmp[0],value);
            }
        }

        for (Map.Entry<String, Double> pair : map.entrySet()) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }

        reader.close();
    }
}
