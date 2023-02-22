package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное число
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
        System.out.println(counter);
    }
}
