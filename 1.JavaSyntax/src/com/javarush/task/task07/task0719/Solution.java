package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = scanner.nextInt();
            temp.add(a);
        }
        for (int i = 9; i >=0 ; i--) {
            System.out.println(temp.get(i));
        }
    }
}
