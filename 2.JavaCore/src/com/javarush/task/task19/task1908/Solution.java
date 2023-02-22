package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
       BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        String s1 = fileReader.readLine();
        String[] words = s1.split("\\s"); // Разбиение строки на слова с помощью разграничителя (пробел)
        // Вывод на экран
        for (String subStr : words) {
           if(Pattern.matches("\\d*", subStr)){
                fileWriter.write(subStr + " ");
            }
        }


        br.close();
        fileReader.close();
        fileWriter.close();
    }
}
