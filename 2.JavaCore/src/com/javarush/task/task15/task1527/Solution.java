package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] parts = url.split("\\?");
        String data = parts[1];
        String[] partsData = data.split("&");
        String dataValue = null;
        for (int i = 0; i < partsData.length; i++) {
            String[] tmpArr = partsData[i].split("=");
            if (tmpArr[0].equals("obj")) {
                dataValue = tmpArr[1];
            }
            System.out.print(tmpArr[0] + " ");
        }
        System.out.println();
        if (dataValue == null) {
            return;
        }
        try {
            alert(Double.parseDouble(dataValue));
        } catch (NumberFormatException e) {
            alert(dataValue);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

}
