package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(1,5);
        System.out.println(hash.get(1));
    }
}
