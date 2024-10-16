package ru.job4j.loop;

public class Factorial {

    public static int calculate(int n) {
        if (n == 0) {
            return 1; // Факториал 0 равен 1
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Умножаем результат на текущее значение i
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Factorial.calculate(5));
    }
}

