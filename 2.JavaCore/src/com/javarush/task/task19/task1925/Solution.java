package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.StringJoiner;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
        StringJoiner joiner = new StringJoiner(",");
        while (bf1.ready()) {
            String text = bf1.readLine();
            String[] temp = text.split(" ");
            for (int i = 0; i < temp.length; i++) {
                if (temp[i].length() > 6) {
                    joiner.add(temp[i]);
                }
            }
        }
        String joined = joiner.toString();
        bw.write(joined);
        bf1.close();
        bw.close();
    }
}
