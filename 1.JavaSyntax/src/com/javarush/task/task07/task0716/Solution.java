package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i=strings.size()-1; i>=0; i--) {
            if (strings.get(i).contains("л") && strings.get(i).contains("р")){
                continue;
            }else if(strings.get(i).contains("р")){
                strings.remove( strings.get(i));
            }else if(strings.get(i).contains("л")) {
                strings.add(i,strings.get(i));
            }
        }
        return strings;
    }
}