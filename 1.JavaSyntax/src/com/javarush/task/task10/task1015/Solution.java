package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (int i = 0; i < 20; i++) {
            Scanner sc = new Scanner(System.in);
            String keys = sc.nextLine();
            for (String x : result.keySet()) {
                if (x.equals(keys)) {
                    int val = result.get(x);
                    System.out.println(val);
                    result.remove(x);
                    result.put(keys, val++);
                } else {
                    result.put(keys, 0);
                }
            }
        }

    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] createListik = new ArrayList[3];

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2= new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();

        list1.add("asfadd");
        list2.add("akllkjvzxcv");
        list3.add("alhj;;j;;ok;ojlhuh");

        createListik[0] = list1;
        createListik[1] = list2;
        createListik[2] = list3;

        return createListik;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}