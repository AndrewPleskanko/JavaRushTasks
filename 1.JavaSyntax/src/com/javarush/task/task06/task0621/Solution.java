package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat grandpaCat = new Cat(grandpaName);

        String grannyName = reader.readLine();
        Cat grannyCat = new Cat(grannyName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, grandpaCat, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, grannyCat);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(grandpaCat);
        System.out.println(grannyCat);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        /*

        The cat's name is папа Котофей, no mother, father is дедушка Вася
        The cat's name is мама Василиса, mother is бабушка Мурка, no father
        The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
        The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей*/
        @Override
        public String toString() {
            if (father == null && mother == null) {
                return "The cat's name is " + name + ", no mother, no father ";
            } else if (father == null) {
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father ";
            } else if (mother == null) {
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            } else {
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }
    }
}
