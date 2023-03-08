package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        TreeSet<Character> set = new TreeSet<>();
        String line;
        while ((line = reader.readLine()) != null) {
            line = line.toLowerCase();
            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    set.add(c);
                }
            }
        }
        reader.close();
        Iterator<Character> iterator = set.iterator();
        int n = Math.min(set.size(), 5);

        for (int i = 0; i < n; i++) {
            System.out.print((iterator.next()));
        }
    }
}
