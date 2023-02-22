package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            String numb = sc.nextLine();
            list.add(numb);
        }
        list.remove(2);
        for (int i = 3; i >=0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}
