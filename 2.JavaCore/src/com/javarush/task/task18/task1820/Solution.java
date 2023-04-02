package com.javarush.task.task18.task1820;

/*
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Запросимо ім'я файлу для зчитування
            System.out.print("Введіть ім'я файлу для зчитування: ");
            String inputFile = reader.readLine();

            // Запросимо ім'я файлу для записування
            System.out.print("Введіть ім'я файлу для записування: ");
            String outputFile = reader.readLine();

            // Створимо об'єкти для роботи з файлами
            FileReader fileReader = new FileReader(inputFile);
            FileWriter fileWriter = new FileWriter(outputFile);

            // Зчитаємо дані з вхідного файлу та обробимо їх
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] numbers = line.split(" ");
                for (String number : numbers) {
                    double doubleNumber = Double.parseDouble(number);
                    int roundedNumber = (int) Math.round(doubleNumber);
                    fileWriter.write(roundedNumber + " ");
                }
            }

            // Закриваємо об'єкти для роботи з файлами
            bufferedReader.close();
            fileWriter.close();

            System.out.println("Операція завершена успішно.");
        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}
