package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        while (inputStream.available() > 0) {
            int temp = inputStream.read();
            if (hashMap.containsKey(temp)) {
                int data = hashMap.get(temp);//получили значення(кількість повторів)
                hashMap.remove(temp);//видаляємо(потім додамо)
                data++;//(інкрементуємо), бо потім додаємо оновлену кількість
                hashMap.put(temp, data);//тут її і додаємо
            } else {
                hashMap.put(temp, 1);
            }
        }
        inputStream.close();
        int max = 0;
        for (Map.Entry<Integer, Integer> pair : hashMap.entrySet()) {
            if (pair.getValue() > max)
                max = pair.getValue();
        }

        for (Map.Entry<Integer, Integer> pair : hashMap.entrySet()) {
            if (pair.getValue() == max)
                System.out.print(pair.getKey() + " ");
        }


    }
}
