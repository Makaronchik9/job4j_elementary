package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3};
        int[] right = {1, 2, 3};
        boolean result = EqualLast.check(left, right);
        System.out.println(result);
    }
}

