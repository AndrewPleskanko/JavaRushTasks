package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Петр", new Date()));
    }

    static SimpleDateFormat dataFormatRead = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat dataFormatPrint = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    public static void main(String[] args) throws ParseException {

        switch (args[0]) {
            //3. При параметре -с программа должна добавлять всех людей с заданными параметрами в конец списка allPeople,
            // и выводить id каждого (index) на экран.
            case "-c":
                for (int step = 1; step < args.length; step += 3) {

                    Date date = dataFormatRead.parse(args[step + 2]);
                    Person person;
                    if (args[step + 1].startsWith("м")) {
                        person = Person.createMale(args[step], date);
                    } else {
                        person = Person.createFemale(args[step], date);
                    }

                    synchronized (allPeople) {
                        allPeople.add(person);
                    }

                    System.out.println(allPeople.indexOf(person));
                }
                break;
            //4. При параметре -u программа должна обновлять данные людей с заданными id в списке allPeople.
            case "-u": {
                synchronized (allPeople) {
                    for (int step = 1; step < args.length; step += 4) {
                        int index = Integer.parseInt(args[step]);
                        Person person = allPeople.get(index);
                        person.setName(args[step + 1]);
                        Sex sex = "м".equals(args[step + 2]) ? Sex.MALE : Sex.FEMALE;
                        person.setSex(sex);
                        Date date = dataFormatRead.parse(args[step + 3]);
                        person.setBirthDate(date);

                    }
                }
                break;
            }
            //  5. При параметре -d программа должна логически удалять людей с заданными id в списке allPeople.
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                    }
                }
                break;
            }
            //6. При параметре -i программа должна выводить на экран данные о всех людях с заданными id по формату указанному в задании.
            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        StringBuffer s = new StringBuffer();
                        s.append(person.getName());
                        s.append(" ");
                        s.append(person.getSex() == Sex.MALE ? "м" : "ж");
                        s.append(" ");
                        s.append(dataFormatPrint.format(person.getBirthDate()));
                        System.out.println(s);
                    }
                }
            }
            break;
        }
    }
}


