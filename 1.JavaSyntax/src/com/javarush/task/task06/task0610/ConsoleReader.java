package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
         Scanner sc = new Scanner(System.in);
               String string = sc.nextLine();
return string;
    }

    public static int readInt() throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
return number;
    }

    public static double readDouble() throws Exception {
        Scanner sc = new Scanner(System.in);
        double dible = sc.nextDouble();
        return dible;

    }

    public static boolean readBoolean() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean bool = sc.nextBoolean();
        return bool;

    }

    public static void main(String[] args) throws Exception {

    }
}
