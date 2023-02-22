package com.javarush.task.task35.task3507;

import java.util.Set;

/* 
ClassLoader - что это такое?
*/
/*1. Размер множества возвращаемого методом getAllAnimals должен быть равен количеству классов поддерживающих интерфейс Animal
 и имеющих публичный конструктор без параметров (среди классов расположенных в директории переданной в качестве параметра).
2. В множестве возвращаемом методом getAllAnimals должны присутствовать все классы поддерживающие интерфейс Animal
 и имеющие публичный конструктор без параметров (среди классов расположенных в директории переданной в качестве параметра).
3. В множестве возвращаемом методом getAllAnimals НЕ должен присутствовать ни один класс не поддерживающий интерфейс Animal
 или не имеющий публичного конструктора без параметров (среди классов расположенных в директории переданной в качестве параметра).*/
public class Solution {
    public static void main(String[] args) {
        Set<? extends Animal> allAnimals = getAllAnimals(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + Solution.class.getPackage().getName().replaceAll("[.]", "/") + "/data");
        System.out.println(allAnimals);
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) {
        return null;
    }
}
