package com.javarush.task.task18.task1807;

import java.io.*;


/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());


        int charCount = 0;
        while (inputStream.available() > 0) {
            if (inputStream.read() == ',') {
                charCount++;
            }
        }
        System.out.println(charCount);
        reader.close();
        inputStream.close();

    }
}
