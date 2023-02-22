package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String temp = scanner.nextLine();
            if (temp.equals("exit")) {
                break;
            }
            try {


                if (temp.contains(".")) {
                    Double d = Double.parseDouble(temp);
                    print(d);
                } else {
                    int i = Integer.parseInt(temp);
                    if (i > 0 && i < 128) {
                        print((short) i);
                    }else if(i <= 0 || i >= 128){
                        print(i);
                    }
                }
            } catch (NumberFormatException e) {
                print(temp);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
