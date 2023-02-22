package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fin = new FileInputStream(s);
        while (fin.read() > 0){
            int data = fin.read();
            System.out.print((char)data);
        }
        reader.close();
        fin.close();
    }
}