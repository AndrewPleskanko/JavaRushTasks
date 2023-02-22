package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int counter = 0;
        if(a>0){
            counter++;
        }
        if(b>0){
            counter++;
        }
        if(c>0){
            counter++;
        }
        int unCounter = 0;
        if(a<0){
            unCounter++;
        }
        if(b<0){
            unCounter++;
        }
        if(c<0){
            unCounter++;
        }
        System.out.println("количество отрицательных чисел: " + unCounter);
        System.out.println("количество положительных чисел: " + counter);

    }
}
