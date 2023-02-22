package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            int numb = sc.nextInt();
            array[i] = numb;
        }
        for (int i = 9; i >=0 ; i--) {
            System.out.println(array[i]);
        }
    }
}


