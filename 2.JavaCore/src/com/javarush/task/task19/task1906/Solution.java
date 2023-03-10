package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);
        int count;
        for (int i = 1; fileReader.ready(); i++) {
            count = fileReader.read();
            if (i % 2 == 0) {
                fileWriter.write(count);
            }
        }
        br.close();
        fileReader.close();
        fileWriter.close();
    }
}
