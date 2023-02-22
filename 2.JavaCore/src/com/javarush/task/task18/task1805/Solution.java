package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> opachki = new ArrayList<>();

        while (inputStream.available() > 0) {
            int temp = inputStream.read();
            if (!opachki.contains(temp)) {
                opachki.add(temp);
            }
        }
        inputStream.close();

        Collections.sort(opachki);
        for (int i = 0; i < opachki.size(); i++) {
            System.out.print(opachki.get(i) + " ");
        }
    }
}
