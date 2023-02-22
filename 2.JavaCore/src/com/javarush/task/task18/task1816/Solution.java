package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int count = 0;
        if (args.length > 0) {
            FileInputStream inputS = new FileInputStream(args[0]);
            while (inputS.available()>0) {
                int data = inputS.read();
                if (data >= 65 && data <= 90
                        || data >= 97 && data <= 122) {
                    count++;
                }
            }
            inputS.close();
        }
        System.out.println(count);
    }
}
