package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    protected Solution(String a) {
        System.out.println("fUCKING DEEP");
    }
    public Solution() {
        System.out.println("fUCKING DE");
    }

    private Solution(Double a) {
        System.out.println("fUCKING");
    }
     Solution(int a) {
        System.out.println("fUCK");
    }


    public static void main(String[] args) {

    }
}

