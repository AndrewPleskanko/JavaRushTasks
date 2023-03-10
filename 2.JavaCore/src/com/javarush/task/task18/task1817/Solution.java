package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int count = 0;
        int spaces = 0;
        double res = 0;

        if (args.length > 0) {
            FileInputStream in = new FileInputStream(args[0]);

            while (in.available() > 0) {
                count++;
                int data = in.read();

                if (data == (int) ' ') {
                    spaces++;
                }
            }

            in.close();
        }

            res = (double) spaces / count * 100;


        System.out.printf("%.2f", res);
    }
}

