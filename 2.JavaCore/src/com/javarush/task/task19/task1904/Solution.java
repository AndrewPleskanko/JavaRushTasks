package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String str[] = fileScanner.nextLine().split(" ", 4);
            DateFormat df = new SimpleDateFormat("dd MM yyyy");
            Date date = df.parse(str[3]);
            return new Person(str[1], str[2],str[0],date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
