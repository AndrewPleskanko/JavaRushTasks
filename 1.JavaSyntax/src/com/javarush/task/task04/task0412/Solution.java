package com.javarush.task.task04.task0412;

import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0){
            System.out.println(number*2);
        }else if(number<0){
            number++;
            System.out.println(number);
        }else{
            System.out.println(0);
        }
    }

}