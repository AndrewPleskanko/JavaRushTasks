package com.javarush.task.task19.task1907;

import java.io.*;
import java.util.Locale;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = br.readLine();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
        int count = 0;
        while (reader1.ready()) {
            String s1 = reader1.readLine();
            String[] words = s1.split("\\W");

            for (String w : words) {
                if (w.equals("world")) {
                    count++;
                }
            }
        }
        System.out.println(count);
        br.close();
        reader1.close();
    }
}
