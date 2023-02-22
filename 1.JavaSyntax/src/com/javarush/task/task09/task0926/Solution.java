package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> listik = new ArrayList<>();
        int[] intkiks= new int[5];
        int[] intkik= new int[2];
        int[] intki= new int[4];
        int[] intk= new int[7];
        int[] in= new int[0];
        listik.add(intkiks);
        listik.add(intkik);
        listik.add(intki);
        listik.add(intk);
        listik.add(in);
        return listik;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
