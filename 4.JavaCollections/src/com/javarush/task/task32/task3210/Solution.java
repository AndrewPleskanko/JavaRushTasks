package com.javarush.task.task32.task3210;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName =args[0];
        long number = Long.parseLong(args[1]);
        String text = args[2];

        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        byte[] buf = new byte[text.length()];
        raf.seek(number);
        raf.read(buf, 0, buf.length);
        String lineFromFile = new String(buf);
        String storeToFile = lineFromFile.equals(text) ? "true" : "false";
        raf.seek(raf.length());
        raf.write(storeToFile.getBytes());

    }
}
