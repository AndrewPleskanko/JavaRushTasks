package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int min(int x, int y){
        if(x>y){
            return y;
        }
        return x;
    }
    public static long min(long a, long b){
        if(a>b){
            return b;
        }
        return a;
    }
    public static double min(double s, double d){
        if(s>d){
            return d;
        }
        return s;
    }
}
