package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consoleStream);

        String[] expressionSplit = result.split(" ");
        int a = Integer.parseInt(expressionSplit[0]);
        int b = Integer.parseInt(expressionSplit[2]);
        int c = 0;
        if (expressionSplit[1].equals("+"))
        {
            c = a + b;
        } else if (expressionSplit[1].equals("-"))
        {
            c = a - b;
        } else if (expressionSplit[1].equals("*"))
        {
            c = a * b;
        }
        System.out.println(a + " " + expressionSplit[1] + " " + b + " = " + c);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

