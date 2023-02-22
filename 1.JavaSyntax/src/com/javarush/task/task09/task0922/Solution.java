package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String strdate = sc.nextLine();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date date = s.parse(strdate);
        sc.close();

        SimpleDateFormat smd = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.printf(smd.format(date).toUpperCase());

    }
}
