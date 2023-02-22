package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i <11 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(8);
            }
            if (i < 10 && i>=1) {
                System.out.println("");
            }
        }
    }
}
