package com.javarush.task.task19.task1902;

/*
Адаптер
*/

public class AdapterFileOutputStream{
    public static void main(String[] args) {
        String phNumLocal = String.valueOf(1234567890);
        System.out.println(String.valueOf(phNumLocal).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)$2-$3"));
    }

}

