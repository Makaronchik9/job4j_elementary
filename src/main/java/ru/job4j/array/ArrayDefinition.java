package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        String[] names = new String[5];
        names[0] = "Sergey";
        names[1] = "Elena";
        names[2] = "Alena";
        names[3] = "Konstantin";
        names[4] = "Liza";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
    }
}

