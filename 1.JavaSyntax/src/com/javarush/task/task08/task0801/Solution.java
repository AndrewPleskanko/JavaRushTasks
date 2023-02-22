package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/


public class Solution {
    public static void main(String[] args) {
        Set<String> myHashSet = new HashSet<String>();

        myHashSet.add("арбуз");
        myHashSet.add("банан");
        myHashSet.add("вишня");
        myHashSet.add("груша");
        myHashSet.add("дыня");
        myHashSet.add("ежевика");
        myHashSet.add("женьшень");
        myHashSet.add("земляника");
        myHashSet.add("ирис");
        myHashSet.add("картофель");
        for (String text : myHashSet) {
            System.out.println(text);
        }

    }
}
