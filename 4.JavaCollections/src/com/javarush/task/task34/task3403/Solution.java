package com.javarush.task.task34.task3403;

/* 
Разложение на множители с помощью рекурсии
*/

public class Solution {

    public void recurse(int n) {
        int x = 2;//3 3

        while (n >= x) {//9 9 3
            if ((n % x) == 0) {//false true true
                if (n != x) {//
                    System.out.print(x + " ");
                    recurse(n / x);//comeback 3
                } else {//true skip
                    System.out.print(x);
                }
                return;
            }
            x++;
        }
    }
}
