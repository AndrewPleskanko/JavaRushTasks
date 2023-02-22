package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        ArrayList<Integer> firstArray = new ArrayList<>();
        while (inputStream.available() > 0) {
            firstArray.add(inputStream.read());
        }
        Collections.reverse(firstArray);
        for (int i = 0;i<firstArray.size();i++) {
            outputStream.write(firstArray.get(i));
        }
        inputStream.close();
        outputStream.close();
    }
}
