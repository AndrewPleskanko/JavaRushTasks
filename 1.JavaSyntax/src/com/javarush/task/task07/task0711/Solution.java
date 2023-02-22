package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            String numb = sc.nextLine();
            strings.add(numb);
        }
        for (int i = 0; i < 13; i++) {
           strings.add(0,strings.get(4));
            strings.remove(5);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(strings.get(i));
        }
    }
}
