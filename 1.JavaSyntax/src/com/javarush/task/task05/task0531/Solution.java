package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());
        int minimum = min(a, b, c, d, f);


        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int f) {
        int[] temp = new int[5];
        temp[0] = a;
        temp[1] = b;
        temp[2] = c;
        temp[3] = d;
        temp[4] = f;


        for (int i = 0; i < 4; i++) {
            if(temp[i]<temp[i + 1]){
                temp[i+1]=temp[i];
            }
        }
        return temp[4];
    }
}
