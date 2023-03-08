package com.javarush.task.task08.task0827;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy", Locale.US);
        LocalDate parsedDate = LocalDate.parse(date, formatter);
        int dayOfYear = parsedDate.getDayOfYear();
        return dayOfYear % 2 != 0;
    }
}
