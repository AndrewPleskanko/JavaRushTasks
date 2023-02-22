package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        reader = new BufferedReader(new InputStreamReader((new FileInputStream(fileName))));
        ArrayList<Integer> fileSaver = new ArrayList<>();

        while (reader.ready()) {
            int temp = Integer.parseInt(reader.readLine());
            if ((temp % 2) == 0) {
                fileSaver.add(temp);
            }
        }

        reader.close();

        Collections.sort(fileSaver);
        for (int i = 0; i < fileSaver.size(); i++) {
            System.out.println(fileSaver.get(i));
        }

    }
}
