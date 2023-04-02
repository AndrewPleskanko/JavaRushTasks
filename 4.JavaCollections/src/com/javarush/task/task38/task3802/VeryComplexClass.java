package com.javarush.task.task38.task3802;

/* 
Проверяемые исключения (checked exception)
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        FileReader fileReader = new FileReader("Test.txt");

        BufferedReader bufferReader = new BufferedReader(fileReader);

        String fileData = null;

        while ((fileData = bufferReader.readLine()) != null) {
            System.out.println(fileData);
        }

        try {
            bufferReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
