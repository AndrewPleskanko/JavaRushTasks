package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a >= b && a >= c && c >= d) {
            System.out.println(a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println(b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
