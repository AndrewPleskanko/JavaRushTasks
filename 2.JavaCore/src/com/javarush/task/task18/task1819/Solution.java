package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
        String f2 = br.readLine();
        br.close();


        FileInputStream fileInputStream = new FileInputStream(f2);
        FileInputStream fileInputStreams = new FileInputStream(f1);
        FileOutputStream fileOutputStreams = new FileOutputStream(f1);


        while (fileInputStream.available() > 0) {
            fileOutputStreams.write((char) fileInputStream.read());
        }

        while (fileInputStreams.available() > 0) {
            fileOutputStreams.write((char) fileInputStreams.read());
        }
        fileInputStream.close();
        fileInputStreams.close();
        fileOutputStreams.close();
    }
}

