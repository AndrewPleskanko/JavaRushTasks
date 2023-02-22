package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
      /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
        String f2 = br.readLine();
        br.close();
*/
        String f1 = "C:/Users/legen/Desktop/a.txt";
        String f2 = "C:/Users/legen/Desktop/b.txt";

        FileInputStream fileInputStream = new FileInputStream(f2);

        FileOutputStream fileOutputStreams = new FileOutputStream(f2);
        FileInputStream fileInputStreams = new FileInputStream(f1);

        while (fileInputStreams.available() > 0) {
            fileOutputStreams.write((char) fileInputStream.read());
        }
        fileInputStreams.close();
        fileOutputStreams.close();

        FileOutputStream fos = new FileOutputStream(f1, false);

        while (fileInputStream.available() > 0) {
            fos.write((char) fileInputStream.read());
        }

        fileInputStream.close();
        fos.close();
    }
}

