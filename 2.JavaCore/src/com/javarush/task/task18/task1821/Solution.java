package com.javarush.task.task18.task1821;

/*
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        TreeMap<Integer, Integer> counter = new TreeMap<>();
        FileInputStream inputStream = new FileInputStream(filename);
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        int line;
        while ((line = bufferedReader.read()) != -1) {
            if (counter.containsKey(line)) {
                int value = counter.get(line);
                counter.put(line, ++value);
            } else {
                counter.put(line, 1);
            }
        }
        reader.close();

        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            System.out.println((char)((int) entry.getKey()) + " " + entry.getValue());
        }

    }
}
