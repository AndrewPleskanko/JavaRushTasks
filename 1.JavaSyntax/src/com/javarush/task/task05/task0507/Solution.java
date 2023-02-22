package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double count = 0;
        double number = 0;
        int a = 0;
        while (true) {
            a = sc.nextInt();
            if(a ==-1){
                break;
            }
                count = count + a;
                number++;
            }
        double result = count / number;
        System.out.println(result);
    }
}


