package com.javarush.task.task33.task3313;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;

/* 
Сериализация даты в JSON
*/

public class Solution {
    public static void main(String[] args) throws JsonProcessingException {

        Date eventDate;
        Event event = new Event("event#1");

        String result = new ObjectMapper().writeValueAsString(event);

        System.out.println(result);
    }
}
