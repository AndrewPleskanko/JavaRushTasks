package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        String objectClassName = o.getClass().getSimpleName();
        if(objectClassName.equals("Cat")){
            System.out.println("Кошка");
        }else if(objectClassName.equals("Dog")){
            System.out.println("Собака");
        }else if(objectClassName.equals("Bird")){
            System.out.println("Птица");
        }else if(objectClassName.equals("Lamp")){
            System.out.println("Лампа");
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
