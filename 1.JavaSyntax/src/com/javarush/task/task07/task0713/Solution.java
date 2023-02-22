package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listDel3 = new ArrayList<>();
        ArrayList<Integer> listDel2 = new ArrayList<>();
        ArrayList<Integer> listDefault = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Scanner sc = new Scanner(System.in);
            int numb = sc.nextInt();
            list.add(numb);
            if (numb % 3 == 0 && numb % 2 == 0) {
                listDel3.add(numb);
                listDel2.add(numb);
            } else if (numb % 3 == 0) {
                listDel3.add(numb);
            } else if (numb % 2 == 0) {
                listDel2.add(numb);
            } else {
                listDefault.add(numb);
            }
        }

        printList(listDel3);
        printList(listDel2);
        printList(listDefault);

    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
