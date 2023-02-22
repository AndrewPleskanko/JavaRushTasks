package com.javarush.task.task35.task3509;

import java.util.*;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
    }

    /*

    2. Метод newArrayList должен возвращать ArrayList, который содержит переданные в метод объекты.

    4. Метод newHashSet должен возвращать HashSet, который содержит переданные в метод объекты.

    6. Метод newHashMap должен возвращать HashMap, который содержит переданные в метод ключи и значения.
    7. Метод newHashMap должен кидать IllegalArgumentException, если списки ключей и значений не совпадают по размеру.
    */
    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> res = new ArrayList<>();
        for (T elem : elements)
            res.add(elem);

        return res;
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        //напишите тут ваш код
        HashSet<T> res = new HashSet<>();
        for (T elem : elements)
            res.add(elem);

        return res;
    }

    public static <K,V> HashMap<K,V> newHashMap(List<? extends K> keys, List<? extends V> values) {

        if (keys.size() != values.size()) {
            throw new IllegalArgumentException();
        }
        HashMap<K,V> res = new HashMap<K,V>();
        for (int i = 0; i < keys.size(); i++) {
            res.put(keys.get(i), values.get(i));
        }

        return res;
    }
}
