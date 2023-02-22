package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            String numb = sc.nextLine();
            strings.add(numb);
        }
        Integer[] lenghtOfList = new Integer[10];

        for (int i = 0; i < 10; i++) {
            int size = strings.get(i).length();
            lenghtOfList[i] = size;
        }
        ArrayList<String> string = new ArrayList<>();

        Arrays.sort(lenghtOfList, Collections.reverseOrder());
        int min = lenghtOfList[9];
        int max = lenghtOfList[0];

        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() == min) {
                System.out.println(strings.get(i));
                break;
            } else if (strings.get(i).length() == max) {
                System.out.println(strings.get(i));
                break;
            }
        }
    }
}
