package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("name1",new Cat("Markis"));
        map.put("name2",new Cat("Marki"));
        map.put("name3",new Cat("Mark"));
        map.put("name4",new Cat("Mar"));
        map.put("name5",new Cat("Ma"));
        map.put("name6",new Cat("Markis1"));
        map.put("name7",new Cat("Markis2"));
        map.put("name8",new Cat("Markis3"));
        map.put("name9",new Cat("Markis4"));
        map.put("name10",new Cat("Markis5"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> cat = new HashSet<>();
        for (Cat cats : map.values()){
            cat.add(cats);
        }
        return cat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
