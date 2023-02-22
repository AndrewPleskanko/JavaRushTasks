package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        int a = sc.nextInt();
        int i = 0;
        while(i<a){
            System.out.println(b);
            i++;
        }
    }
}
