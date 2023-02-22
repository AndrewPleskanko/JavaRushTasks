package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        int max = 1;
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            int numb = sc.nextInt();
            list.add(numb);
        }
        int count = 1;
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                if (max < count) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(max);
    }
}

