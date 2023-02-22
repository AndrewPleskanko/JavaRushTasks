package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            FileReader fileReader = new FileReader(Statics.FILE_NAME);
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNext()) {
                String string = scanner.nextLine();
                lines.add(string);
            }
            fileReader.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

