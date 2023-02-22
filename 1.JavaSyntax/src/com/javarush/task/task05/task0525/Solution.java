package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck  duck1 = new Duck ();
        Duck  duck2 = new Duck ();
        Cat duck13 = new Cat();
        Cat duck23 = new Cat();
        Dog duck12 = new Dog();
        Dog duck22 = new Dog();
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(duck13);
        System.out.println(duck23);
        System.out.println(duck12);
        System.out.println(duck22);

        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }


}
