package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.RUSSIA)) {
                hen = new RussianHen();
            }
            if (country.equals(Country.UKRAINE)) {
                hen = new UkrainianHen();
            }
            if (country.equals(Country.MOLDOVA)) {
                hen = new MoldovanHen();
            }
            if (country.equals(Country.BELARUS)) {
                hen = new BelarusianHen();
            }
            return hen;
        }
    }
}

abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я - курица.";
    }
}

class RussianHen extends Hen implements Country {

    int getCountOfEggsPerMonth() {
        return 30;
    }

    String getDescription() {
        return super.getDescription() +" Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class UkrainianHen extends Hen {

    int getCountOfEggsPerMonth() {
        return 20;
    }

    String getDescription() {
        return super.getDescription() +" Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class MoldovanHen extends Hen implements Country {

    int getCountOfEggsPerMonth() {
        return 5;
    }

    String getDescription() {
        return super.getDescription() +" Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class BelarusianHen extends Hen implements Country {

    int getCountOfEggsPerMonth() {
        return 10;
    }

    String getDescription() {
        return super.getDescription() +" Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

