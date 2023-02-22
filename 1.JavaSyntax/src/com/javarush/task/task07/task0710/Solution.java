package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            String numb = sc.nextLine();
            strings.add(0,numb);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(strings.get(i));
        }
    }
}
