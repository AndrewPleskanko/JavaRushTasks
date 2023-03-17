package com.javarush.task.task33.task3310.strategy;

import com.google.common.collect.HashBiMap;

import java.io.IOException;

public class HashBiMapStorageStrategy implements StorageStrategy {
    HashBiMap<Long, String> data = HashBiMap.create();

    @Override
    public boolean containsKey(Long key) throws IOException {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) throws IOException {
        return data.containsValue(value);
    }

    @Override
    public void put(Long key, String value) throws IOException {
        data.put(key, value);
    }

    @Override
    public Long getKey(String value) throws IOException {
        return data.inverse().get(value);
    }

    @Override
    public String getValue(Long key) throws IOException {
        return data.get(key);
    }
}
