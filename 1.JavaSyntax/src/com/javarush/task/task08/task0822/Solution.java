package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Arrays.sort;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        return Collections.min(array);
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> array = new ArrayList<>();
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sd.nextInt();
            array.add(number);
        }
        return array;
    }
}
