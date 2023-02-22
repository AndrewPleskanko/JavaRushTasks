package com.javarush.task.task18.task1820;

/*
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
        String f2 = br.readLine();
        br.close();
        FileInputStream fileInputStream = new FileInputStream(f1);
        FileOutputStream fileOutputStream = new FileOutputStream(f2);
        ArrayList<String> opa = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            fileOutputStream.write((Math.round(fileInputStream.read()) + " ").getBytes());
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
