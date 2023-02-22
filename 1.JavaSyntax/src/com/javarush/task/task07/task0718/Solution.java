package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            String numb = sc.nextLine();
            list.add(numb);
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).length() >= list.get(i).length()) {
                System.out.println(i);
                break;
            }
        }
    }
}

