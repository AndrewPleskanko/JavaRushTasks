package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution extends Thread{
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread list1 = new SpecialThread();
        SpecialThread list2 = new SpecialThread();
        SpecialThread list3 = new SpecialThread();
        SpecialThread list4 = new SpecialThread();
        SpecialThread list5 = new SpecialThread();

        Thread list11 = new Thread(list1);
        Thread list22 = new Thread(list2);
        Thread list33 = new Thread(list3);
        Thread list44 = new Thread(list4);
        Thread list55 = new Thread(list5);
        list.add(list11);
        list.add(list22);
        list.add(list33);
        list.add(list44);
        list.add(list55);
        list11.run();
        list22.run();
        list33.run();
        list44.run();
        list55.run();

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
