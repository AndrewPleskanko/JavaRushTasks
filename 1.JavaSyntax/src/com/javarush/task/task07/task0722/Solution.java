package com.javarush.task.task07.task0722;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String> strings = new ArrayList<>();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String temp = scanner.nextLine();
            if(temp.equals("end")){
                break;
            }else{
                strings.add(temp);
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
/*
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.


Requirements:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
3. Саму строку "end" не нужно добавлять в список.
4. Выведи список на экран, каждое значение с новой строки.
5. Используй цикл for.*/
        //напишите тут ваш код
    }
}