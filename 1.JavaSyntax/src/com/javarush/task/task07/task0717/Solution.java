package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            String numb = sc.nextLine();
            list.add(numb);
        }

        ArrayList<String> result = doubleValues(list);
        for(String j:list){System.out.println(j);}
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = 0 ; i < list.size(); i+=2){
            if(i == 20) {break;}
            list.add(i+1, list.get(i));
        }
        return list;
    }
}
