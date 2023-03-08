package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human human1 = new Human("Bob1",true,130);
        Human human2 = new Human("Bob1",true,10000);
        Human human3 = new Human("Bob1",true,1222220);
        Human human4 = new Human("Bob1",true,120);
        Human human5 = new Human("Bob1sfbf",true,12220,human1,human2);
        Human human6 = new Human("Bob1sdvgs",true,122220,human2,human2);
        Human human7 = new Human("Bob1x xbsf",true,10,human3,human2);
        Human human8 = new Human("BobasFb",true,10,human4,human2);
        Human human9 = new Human("Bobxfbvfxb",true,10,human1,human4);
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

6. Выведи созданные объекты на экран.*/
    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
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

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}