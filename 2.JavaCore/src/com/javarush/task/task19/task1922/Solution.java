package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(buf.readLine()));
        buf.close();
        while (reader.ready()) {
            int count = 0;
            String jj = reader.readLine();
            String[] rr = jj.split(" ");
            for (String one : words) {
                for (String opachki : rr) {
                    if (one.equals(opachki)) {
                        count++;
                    }

                }
            }
            if (count == 2) {
                System.out.println(jj);
            }
        }
        reader.close();
    }
}
