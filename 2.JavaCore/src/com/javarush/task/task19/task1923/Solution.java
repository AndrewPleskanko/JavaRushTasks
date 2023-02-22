package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

        while (bf1.ready()) {
            String jj = bf1.readLine();
            String[] rr = jj.split(" ");
            for (String one : rr) {
                if (Pattern.compile("[0-9]").matcher(one).find()) {
                    bw.write(one + " ");
                }
            }
        }
        bf1.close();
        bw.close();
    }
}
