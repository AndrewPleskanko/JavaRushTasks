package com.javarush.task.task14.task1417;

public abstract class Money {
    /*
2. В классе Money должен быть реализован публичный конструктор с одним параметром типа double, который устанавливает
 значение переменной amount согласно переданному параметру.
3. В классе Money должен быть реализован публичный метод getAmount(), который будет возвращать значение поля amount.
4. Классы Hryvnia, Ruble и USD должны быть потомками класса Money и существовать в отдельных файлах.
5. В классах Hryvnia, Ruble и USD должен быть реализован метод getCurrencyName().
6. Метод getCurrencyName() должен возвращать название соответствующей валюты (строку) в виде аббревиатуры (USD, UAH, RUB).
7. В классах Hryvnia, Ruble и USD должен быть реализован публичный конструктор с одним параметром типа double,
 который устанавливает значение поля amount класса Money путем вызова конструктора класса родителя c тем же параметром.*/
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract String getCurrencyName();
}

