package com.javarush.task.task10.task1014;

/* 
Расставьте минимум static-ов
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[8]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[i] < array[k]) {
                    int min = array[k];
                    array[k] = array[i];
                    array[i] = min;
                }
            }
        }
    }
}


