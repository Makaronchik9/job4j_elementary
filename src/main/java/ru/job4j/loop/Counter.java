package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        if (start > finish) {
            return 0; // Если start больше finish, возвращаем 0
        }
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10)); // Ожидаемый результат: 55
        System.out.println(sum(3, 8));  // Ожидаемый результат: 33
        System.out.println(sum(1, 1));  // Ожидаемый результат: 1
        System.out.println(sum(5, 3));  // Ожидаемый результат: 0, так как start > finish
    }

}
