package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line + "\n");  //добавлен переход на новую строку
            writer.flush();     // добавлена очистка буфера (необязательно) иначе в нем будут накапливаться все ранее введенные значения
            if (line.equals("exit")) {
                // writer.write(line);  - в этом нет необходимости идет дублирование
                break;
            }
        }
        reader.close();
        writer.close();
    }
}