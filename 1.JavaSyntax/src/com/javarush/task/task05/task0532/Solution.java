package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                int g = Integer.parseInt(reader.readLine());
                if (g > maximum) {
                    maximum = g;
                }
            }

            System.out.println(maximum);
        }
    }
}
