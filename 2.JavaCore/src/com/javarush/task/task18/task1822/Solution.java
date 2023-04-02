package com.javarush.task.task18.task1822;

/*
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        BufferedReader buffer = new BufferedReader(new FileReader(file)); String str;

        while ((str = buffer.readLine()) != null) {
            if (str.split(" ")[0].equals(args[0])) {
                System.out.println(str);
                break;
            }
        }
        reader.close();
        buffer.close();
    }
}

