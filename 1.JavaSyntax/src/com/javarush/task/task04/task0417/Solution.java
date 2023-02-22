package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && a == c) {
            System.out.print(a + " " +  a + " " +a);
        } else if (a == b) {
            System.out.print(a + " " +  a);
        } else if (b == c) {
            System.out.print(b + " " +  b);
        } else if (a == c) {
            System.out.print(a + " " +  a);
        }

    }
}