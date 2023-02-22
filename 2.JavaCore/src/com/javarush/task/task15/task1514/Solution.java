package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
static {
    labels.put(12.2,"1");
    labels.put(12.1,"1");
    labels.put(12.3,"1");
    labels.put(12.432,"1");
    labels.put(12.21312,"3");
}
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
