package com.javarush.task.task19.task1921;

import java.io.*;
import java.util.*;


/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
        while (bf1.ready()) {
            String jj = bf1.readLine();
            String[] rr = jj.split(" ");
            Date birthDate = new Date(
                    Integer.parseInt(rr[rr.length - 1])-1900,
                    Integer.parseInt(rr[rr.length - 2])-1,
                    Integer.parseInt(rr[rr.length - 3]));
            StringJoiner joiner = new StringJoiner(" ");
            for (int i = 0; i < rr.length - 3; i++) {
                joiner.add(rr[i]);
            }
            String joined = joiner.toString();

            PEOPLE.add(new Person(joined, birthDate));
            for (int i = 0; i < PEOPLE.size(); i++) {
                System.out.println(PEOPLE);
            }
        }
        bf1.close();
    }
}
