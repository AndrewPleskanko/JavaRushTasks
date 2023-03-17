package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        solution.testStrategy(new HashMapStorageStrategy(), 10000L);
    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) throws IOException {
        Set<Long> setKeys = new HashSet<>();
        for (String s : strings) {
            setKeys.add(shortener.getId(s));
        }
        return setKeys;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys) throws IOException {
        Set<String> setString = new HashSet<>();
        for (Long s : keys) {
            setString.add(shortener.getString(s));
        }
        return setString;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) throws IOException {
        System.out.println(strategy.getClass().getSimpleName());
        Set<String> strings = new HashSet<>();
        for (long i = 0; i < elementsNumber; i++) {
            String lines = Helper.generateRandomString();
            strings.add(lines);
            strategy.put(i, lines);
        }
        Shortener shortener = new Shortener(strategy);

        Date startDate = new Date();
        Set<Long> longIds = getIds(shortener, strings);
        Date endDate = new Date();
        long timeElapsed = endDate.getTime() - startDate.getTime();

        Date startDate1 = new Date();
        Set<String> stringGetter = getStrings(shortener, longIds);
        Date endDate1 = new Date();
        long timeElapsed1 = endDate1.getTime() - startDate1.getTime();
        if (stringGetter.equals(strings)) {
            System.out.println("Тест пройден.");
        } else {
            System.out.println("Тест не пройден.");
        }
    }
}
