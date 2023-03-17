package com.javarush.task.task07.task0721;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int maximum;
        int minimum;

        int[] array = getInts();
        //напишите тут ваш код

        Arrays.sort(array);
        maximum = array[19];
        minimum = array[0];
        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() {
        Scanner scanner = new Scanner(System.in);
        int[] opa = new int[20];
        for (int i = 0; i < 20; i++) {
            int temp = scanner.nextInt();
            opa[i] = temp;
        }
        return opa;
    }
}
