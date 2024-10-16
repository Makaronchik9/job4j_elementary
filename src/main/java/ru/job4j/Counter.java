package ru.job4j;

public class Counter {
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumByEven(0, 10));  // Сумма четных чисел от 0 до 10
        System.out.println(sumByEven(3, 8));   // Сумма четных чисел от 3 до 8
        System.out.println(sumByEven(-5, 5));  // Сумма четных чисел от -5 до 5
    }
}

