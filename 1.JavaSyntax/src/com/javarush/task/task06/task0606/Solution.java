package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        while(age>0) {

            if (age % 2 == 0) {
                even++;
                int prog = age / 10;
                age = prog;
            } else {
                odd++;
                int prog = age / 10;
                age = prog;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
