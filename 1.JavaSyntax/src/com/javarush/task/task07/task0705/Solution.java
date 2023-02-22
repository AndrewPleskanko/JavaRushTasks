package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int array[] = new int[20];
        for (int i = 0; i < 20; i++) {
            Scanner sc = new Scanner(System.in);
            int numb = sc.nextInt();
            array[i] = numb;
        }
        int myArray[] = new int[10];
        int myArrais[] = new int[10];
        for (int i = 0; i <10 ; i++) {
           myArray[i] =array[i];
        }
        for (int i = 0; i <10 ; i++) {
           myArrais[i]= array[i+10];
            System.out.println(myArrais[i]);
        }
    }
}
