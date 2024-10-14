package ru.job4j.converter;

public class Converter {
    public static double rubleToDollar(double value) {
        return value / 60; // предположим, что 1 доллар = 60 рублей
    }

    public static double rubleToEuro(double value) {
        return value / 70; // предположим, что 1 евро = 70 рублей
    }

    public static double dollarToRuble(double value) {
        return value * 60;
    }

    public static double euroToRuble(double value) {
        return value * 70;
    }
}
