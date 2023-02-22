package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int a = 0;
        while (a != -1) {
            a = sc.nextInt();
            count = count + a;
        }
        System.out.println(count);
    }
}
