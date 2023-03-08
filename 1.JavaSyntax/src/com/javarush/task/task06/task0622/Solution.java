package com.javarush.task.task06.task0622;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;/*
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            int temp = scan.nextInt();
            integers.add(temp);
        }
        Collections.sort(integers);
        for (int i = 0; i < 5; i++) {
            System.out.println(integers.get(i));
        }
    }
}
