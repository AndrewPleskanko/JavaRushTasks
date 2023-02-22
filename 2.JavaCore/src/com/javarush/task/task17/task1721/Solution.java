package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/







public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f1 = br.readLine();
        String f2 = br.readLine();
        br.close();
        //5 пункт
        FileReader fr = new FileReader(f1);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        while (reader.ready()) {
            String line = reader.readLine();
            allLines.add(line);
        }

        //6 пункт
        FileReader frs = new FileReader(f2);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader readers = new BufferedReader(frs);
        // считаем сначала первую строку
        while (readers.ready()) {
            String line = readers.readLine();
            forRemoveLines.add(line);
        }
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            return;
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
