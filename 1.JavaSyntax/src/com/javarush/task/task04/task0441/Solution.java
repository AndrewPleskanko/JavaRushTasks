package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d;
        if (b >= a && b >= c) {
            d = a;
            a = b;
            b = d;
        } else if (c >= a && c >= b) {
            d = a;
            a = c;
            c = d;
        }
        if (b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
