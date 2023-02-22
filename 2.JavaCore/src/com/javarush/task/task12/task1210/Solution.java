package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int x, int y){
        if(x>y){
            return x;
        }
        return y;
    }
    public static long max(long a, long b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static double max(double s, double d){
        if(s>d){
            return s;
        }
        return d;
    }
}
