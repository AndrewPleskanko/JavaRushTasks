package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/


public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 4;
        this.weight = 6;
        this.color = "color";
        this.address = null;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";
        this.address = null;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 6;
        this.color = "color";
        this.address = null;
    }

    public Cat(int weight, String color) {
        this.name = null;
        this.age = 4;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.name = null;
        this.age = 4;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
