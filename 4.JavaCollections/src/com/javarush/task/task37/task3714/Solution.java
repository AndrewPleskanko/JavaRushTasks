package com.javarush.task.task37.task3714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Древний Рим
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman number to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result equals " + romanToInteger(romanString));
    }

    public static int romanToInteger(String s) {
        Map<String, Integer> res = new HashMap<>();

        res.put("IX", 9);
        res.put("VIII", 8);
        res.put("VII", 7);
        res.put("VI", 6);
        res.put("IV", 4);
        res.put("V", 5);
        res.put("III", 3);
        res.put("II", 2);
        res.put("I", 1);
        res.put("X", 10);
        res.put("L", 50);
        res.put("C", 100);
        res.put("D", 500);
        res.put("M", 1000);
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result += res.get(String.valueOf(s.toCharArray()[i]).toUpperCase());
        }

        return result;
    }
}
