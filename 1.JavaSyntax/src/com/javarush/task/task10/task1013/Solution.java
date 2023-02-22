package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String name;
        private boolean idiot;
        private boolean ace;
        private int howPlay;
        private String surname;

        public Human(int age) {
            this.age = age;
        }


        public Human(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public Human(int age, String name, boolean idiot) {
            this.age = age;
            this.name = name;
            this.idiot = idiot;
        }

        public Human(int age, String name, boolean idiot, boolean ace) {
            this.age = age;
            this.name = name;
            this.idiot = idiot;
            this.ace = ace;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(boolean idiot) {
            this.idiot = idiot;
        }

        public Human(int age, String name, boolean idiot, boolean ace, int howPlay) {
            this.age = age;
            this.name = name;
            this.idiot = idiot;
            this.ace = ace;
            this.howPlay = howPlay;
        }

        public Human(int age, String name, boolean idiot, boolean ace, int howPlay, String surname) {
            this.age = age;
            this.name = name;
            this.idiot = idiot;
            this.ace = ace;
            this.howPlay = howPlay;
            this.surname = surname;
        }

        public Human(boolean ace, int howPlay) {
            this.ace = ace;
            this.howPlay = howPlay;
        }

        public Human(boolean idiot, boolean ace, int howPlay, String surname) {
            this.idiot = idiot;
            this.ace = ace;
            this.howPlay = howPlay;
            this.surname = surname;
        }
    }
}
