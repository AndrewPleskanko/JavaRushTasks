package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    public static class StringObject implements SimpleObject<String> {
        String temp;

        @Override
        public Solution.SimpleObject getInstance() {
            return this;
        }
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

}
