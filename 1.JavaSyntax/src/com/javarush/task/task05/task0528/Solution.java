package com.javarush.task.task05.task0528;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        SimpleDateFormat formater = new SimpleDateFormat("dd MM yyyy");
        Date date = new Date();
        System.out.println(formater.format(date));
    }
}
