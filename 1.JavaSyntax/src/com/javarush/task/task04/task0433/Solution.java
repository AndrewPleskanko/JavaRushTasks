package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("S");
            }
            System.out.println("S");
        }
*/
        int i = 0;
        int j = 0;
        while(i<10) {
            i++;
            while (j < 9) {
                System.out.print("S");
                j++;
            }
            j = 0;
            System.out.println("S");

        }

    }
}
