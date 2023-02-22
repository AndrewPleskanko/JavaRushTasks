package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import static com.javarush.task.task19.task1916.Solution.Type.*;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(br.readLine()));
        BufferedReader reader2 = new BufferedReader(new FileReader(br.readLine()));

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        while (reader1.ready() && reader2.ready()) {
            String firstFile = reader1.readLine();
            String secondFile = reader2.readLine();
            list1.add(firstFile);
            list2.add(secondFile);
        }
        br.close();
        reader1.close();
        reader2.close();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    lines.add(new LineItem(Type.SAME, list1.get(i)));
                    list1.remove(i);
                    list2.remove(j);
                } else if (list1.get(i + 1).equals(list2.get(j))) {
                    lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                    list1.remove(i);
                } else if (list1.get(i).equals(list2.get(j + 1))) {
                    lines.add(new LineItem(Type.ADDED, list2.get(j)));
                    list2.remove(j);
                }
            }
        }


    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
