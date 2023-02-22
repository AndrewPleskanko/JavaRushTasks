package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 100 && a<1000) {
            if (a % 2 == 0) {
                System.out.println("четное трехзначное число");
            } else {
                System.out.println("нечетное трехзначное число");
            }
        } else if (a >= 10 && a < 100) {
            if (a % 2 == 0) {
                System.out.println("четное двузначное число");
            } else {
                System.out.println("нечетное двузначное число");
            }
        } else if (a >= 1 && a < 10) {
            if (a % 2 == 0) {
                System.out.println("четное однозначное число");
            } else {
                System.out.println("нечетное однозначное число");
            }
        }
    }
}
