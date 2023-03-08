package com.javarush.task.task18.task1825;

/*
Собираем файл
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> parts = new ArrayList<>();
        String input;
        while (!(input = scanner.nextLine()).equals("end")) {
            parts.add(input);
        }
        scanner.close();
        //Сортируем коллекцию
        Collections.sort(parts, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        String outputFileName = parts.get(0).split(".part")[0];
        FileOutputStream fileOutputStream = new FileOutputStream(outputFileName);

        byte[] buffer = new byte[1024];
        for (String part : parts) {
            try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(Paths.get(part)))) {
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) > 0) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                }
            }
        }
    }
}