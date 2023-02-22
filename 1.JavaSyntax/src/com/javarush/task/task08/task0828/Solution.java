package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        HashMap<Integer, String> list = new HashMap<>();
        list.put(0, "January");
        list.put(1, "February");
        list.put(2, "March");
        list.put(3, "April");
        list.put(4, "May");
        list.put(5, "June");
        list.put(6, "July");
        list.put(7, "August");
        list.put(8, "September");
        list.put(9, "October");
        list.put(10, "November");
        list.put(11, "December");
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(month)){
                count = i+1;
                break;
            }
        }
        System.out.println(month + " is the " + count + " month");
    }
}