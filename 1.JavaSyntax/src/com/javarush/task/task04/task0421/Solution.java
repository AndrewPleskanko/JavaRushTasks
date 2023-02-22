package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.equals(b)){
            System.out.println("Имена идентичны");
        }else if(a.length() == b.length()){
            System.out.println("Длины имен равны");
        }

    }
}
