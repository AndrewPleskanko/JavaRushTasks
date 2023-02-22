package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.SecureRandom;
import java.util.Scanner;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Person person = null;
        String key = null;
        while(true){
            key = scan.nextLine();

            if (key.equals("user")) {
                person = new Person.User();
            } else if (key.equals("loser")) {
                person = new Person.Loser();
            } else if (key.equals("coder")) {
                person = new Person.Coder();
            } else if (key.equals("proger")){
                person = new Person.Proger();
            }else {
                break;
            }
            doWork(person);
        }
    }


    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            Person.User user = (Person.User) person;
            user.live();
        } else if (person instanceof Person.Loser) {
            Person.Loser user = (Person.Loser) person;
            user.doNothing();
        } else if (person instanceof Person.Coder) {
            Person.Coder user = (Person.Coder) person;
            user.writeCode();
        }
        if (person instanceof Person.Proger) {
            Person.Proger user = (Person.Proger) person;
            user.enjoy();
        }
    }
}
