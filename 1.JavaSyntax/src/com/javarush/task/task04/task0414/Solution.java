package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%400 == 0){
            System.out.println("количество дней в году: 366");
        }else if(number%100 == 0){
            System.out.println("количество дней в году: 365");
        }else if(number%4 == 0){
            System.out.println("количество дней в году: 366");
        }else{
            System.out.println("количество дней в году: 365");
        }

    }
}