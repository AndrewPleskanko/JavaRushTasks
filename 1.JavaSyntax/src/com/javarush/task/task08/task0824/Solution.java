package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //children
        Human human7 = new Human("Bob1", true, 130);
        Human human8 = new Human("Bob1", true, 10000);
        Human human9 = new Human("Bob1", true, 1222220);
        ArrayList<Human> children = new ArrayList<>();
        children.add(human7);
        children.add(human8);
        children.add(human9);
//adult
        Human human5 = new Human("Bob1", true, 130, children);
        ArrayList<Human> parents1 = new ArrayList<>();
        parents1.add(human5);
        Human human6 = new Human("Bob1", true, 10000, children);
        ArrayList<Human> parents2 = new ArrayList<>();
        parents2.add(human6);

//grandfather / grandmother
        Human human1 = new Human("Bob1", true, 130, parents1);
        Human human2 = new Human("Bob1", true, 10000, parents1);
        Human human3 = new Human("Bob1", true, 1222220, parents2);
        Human human4 = new Human("Bob1", true, 120, parents2);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);
    }

    /*

    чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.*/
    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
