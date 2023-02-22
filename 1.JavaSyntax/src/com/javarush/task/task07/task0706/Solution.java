package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int array[] = new int[15];
        int negNum = 0;
        int posNum = 0;
        for (int i = 0; i < 15; i++) {
            Scanner sc = new Scanner(System.in);
            int numb = sc.nextInt();
            array[i] = numb;
            if (i % 2 == 0) {
                posNum += array[i];
            } else {
                negNum += array[i];
            }
        }
        if (posNum > negNum) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else if(negNum>posNum) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
