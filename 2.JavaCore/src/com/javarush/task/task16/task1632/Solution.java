package com.javarush.task.task16.task1632;

import sun.util.resources.ms.CalendarData_ms_MY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            if (Thread.interrupted()) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()){
                try
                {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {}
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void run() {
            while(!isInterrupted())
            {}
        }

        @Override
        public void showWarning() {
            interrupt();
            try{
                join();
            } catch (InterruptedException e) {}
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            int count = 0;
            while (true) {
                Scanner scan = new Scanner(System.in);
                String temp = scan.nextLine();
                if (temp.equals("N")) {
                    break;
                }
                count = count+ Integer.parseInt(temp);
            }
            System.out.println(count);
        }
    }

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
    }
}