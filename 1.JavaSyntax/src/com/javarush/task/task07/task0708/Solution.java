package com.javarush.task.task07.task0708;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
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
        int max = lenghtOfList[0];

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == max) {
                System.out.println(strings.get(i));
            }
        }
    }
}
