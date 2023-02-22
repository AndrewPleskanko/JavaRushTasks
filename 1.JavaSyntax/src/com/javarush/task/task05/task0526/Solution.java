package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man duck1 = new Man("Sus",10,"lolpops");
        Man duck11 = new Man("Sus",10,"lolpops");
        System.out.println(duck1.name + " " + duck1.age + " " + duck1.address);
        System.out.println(duck11.name + " " + duck11.age + " " + duck11.address);
        Woman duck12 = new Woman("Suslic",100,"lol");
        Woman duck123 = new Woman("Suslic",100,"lol");
        System.out.println(duck12.name + " " + duck12.age + " " + duck12.address);
        System.out.println(duck123.name + " " + duck123.age + " " + duck123.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
