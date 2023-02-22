package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

        try {
            while(true) {
                Scanner sc = new Scanner(System.in);
                int age = sc.nextInt();
                System.out.println(age);
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
