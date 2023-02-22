package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        if(t%5<3 & t%5>=0){
            System.out.println("зелёный");
        } else if (t%5>=3 & t%5<4) {
            System.out.println("жёлтый");
        }else {
            System.out.println("красный");
        }
    }
}