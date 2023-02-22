package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String array[] = new String[10];
        int myArray[] = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            String numb = sc.nextLine();
            array[i] = numb;
            myArray[i] = array[i].length();
            System.out.println(myArray[i]);
        }
    }
}
