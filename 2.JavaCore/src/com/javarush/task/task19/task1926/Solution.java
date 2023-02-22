package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));

        while(fileReader.ready()){
            System.out.println(new StringBuilder(fileReader.readLine()).reverse());
        }
        br.close();
        fileReader.close();
    }
}
