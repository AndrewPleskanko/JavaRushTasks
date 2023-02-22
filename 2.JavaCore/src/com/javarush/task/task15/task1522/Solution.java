package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

   static {
       readKeyFromConsoleAndInitPlanet();
   }

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner scan = new Scanner(System.in);
        String temp = scan.nextLine();
        if(Planet.EARTH.equals(temp)){
            thePlanet = Earth.getInstance();;
        }else if(Planet.SUN.equals(temp)){
            thePlanet = Sun.getInstance();;
        }else if(Planet.MOON.equals(temp)){
            thePlanet = Moon.getInstance();
        }else{
            thePlanet = null;
        }
    }
}
