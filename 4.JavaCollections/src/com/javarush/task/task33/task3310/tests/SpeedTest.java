package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Helper;
import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.HashBiMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import org.junit.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SpeedTest {
    public long getTimeToGetIds(Shortener shortener, Set<String> strings, Set<Long> ids) throws IOException {
        long timeStart = System.currentTimeMillis();
        for (String str : strings) {
            ids.add(shortener.getId(str));
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }

    public long getTimeToGetStrings(Shortener shortener, Set<Long> ids, Set<String> strings) throws IOException {
        long timeStart = System.currentTimeMillis();
        for (Long lng : ids) {
            strings.add(shortener.getString(lng));
        }
        long timeEnd = System.currentTimeMillis();
        return timeEnd - timeStart;
    }

    @Test
    public void testHashMapStorage() throws IOException {
        Shortener shortener1 = new Shortener(new HashMapStorageStrategy());
        Shortener shortener2 = new Shortener(new HashBiMapStorageStrategy());
        Set<String> origStrings = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            origStrings.add(Helper.generateRandomString());
        }
        Set<Long> ids = new HashSet<>();
        long time1 = getTimeToGetIds(shortener1, origStrings, ids);

        long time2 = getTimeToGetIds(shortener2, origStrings, ids);
        assertTrue(time1 > time2);

        long timeToGetStrings1 = getTimeToGetStrings(shortener1, ids, origStrings);
        long timeToGetStrings2 = getTimeToGetStrings(shortener2, ids, origStrings);
        assertEquals((float) timeToGetStrings1, (float) timeToGetStrings2, 30);


    }
}
