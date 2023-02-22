package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while(i<10){
            i++;
            while(j<10){
                j++;
                System.out.print(i*j + " ");
            }
            j = 0;
            System.out.println("");
        }

    }
}
