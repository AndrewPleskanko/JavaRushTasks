package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        if (args[0].equals("-e")) {
            int i;
            while (inputStream.available() > 0) {
                i = inputStream.read() + 100;
                outputStream.write(i);
            }
        } else if (args[0].equals("-d")) {
            int j;
            while (inputStream.available() > 0) {
                j = inputStream.read() - 100;
                outputStream.write(j);
            }
        }
        inputStream.close();
        outputStream.close();
    }

}
