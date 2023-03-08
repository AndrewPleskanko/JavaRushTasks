package com.javarush.task.task14.task1420;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        while (value2 != 0) {

            int temp = value2;
            value2 = value1 % value2;
            value1 = temp;
        }
        System.out.println(value1);
    }
}
