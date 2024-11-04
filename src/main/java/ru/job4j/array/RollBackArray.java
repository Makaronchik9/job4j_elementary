package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result = array;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        int[] result = RollBackArray.rollback(array);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}

