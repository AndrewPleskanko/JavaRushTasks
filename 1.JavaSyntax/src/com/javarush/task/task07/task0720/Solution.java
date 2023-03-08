package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        int N = Integer.parseInt(scanner.readLine());
        int M = Integer.parseInt(scanner.readLine());

        for (int i = 0; i < N; i++) {
            arrayList.add(scanner.readLine());
        }

        for (int i = 0; i < M; i++) {
         arrayList.add(arrayList.get(i));
        }
        for (int i = 0; i < M; i++) {
            int count = 0;
            arrayList.remove(count);
        }
        //напишите тут ваш код
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
