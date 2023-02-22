package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if (args[0].contentEquals("-c")) {
            String name = args[1];
            if (args[args.length-2].contentEquals("м")) {
                allPeople.add(Person.createMale(name, dateFormat.parse(args[args.length - 1])));
            } else if (args[args.length-2].contentEquals("ж")) {
                allPeople.add(Person.createFemale(name, dateFormat.parse(args[args.length - 1])));
            }
            System.out.println(allPeople.size()-1);
        } else if (args[0].contentEquals("-u")) {
            String name = args[2];
            if (args[args.length-2].contentEquals("м")) {
                allPeople.set(Integer.parseInt(args[0]), Person.createMale(name,dateFormat.parse(args[args.length - 1])));
            } else if (args[args.length-2].contentEquals("ж")) {
                allPeople.set(Integer.parseInt(args[0]), Person.createFemale(name,dateFormat.parse(args[args.length - 1])));
            }
        } else if (args[0].contentEquals("-d")) {
            Person person = allPeople.get((Integer.parseInt(args[1])));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
            allPeople.set((Integer.parseInt(args[1])), person);
        } else if (args[0].contentEquals("-r")) {
            SimpleDateFormat formater = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
            Person person = allPeople.get(Integer.parseInt(args[1]));
            String sex = person.getSex().equals("MALE") ? "ж" : "м";
            System.out.print(person.getName() + " " + sex + " " + formater.format(person.getBirthDate()));
        }
    }
}
