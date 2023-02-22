package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
        String f2 = br.readLine();
        String f3 = br.readLine();
        br.close();

        FileOutputStream fileOutputStream = new FileOutputStream(f1);
        FileInputStream fileInputStream = new FileInputStream(f2);
        FileInputStream fileInputStreams = new FileInputStream(f3);

        while (fileInputStream.available() > 0) {
            fileOutputStream.write((char) fileInputStream.read());
        }
        fileInputStream.close();
        while (fileInputStreams.available() > 0) {
            fileOutputStream.write((char) fileInputStreams.read());
        }
        fileInputStreams.close();
        fileOutputStream.close();
    }
}
