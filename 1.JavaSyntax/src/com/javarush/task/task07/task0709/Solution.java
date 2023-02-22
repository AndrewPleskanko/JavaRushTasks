package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            String numb = sc.nextLine();
            strings.add(numb);
        }
        Integer[] lenghtOfList = new Integer[5];

        for (int i = 0; i < 5; i++) {
            int size = strings.get(i).length();
            lenghtOfList[i] = size;
        }

        Arrays.sort(lenghtOfList, Collections.reverseOrder());
        int min = lenghtOfList[4];

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == min) {
                System.out.println(strings.get(i));
            }
        }
    }
}

