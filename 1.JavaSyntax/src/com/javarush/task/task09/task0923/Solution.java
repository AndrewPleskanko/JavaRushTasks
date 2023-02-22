package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Character> xyi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().replace(" ", "");
        for (int i = 0; i < string.length(); i++) {
            if (isVowel(string.charAt(i))) {
                characters.add(string.charAt(i));
            }else {
              xyi.add(string.charAt(i));
            }
        }
        for (Character v : characters){
            System.out.print(v + " ");
        }
        System.out.println();
        for (Character v : xyi){
            System.out.print(v + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}